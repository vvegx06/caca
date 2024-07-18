/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Atributos {

    public int cedula;
    public String nombre;
    public String apellidos;

    public Atributos(int cedula, String nombre, String apellidos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
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

    public static void pipi(Atributos estudiantes[]) {
        for (int x = 0; x < estudiantes.length; x++) {
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos del estudiante " + x);
            int cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la cedula:"));
            String nombre = JOptionPane.showInputDialog(null, "Escriba el nombre: ");
            String apellidos = JOptionPane.showInputDialog("Escriba los apellidos");
            estudiantes[x] = new Atributos(cedula, nombre, apellidos);
        }
    }
    
    public static void popo(Atributos estudiantes[]) {
        for (int x = 0; x < 4; x++) {
            JOptionPane.showMessageDialog(null, estudiantes[x].getCedula()+ ""+ estudiantes[x].getNombre()+ " "+estudiantes[x].getApellidos());
           
        }
    } 
}
