package java0603;

public class Car {
    private String name;
    private String model;
    private int horsePower;
    private int boost;
    private int finalHorsePower;

    public Car(String name) {
        this.name = name;
        this.model = CarUtil.getRandomModel();
        this.horsePower = CarUtil.getRandomHorsePower();
        this.boost = CarUtil.getRandomBoost();
        this.finalHorsePower = horsePower + (boost * 5);
    }

    public int getFinalHorsePower() {
        return finalHorsePower;
    }

    public String getModel() {
        return this.model;
    }

    public String getName() {
        return name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getBoost() {
        return boost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", boost=" + boost +
                '}';
    }
}
