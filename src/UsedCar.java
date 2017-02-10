/**
 * Created by mpjoh on 2/9/2017.
 */
public class UsedCar extends NewCar {

    private int index;
    private String make;
    private String model;
    private String newused;
    private int year;
    private double price;
    private double mileage;

    public UsedCar(int index, String make, String model, String newused, int year, double price, double mileage)
    {
        super(index, make, model, newused, year, price);

        this.index = index;
        this.make = make;
        this.model = model;
        this.newused = newused;
        this.year = year;
        this.price = price;
        this.mileage = mileage;

    }

    public double getMileage() {
        return mileage;
    }

    public double setMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        //return "\t" + mileage;

         return String.format(
         "%1$5d %2$12s %3$10s %4$9s %5$10d %6$10.2f %7$10f", index, make, model, newused, year, price, mileage);
    }
}
