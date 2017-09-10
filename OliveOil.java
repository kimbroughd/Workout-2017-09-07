
public class OliveOil extends Toppings {
	Pizza pizza;
 
	public OliveOil(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Olive Oil and Garlic";
	}
 
	public int getCalories() {
		return 40 + pizza.getCalories();
	}
}
