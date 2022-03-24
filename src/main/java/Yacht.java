public class Yacht extends Vehicle implements CanSail {
    private boolean hasKitchen;
    private int motorQty, length;

    public Yacht() {
        super();
        this.hasKitchen = false;
        this.motorQty = 1;
        this.length = 15;
    }

    public Yacht(String brand, String model, String color, float km, int doors,
                 int places, boolean hasKitchen, int motorQty, int length) {
        super(brand, model, color, km, doors, places);
        this.hasKitchen = hasKitchen;
        this.motorQty = motorQty;
        this.length = length;
    }

    @Override
    public void sail() {
        System.out.println("Esto es un yate y los yates pueden navegar" +
                           " en el mar.");
    }



    @Override
    public void start() {
        System.out.println("Iniciando yate.");
    }

    @Override
    public void accelerate() {
        System.out.println("Yate acelerando.");
    }

    @Override
    public void brake() {
        System.out.println("Yate frenando.");
    }

    public void setSail() {
        System.out.println("Yate zarpando..");
    }

    public void dock() {
        System.out.println("Yate atracando.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cocina: " + this.hasKitchen + ".\n" +
                "Motores: " + this.motorQty + ".\n" +
                "Longitud: " + this.length + ".\n";
    }

    public boolean isHasKitchen() {
        return hasKitchen;
    }

    public void setHasKitchen(boolean hasKitchen) {
        this.hasKitchen = hasKitchen;
    }

    public int getMotorQty() {
        return motorQty;
    }

    public void setMotorQty(int motorQty) {
        this.motorQty = motorQty;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
