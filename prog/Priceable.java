public abstract interface Priceable {

    public abstract double getPrice();
    public  double getVAT();

    default double getPriceWithVAT(){
        return getPrice() * (getVAT() + 1);
    }
}
