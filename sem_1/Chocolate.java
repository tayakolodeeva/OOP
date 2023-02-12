package sem_1;

public class Chocolate extends Product {
    int percentageOfCocoa;
    Types type;

    public Chocolate(String name, double cost, int percentageOfCocoa, Types type) {
        super(name, cost, type);
        this.percentageOfCocoa = percentageOfCocoa;
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", percentageOfCocoa: %s", this.percentageOfCocoa);
    }
}
