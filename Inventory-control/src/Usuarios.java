

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Jesus Vazquez
 */
public class Usuarios {
    private String rfc;
    private String nombre;
    private String apellidos;
    private String rol;
    private int edad;
    private String password;
    private String sexo;
    private String email;
    private String telefono;
    
    public Usuarios(){
    
    }

    public Usuarios(String rfc, String nombre, String apellidos, String rol, int edad, String password, String sexo, String email, String telefono) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.rol = rol;
        this.edad = edad;
        this.password = password;
        this.sexo = sexo;
        this.email = email;
        this.telefono = telefono;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public boolean crearUsuario(String[] valores){
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("INSERT INTO usuarios VALUES('%s','%s','%s','%s',%s,'%s','%s','%s','%s',1);",
                                            valores[0],valores[1],valores[2],valores[3],valores[4],valores[5],valores[6],
                                            valores[7],valores[8]);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            sql.execute();
            conexion.getConexion().close();
            System.out.println("Usuario creado");
        }catch(SQLException error){
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE,"Ocurrio un error al crear el usuario",error);
            return false;
        }
        return true;
    }
    
    public boolean actualizarUsuario(String[] valores){
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("UPDATE usuarios SET Nombre='%s',Apellidos='%s',Rol='%s',Edad=%s,Password='%s',Sexo='%s'"
                                            + ",Email='%s',Telefono='%s' WHERE Rfc='%s';",
                                            valores[1],valores[2],valores[3],valores[4],valores[5],valores[6],valores[7],
                                            valores[8],valores[0]);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            sql.executeUpdate();
            conexion.getConexion().close();
            System.out.println("Usuario actualizado");
        }catch(SQLException error){
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE,"Ocurrio un error al actualizar el usuario",error);
            return false;
        }
   
        return true;
    }
    
    public boolean eliminarUsuario(String rfc){
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("UPDATE usuarios SET EstadoUsuarios=0 WHERE Rfc='%s';",rfc);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            sql.executeUpdate();
            conexion.getConexion().close();
            System.out.println("Usuario eliminado");
        }catch(SQLException error){
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE,"Ocurrio un error al eliminar el usuario",error);
            return false;
        }
   
        return true;
    }
    
    public List<Usuarios> obtenerUsuarios(){
        List<Usuarios> listaUsuarios = new ArrayList<>();
        try{
            Conexion conexion = new Conexion();
            String consulta = "SELECT * FROM usuarios WHERE EstadoUsuarios=1";
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            ResultSet resultados = sql.executeQuery();
            while(resultados.next()){
                Usuarios usuario = new Usuarios(
                            resultados.getString("Rfc"),
                            resultados.getString("Nombre"),
                            resultados.getString("Apellidos"),
                            resultados.getString("Rol"),
                            resultados.getInt("Edad"),
                            resultados.getString("Password"),
                            resultados.getString("Sexo"),
                            resultados.getString("Email"),
                            resultados.getString("Telefono")
                            
                        );
                listaUsuarios.add(usuario);
            }
            resultados.close();
            conexion.getConexion().close();
        }catch(SQLException error){
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE,"Error al buscar los proveedores",error);
            return listaUsuarios;
        }
        return listaUsuarios;
    }
    
    public Usuarios obtenerUsuario(String valor){
        Usuarios usuario = new Usuarios();
        try{
            Conexion conexion = new Conexion();
            String consulta = String.format("SELECT * FROM usuarios WHERE (Rfc='%s' OR Nombre='%s' OR Apellidos='%s') AND EstadoUsuarios=1", valor,valor,valor);
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            ResultSet resultado = sql.executeQuery();
            
            //Verificamos si tiene algun registro dentro, esto al recorrer el apuntador de elemento
            if(resultado.next()){
                
                usuario = new Usuarios(
                            resultado.getString("Rfc"),
                            resultado.getString("Nombre"),
                            resultado.getString("Apellidos"),
                            resultado.getString("Rol"),
                            resultado.getInt("Edad"),
                            resultado.getString("Password"),
                            resultado.getString("Sexo"),
                            resultado.getString("Email"),
                            resultado.getString("Telefono")
                           );
            }
            
            resultado.close();
            conexion.getConexion().close();
            return usuario;
        }catch(SQLException error){
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE,"Error al buscar el producto",error);
            return usuario;
        }
    }
    public boolean loginUsuario(String user, String pass){
        boolean existsUser = false;
        String queryCamparar = "SELECT * FROM usuarios WHERE Email = ? AND Password = ? AND EstadoUsuario = ?";
        try {
            
            Conexion conexion = new Conexion();
            PreparedStatement sql = conexion.getConexion().prepareStatement(queryCamparar);
            
            sql.setString(1, user); // Asignar el email
            sql.setString(2, pass); // Asignar la contraseña
            sql.setInt(3, 1);
            
            ResultSet rs = sql.executeQuery();
            
            if(rs.next()){
                existsUser = true;
                System.out.println("Usuario existente");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
           
        
        return existsUser;
    }
}
