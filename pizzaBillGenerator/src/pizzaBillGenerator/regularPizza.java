package pizzaBillGenerator;

public class regularPizza {
	private final int basePrice; // different for veg and non veg

	   private final int toppingPrice; // different for veg and non veg, added on extra topping

	   private final int cheesePrice = 80; // same for both, added if customer wants extra cheese

	   private final int bagPrice = 20; // added if

	   private final boolean isVeg;

	   private int total;

	   private boolean isCheeseAdded = false;
	   private boolean isToppingsAdded = false;
	   private boolean isTakeAwayAdded = false;

	   regularPizza(boolean isVeg){
	       this.isVeg = isVeg;

	       if(isVeg){ // prices are different for veg and non veg
	           basePrice = 300;
	           toppingPrice = 70;
	           total = 300;
	       }
	       else {
	           basePrice = 400;
	           toppingPrice = 120;
	           total = 400;
	       }
	   }

	   public void extraCheese(){
	       if(isCheeseAdded == false) {
	           total = total + cheesePrice;
	           isCheeseAdded = true;
	       }
	   }

	   public void extraToppings(){
	       if(!isToppingsAdded){
	           total = total + toppingPrice;
	           isToppingsAdded = true;
	       }

	   }

	   public void takeAway(){
	       if(!isTakeAwayAdded){
	           total = total + bagPrice;
	           isTakeAwayAdded = true;
	       }
	   }

	   public String generateBill(){
	       String bill = "Base Price Of The Pizza: " + basePrice + "\n";

	       if(isCheeseAdded) // add in bill if he opted for extra cheese,
	           bill = bill + "Extra Cheese Added: " + cheesePrice + "\n";

	       if(isToppingsAdded) // add if he opted for extra toppings
	           bill = bill + "Extra Toppings Added: " + toppingPrice + "\n";

	       if(isTakeAwayAdded) // if he is opted for takeaway
	           bill = bill + "Paperbag Added: " + bagPrice + "\n";

	       bill = bill + "Total Price: " + total;

	       return bill;
	   }
	}




