public class Program {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int result = call(45);
        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;
        System.out.printf("Execution time: %d milliseconds%n", executionTime);
        System.out.printf("Result: %d%n", result);
    }

    public static int call(int n) {
        if (n == 2) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        return call(n - 1) + call(n - 2);
    }
}
