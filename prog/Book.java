public class Book extends Item implements PriceableWithVAT6{

    private final String author;
    private final double price;
    private final boolean bound;

    public Book(String name, String author, double price, boolean bound ){
        super(name);
        this.author = author;
        this.price = price;
        this.bound = bound;
    }
@Override
    public double getPrice()
    {
        if (bound) {
            return price * 1.3;
        } else {
            return price;
        }
    }
    @Override
    public String toString()
    {
        return getType() + ": " + "name= " + getName() + ", author= " + author +", bound=" + bound + ", price=" + getPrice() + ", price+vat=" + getPriceWithVAT();
    }

    public String getType(){
        return "Book";
    }

}
