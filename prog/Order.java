import java.util.*;
public  class Order {

    private long orderNumber;
    private static long counter = 1;
    private  List<Item> items;

    public Order(Item... items) {
        this.orderNumber = orderNumber;
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public String getReceipt(){
        String orderNR = "Receipt for order #" + orderNumber + "\n-----------\n";
        String sak = "";
        for (Item item : items)
        {
            sak += item.toString();
        }
        return orderNR;
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
