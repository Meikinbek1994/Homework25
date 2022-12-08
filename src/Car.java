public class Car {

    private int ID;
    private int carNumber;


    public Car(int ID, int carNumber) {
        this.ID = ID;
        this.carNumber = carNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID=" + ID +
                ", carNumber=" + carNumber +
                '}';
    }
}
