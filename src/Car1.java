public class Car1 {

    private int producedYear;
    private String model;
    private int price;
    private String color;


    public Car1(int producedYear, String model, int price, String color) {
        this.producedYear = producedYear;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getProducedYear() {
        return producedYear;
    }

    public void setProducedYear(int producedYear) {
        this.producedYear = producedYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "producedYear=" + producedYear +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
