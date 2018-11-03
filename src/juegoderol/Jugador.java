//Invertí la mecánica del juego. En vez de dos jugadores con 100 de vida 
//que se golpean hasta que uno muere, hice dos con 10 de vida y en cada
//turno el jugador va sanando al otro hasta que uno llega a 100 ó más de vida.
//Gana el primero que sana al otro.

package juegoderol;
import java.util.Random;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Jugador {
    
    public String nombre;
    public int vida;
    public int minPower;
    public int maxPower;
    public int sanacion;
    public int i;
    public int nj;
        
    //Método para cargar valores atributos. Sólo el nombre por panel.
    public void cargar (int nroJugador){        
        this.vida = 10;
        this.minPower = 10;
        this.maxPower = 50;
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del Jugador "+nroJugador);        
    }
    
    //Método para golpear
    public void sanar(int nroJugador){
        nj = nroJugador;
        if(nj == 2){
            JOptionPane.showMessageDialog(null, JuegoDeRol.getnombre()+":\nSanar a "+this.nombre);
            Random aleatorio = new Random();
            //Calculo sanacion. Valor entre minPower y maxPower.
            sanacion = minPower + aleatorio.nextInt(11)*(maxPower - minPower)/10;
            this.vida = this.vida + sanacion;
            JOptionPane.showMessageDialog(null, "Sanación aplicada: "+sanacion);        
        }
        if(nj == 1){
            JOptionPane.showMessageDialog(null, JuegoDeRol.getnombre()+":\nSanar a "+this.nombre);
            Random aleatorio = new Random();
            //Calculo sanacion. Valor entre minPower y maxPower.
            sanacion = minPower + aleatorio.nextInt(11)*(maxPower - minPower)/10;
            this.vida = this.vida + sanacion;
            JOptionPane.showMessageDialog(null, "Sanación aplicada: "+sanacion);        
        }
         
    }
    
    //Método para aplicar sanacion
    public void aplicarSanacion(){
        this.vida = this.vida + sanacion;
        
        
    }
    
}
