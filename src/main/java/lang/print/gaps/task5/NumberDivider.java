package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        float number = toBeDivided / 5.0f;
        System.out.println(number);
    }

    public static void main(String[] args) {
        NumberDivider divider = new NumberDivider();
        divider.divide(19);
    }
}
