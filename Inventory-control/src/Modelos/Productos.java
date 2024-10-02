/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;
/**
 *
 * @author JESUS EMMANUEL LR
 */
public class Productos {
    private String codigo;
    private String descripcion;
    private String marca;
    private String talla;
    private String color;
    private float costo;
    private float precio;
    private int stock;
    
    public Productos(){
    
    }
    
    public Productos(String _codigo,String _descripcion,String _marca,String _talla,String _color, float _costo,float _precio,int _stock){
        this.setCodigo(_codigo);
        this.setDescripcion(_descripcion);
        this.setMarca(_marca);
        this.setTalla(_talla);
        this.setColor(_color);
        this.setCosto(_costo);
        this.setPrecio(_precio);
        this.setStock(_stock);
    }
    
    public void setCodigo(String _codigo){
        this.codigo = _codigo;
    }
    
    public void setDescripcion(String _descripcion){
        this.descripcion = _descripcion;
    }
    
    public void setMarca(String _marca){
        this.marca = _marca;
    }
    
    public void setTalla(String _talla){
        this.talla = _talla;
    }
    
    public void setColor(String _color){
        this.color = _color;
    }
    
    public void setCosto(float _costo){
        this.costo = _costo;
    }
    
    public void setPrecio(float _precio){
        this.precio = _precio;
    }
    
    public void setStock(int _stock){
        this.stock = _stock;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getTalla(){
        return this.talla;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public float getCosto(){
        return this.costo;
    }
    
    public float getPrecio(){
        return this.precio;
    }
    
    public int getStock(){
        return this.stock;
    }
    
    public boolean crearProducto(String[] valores){
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("INSERT INTO productos VALUES('%s','%s','%s','%s','%s',%s,%s,%s,1);",
                                            valores[0],valores[1],valores[2],valores[3],valores[4],valores[5],valores[6],
                                            valores[7]);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            sql.execute();
            conexion.getConexion().close();
            System.out.println("Registro creado");
        }catch(SQLException error){
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE,"Ocurrio un error al registrar el producto",error);
            return false;
        }
        
        return true;
    }
    
    public boolean actualizarProducto(String[] valores){
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("UPDATE productos SET Descripcion='%s',Marca='%s',Talla='%s',Color='%s',Costo=%s,Precio=%s,Stock=%s WHERE Codigo='%s';",
                                            valores[1],valores[2],valores[3],valores[4],valores[5],valores[6],valores[7],valores[0]);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            sql.executeUpdate();
            conexion.getConexion().close();
            System.out.println("Actualizacion del producto exitosa");
        }catch(SQLException error){
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE,"Ocurrio un error al actualizar el producto",error);
            return false;
        }
        
        return true;
    }
    
    public boolean eliminarProducto(String codigo){
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("UPDATE productos SET EstadoProductos=0 WHERE Codigo='%s';",codigo);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            sql.executeUpdate();
            conexion.getConexion().close();
            System.out.println("Eliminacion del producto exitosa");
        }catch(SQLException error){
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE,"Ocurrio un error al eliminar el producto",error);
            return false;
        }
        
        return true;
    }
    
    public List<Productos> obtenerProductos(){
        List<Productos> listaProductos = new ArrayList<>();
        try{
            Conexion conexion = new Conexion();
            String consulta = "SELECT * FROM productos WHERE EstadoProductos=1";
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            ResultSet resultados = sql.executeQuery();
            while(resultados.next()){
                Productos producto = new Productos(
                            resultados.getString("Codigo"),
                            resultados.getString("Descripcion"),
                            resultados.getString("Marca"),
                            resultados.getString("Talla"),
                            resultados.getString("Color"),
                            resultados.getFloat("Costo"),
                            resultados.getFloat("Precio"),
                            resultados.getInt("Stock")
                        );
                listaProductos.add(producto);
            }
            resultados.close();
            conexion.getConexion().close();
        }catch(SQLException error){
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE,"Error al buscar los productos",error);
            return listaProductos;
        }
        return listaProductos;
    }
    
    public Productos obtenerProducto(String valor){
        Productos producto = new Productos();
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("SELECT * FROM productos WHERE (Codigo='%s' OR Marca='%s' OR Talla='%s') AND EstadoProductos=1", valor,valor,valor);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            ResultSet resultado = sql.executeQuery();
            
            //Verificamos si tiene algun registro dentro, esto al recorrer el apuntador de elemento
            if(resultado.next()){
                
                producto = new Productos(
                            resultado.getString("Codigo"),
                            resultado.getString("Descripcion"),
                            resultado.getString("Marca"),
                            resultado.getString("Talla"),
                            resultado.getString("Color"),
                            resultado.getFloat("Costo"),
                            resultado.getFloat("Precio"),
                            resultado.getInt("Stock")
                           );
            }
            
            resultado.close();
            conexion.getConexion().close();
            return producto;
        }catch(SQLException error){
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE,"Error al buscar el producto",error);
            return producto;
        }
    }
    
}
