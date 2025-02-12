
package pizzaBillgenerator;


public class DeluxePizza extends Pizza  {

	public DeluxePizza(Boolean veg) {
		super(veg);
		super.addExtraCheese();
		super.addExtraToppings();
		super.getBill();
		
	}

}
