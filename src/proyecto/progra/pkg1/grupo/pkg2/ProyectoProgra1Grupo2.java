/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.progra.pkg1.grupo.pkg2;

import java.util.Scanner;

/**
 *
 * @author ingen
 */
public class ProyectoProgra1Grupo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        String nombre = "";

        String apellido = "";
        double salario = 0.0;

        

        System.out.println("Personal de la Empresa");
        System.out.println("Que Gestion le gustaria Realizar en este momento?");
        System.out.println("1. Agregar Nuevo colaborador");
        System.out.println("2. Consultar Informacion acerca de un colaborador");
        System.out.println("3. Obtener Reporte Mensual de Pagos a Jefes");
        System.out.println("4. Obetener Reporte Mensual de Pagos a Supervisores");
        System.out.println("5. Obtener Reporte Mensual de Pagos a Operarios");
        System.out.println("6. Obtener Reporte Mensual General");
   

        opcion = sc.nextInt();

        if (opcion == 1) {
            
            

            Empleado nuevo = new Empleado(nombre, apellido, salario);
            System.out.println("Cual es el nombre del nuevo colaborador?");
            nombre = sc.next();
            System.out.println("Cual es el apellido del nuevo colaborador?");
            apellido = sc.next();
            System.out.println("Cual es el Salario del nuevo colaborador?");
            salario = sc.nextDouble();
            
            nuevo.setnombre(nombre);
            nuevo.setapellido(apellido);
            nuevo.setsalario(salario);
            
            
            nuevo.mostrardatos();
            
            
            
       
            
            
           // nuevo.setnombre(nombre);
           
            
            
            
            
            

        }

    }// fin de main 

}//fin de class
