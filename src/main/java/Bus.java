public class Bus extends Vehicle implements CanDrive {
    private String routeType;
    private boolean isScholar;

    public Bus() {
        super();
        this.routeType = "Local";
        this.isScholar = false;
    }

    public Bus(String brand, String model, String color, float km, int doors,
               int places, String routeType, boolean isScholar) {
        super(brand, model, color, km, doors, places);
        this.routeType = routeType;
        this.isScholar = isScholar;
    }

    public void drive() {
        System.out.println("Esto es un autobús y los autobuses circulan" +
                " por carreteras, autovias y autopistas.");
    }

    @Override
    public void start() {
        System.out.println("Arrancando autobus.");
    }

    @Override
    public void accelerate() {
        System.out.println("Autobus acelerando.");
    }

    @Override
    public void brake() {
        System.out.println("Autobus frenando.");
    }

    public void openDoors() {
        System.out.println("Autobus abriendo puertas.");
    }

    public void park() {
        System.out.println("Autobus aparcando.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tipo de ruta: " + this.routeType + ".\n" +
                "Escolar: " + this.isScholar + ".\n";
    }

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    public String getRouteType() {
        return this.routeType;
    }
    
    public void setIsScholar(boolean isScholar) {
        this.isScholar = isScholar;
    }

    public String isIsScholar() {
        return this.routeType;
    }
}
