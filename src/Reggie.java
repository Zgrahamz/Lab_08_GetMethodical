import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String prompt = "Input a String that matches this pattern";

        SafeInput.getRegExString(sca, prompt, "^\\d{3}-\\d{2}-\\d{4}$");

        SafeInput.getRegExString(sca, prompt, "^(M|m)\\d{5}$");

        SafeInput.getRegExString(sca, prompt, "^[OoSsVvQq]$");
    }

}
