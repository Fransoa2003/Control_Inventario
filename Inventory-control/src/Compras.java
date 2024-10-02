/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.time.LocalDateTime;
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
public class Compras {
    private long id;
    private String fecha;
    private String usuario;
    private String proveedor;
    
    public Compras(){
        
    }

    public Compras(long id, String fecha, String usuario, String proveedor) {
        this.id = id;
        this.fecha = fecha;
        this.usuario = usuario;
        this.proveedor = proveedor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    public void setId(int _id){
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
    
    public boolean crearCompra(String[] valores){
        
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("INSERT INTO compras VALUES(null,'%s','%s','%s',1);",
                                            valores[0],valores[1],LocalDateTime.now().toString());
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            sql.execute();
            conexion.getConexion().close();
            System.out.println("Compra creada");
        }catch(SQLException error){
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE,"Ocurrio un error al crear la compra",error);
            return false;
        }
   
        return true;
    }
    
    public boolean actualizarCompra(String[] valores){
        
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("UPDATE compras SET RfcUsuario='%s',RfcProveedor='%s' WHERE Id=%s;",
                                            valores[1],valores[2],valores[0]);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            sql.executeUpdate();
            conexion.getConexion().close();
            System.out.println("Compra actualizada");
        }catch(SQLException error){
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE,"Ocurrio un error al actualizar la compra",error);
            return false;
        }
   
        return true;
    }
    
    public boolean eliminarCompra(String id){
        
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("UPDATE compras SET EstadoCompras=0 WHERE Id=%s;",id);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            sql.executeUpdate();
            conexion.getConexion().close();
            System.out.println("Compra eliminada");
        }catch(SQLException error){
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE,"Ocurrio un error al eliminar la compra",error);
            return false;
        }
        return true;
    }
    
    public List<Compras> obtenerCompras(){
        List<Compras> listaCompras = new ArrayList<>();
        try{
            Conexion conexion = new Conexion();
            String consulta = "SELECT * FROM compras WHERE EstadoCompras=1";
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            ResultSet resultados = sql.executeQuery();
            while(resultados.next()){
                Compras compra = new Compras(
                            resultados.getLong("Id"),
                            resultados.getString("FechaCompra"),
                            resultados.getString("RfcUsuario"),
                            resultados.getString("RfcProveedor")
                            
                        );
                listaCompras.add(compra);
            }
            resultados.close();
            conexion.getConexion().close();
        }catch(SQLException error){
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE,"Error al buscar las compras",error);
            return listaCompras;
        }
        return listaCompras;
    }
    
    public Compras obtenerCompra(String id){
        Compras compra = new Compras();
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("SELECT * FROM compras WHERE Id=%s AND EstadoCompras=1", id);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            ResultSet resultado = sql.executeQuery();
            
            //Verificamos si tiene algun registro dentro, esto al recorrer el apuntador de elemento
            if(resultado.next()){
                
                compra = new Compras(
                            resultado.getLong("Id"),
                            resultado.getString("FechaCompra"),
                            resultado.getString("RfcUsuario"),
                            resultado.getString("RfcProveedor")
                        
                           );
            }
            
            resultado.close();
            conexion.getConexion().close();
            return compra;
        }catch(SQLException error){
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE,"Error al buscar la compra",error);
            return compra;
        }
    }
    
}
