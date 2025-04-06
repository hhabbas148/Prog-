package prog;

import java.util.*;
public  class Order {

    private long orderNumber;
    private static long counter = 1;
    private  List<Item> items;

    public Order(Item[] items) {
        this.orderNumber = orderNumber;
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public String getReciept(){
        String orderNR = "Receipt for order #" + orderNumber + "\n-----------\n";
        String sak = "";
        for (Item item : items)
        {
            sak += item.toString();
        }
        return orderNR + sak;
    }

    public double getTotatValuePlusVAT()
    {
        return 0;
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
