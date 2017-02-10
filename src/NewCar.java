/**
 * Created by mpjoh on 2/9/2017.
 */
public class NewCar {

        // private var does not allow other developers to change the attributes

        private int index;
        private String make;
        private String model;
        private String newused;
        private int year;
        private double price;

        public NewCar(int index, String make, String model, String newused, int year, double price) {
            this.index = index;
            this.make = make;
            this.model = model;
            this.newused = newused;
            this.year = year;
            this.price = price;
        }

        public int getIndex() {
            return index;
        }

        public int setIndex() {
            return index;
        }

        public String getMake() {
            return make;
        }

        public String setMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public String setModel() {
            return model;
        }

        public String getNewUsed() {
            return newused;
        }

        public String setNewUsed() {
            return newused;
        }

        public int getYear() {
            return year;
        }

        public int setYear() {
            return year;
        }

        public double getPrice() {
            return price;
        }

        public double setPrice() {
            return price;
        }

        @Override
        public String toString() {
            // return make + "\t" + "\t" + model + "\t" +  "\t" + year + "\t$" + price;
            return String.format("%1$5d %2$12s %3$10s %4$9s %5$10d %6$10.2f", index, make, model, newused, year, price);
        }
    }

