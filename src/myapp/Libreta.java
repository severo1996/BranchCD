package myapp;

import javax.swing.JOptionPane;

public class Libreta {
    
    
    private String nombre;
    private String DNI;
    private String Apellido;

    public void añadir() {
        JOptionPane.showMessageDialog(null, "Pedir nombre y apellido");
        JOptionPane.showConfirmDialog(null, "Pedir DNI");
        JOptionPane.showConfirmDialog(null, "Pedir");
        
    }

    @Override
    public String toString() {
        return "Libreta{" + "nombre=" + nombre + ", DNI=" + DNI + ", Apellido=" + Apellido + '}';
        
        
    }
   public void metodoprueba(){
       
   }
}
