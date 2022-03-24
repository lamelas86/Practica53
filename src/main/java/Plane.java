public class Plane extends Vehicle implements CanFly {
    private String airport;
    private int maxKg;

    public Plane() {
        super();
        this.airport = "Madrid";
        this.maxKg = 41000;
    }

    public Plane(String brand, String model, String color, float km, int doors,
                 int places, String airport, int maxKg) {
        super(brand, model, color, km, doors, places);
        this.airport = airport;
        this.maxKg = maxKg;
    }

    @Override
    public void fly() {
        System.out.println("Esto es un avión y las aviones sólo pueden" +
                           " circular por los aeropuertos.");
    }

    public void takeOff() {
        System.out.println("Avión despegando.");
    }

    public void land() {
        System.out.println("Avión aterrizando.");
    }

    @Override
    public void start() {
        System.out.println("Iniciando avión.");
    }

    @Override
    public void accelerate() {
        System.out.println("Avión acelerando.");
    }

    @Override
    public void brake() {
        System.out.println("Avión frenando.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Aeropuerto: " + this.airport + ".\n" +
                "Carga máxima: " + this.maxKg + ".\n";
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public int getMaxKg() {
        return maxKg;
    }

    public void setMaxKg(int maxKg) {
        this.maxKg = maxKg;
    }
}
