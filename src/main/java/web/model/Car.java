package web.model;

public class Car {
    private String model;
    private String color;
    private Integer year;

    public Car(String model, String color, Integer year) {
        this.model = model;
        this.color = color;
        this.year = year;
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

    public int getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
               "model='" + model + '\'' +
               ", color='" + color + '\'' +
               ", year=" + year +
               '}';
    }
}
