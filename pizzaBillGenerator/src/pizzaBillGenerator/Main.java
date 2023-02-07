package pizzaBillGenerator;

public class Main {
	public static void main(String[] args){

        regularPizza order1 = new regularPizza(false);
        order1.takeAway();
        System.out.println(order1.generateBill());

        System.out.println();
        deluxePizza order2 = new deluxePizza(false);
        order2.takeAway();
        System.out.println(order2.generateBill());

    }


}
