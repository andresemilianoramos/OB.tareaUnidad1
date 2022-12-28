public class SmartPhone extends SmartDevice{
    String material;

    public SmartPhone(){}

    public SmartPhone(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", añoFabricacion=" + añoFabricacion +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                "} ";
    }
}
