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
    public boolean val_rfc(String cadena){
        
        char[] letra = cadena.toCharArray();
        boolean respuesta = true;
        if(cadena.length()!=13){
            respuesta = false;
        }
        for(char letras : letra){
            int letra_ascii = letras;
            if(!(letra_ascii > 47 && letra_ascii < 58 || 
                    letra_ascii > 64 && letra_ascii<91)){
                respuesta = false;
                break;
            }
        }
        
        return respuesta;
    }
    //Validar telefono
    public boolean val_phone(String cadena){
        boolean respuesta = true;
        char[] letras = cadena.toCharArray();
        if(cadena.length()!=10){
            respuesta = false;
        }
        for(char letra:letras){
            int letra_ascii = letra;
            if(!(letra_ascii > 47 && letra_ascii<64)){
                respuesta = false;
                break;
            }
            
        }
        return respuesta;
    }
    //validar razon social
    public boolean val_company(String cadena){
        boolean respuesta = true;
        char[] letras = cadena.toCharArray();
        for(char letra : letras){
            int letra_ascii = letra;
            if(!(letra_ascii >64 && letra_ascii<91 ||
                    letra_ascii > 96 && letra_ascii<123 ||
                    letra_ascii == 32 || letra_ascii == 46)){
                respuesta = false;
                break;
            }
        }
        return respuesta;
    }
    public boolean val_address(String cadena){
        boolean respuesta = true;
        char[] letras = cadena.toCharArray();
        for(char letra : letras){
            int letra_ascii = letra;
            if(!(letra_ascii >64 && letra_ascii<91 ||
                    letra_ascii > 96 && letra_ascii<123 ||
                    letra_ascii > 47 && letra_ascii < 58 ||
                    letra_ascii == 32)){
                respuesta = false;
                break;
            }
        }
        return respuesta;
    }
}
