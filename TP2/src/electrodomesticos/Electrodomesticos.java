package electrodomesticos;

public class Electrodomesticos {

    private String nombre,color;
    private int precioBase,consumo,peso;
    
    public Electrodomesticos(String nombre) {
        this.nombre = nombre;
        this.precioBase = 100;
        this.color = "gris plata";
        this.consumo = 10;
        this.peso = 2;
    }

    public Electrodomesticos(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        this.precioBase = 100;
        this.consumo = 10;
        this.peso = 2;
    }

    public Electrodomesticos(String nombre, int precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = "gris plata";
        this.consumo = 10;
        this.peso = 2;
    }

    public Electrodomesticos(String nombre, int precioBase, int consumo) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = "gris plata";
        this.consumo = consumo;
        this.peso = 2;
    }

    public Electrodomesticos(String nombre, int precioBase, int consumo, int peso) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = "gris plata";
        this.consumo = consumo;
        this.peso = peso;
    }

    public Electrodomesticos(String nombre, int precioBase, int consumo, int peso, String color) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public static void main(String[] args) {
        String nombre="pepe";
        Electrodomesticos ele=new Electrodomesticos(nombre);
        String calConsumo=ele.calcularConsumo();
        int balance=ele.calcularBalance();
        String gama=ele.calcularGama();
        System.out.print(calConsumo+" balance:"+balance+gama);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String calcularConsumo() {
        String estado = "";
        if (consumo < 45) {
            estado = "es de bajo consumo";
        } else {
            estado = "no es de bajo consumo";
        }
        return estado;
    }

    public int calcularBalance() {
        return (precioBase / peso);
    }

    public String calcularGama() {
        String estado = "";
        if (calcularBalance() > 3) {
            estado = "es de gama alta";
        } else {
            estado = "no es de gama alta";
        }
        return estado;
    }
}
