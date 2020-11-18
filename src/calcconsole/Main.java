package calcconsole;

import java.util.Scanner;

import static calcconsole.Calc.calculation;
import static calcconsole.FromRomanToArabik.*;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();
        String str[] = inputString.split(" ");

        String oper = str[1];
        int[] chislo1 = convert(str[0]);
        int[] chislo2 = convert(str[2]);
        if (chislo1[0] == 0 | chislo2[0] == 0 | chislo1[1] != chislo2[1])
            System.out.println("Fix your request!");
        else {
            int result2 = calculation(chislo1[0], chislo2[0], oper);
            if (chislo1[1] == 0 | result2 == 0)
                System.out.println(result2);
            else
                revConvert(result2);
        }
    }
}




