import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double total = 0;
        String prompt1 = "Welcome to the $10 Store, where nothing is more than $10. Enter an item price:";
        String prompt2 = "Continue shopping?";
        boolean doneShopping = false;

        do {
            total += SafeInput.getRangedDouble(sca, prompt1, 0.50, 10);
            System.out.println("Your total is " + total);
            

            if(!SafeInput.getYNConfirm(sca, prompt2)) {
                doneShopping = true;
            }

        } while (!doneShopping);
    }
}
