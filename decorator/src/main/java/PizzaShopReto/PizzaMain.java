package PizzaShopReto;

public class PizzaMain {
    public static void main(String... args) {


        Pizza pizza = new Crunchy(); // basis, nur der boden
        pizza = new Cheese(pizza);
        pizza = new Cheese(pizza); // doppelkaese
        pizza = new Salami(pizza);
        pizza = new Chili(pizza);

        System.out.printf("Your pizza:%nprice: %d%nvegetarian: %b%nhot: %b%n",
                pizza.getPrice(),
                pizza.isVegetarian(),
                pizza.isHot());
    }
}
