public class LongPlay extends Recording{
    protected LongPlay(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);
    }
    public String getType(){
        return "LP";
    }

    public double getPrice(){
        return getPrice() + ((2025 - getYear()) * 5.0);
    }
}
