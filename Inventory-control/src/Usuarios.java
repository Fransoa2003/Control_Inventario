/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Jesus Vazquez
 */
public class Usuarios {
    public boolean addUsuarios(){
        try{
            Conexion conexion = new Conexion();
            String consulta = "select * from usuarios;";
            PreparedStatement sql = conexion.getConexion().prepareStatement(consulta);
            sql.execute();
            System.out.println("Consulta exitosa");
            conexion.getConexion().close();
            
        }catch (SQLException error){
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE,"Ocurrio un error al registrar el producto",error);
            return false;
        }
              
        
        return true;
    }
}
