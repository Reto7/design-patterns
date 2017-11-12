package PizzaShopReto;

/**
 * Abstrakte Dekoratorklasse: Pizzaauflage.
 *
 * Die verschiedenen Auflagen werden als Dekoratoren implementiert.
 * Die gemeinsame Eigenschaft aller Auflagen, die Verwaltung der darunterliegenden Pizza,
 * wird in eine gemeinsame abstrakte Basisklasse Topping herausgezogen. Topping implementiert
 * das Interface Pizza und enthält eine Objektvariable vom Typ Pizza, die die darunterliegende
 * restliche Pizza ohne diese Auflage repräsentiert. Die Klasse ist abstrakt, obwohl sie keine
 * abstrakten Methoden enthält. Damit können keine Instanzen erzeugt werden. Alle Methoden des
 * Interface werden an die Objektvariable delegiert.
 */
public abstract class Topping implements Pizza {
    private final Pizza below;

    public Topping(Pizza below) {
        this.below = below;
    }

    public boolean isVegetarian() {
        return below.isVegetarian();
    }

    public boolean isHot() {
        return below.isHot();
    }

    public int getPrice() {
        return below.getPrice();
    }
}