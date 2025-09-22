/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.progra.pkg1.grupo.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ingen
 */
public class ProyectoProgra1VersionFinalGrupo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        int opcion = 0;
        int id = 4;

        // Guarde 3 empleados de muestra para no tener que agregar tanto manualmente y asi poder probar el codigo
        Empleado emp1 = new Empleado(1, "Kevin", "Zelaya", 200);
        empleados.add(emp1);
        Empleado emp2 = new Empleado(2, "Luis", "Barahona", 100);
        empleados.add(emp2);
        Empleado emp3 = new Empleado(3, "Josue", "Medina", 150);
        empleados.add(emp3);

        do {
            System.out.println("\n---------------------------------------------");
            System.out.println("1. Agregar nuevo colaborador");
            System.out.println("2. Agregar deducciones a colaborador");
            System.out.println("3. Ver todos los colaboradores");
            System.out.println("4. Agregar dias trabajados");
            System.out.println("5. Agregar horas extra y valor por hora");
            System.out.println("6. Ver resumen sin deducciones");
            System.out.println("7. Ver total mensual (salario + horas extra)");
            System.out.println("8. Ver reporte con deducciones");
            System.out.println("9. Eliminar colaborador");
            System.out.println("10. Salir");
            System.out.println("---------------------------------------------\n");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            System.out.println("\n---------------------------------------------\n");

            switch (opcion) {

                case 1:
                    int agregar = 1;
                    while (agregar == 1) {
                        System.out.println("Ingrese el nombre del colaborador:");
                        String nombre = sc.next();

                        System.out.println("Ingrese el apellido del colaborador:");
                        String apellido = sc.next();

                        System.out.println("Ingrese el salario por dia:");
                        double salario = sc.nextDouble();

                        Empleado nuevoEmpleado = new Empleado(id, nombre, apellido, salario);
                        empleados.add(nuevoEmpleado);

                        id = id + 1;

                        System.out.println("Desea agregar otro colaborador? (1 = si / 2 = no):");
                        agregar = sc.nextInt();
                    }
                    break;

                case 2:

                    int opcionPrestamoCasa = 0;
                    int opcionPrestamoPlanilla = 0;
                    int opcionRAP = 0;
                    int opcionISR = 0;
                    int opcionManutencion = 0;

                    System.out.println("Ingrese el ID del colaborador:");
                    int idDeduccion = sc.nextInt();
                    Empleado empDeduccion = null;

                    for (Empleado e : empleados) {
                        if (e.getId() == idDeduccion) {
                            empDeduccion = e;
                            break;
                        }
                    }

                    if (empDeduccion != null) {
                        System.out.println("Asignando deducciones a: " + empDeduccion.getNombre() + " " + empDeduccion.getApellido());

                        System.out.println("Aplica a prestamo de planilla? (1 = si / 2 = no):");
                        opcionPrestamoPlanilla = sc.nextInt();

                        if (opcionPrestamoPlanilla == 1) {
                            empDeduccion.setPrestamoPlanilla("Aplica");
                        } else {
                            empDeduccion.setPrestamoPlanilla("No aplica");
                        }

                        System.out.println("Aplica a prestamo de casa? (1 = si / 2 = no):");
                        opcionPrestamoCasa = sc.nextInt();

                        if (opcionPrestamoCasa == 1) {
                            empDeduccion.setPrestamoCasa("Aplica");
                        } else {
                            empDeduccion.setPrestamoCasa("No aplica");
                        }

                        System.out.println("Aplica a RAP? (1 = si / 2 = no):");
                        opcionRAP = sc.nextInt();

                        if (opcionRAP == 1) {
                            empDeduccion.setRAP("Aplica");
                        } else {
                            empDeduccion.setRAP("No aplica");
                        }

                        System.out.println("Aplica a ISR? (1 = si / 2 = no):");
                        opcionISR = sc.nextInt();

                        if (opcionISR == 1) {
                            empDeduccion.setISR("Aplica");
                        } else {
                            empDeduccion.setISR("No aplica");
                        }

                        System.out.println("Aplica a manutencion? (1 = si / 2 = no):");
                        opcionManutencion = sc.nextInt();

                        if (opcionManutencion == 1) {
                            empDeduccion.setManutencion("Aplica");
                        } else {
                            empDeduccion.setManutencion("No aplica");
                        }

                        System.out.println("Deducciones asignadas correctamente.");
                    } else {
                        System.out.println("Colaborador no encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("\nLista de colaboradores:");
                    for (int i = 0; i < empleados.size(); i++) {
                        Empleado e = empleados.get(i);
                        System.out.println(e.getNombre()
                                + " | "
                                + e.getApellido()
                                + " | Lps." + e.getSalario()
                                + " | ID: 00" + e.getId());
                    }
                    break;

                case 4:

                    int idBuscado = 0;

                    System.out.println("Ingrese el ID del colaborador:");
                    idBuscado = sc.nextInt();
                    Empleado encontrado = null;

                    for (int i = 0; i < empleados.size(); i++) {
                        Empleado e = empleados.get(i);
                        if (e.getId() == idBuscado) {
                            encontrado = e;
                            break;
                        }
                    }

                    if (encontrado != null) {
                        System.out.println("Colaborador encontrado: " + encontrado.getNombre() + " " + encontrado.getApellido());
                        System.out.println("Cuantos dias trabajo?");
                        double dias = sc.nextDouble();

                        encontrado.setDiasTrabajados(dias);

                        double total = dias * encontrado.getSalario();
                        System.out.println("Salario total sin extras: Lps." + total);
                    } else {
                        System.out.println("No se encontro ningun colaborador con ese ID.");
                    }
                    break;

                case 5:

                    int idExtra = 0;

                    System.out.println("Ingrese el ID del colaborador:");
                    idExtra = sc.nextInt();
                    Empleado encontradoExtra = null;

                    for (int i = 0; i < empleados.size(); i++) {
                        if (empleados.get(i).getId() == idExtra) {
                            encontradoExtra = empleados.get(i);
                            break;
                        }
                    }

                    if (encontradoExtra != null) {
                        System.out.println("Colaborador encontrado: " + encontradoExtra.getNombre() + " " + encontradoExtra.getApellido());
                        System.out.println("Ingrese cantidad de horas extra:");
                        double horas = sc.nextDouble();
                        System.out.println("Ingrese el pago por hora extra:");
                        double valor = sc.nextDouble();

                        encontradoExtra.setHorastrab(horas);
                        encontradoExtra.setPagohora(valor);
                        System.out.println("Datos de horas extra guardados.");
                    } else {
                        System.out.println("ID no encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("\nTOTAL mensual incluyendo horas extra:");
                    for (int i = 0; i < empleados.size(); i++) {
                        Empleado e = empleados.get(i);
                        double dias = e.getDiasTrabajados();
                        double extras = e.getHorastrab() * e.getPagohora();
                        double base = e.getSalario() * e.getDiasTrabajados();
                        double total = base + extras;
                        System.out.println("ID: " + e.getId());
                        System.out.println("Nombre: " + e.getNombre() + " " + e.getApellido());
                        System.out.println("Dias: " + dias);
                        System.out.println("Salario base: Lps." + base);
                        System.out.println("Horas extra: Lps." + extras);
                        System.out.println("TOTAL MES: Lps." + total);
                        System.out.println("-----------------------------");
                    }
                    break;

                case 7:
                    System.out.println("\nResumen sin deducciones:");
                    for (int i = 0; i < empleados.size(); i++) {
                        Empleado e = empleados.get(i);
                        System.out.println("ID: " + e.getId());
                        System.out.println("Nombre: " + e.getNombre());
                        System.out.println("Apellido: " + e.getApellido());
                        System.out.println("Salario por dia: Lps." + e.getSalario());
                        System.out.println("Dias trabajados: " + e.getDiasTrabajados());
                        double salarioBase = e.getSalario() * e.getDiasTrabajados();
                        System.out.println("Salario total sin extras: Lps." + salarioBase);
                        System.out.println("Horas extra: " + e.getHorastrab());
                        System.out.println("Pago por hora extra: Lps." + e.getPagohora());
                        System.out.println("-----------------------------");
                    }
                    break;

                case 8:

                    System.out.println("\nReporte mensual con deducciones :");

                    for (Empleado e : empleados) {
                       
                        double pagoExtra;
                        double base;
                        double total;
                        double descuento;
                        double deduccionesExtras;
                        double rap = 0;
                        double isr = 0;
                        double totalDeducciones;
                        double finalTotal;

                       
                        pagoExtra = e.getHorastrab() * e.getPagohora();
                        base = e.getSalario() * e.getDiasTrabajados();
                        total = base + pagoExtra;
                        descuento = total; 
                        deduccionesExtras = 0;

                        
                        System.out.println("Colaborador: " + e.getNombre() + " " + e.getApellido());

                     
                        if (e.getPrestamoPlanilla().equals("Aplica")) {
                            System.out.println("Prestamo planilla: -Lps. 500");
                            deduccionesExtras += 500;
                        } else {
                            System.out.println("Prestamo planilla: No aplica");
                        }

                        // Prestamo casa
                        if (e.getPrestamoCasa().equals("Aplica")) {
                            System.out.println("Prestamo casa: -Lps. 1000");
                            deduccionesExtras += 1000;
                        } else {
                            System.out.println("Prestamo casa: No aplica");
                        }

                      
                        if (e.getRAP().equals("Aplica")) {
                            rap = total * 0.015;
                            System.out.println("RAP (1.5%): -Lps. " + rap);
                            deduccionesExtras += rap;
                        } else {
                            System.out.println("RAP: No aplica");
                        }

                        
                        if (e.getISR().equals("Aplica")) {
                            isr = total * 0.05;
                            System.out.println("ISR (5%): -Lps. " + isr);
                            deduccionesExtras += isr;
                        } else {
                            System.out.println("ISR: No aplica");
                        }

                        
                        if (e.getmanutencion().equals("Aplica")) {
                            System.out.println("Manutencion: -Lps. 750");
                            deduccionesExtras += 750;
                        } else {
                            System.out.println("Manutencion: No aplica");
                        }

                        
                        totalDeducciones = descuento + deduccionesExtras;
                        finalTotal = total - totalDeducciones;

                        
                        System.out.println("Salario base: Lps." + base);
                        System.out.println("Pago horas extra: Lps." + pagoExtra);
                        System.out.println("Deduccion general (10%): Lps." + descuento);
                        System.out.println("Deducciones adicionales: Lps." + deduccionesExtras);
                        System.out.println("TOTAL FINAL CON DEDUCCIONES: Lps." + finalTotal);
                        System.out.println("-----------------------------");
                    }

            
            break;
        

          case 9:

                    int idEliminar = 0;

                    System.out.println("Ingrese el ID del colaborador a eliminar:");
                    idEliminar = sc.nextInt();

                    Empleado eliminar = null;

                    for (int i = 0; i < empleados.size(); i++) {
                        if (empleados.get(i).getId() == idEliminar) {
                            eliminar = empleados.get(i);
                            break;
                        }
                    }

                    if (eliminar != null) {
                        System.out.println("Seguro que desea eliminar a " + eliminar.getNombre() + " (1 = si / 2 = no):");
                        int confirm = sc.nextInt();
                        if (confirm == 1) {
                            empleados.remove(eliminar);
                            System.out.println("Colaborador eliminado.");
                        } else {
                            System.out.println("Eliminacion cancelada.");
                        }
                    } else {
                        System.out.println("No se encontro un colaborador con ese ID.");
                    }
                    break;

                case 10:
                    System.out.println("Cerrando sesion...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

        
    
    }


while (opcion != 9);

    } // fin de main 
}//fin de class
