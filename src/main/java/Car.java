public class Car extends Vehicle implements CanDrive {
    private int airbagsQty;
    private boolean hasRoof, hasRadio;

    public Car() {
        super();
        this.airbagsQty = 2;
        this.hasRoof = false;
        this.hasRadio = true;
    }

    public Car(String brand, String model, String color, float km, int doors,
               int places, int airbagsQty, boolean hasRoof, boolean hasRadio) {
        super(brand, model, color, km, doors, places);
        this.airbagsQty = airbagsQty;
        this.hasRoof = hasRoof;
        this.hasRadio = hasRadio;
    }

    @Override
    public void drive() {
        System.out.println("Esto es un coche y los coches circulan" +
                " por carreteras, autovias y autopistas.");
    }

    @Override
    public void start() {
        System.out.println("Arrancando coche.");
    }

    @Override
    public void accelerate() {
        System.out.println("Coche acelerando.");
    }

    @Override
    public void brake() {
        System.out.println("Coche frenando.");
    }

    public void park() {
        System.out.println("Coche aparcando.");
    }

    public void customize(String color) {
        String operation = "Reiniciado el contador de km a 0";

        if (this.hasRoof == false) {
            this.hasRoof = true;
            operation += ", añadido techo solar";
        }

        this.setColor(color);
        operation += " y pintado el coche de color " + color + ".";
        System.out.println(operation);
    }

    @Override
    public String toString() {
        return super.toString() +
               "Airbags: " + this.airbagsQty + ".\n" +
               "Techo solar: " + this.hasRoof + ".\n" +
               "Radio: " + this.hasRadio + ".\n";
    }

    public int getAirbagsQty() {
        return airbagsQty;
    }

    public void setAirbagsQty(int airbagsQty) {
        this.airbagsQty = airbagsQty;
    }

    public boolean isHasRoof() {
        return hasRoof;
    }

    public void setHasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    public boolean isHasRadio() {
        return hasRadio;
    }

    public void setHasRadio(boolean hasRadio) {
        this.hasRadio = hasRadio;
    }
}
