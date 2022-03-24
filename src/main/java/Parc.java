import java.util.ArrayList;
import java.util.Scanner;

public class Parc {
    public final Scanner sc = new Scanner(System.in);
    ArrayList<Vehicle> garage = new ArrayList<>(5);


    public static void main(String[] args) {
        Parc app = new Parc();

        int selection;

        while (true) {
            selection = app.chooseOption();

            switch (selection) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5: app.createVehicle(selection);
                        break;
                case 6: app.showGarage(app.garage);
                        System.out.println();break;
                case 7: return;
            }
        }

    }

    public int chooseOption() {
        showOptions();

        int selection = sc.nextInt();
        sc.nextLine(); // anti errores
        return selection;
    }

    public void showOptions() {
        System.out.println("Seleccione una opción: \n" +
                "1. Crear un coche\n" +
                "2. Crear un autobús\n" +
                "3. Crear una motocicleta\n" +
                "4. Crear una avioneta\n" +
                "5. Crear un yate\n" +
                "6. Mostrar características de todos los vehículos\n" +
                "7. Salir\n");
    }

    public boolean checkSlot() {
        if (Vehicle.vehicleQty < Vehicle.maxVehicles){
            return true;
        }
        System.out.println("No hay espacio para más vehículos.");
        return false;
    }

    public void createVehicle(int typeOfVehicle) {
        if (checkSlot()) {

            switch(typeOfVehicle) {
                case 1: createCar(); break;
                case 2: createBus(); break;
                case 3: createMotorbike(); break;
                case 4: createPlane(); break;
                case 5: createYacht(); break;
            }
        }
    }

    public void createCar() {
        if (askIfDetailed()) {
            String[] genericDetails = gatherGenericDetails();
            String[] carDetails = gatherCarDetails();

            garage.add(new Car(genericDetails[0], genericDetails[1], genericDetails[2],
                       Float.parseFloat(genericDetails[3]), Integer.parseInt(genericDetails[4]),
                       Integer.parseInt(genericDetails[5]), Integer.parseInt(carDetails[0]),
                       Boolean.parseBoolean(carDetails[1]), Boolean.valueOf(carDetails[2])));

        } else {
            garage.add(new Car());
        }
        System.out.println("Coche creado.");
        System.out.println(garage.get(Vehicle.vehicleQty));
        Vehicle.vehicleQty++;
    }

    public void createBus() {
        if (askIfDetailed()) {
            String[] genericDetails = gatherGenericDetails();
            String[] busDetails = gatherBusDetails();

            garage.add(new Bus(genericDetails[0], genericDetails[1], genericDetails[2],
                    Float.parseFloat(genericDetails[3]), Integer.parseInt(genericDetails[4]),
                    Integer.parseInt(genericDetails[5]), busDetails[0],
                    Boolean.parseBoolean(busDetails[1])));
        } else {
            garage.add(new Bus());
        }

        System.out.println("Autobús creado");
        System.out.println(garage.get(Vehicle.vehicleQty));
        Vehicle.vehicleQty++;
    }

    public void createMotorbike() {
        if (askIfDetailed()) {
            String[] genericDetails = gatherGenericDetails();
            String[] MotorbikeDetails = gatherMotorbikeDetails();

            garage.add(new Motorbike(genericDetails[0], genericDetails[1], genericDetails[2],
                    Float.parseFloat(genericDetails[3]), Integer.parseInt(genericDetails[4]),
                    Integer.parseInt(genericDetails[5]), Integer.parseInt(MotorbikeDetails[0]),
                    Boolean.parseBoolean(MotorbikeDetails[1])));
        } else {
            garage.add(new Motorbike());
        }

        System.out.println("Moto creada");
        System.out.println(garage.get(Vehicle.vehicleQty));
        Vehicle.vehicleQty++;
    }

    public void createPlane() {
        if (askIfDetailed()) {
            String[] genericDetails = gatherGenericDetails();
            String[] planeDetails = gatherPlaneDetails();

            garage.add(new Plane(genericDetails[0], genericDetails[1], genericDetails[2],
                    Float.parseFloat(genericDetails[3]), Integer.parseInt(genericDetails[4]),
                    Integer.parseInt(genericDetails[5]), (planeDetails[0]),
                    Integer.parseInt(planeDetails[1])));
        } else {
            garage.add(new Plane());
        }

        System.out.println("Avión creada");
        System.out.println(garage.get(Vehicle.vehicleQty));
        Vehicle.vehicleQty++;
    }

    public void createYacht() {
        if (askIfDetailed()) {
            String[] genericDetails = gatherGenericDetails();
            String[] yachtDetails = gatherYachtDetails();

            garage.add(new Yacht(genericDetails[0], genericDetails[1], genericDetails[2],
                    Float.parseFloat(genericDetails[3]), Integer.parseInt(genericDetails[4]),
                    Integer.parseInt(genericDetails[5]), Boolean.parseBoolean(yachtDetails[0]),
                    Integer.parseInt(yachtDetails[1]), Integer.parseInt(yachtDetails[2])));
        } else {
            garage.add(new Yacht());
        }

        System.out.println("Yate creado");
        System.out.println(garage.get(Vehicle.vehicleQty));
        Vehicle.vehicleQty++;
    }

    public boolean askIfDetailed() {
        System.out.println("¿Desea introducir los detalles del vehículo? y/n");

        if (sc.nextLine().equals("y")) {
            return true;
        }
        return false;
    }

    public int tipusVehicle(Vehicle vehi) {
        String type = vehi.getClass().getSimpleName();

        switch(type) {
            case "Car": return 1;
            case "Bus": return 2;
            case "Motorbike": return 3;
            case "Plane": return 4;
            case "Yacht": return 5;
        }
        return -1;
    }

    public void showGarage(ArrayList<Vehicle> garage) {

        for (Vehicle vehi: garage) {
            switch(tipusVehicle(vehi)) {
                case 1:
                    Car currentCar = (Car) vehi;
                    System.out.print(currentCar);
                    currentCar.drive();
                    break;
                case 2:
                    Bus currentBus = (Bus) vehi;
                    System.out.print(currentBus);
                    currentBus.drive();
                    break;
                case 3:
                    Motorbike currentMotorbike = (Motorbike) vehi;
                    System.out.print(currentMotorbike);
                    currentMotorbike.drive();
                    break;
                case 4:
                    Plane currentPlane = (Plane) vehi;
                    System.out.print(currentPlane);
                    currentPlane.fly();
                    break;
                case 5:
                    Yacht currentYacht = (Yacht) vehi;
                    System.out.print(currentYacht);
                    currentYacht.sail();
                    break;
            }
            System.out.println();
        }
    }

    public String[] gatherGenericDetails() {
        String[] details = new String[6]; //String brand, String model, String color, float km, int doors, int places

        System.out.println("Introduce la marca.");
        details[0] = sc.nextLine();
        System.out.println("Introduce el modelo.");
        details[1] = sc.nextLine();
        System.out.println("Introduce el color.");
        details[2] = sc.nextLine();
        System.out.println("Introduce los kilómetros.");
        details[3] = sc.nextLine();
        System.out.println("Introduce las puertas.");
        details[4] = sc.nextLine();
        System.out.println("Introduce las plazas.");
        details[5] = sc.nextLine();

        return details;
    }

    public String[] gatherCarDetails() {
        String[] carDetails = new String[3];

        System.out.println("Introduce la cantidad de airbags.");
        carDetails[0] = sc.nextLine();

        System.out.println("¿Tiene techo solar? y/n");
        carDetails[1] = sc.nextLine();
        carDetails[1] = booleanStringConversion(carDetails[1]);

        System.out.println("¿Tiene radio? y/n");
        carDetails[2] = sc.nextLine();
        carDetails[2] = booleanStringConversion(carDetails[1]);

        return carDetails;
    }

    public String[] gatherBusDetails() {
        String[] busDetails = new String[2];

        System.out.println("Introduce el tipo de ruta.");
        busDetails[0] = sc.nextLine();

        System.out.println("¿Es escolar? y/n");
        busDetails[1] = sc.nextLine();
        busDetails[1] = booleanStringConversion(busDetails[1]);

        return busDetails;
    }

    public String[] gatherMotorbikeDetails() {
        String[] motorbikeDetails = new String[2];

        System.out.println("Introduce la potencia.");
        motorbikeDetails[0] = sc.nextLine();

        System.out.println("¿Tiene maletero? y/n");
        motorbikeDetails[1] = sc.nextLine();
        motorbikeDetails[1] = booleanStringConversion(motorbikeDetails[1]);

        return motorbikeDetails;
    }

    public String[] gatherPlaneDetails() {
        String[] planeDetails = new String[2];

        System.out.println("Introduce el aeropuerto.");
        planeDetails[0] = sc.nextLine();
        System.out.println("Introduco la carga máxima (kg).");
        planeDetails[1] = sc.nextLine();

        return planeDetails;
    }

    public String[] gatherYachtDetails() {
        String[] yachtDetails = new String[3];

        System.out.println("¿Tiene cocina? y/n");
        yachtDetails[0] = sc.nextLine();
        yachtDetails[0] = booleanStringConversion(yachtDetails[0]);

        System.out.println("Introduce la cantidad de motores.");
        yachtDetails[1] = sc.nextLine();
        System.out.println("Introduce la longitud del yate.");
        yachtDetails[2] = sc.nextLine();

        return yachtDetails;
    }

    public String booleanStringConversion(String s) {
        if (s.equals("y")) {
            return "true";
        }
        return "false";
    }
}

