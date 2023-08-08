import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

class Item {
    private String name;
    private double price;
    private boolean isImported;
    private boolean isExempt;

    public Item(String name, double price, boolean isImported, boolean isExempt) {
        this.name = name;
        this.price = price;
        this.isImported = isImported;
        this.isExempt = isExempt;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isImported() {
        return isImported;
    }

    public boolean isExempt() {
        return isExempt;
    }
}

class ShoppingBasket {
    private List<Item> items;

    public ShoppingBasket() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}

class Receipt {
    private ShoppingBasket basket;
    private double totalSalesTax;
    private double totalPrice;

    public Receipt(ShoppingBasket basket) {
        this.basket = basket;
        this.totalSalesTax = 0.0;
        this.totalPrice = 0.0;
    }

    public void generateReceipt() {
        DecimalFormat df = new DecimalFormat("0.00");
        for (Item item : basket.getItems()) {
            double salesTax = calculateSalesTax(item);
            totalSalesTax += salesTax;
            double totalPrice = item.getPrice() + salesTax;
            this.totalPrice += totalPrice;
            System.out.println(item.getName() + ": " + df.format(totalPrice));
        }
        System.out.println("Sales Taxes: " + df.format(totalSalesTax));
        System.out.println("Total: " + df.format(this.totalPrice));
    }

    private double calculateSalesTax(Item item) {
        double taxRate = 0.0;
        if (!item.isExempt()) {
            taxRate += 0.1;
        }
        if (item.isImported()) {
            taxRate += 0.05;
        }
        double salesTax = item.getPrice() * taxRate;
        return Math.ceil(salesTax * 20) / 20; // Rounding up to the nearest 0.05
    }
}

public class SalesTaxApp {
    public static void main(String[] args) {
        ShoppingBasket basket1 = new ShoppingBasket();
        basket1.addItem(new Item("1 book", 12.49, false, true));
        basket1.addItem(new Item("1 music CD", 14.99, false, false));
        basket1.addItem(new Item("1 chocolate bar", 0.85, false, true));

        ShoppingBasket basket2 = new ShoppingBasket();
        basket2.addItem(new Item("1 imported box of chocolates", 10.00, true, true));
        basket2.addItem(new Item("1 imported bottle of perfume", 47.50, true, false));

        ShoppingBasket basket3 = new ShoppingBasket();
        basket3.addItem(new Item("1 imported bottle of perfume", 27.99, true, false));
        basket3.addItem(new Item("1 bottle of perfume", 18.99, false, false));
        basket3.addItem(new Item("1 packet of headache pills", 9.75, false, true));
        basket3.addItem(new Item("1 box of imported chocolates", 11.25, true, true));

        Receipt receipt1 = new Receipt(basket1);
        System.out.println("Output 1:");
        receipt1.generateReceipt();

        Receipt receipt2 = new Receipt(basket2);
        System.out.println("\nOutput 2:");
        receipt2.generateReceipt();

        Receipt receipt3 = new Receipt(basket3);
        System.out.println("\nOutput 3:");
        receipt3.generateReceipt();
    }
}
