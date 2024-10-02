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
                    letraAscii >96 && letraAscii<123 ||
                    letraAscii == 32)){
                respuesta = false;
                break;
            }
        }
        return respuesta;
    }
    public boolean numers(String cadena){
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
    public boolean valPassword(String cadena){
        boolean respuesta = true;
        char[] letras = cadena.toCharArray();
        for(char letra:letras){
            int letraAscii = letra;
            if(!(letraAscii > 47 && letraAscii<64 ||
                    letraAscii > 64 && letraAscii < 91 ||
                    letraAscii > 96 && letraAscii < 123)){
                respuesta = false;
                break;
            } 
        }
        return respuesta;
    }
    public boolean valCodigo(String cadena){
        boolean respuesta = true;
        char[] letras = cadena.toCharArray();
        if(cadena.length()!=8){
            respuesta = false;
        }
        for(char letra:letras){
            int letraAscii = letra;
            if(!(letraAscii > 47 && letraAscii<64 ||
                    letraAscii > 64 && letraAscii < 91 ||
                    letraAscii > 96 && letraAscii < 123)){
                respuesta = false;
                break;
            } 
        }
        return respuesta;
    }
    public boolean validarCorreo(String cadena){
        //oskos@dominio.com @koskos.com ksis@osos.ciso@
        boolean isValido = true;

        int posicionArroba = cadena.indexOf("@");

        if(posicionArroba >= 0){

            //validamos que el arroba no este al principio y al fin
            if(posicionArroba == 0 || posicionArroba == cadena.length() - 1){
                isValido = false;
            }

            String cadenaParteUno = cadena.substring(0, posicionArroba);
            String cadenaParteDos = cadena.substring(posicionArroba + 1, cadena.length());

            char[] letrasCadenaPtUno = cadenaParteUno.toCharArray();
            char[] letrasCadenaPtDos = cadenaParteDos.toCharArray();

            //Validamos el punto al principio y final de la parte uno
            if(cadenaParteUno.indexOf(".") == 0 || cadenaParteUno.indexOf(".") == cadenaParteUno.length() - 1){
                isValido = false;
            }

            //Si existe algun punto
            boolean hasPuntoPrUno = false;

            //Validamos la primera parte
            for(char letra : letrasCadenaPtUno){

                int letra_ascii = letra;

                if(
                        letra_ascii > 96 && letra_ascii < 123 ||
                                letra_ascii > 47 && letra_ascii < 58 ||
                                letra_ascii == 46 || letra_ascii == 95)
                {

                    if(hasPuntoPrUno && letra_ascii == 46){
                        isValido = false;
                        break;
                    }else hasPuntoPrUno = letra_ascii == 46;


                }else{
                    isValido = false;
                    break;
                }
            }//Fin for

            if(cadenaParteDos.indexOf(".") == 0 || cadenaParteDos.indexOf(".") == cadenaParteDos.length() - 1){
                isValido = false;
            }

            //Si existe algun punto
            boolean hasPuntoPrDos = false;

            //Validamos la primera parte
            for(char letra : letrasCadenaPtDos){

                int letra_ascii = letra;

                if(
                        letra_ascii > 96 && letra_ascii < 123 ||
                                letra_ascii == 46)
                {

                    if(hasPuntoPrDos && letra_ascii == 46){
                        isValido = false;
                        break;
                    }else hasPuntoPrDos = letra_ascii == 46;

                }else{
                    isValido = false;
                    break;
                }
            }//Fin for

            int posPunto = cadenaParteDos.indexOf(".");
            if(posPunto == -1){
                isValido = false;
            }else{
                String extension = cadenaParteDos.substring(posPunto);
                if(!extension.equals(".com")){
                    isValido = false;
                }
            }

        }else{
            isValido = false;
        }

        return isValido;
    }
    
}
