public class GreenPeppers extends Toppings
{
    Pizza pizza;

    public GreenPeppers(Pizza pizza)
    {
        this.pizza = pizza;
    }
        public String getDescription() {
        return pizza.getDescription() + ", Green Peppers";
    }
    public int getCalories() {
    return 5 + beverage.cost();
    }
}
