package calcconsole;

public class Calc {
    private final int inum1;
    private final int inum2;
    private final String oper;

    public Calc(int inum1, int inum2, String oper) {
        this.inum1 = inum1;
        this.inum2 = inum2;
        this.oper = oper;
    }

    public static int calculation(int inum1, int inum2, String oper) {
        switch (oper) {
            case "+":
                return inum1 + inum2;
            case "-":
                return inum1 - inum2;
            case "*":
                return inum1 * inum2;
            case "/":
                return inum1 / inum2;
            default:
                System.out.print("Error!");

        }

        return 0;
    }
}