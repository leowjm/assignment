
public class Airplane {

    private String id;
    private double price;
    private int yearOfPurchased;
    private int numOfPassenger;
    private static int numberOfAirplane;

    public Airplane() {
        this("", 0.00, 0, 0);

    }

    public Airplane(String id, double price, int yearOfPurchased, int numOfPassenger) {
        this.id = id;
        this.price = price;
        this.yearOfPurchased = yearOfPurchased;
        this.numOfPassenger = numOfPassenger;
        numberOfAirplane++;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumOfPassenger(int numOfPassenger) {
        this.numOfPassenger = numOfPassenger;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfPurchased() {
        return yearOfPurchased;
    }

    public int getNumOfPassenger() {
        return numOfPassenger;
    }

    public static int getNumberOfAirplane() {
        return numberOfAirplane;
    }

    public double calCurrentValue() {
        double value = price - (price * 0.1 * (2011 - yearOfPurchased));

        if (value < 0) {
            return 0;
        }
        return value;

    }

    public String toString() {
        return "ID : " + id + "\n"
                + "Price :" + price + "\n"
                + "Year Of Purchased :" + yearOfPurchased+ "\n"
                + "Num Of Passenger :" +numOfPassenger+ "\n";

    }

}
