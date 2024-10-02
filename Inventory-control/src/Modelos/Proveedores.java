/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import com.mysql.cj.protocol.Resultset;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JESUS EMMANUEL LR
 */
public class Proveedores {
    private String rfc;
    private String razonSocial;
    private String direccion;
    private String telefono;
    
    public Proveedores(){
    
    }
    
    public Proveedores(String _rfc,String _razonSocial,String _direccion,String _telefono){
        this.setRfc(_rfc);
        this.setRazonSocial(_razonSocial);
        this.setDireccion(_direccion);
        this.setTelefono(_telefono);
    }
    
    public void setRfc(String _rfc){
        this.rfc = _rfc;
    }
    
    public void setRazonSocial(String _razon_social){
        this.razonSocial = _razon_social;
    }
    
    public void setDireccion(String _direccion){
        this.direccion = _direccion;
    }
    
    public void setTelefono(String _telefono){
        this.telefono = _telefono;
    }
    
    public String getRfc(){
        return this.rfc;
    }
    
    public String getRazonSocial(){
        return this.razonSocial;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public boolean crearProveedor(String[] valores){
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("INSERT INTO proveedores VALUES('%s','%s','%s','%s',1)",
                                            valores[0],valores[1],valores[2],valores[3]);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            sql.execute();
            conexion.getConexion().close();
            System.out.println("Registro de proveedor exitosa");
        }catch(SQLException error){
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE,"Ocurrio un error al registrar el proveedor",error);
            return false;
        }
        return true;
    }
    
    public boolean actualizarProveedor(String[] valores){
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("UPDATE proveedores SET RazonSocial='%s',Direccion='%s',Telefono='%s' WHERE Rfc='%s'",
                   valores[1],valores[2],valores[3],valores[0]);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            sql.executeUpdate();
            conexion.getConexion().close();
            System.out.println("Actualizacion de proveedor correcta");
        }catch(SQLException error){
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE,"Error al actualizar el proveedor",error);
            return false;
        }
        return true;
    }
    
    public boolean eliminarProveedor(String rfc){
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("UPDATE proveedores SET EstadoProveedor=0 WHERE Rfc='%s'",
                   rfc);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            sql.executeUpdate();
            conexion.getConexion().close();
            System.out.println("Eliminacion de proveedor correcta");
        }catch(SQLException error){
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE,"Error al actualizar el proveedor",error);
            return false;
        }
        return true;
    }
    
    public List<Proveedores> obtenerProveedores(){
        List<Proveedores> listaProveedores = new ArrayList<>();
        try{
            Conexion conexion = new Conexion();
            String consulta = "SELECT * FROM proveedores WHERE EstadoProveedor=1";
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            ResultSet resultados = sql.executeQuery();
            while(resultados.next()){
                Proveedores proveedor = new Proveedores(
                        resultados.getString("Rfc"),
                        resultados.getString("RazonSocial"),
                        resultados.getString("Direccion"),
                        resultados.getString("Telefono")
                        );
                listaProveedores.add(proveedor);
            }
            resultados.close();
            conexion.getConexion().close();
        }catch(SQLException error){
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE,"Error al buscar los proveedores",error);
            return listaProveedores;
        }
        return listaProveedores;
    }
    
    public Proveedores obtenerProveedor(String valor){
        Proveedores proveedor = new Proveedores();
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("SELECT * FROM proveedores WHERE Rfc='%s' OR RazonSocial='%s'", valor,valor);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            ResultSet resultado = sql.executeQuery();
            
            //Verificamos si tiene algun registro dentro, esto al recorrer el apuntador de elemento
            if(resultado.next()){
                
                proveedor = new Proveedores(resultado.getString("Rfc"),resultado.getString("RazonSocial"),
                                        resultado.getString("Direccion"),
                                        resultado.getString("Telefono"));
            }
            
            resultado.close();
            conexion.getConexion().close();
            return proveedor;
        }catch(SQLException error){
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE,"Error al buscar el proveedor",error);
            return proveedor;
        }
    }
}
