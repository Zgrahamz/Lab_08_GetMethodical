import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int favInt = 0;
        double favDouble = 0.0;

        String prompt = "Input your favorite integer";
        favInt = SafeInput.getInt(sca, prompt);

        prompt = "Now input your favorite double";
        favDouble = SafeInput.getDouble(sca, prompt);

        System.out.println("\n" + "Your favorite integer is " + favInt + " and your favorite double is " + favDouble);
    }
}