public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

        // numeric fields
        double price = 21.99;
        int quantity = 0;
        double tax = 1.04;
        double total;
String message;
        if (quantity<=1){
            message = custName+" wants to purchase "+quantity+" "+itemDesc+".";
        }
        else{
            message = custName+" wants to purchase "+quantity+" "+itemDesc+"s.";
        }


        // Calculating total cost
        total = (price*quantity)*tax;


        // Declare outOfStock variable and initialize it
        boolean outOfStock;

        // Test quantity and modify message if quantity > 1.
        if (quantity==0) {
            System.out.println("Item is Out Of Stock");
        }
        else{
            System.out.println(message);
        }

        // Test outOfStock and notify user in either case.



    }

}


