package PizzaShopReto;

/**
 * https://sol.cs.hm.edu/4129/html/461-beispieldecoratorpattern.xhtml
 *
 * Aufzählungstyp als konkrete Komponentenklasse: Pizzaböden.
 * Als konkrete Bausteine dienen Pizzaböden, die „einfachsten” möglichen Pizzas.
 * Die gemeinsamen Eigenschaften von Pizzaböden (Preis, scharf oder nicht) fasst die
 * abstrakte Basisklasse[1] Base zusammen. Alle Pizzaböden sind vegetarisch, Preis und
 * Schärfe werden jeweils im Konstruktor festgelegt:
 */
public abstract class Base implements Pizza {

    private final int price;
    private final boolean hot;

    public Base(int price, boolean hot) {
        this.price = price;
        this.hot = hot;
    }

    public int getPrice() {
        return price;
    }
    public boolean isHot() {
        return hot;
    }
    public boolean isVegetarian() {
        return true;
    }
}