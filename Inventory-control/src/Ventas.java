/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JESUS EMMANUEL LR
 */
public class Ventas {
    private long id;
    private String fecha;
    private String usuario;
    
    public Ventas(){
    
    }

    public Ventas(long id, String fecha, String usuario) {
        this.id = id;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public void setId(long _id){
        this.id = _id;
    }
    
    public void setFecha(String _fecha){
        this.fecha = _fecha;
    }
    
    public long getId(){
        return this.id;
    }
    
    public String getFecha(){
        return this.fecha;
    }
    
    public boolean crearVenta(String rfcUsuario){
        
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("INSERT INTO ventas VALUES(null,'%s','%s',1);",
                                            rfcUsuario,LocalDateTime.now().toString());
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            sql.execute();
            conexion.getConexion().close();
            System.out.println("Venta creada");
        }catch(SQLException error){
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE,"Ocurrio un error al crear la venta",error);
            return false;
        }
   
        return true;
    }
    
    public boolean actualizarVenta(String rfcUsuario,String id){
        
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("UPDATE ventas SET RfcUsuario='%s' WHERE Id=%s;",
                                            rfcUsuario,id);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            sql.executeUpdate();
            conexion.getConexion().close();
            System.out.println("Venta actualizada");
        }catch(SQLException error){
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE,"Ocurrio un error al actualizar la venta",error);
            return false;
        }
   
        return true;
    }
    
    public boolean eliminarCompra(String id){
        
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("UPDATE ventas SET EstadoVentas=0 WHERE Id=%s;",id);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            sql.executeUpdate();
            conexion.getConexion().close();
            System.out.println("Venta eliminada");
        }catch(SQLException error){
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE,"Ocurrio un error al eliminar la venta",error);
            return false;
        }
        return true;
    }
    
    public List<Ventas> obtenerVentas(){
        List<Ventas> listaVentas = new ArrayList<>();
        try{
            Conexion conexion = new Conexion();
            String consulta = "SELECT * FROM ventas WHERE EstadoVentas=1";
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            ResultSet resultados = sql.executeQuery();
            while(resultados.next()){
                Ventas venta = new Ventas(
                            resultados.getLong("Id"),
                            resultados.getString("RfcUsuario"),
                            resultados.getString("FechaCompra")
                            
                        );
                listaVentas.add(venta);
            }
            resultados.close();
            conexion.getConexion().close();
        }catch(SQLException error){
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE,"Error al buscar las ventas",error);
            return listaVentas;
        }
        return listaVentas;
    }
    
    public Ventas obtenerCompra(String id){
        Ventas venta = new Ventas();
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("SELECT * FROM ventas WHERE Id=%s AND EstadoVentas=1", id);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            ResultSet resultado = sql.executeQuery();
            
            //Verificamos si tiene algun registro dentro, esto al recorrer el apuntador de elemento
            if(resultado.next()){
                
                venta = new Ventas(
                            resultado.getLong("Id"),
                            resultado.getString("RfcUsuario"),
                            resultado.getString("FechaCompra")
                        
                           );
            }
            
            resultado.close();
            conexion.getConexion().close();
            return venta;
        }catch(SQLException error){
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE,"Error al buscar el producto",error);
            return venta;
        }
    }
}
