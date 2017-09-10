public class BlackOlives extends Toppings
{
    Pizza pizza;

    public BlackOlives(Pizza pizza)
    {
        this.pizza = pizza;
    }
        public String getDescription() {
        return pizza.getDescription() + ", Black Olives";
    }
    public int getCalories() {
    return 10 + pizza.getCalories();
    }
}
