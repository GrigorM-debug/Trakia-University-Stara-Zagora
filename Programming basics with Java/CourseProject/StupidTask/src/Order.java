public class Order {
    private String name;
    private double price;

    private double deliveryPrice;

    public Order(String name, double price, double deliveryPrice){
        this.SetName(name);
        this.SetPrice(price);
        this.SetDeliveryPrice(deliveryPrice);
    }
    public String GetName(){
        return this.name;
    }

    public void SetName(String name){
        this.name = name;
    }
    public double GetPrice(){
        return this.price;
    }

    public void SetPrice(double price){
        this.price = price;
    }

    public double GetDeliveryPrice(){
        return this.deliveryPrice;
    }

    public void SetDeliveryPrice(double deliveryPrice){
        this.deliveryPrice = deliveryPrice;
    }
}
