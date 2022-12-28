public class SmartDevice {

    // definimos los atributos del General SmartDevices:
    String color;
    String marca;
    String sistemaOperativo;
    Integer añoFabricacion;
    String modelo;
    String tipo;

    // creamos el constructor vacio:
    public SmartDevice(){
    }

    // creamos el constructor con todos los atributos por clase.

    public SmartDevice(String color, String marca, String sistemaOperativo,
                       Integer añoFabricacion, String modelo, String tipo)
    {
        this.color = color;
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
        this.añoFabricacion = añoFabricacion;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", añoFabricacion=" + añoFabricacion +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
