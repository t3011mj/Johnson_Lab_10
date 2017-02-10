import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int inputIndex = 0;
        int i = 0;
        int removeIndex = 0;
        int index = 0;
        String inputBuy = " ";
        String make = " ";
        String model = " ";
        String newused = " ";
        int year = 0;
        double price = 0.0;

        Scanner scan1 = new Scanner(System.in);

        ArrayList<NewCar> carList = new ArrayList<NewCar>();

        carList.add(new NewCar(1, "Mercedes Benz", "E350", "New", 2017, 60000));
        carList.add(new NewCar(2, "Mercedes Benz", "C300", "New", 2017, 50000));
        carList.add(new NewCar(3, "Mercedes Benz", "S500", "New", 2017, 70000));
        carList.add(new UsedCar(4,"Mercedes Benz", "E350", "Used", 2014, 30000, 27800));
        carList.add(new UsedCar(5, "Mercedes Benz", "C300", "Used", 2014, 200000, 50000));
        carList.add(new UsedCar(6, "Mercedes Benz", "S500", "Used", 2014, 50000, 3000));
        carList.add(new NewCar(7, "Mercedes Benz", "ML450", "New", 2017, 75000));
        carList.add(new NewCar(8, "Mercedes Benz", "GL250", "New", 2017, 35000));


        System.out.println("Welcome to the Grand Circus Motors Car Purchase Program");

        System.out.println("Number     Make           Model  New / Used    Year     Price    Mileage");

        for (NewCar c : carList) {
            System.out.println(c.toString());
        }

        System.out.println();

        System.out.println("Enter the number of the Vehicle that you wish to purchase:");
        inputIndex = scan1.nextInt() - 1;

        System.out.println("Selected vehicle is: " + carList.get(inputIndex));
        System.out.println();
        System.out.println("Do you want to buy the car? (Y/N");
        scan1.nextLine();
        inputBuy = scan1.nextLine();

        if (inputBuy.equalsIgnoreCase("Y")) {
            System.out.println("To be removed:" + carList.get(inputIndex));
            carList.remove(inputIndex);
        }

        System.out.println();
        System.out.println("Number     Make           Model  New / Used    Year     Price     Mileage");

        for (NewCar c : carList) {
            System.out.println(c.toString());
        }
    }
}