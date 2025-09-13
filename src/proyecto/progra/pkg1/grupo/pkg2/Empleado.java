package proyecto.progra.pkg1.grupo.pkg2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ingen
 */
public class Empleado {
    Scanner sc= new Scanner (System.in);

    private double salario;
    private int id;
    private String nombre;
    private String apellido;
    private double pagohora; // el pago que se le da por hora extra 
    private double horastrab; //las horas extra que trabaja durante el dia

    public Empleado(String nombre, String apellido, double salario) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.id = id;
        this.pagohora = 0;
        this.horastrab = 0;
    }
    
    public String getnombre(){
        return this.nombre;
    }
    public void setnombre(String nombre){
        this.nombre= nombre;
    }
    public String getapellido(){
        return this.apellido;
    }
    public void setapellido(String apellido){
        this.apellido= apellido;
    }

    public double getsalario() {
        return this.salario;
    }

    public void setsalario(double salario) {
        this.salario = salario;   
    }
    
   

    public void mostrardatos() {
        System.out.println("------------------");
        System.out.printf("Nombre del Empleado: %s\n", this.nombre);
        System.out.printf("Apellido del Empleado: %s\n", this.apellido);
        System.out.printf("Salario del Empleado: %.2f\n", this.salario);
        System.out.printf("ID Empleado: %d\n", this.id);

    }

}
