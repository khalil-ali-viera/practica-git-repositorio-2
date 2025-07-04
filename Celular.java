public class Celular extends Dispositivo { // INICIO DE LA CLASE Celular;

    // ESTADO;
    // ATRIBUTOS;
    private boolean huellaEnLaPantalla;
    private boolean cincoG;
    private double tamanioPantalla;

    // COMPORTAMIENTO;
    // CONSTRUCTORES;
    public Celular() { // CONSTRUCTOR SIN PARAMETROS;
        super();
    }

    public Celular(String marca, String modelo, boolean estaEncendido, String color, double peso,
            boolean huellaEnLaPantalla, boolean cincoG, double tamanioPantalla) { // CONSTRUCTOR CON PARAMETROS;
        super(marca, modelo, estaEncendido, color, peso);
        this.huellaEnLaPantalla = huellaEnLaPantalla;
        this.cincoG = cincoG;
        this.tamanioPantalla = tamanioPantalla;
    }

    // MÉTODOS GETTERS Y SETTERS;
    public boolean getHuellaEnLaPantalla() { // HUELLA EN LA PANTALLA;
        return this.huellaEnLaPantalla;
    }

    public boolean getCincoG() {
        return this.cincoG;
    }

    public double getTamanioPantalla() {
        return this.tamanioPantalla;
    }

    // MÉTODOS;
    public String enviarMensaje(String mensaje) {
        return mensaje;
    }

    public void llamar() {
        System.out.println("LLAMANDO...");
    }

} // FIN DE LA CLASE Celular;
