public class Dispositivo { // INICIO DE LA CLASE Dispositivo;

    // ESTADO;
    // ATRIBUTOS;
    private String marca;
    private String modelo;
    private boolean estaEncendido;
    private String color;
    private double peso;

    // COMPORTAMIENTOS;
    // CONSTRUCTOR;
    public Dispositivo() { // CONSTRUCTOR SIN PARAMETROS;
        this.estaEncendido = false;
    }

    public Dispositivo(String marca, String modelo, String color, double peso) { // CONSTRUCTOR CON PARAMETROS;
        this.marca = marca;
        this.modelo = modelo;
        this.estaEncendido = false;
        this.color = color;
        this.peso = peso;
    }

    public Dispositivo(String marca, String modelo, boolean estaEncendido, String color, double peso) { // CONSTRUCTOR
                                                                                                        // CON                                                                                      // PARAMETROS;
        this.marca = marca;
        this.modelo = modelo;
        this.estaEncendido = estaEncendido;
        this.color = color;
        this.peso = peso;
    }

    // GETTERS Y SETTERS;
    public String getMarca() { // MARCA;
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() { // MODELO;
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean getEstaEncendido() { // ESTA ENCENDIDO;
        return this.estaEncendido;
    }

    public void setEstaEncendio(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    public String getColor() { // COLOR;
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // MÉTODOS;
    public void encerder() { // ENCENDER;
        this.estaEncendido = true;
        if (estaEncendido == true) {
            System.out.println("encendido");
        }
    }

    public void apagar() { // APAGAR;
        this.estaEncendido = false;
        if (estaEncendido == false) {
            System.out.println("apagado");
        }
    }

    public String mostrarInformacion(){ // MOSTRAR INFORMACIÓN;
        return "Marca: " + this.marca + "\nModelo: " + this.modelo +
        "\nColor: " + this.color + "\nPeso: " + this.peso;                   
    }

} // FIN DE LA CLASE Dispositivo;
