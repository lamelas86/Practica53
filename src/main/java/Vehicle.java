public abstract class Vehicle {
    public static int vehicleQty = 0;
    public static int maxVehicles = 5;

    private String plate, brand, model, color;
    private float km;
    private int doors, places;

    public Vehicle() {
        this.plate = randomPlate();
        this.brand = "Indefinido";
        this.model = "Indefinido";
        this.color = "Blanco";
        this.km = 0;
        this.doors = 4;
        this.places = 5;
    }

    public Vehicle(String brand, String model,
                   String color, float km, int doors, int places) {
        this.plate = randomPlate();
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.km = km;
        this.doors = doors;
        this.places = places;
    }

    private String randomPlate() {
        int generatedNumber = (int) (Math.random()*10000000);
        String plate = String.format("%07d" , generatedNumber);
        return plate;
    }

    public abstract void start();

    public abstract void accelerate();

    public abstract void brake();

    public String toString() {
        return "Matricula: " + plate + "\n" +
               "Marca: " + brand + "\n" +
               "Modelo: " + model + "\n" +
               "Color: " + color + "\n" +
               "KM: " + km + "\n" +
               "Puertas: " + doors + "\n" +
               "Plazas: " + places + "\n";
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }
}
