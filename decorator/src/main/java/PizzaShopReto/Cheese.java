package PizzaShopReto;

/**
 * Konkrete Dekoratorklasse
 */
public class Cheese extends Topping {
    public Cheese(Pizza below) {
        super(below);
    }

    public int getPrice() {
        return 100 + super.getPrice();
    }
}