/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calle13;

/**
 *
 * @author ANDRES
 */
public class Grabadora extends Electrodomestico
{
    
    boolean encendido;
    int volumen;
    int voltemp;
    boolean mute;
    double frecuencia;
    boolean modulacion;
    boolean unidad;
    boolean reproduccion;
    boolean pausada;
    int cancion;
    boolean bandeja;
    String potencia;
    

    public Grabadora(String marca, String entradaelectrica) {
        super(marca, entradaelectrica);
    }
    
    
    @Override
    void enceder() {
        if (encendido != true) {
            encendido = true;
        } else {
            encendido = false;
        }
    }

    
    public void subirVol() {
        if (mute == false) {
            if (volumen == 100) {
                volumen = 100;
            } else {
                volumen++;
            }
        }
        else{
            mute=false;
            if(voltemp==100)
            {
                volumen=100;
            }
            else{
                volumen=(byte)voltemp++;
            }
        }
    }

    public void bajarVolumen() {
        if(mute==false)
        {
            if(volumen==0)
               volumen=0;
            else{
                volumen--;}
        }
        else{
            mute=false;
      
            if (voltemp == 0) {
                volumen = 0;
            } else {
            volumen=voltemp--;
            }
        }

    }    
       
     public void silenciar() {

        if (mute == false) {
            mute = true;
            voltemp = volumen;
            volumen = 0;
        } else {
            mute = false;
            volumen = voltemp;
            voltemp = 0;
        }
    }
    
    public void subirFrecuencia() {
        if (frecuencia == 170) {
            frecuencia = 88;
        } else {
            frecuencia++;
        }

        
    }

    public void bajarFrecuencia() {
        if (frecuencia == 88) {
            frecuencia = 170;
        } else {
            frecuencia--;
        }
        
    }
        
    public void cambiarFrecuencia(int siguienteFrecuencia) 
    {
        if (siguienteFrecuencia<88) {
            frecuencia=frecuencia;
        }
        
        else   {
            
        if (siguienteFrecuencia>170) {
            frecuencia=frecuencia;
        }
        
        else{
        frecuencia= (double) siguienteFrecuencia;
        }
        
        }
   
    } 

    public Grabadora(String potencia, String marca, String entradaelectrica) {
        super(marca, entradaelectrica);
        this.potencia = potencia;
    }
     
    @Override
    public String toString() {
        return "------------------\n"
                + "Estado: " + encendido + "\n"
                + "Vol: " + "" + volumen
                + "\n" + "Can: " + frecuencia
                + "\n"+ mute;
    }

    public void mostrarMenuGrab()
    {
        
        if(encendido==true){
        System.out.println("-------------------"
                         +"\n 2- Para Subir Volumen "
                         + "\n 3- Para Bajar Volumen"
                         + "\n 4- Para Subir frecuencia"
                         + "\n 5- Para Bajar frecuencia"
                         + "\n 6- Para Mute"
                         + "\n 7- Para Cambiar Modulacion"
                         + "\n 8- Para Cambiar Unidad"
                         + "\n 9- Para Reproducir Cd"
                         + "\n 10- Para Pausar Cd"
                         + "\n 11- Para Siguiente Canción"
                         + "\n 12- Para Canción Anterior"
                         + "\n 13- Para Abrir Bandeja"
                         + "\n 14- Para Cerrar Bandeja"
                         + "\n 1- Para Apagar");
        
        }
    }
    
}

    
}
     
     
     
     
     
     
 