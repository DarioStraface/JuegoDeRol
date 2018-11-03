
package juegoderol;

import java.util.Random;
import javax.swing.JOptionPane;

public class JuegoDeRol {
    
    int i;
    int alea;
    
    //nombreSanado es la variable para pasar el 1er nombre al metodo sanar. No encontré otra manera de pasarlo.
    public static String nombreSanador;
    
    public static String getnombre (){
        return nombreSanador;
    }

        
    public static void main(String[] args) {
        
        //Creo Jugador 1 e ingreso valores por código y por pantalla (sólo el nombre)
        Jugador j1 = new Jugador();
        j1.cargar(1);
        
        //Creo Jugador 2 e ingreso valores por código y por pantalla (sólo el nombre)
        Jugador j2 = new Jugador();
        j2.cargar(2);
        
        //Muestro parámetros de los jugadores
        JOptionPane.showMessageDialog(null, "Jugador 1 "+"\nNombre: "+j1.nombre+"\nVida: "+j1.vida+"\n\nJugador 2 "+"\nNombre: "+j2.nombre+"\nVida: "+j2.vida);
        
        while(j1.vida<100 && j2.vida<100){

            //La definicion de nombreSanador es para pasar el 1er nombre a la clase Jugador para mostrar en ventana quien sana a quien.
            nombreSanador = j1.nombre;
            //El jugador 1 sana al 2. El metodo se aplica al jugador 2. El argumento "2" es para definir el mensaje en pantalla en el metodo de la clase jugador.
            j2.sanar(2);
            System.out.println(nombreSanador);
            if(j2.vida<100 && j1.vida<100){
                JOptionPane.showMessageDialog(null, "Vida "+j1.nombre+": "+j1.vida+"\nVida "+j2.nombre+": "+j2.vida);
            }

            if(j1.vida<100 && j2.vida<100){
                nombreSanador = j2.nombre;
                j1.sanar(1);
                //Pongo otro if porque si en esta etapa j2 sana a j1 no se tienen que mostrar los valores sino el mensaje final de triunfo.
                if(j1.vida<100){
                JOptionPane.showMessageDialog(null, "Vida "+j1.nombre+": "+j1.vida+"\nVida "+j2.nombre+": "+j2.vida);
                }
            }
        }
        if(j2.vida>=100){
            JOptionPane.showMessageDialog(null, "Vida "+j1.nombre+": "+j1.vida+"\nVida "+j2.nombre+": "+j2.vida+"\n\n"+j2.nombre+" ha sanado completamente.\n\n¡GANO "+j1.nombre+"!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Vida "+j1.nombre+": "+j1.vida+"\nVida "+j2.nombre+": "+j2.vida+"\n\n"+j1.nombre+" ha sanado completamente.\n\n¡GANO "+j2.nombre+"!");
        }
        
    }
}