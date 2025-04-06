package prog;

public abstract class Recording extends Item implements PriceableWithVAT25 {

    private final String artist;
    private final int year;
    private int condition;
    private final double price;
    protected Recording(String name, String artist, int year, int condition, double price) {
        super(name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }

    public String getArtist(){
        return artist;
    }
    public int getYear(){
        return year;
    }
    public int getCondition(){
        return condition;
    }
    @Override
    public double getPrice(){
        double newPrice = 0.00;
        if (condition < 0 || condition > 10)
        {
            return 0;
        } else {
            newPrice = price * (condition * 0.1);
        }
        return Math.max(10.0, (newPrice));
    }

    @Override
    public double getVAT() {
        return 0.25;
    }

    @Override
    public String toString(){
        return getType() + ": " + "name= " + getName() + ", artist= " + getArtist() +", year=" + getYear() + ", condition=" + getCondition() + ", original price=" + getOriginalPrice() + ", price=" + getPrice() + ", price+vat=" + getPriceWithVAT();
    }

    public abstract String getType();

    protected double getOriginalPrice(){
        return price;
    }
}
