package calcconsole;


public class FromRomanToArabik {
    public static int[] convert(String numb) {
        switch (numb) {
            case "1":
                return new int[]{1, 0};
            case "2":
                return new int[]{2, 0};
            case "3":
                return new int[]{3, 0};
            case "4":
                return new int[]{4, 0};
            case "5":
                return new int[]{5, 0};
            case "6":
                return new int[]{6, 0};
            case "7":
                return new int[]{7, 0};
            case "8":
                return new int[]{8, 0};
            case "9":
                return new int[]{9, 0};
            case "10":
                return new int[]{10, 0};
            case "I":
                return new int[]{1, 1};
            case "II":
                return new int[]{2, 1};
            case "III":
                return new int[]{3, 1};
            case "IV":
                return new int[]{4, 1};
            case "V":
                return new int[]{5, 1};
            case "VI":
                return new int[]{6, 1};
            case "VII":
                return new int[]{7, 1};
            case "VIII":
                return new int[]{8, 1};
            case "IX":
                return new int[]{9, 1};
            case "X":
                return new int[]{10, 1};
            default:
                return new int[]{0, 0};
        }
    }

    public static void revConvert(int res) {
        String rome = "";
        if (res >= 90 && res < 100) {
            rome += "XC";
            res -= 90;
            rome += rome10(res);
        } else if (res >= 50 && res < 90) {
            rome += "L";
            res -= 50;
            for (int i = 0; i < res / 10; i++)
                rome += "X";
            rome += rome10(res % 10);
        } else if (res >= 40 && res < 50) {
            rome += "XL";
            res -= 40;
            rome += rome10(res);
        } else if (res < 40) {
            for (int i = 0; i < res / 10; i++)
                rome += "X";
            rome += rome10(res % 10);
        } else if (res == 100)
            rome += "C";
        System.out.println(rome);
    }

    public static String rome10(int res) {
        String rome10 = "";
        if (res > 0 && res < 3)
            for (int i = 0; i < res; i++)
                rome10 += "I";
        if (res == 4)
            rome10 += "IV";
        if (res >= 5 && res < 9) {
            rome10 += "V";
            res -= 5;
            if (res > 0 && res < 3)
                for (int i = 0; i < res; i++)
                    rome10 += "I";
        }
        if (res == 9)
            rome10 += "IX";
        return rome10;
    }
}
