import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        int daysNum;
        int dayNum = 0;
        int monthNum;
        int yearNum;

        String prompt1 = "Please input a year";
        String prompt2 = "Please input a month";
        String prompt3 = "Please input a day";
        String prompt4 = "Please input a hour";
        String prompt5 = "Please input a minute";

        yearNum = SafeInput.getRangedInt(sca, prompt1, 1950, 2015);
        monthNum = SafeInput.getRangedInt(sca, prompt2, 1, 12);

        switch (monthNum) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dayNum = 31;
                break;
            case 4: case 6: case 9: case 11:
                dayNum = 30;
                break;
            case 2:
                if (((yearNum % 4 == 0) && !(yearNum % 100 == 0)) || (yearNum % 400 == 0))
                    dayNum = 29;
                else
                    dayNum = 28;
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }

        daysNum = SafeInput.getRangedInt(sca, prompt3, 1, dayNum);
        SafeInput.getRangedInt(sca, prompt4, 1, 12);
        SafeInput.getRangedInt(sca, prompt5, 1, 59);

    }

}
