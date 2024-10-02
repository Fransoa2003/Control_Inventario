
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;
import java.util.logging.Level;
/**
 *
 * @author JESUS EMMANUEL LR
 * Para las aplicaciones del tipo Java Application y no Jaba Maven es necesario instalar el .jar del archivo comprimido .tar
 * Caso contrario instalar el archivo comprimido en Zip
 * Todo esto referente al jdbc de las bases de datos.
 * Asi mismo para hacer uso del conector desde la version de MySQL 8.0x se debe emplear com.mysql.cj.jdbc.Driver
 */
public class Conexion {
    private String bd;
    private String user;
    private String password;
    private String port;
    private String host;
    private Connection conexion;
    
    public Conexion(){
        this.user = "root";
        this.password = "123456";
        this.port = "3306";
        this.bd = "tienda";
        this.host = String.format("jdbc:mysql://127.0.0.1:%s/%s",this.port,this.bd);
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            this.conexion = DriverManager.getConnection(this.host,this.user,this.password);
            
            System.out.println("Conexion exitosa");
            
        }catch(SQLException | ClassNotFoundException error){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,"Ocurrio un error",error);
        }
    }
    
    public Connection getConexion(){
        return this.conexion;
    }
}
