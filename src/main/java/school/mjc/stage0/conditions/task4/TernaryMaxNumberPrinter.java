package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        String result = String.valueOf(first > second ? first : second > third ? second : third);
        System.out.println(result);
    }
}
