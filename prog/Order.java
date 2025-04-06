import java.util.*;
public  class Order {

    private static long counter;
    private long orderNumber = 1;
    private  List<Item> items;

    public Order(Item... items) {
        this.orderNumber = orderNumber;
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public String getReceipt(){
        String order = "Receipt for order #" + orderNumber + "\n-----------\n";
        for (Item item : items)
        {
            order += item.toString();

        }
        orderNumber++;
        return order;
    }

    public double getTotalValuePlusVAT()
    {
        double total = 0;
        for (Item item : items)
        {
            total += item.getPrice() + (item.getPrice()*item.getVAT());
        }
        return total;
    }

    public double getTotalValue()
    {
        double totalPrice = 0.0;

        for(Item item : items)
        {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
