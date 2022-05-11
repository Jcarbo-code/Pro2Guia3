package persona;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    protected String nombre, apellido;
    protected int edad, DNI, peso, altura;
    protected LocalDate nacimiento;
    protected char sexo;

    public Persona(int DNI) {
        this.DNI = DNI;
        this.nombre = "N";
        this.apellido = "N";
        this.nacimiento = LocalDate.of(2000, 1, 1);
        this.sexo = 'F';
        this.peso = 1;
        this.altura = 1;
    }

    public Persona(int DNI, String nombre, String apellido) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = LocalDate.of(2000, 1, 1);
        this.sexo = 'F';
        this.peso = 1;
        this.altura = 1;
    }

    public Persona(int DNI, String nombre, String apellido, LocalDate nacimiento) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.sexo = 'F';
        this.peso = 1;
        this.altura = 1;
    }

    public Persona(int DNI, String nombre, String apellido, LocalDate nacimiento, char sexo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.peso = 1;
        this.altura = 1;
    }

    public Persona(int DNI, String nombre, String apellido, LocalDate nacimiento, char sexo, int peso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = 1;
    }

    public Persona(int DNI, String nombre, String apellido, LocalDate nacimiento, char sexo, int peso, int altura) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public static void main(String[] args) {
        Persona ce = new Persona(903309);
        int masaCorp = ce.calcularMasaCorporal();
        String estadoMasa = ce.calcularEstado();
        String votar = ce.calcularPuedeVotar();
        String mayor = ce.calcularEsMayor();
        String estadoEdad = ce.calcularEstadoEdad();
        String cumple = ce.calcularCumple();
        System.out.println("masa corporal: " + masaCorp);
        System.out.println(estadoMasa);
        System.out.println(estadoEdad);
        System.out.println(cumple);
        System.out.println(votar);
        System.out.println(mayor);
        System.out.println(ce.getAllData());
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.nombre = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int calcularMasaCorporal() {
        return (peso / (altura * altura));
    }

    public String calcularEstado() {
        int forma = calcularMasaCorporal();
        String estado = "";
        if (forma < 18.5) {
            estado = "bajo indice de masa corporal";
        } else if (forma > 25) {
            estado = "alto indice de masa corporal";
        } else {
            estado = "en forma";
        }
        return estado;
    }

    public String calcularEsMayor() {
        String estado = "";
        Period period = Period.between(nacimiento, LocalDate.now());
        if (period.getYears() >= 18) {
            estado = "ES MAYOR";
        } else {
            estado = "ES MENOR";
        }
        return estado;
    }

    public String calcularPuedeVotar() {
        String estado = "";
        Period period = Period.between(nacimiento, LocalDate.now());
        if (period.getYears() >= 16) {
            estado = "puede votar";
        } else {
            estado = "no puede votar";
        }
        return estado;
    }

    public String calcularEstadoEdad() {
        String estado = "";
        Period period = Period.between(nacimiento, LocalDate.now());
        if (period.getYears() == edad) {
            estado = "edad correcta";
        } else {
            estado = "edad incorrecta";
        }
        return estado;
    }

    public String getAllData() {
        return ("Nombre: " + this.nombre + " Edad: " + this.edad + " Nacimiento: " + this.nacimiento + " DNI: " + this.DNI + " Sexo: " + this.sexo + " Altura: " + this.altura + " Peso: " + this.peso);
    }

    public String calcularCumple() {                    //BUSCAR
        String estado = ""; 
        if (nacimiento.month == LocalDate.now().month) {
            if (nacimiento.day == LocalDate.now().day) {
                estado = "es el cumpleanios";
            }
        } else {
            estado = "falta para el cumpleanios";
        }
        return estado;
    }
}
