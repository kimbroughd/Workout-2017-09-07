public class FetaCheese extends Toppings
{
    Pizza pizza;

    public FetaCheese(Pizza pizza)
    {
        this.pizza = pizza;
    }
        public String getDescription() {
        return pizza.getDescription() + ", Feta Cheese";
    }
    public int getCalories() {
    return 35 + pizza.getCalories();
    }
}
