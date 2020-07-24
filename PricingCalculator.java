public class PricingCalculator {
    
    double smallPizzaPrice = 5;
    double mediumPizzaPrice = 8;
    double largePizzaPrice = 12;
    double extraLargePizzaPrice = 16;

    double toppingPrice = .75;

    double smallDrinkPrice = 1;
    double mediumDrinkPrice = 2.25;
    double largeDrinkPrice = 3.15;

    public static double getPizzaPrice(Pizza p)
    {
        double price = 0;

        if (p.size == "Small") {
            price += smallPizzaPrice;
        } else if (p.size == "Medium") {
            price += mediumPizzaPrice;
        } else if (p.size == "Large") {
            price += largePizzaPrice;
        } else {
            price += extraLargePizzaPrice;
        }

        for (String tpng : p.toppings) {
            price += toppingPrice;
        }

        return price;
    }

    public static double getDrinkPrice(Drink d) {
        double price = 0;

        if (d.size == "Small") {
            price += smallDrinkPrice;
        } else if (d.size == "Medium") {
            price += mediumDrinkPrice;
        } else if (d.size == "Large") {
            price += largeDrinkPrice;
        }

        return price;
    }
}