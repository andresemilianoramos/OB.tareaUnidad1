public class SmartWatch extends SmartDevice{

    String correa;

    public SmartWatch(){}

    public SmartWatch(String correa) {
        this.correa = correa;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "correa='" + correa + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", añoFabricacion=" + añoFabricacion +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                "} " + super.toString();
    }
}
