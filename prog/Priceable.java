package prog;

public abstract interface Priceable {

    public abstract double getPrice();
    public abstract double getVAT();

    default double getPriceWithVAT(){
        return getPrice() + getVAT();
    }
}
