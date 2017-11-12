package PizzaShopReto;

/**
 * Konkrete Dekoratorklasse
 */
public class Chili extends Topping {
    public Chili(Pizza below) {
        super(below);
    }

    public boolean isHot() {
        return true;
    }
}