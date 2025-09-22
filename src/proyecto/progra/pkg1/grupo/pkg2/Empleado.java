/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.progra.pkg1.grupo.pkg2;

/**
 *
 * @author ingen
 */
public class Empleado {

    public int id;
    public String nombre;
    public String apellido;
    public double salario;

    public double pagohora;   // pago por hora extra
    public double horastrab;  // horas extra trabajadas
    public double diasTrabajados;

    public String prestamoPlanilla = "";
    public String prestamoCasa = "";
    public String RAP = "";
    public String ISR = "";
    public String manutencion = "";

    public Empleado(int id, String nombre, String apellido, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.pagohora = 0;
        this.horastrab = 0;
        this.diasTrabajados = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int idNuevo) {
        this.id = idNuevo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreNuevo) {
        this.nombre = nombreNuevo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellidoNuevo) {
        this.apellido = apellidoNuevo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double nuevoSalario) {
        this.salario = nuevoSalario;
    }

    public double getHorastrab() {
        return horastrab;
    }

    public void setHorastrab(double horastrab) {
        this.horastrab = horastrab;
    }

    public double getPagohora() {
        return pagohora;
    }

    public void setPagohora(double pagohora) {
        this.pagohora = pagohora;
    }

    public double getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(double diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public String getPrestamoPlanilla() {
        return prestamoPlanilla;
    }

    public void setPrestamoPlanilla(String prestamoPlanilla) {
        this.prestamoPlanilla = prestamoPlanilla;
    }

    public String getPrestamoCasa() {
        return prestamoCasa;
    }

    public void setPrestamoCasa(String prestamoCasa) {
        this.prestamoCasa = prestamoCasa;
    }

    public String getRAP() {
        return RAP;
    }

    public void setRAP(String RAP) {
        this.RAP = RAP;
    }

    public String getISR() {
        return ISR;
    }

    public void setISR(String ISR) {
        this.ISR = ISR;
    }

    public String getmanutencion() {
        return manutencion;
    }

    public void setManutencion(String manutencion) {
        this.manutencion = manutencion;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Salario por dia: Lps." + salario);
        System.out.println("Dias trabajados: " + diasTrabajados);
        System.out.println("Horas extra: " + horastrab);
        System.out.println("Pago por hora extra: Lps." + pagohora);
    }

    public String toString() {
        return nombre + " | " + apellido + " | Lps." + salario + " | ID: 00" + id;
    }
}
