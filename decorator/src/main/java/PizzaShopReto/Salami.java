package PizzaShopReto;

/**
 * Konkrete Dekoratorklasse
 */
public class Salami extends Topping {
    public Salami(Pizza below) {
        super(below);
    }

    public int getPrice() {
        return 150 + super.getPrice();
    }

    public boolean isVegetarian() {
        return false;
    }
}