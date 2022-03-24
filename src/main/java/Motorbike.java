public class Motorbike extends Vehicle implements CanDrive {
    private int motorPotency;
    private boolean hasTrunk;

    public Motorbike() {
        super();
        this.motorPotency = 80;
        this.hasTrunk = false;
    }

    public Motorbike(String brand, String model, String color, float km, int doors,
                     int places, int motorPotency, boolean hasTrunk) {
        super(brand, model, color, km, doors, places);
        this.motorPotency = motorPotency;
        this.hasTrunk = hasTrunk;
    }

    public void drive() {
        System.out.println("Esto es una moto y las motos circulan" +
                " por carreteras, autovias y autopistas.");
    }

    @Override
    public void start() {
        System.out.println("Arrancando moto.");
    }

    @Override
    public void accelerate() {
        System.out.println("Moto acelerando.");
    }

    @Override
    public void brake() {
        System.out.println("Moto frenando.");
    }

    public void park() {
        System.out.println("Moto aparcando.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Potencia de motor: " + this.motorPotency + ".\n" +
                "Maletero: " + this.hasTrunk + ".\n";
    }

    public int getMotorPotency() {
        return motorPotency;
    }

    public void setMotorPotency(int motorPotency) {
        this.motorPotency = motorPotency;
    }

    public boolean isHasTrunk() {
        return hasTrunk;
    }

    public void setHasTrunk(boolean hasTrunk) {
        this.hasTrunk = hasTrunk;
    }
}
