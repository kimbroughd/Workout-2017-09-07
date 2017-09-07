public class StarbuzzCoffee {
 
	public static void main(String args[]) 
    {
		Beverage beverage = new HouseBlend();
		beverage = new Whip(beverage);
		beverage = new Soy(beverage);
		beverage = new Mocha(beverage);
        beverage = new Mochabeverage);
        beverage = new Mocha(beverage;
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());
	}
}
