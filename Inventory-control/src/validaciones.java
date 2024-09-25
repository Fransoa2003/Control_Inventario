/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jesus Vazquez
 */
public class validaciones {
    //Validacion rfc
    public boolean valRfc(String cadena){
        
        char[] letra = cadena.toCharArray();
        boolean respuesta = true;
        if(cadena.length()!=13){
            respuesta = false;
        }
        for(char letras : letra){
            int letraAscii = letras;
            if(!(letraAscii > 47 && letraAscii < 58 || 
                    letraAscii > 64 && letraAscii<91)){
                respuesta = false;
                break;
            }
        }
        
        return respuesta;
    }
    //Validar telefono
    public boolean valPhone(String cadena){
        boolean respuesta = true;
        char[] letras = cadena.toCharArray();
        if(cadena.length()!=10){
            respuesta = false;
        }
        for(char letra:letras){
            int letraAscii = letra;
            if(!(letraAscii > 47 && letraAscii<64)){
                respuesta = false;
                break;
            } 
        }
        return respuesta;
    }
    //validar razon social
    public boolean valCompany(String cadena){
        boolean respuesta = true;
        char[] letras = cadena.toCharArray();
        for(char letra : letras){
            int letraAscii = letra;
            if(!(letraAscii >64 && letraAscii<91 ||
                    letraAscii > 96 && letraAscii<123 ||
                    letraAscii == 32 || letraAscii == 46)){
                respuesta = false;
                break;
            }
        }
        return respuesta;
    }
    public boolean valAddress(String cadena){
        boolean respuesta = true;
        char[] letras = cadena.toCharArray();
        for(char letra : letras){
            int letraAscii = letra;
            if(!(letraAscii >64 && letraAscii<91 ||
                    letraAscii > 96 && letraAscii<123 ||
                    letraAscii > 47 && letraAscii < 58 ||
                    letraAscii == 32)){
                respuesta = false;
                break;
            }
        }
        return respuesta;
    }
    public boolean valName(String cadena){
        boolean respuesta = true;
        char[] letras = cadena.toCharArray();
        for(char letra : letras){
            int letraAscii = letra;
            if(!(letraAscii >64 && letraAscii<91 || 
                    letraAscii >96 && letraAscii<123)){
                respuesta = false;
                break;
            }
        }
        return respuesta;
    }
    public boolean valQuantity(String cadena){
        boolean respuesta = true;
        char[] letras = cadena.toCharArray();
        for(char letra:letras){
            int letraAscii = letra;
            if(!(letraAscii > 47 && letraAscii<64)){
                respuesta = false;
                break;
            } 
        }
        return respuesta;
    }
}
