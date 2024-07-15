import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String prompt = "Input a String";
        SafeInput.getNonZeroLenString(sca, prompt);

        prompt = "Input an int";
        SafeInput.getInt(sca, prompt);

        prompt = "Input a double";
        SafeInput.getDouble(sca, prompt);

        prompt = "Input an int within the range";
        SafeInput.getRangedInt(sca, prompt, 1, 10);

        prompt = "Input a double within the range";
        SafeInput.getRangedDouble(sca, prompt, 1.5, 12.3);

        prompt = "Play again?";
        SafeInput.getYNConfirm(sca, prompt);

        prompt = "Input a String that matches this regEx";
        SafeInput.getRegExString(sca, prompt, "^\\d{3}-\\d{2}-\\d{4}$");

        SafeInput.prettyHeader("Message Centered Here");
    }
}