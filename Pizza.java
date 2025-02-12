package pizzaBillgenerator;

public class Pizza {
	private int price;
	private Boolean veg;
	private int extraCheesePrice=100;
	private int extraToppingsPrice=150;
	private int backPackPrice=20;
	
	
	
	public Pizza(Boolean veg) {
		this.veg=veg;
		if(this.veg) {
			this.price=300;
			System.out.println("Veg Pizaa :"+ this.price);
		}else {
			this.price=400;
			System.out.println("Nonveg Pizza :"+this.price);
		}
   }
	public void addExtraCheese() {
		System.out.println("Extra Cheese added :"+this.extraCheesePrice);
		this.price+=extraCheesePrice;
		
	}
	public void addExtraToppings() {
		System.out.println("Extra Toppings added :"+ this.extraToppingsPrice);
		this.price+=extraToppingsPrice;
		
	}
	public void takeAway() {
		System.out.println("Take Away :"+ this.backPackPrice);
		this.price+=backPackPrice;
		
	}
	public void getBill() {
		System.out.println("Total :"+ this.price);
		System.out.print("THANKYOU FOR VISITING");
		
	}
	 
	
	
	

}
