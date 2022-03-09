package Project.Shop.entity;

/**
 *
 */
public class CartItem implements Comparable<CartItem> {
    private int id;
    private String name;
    private double price;
    private int amount;



    public CartItem(int id, String name, double price, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public CartItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }



    @Override
    public int compareTo(CartItem o) {

        return this.id-o.id;
    }
}
