public class Main {
    public static void main(String[] args) {
        ways(3 - 1, 3 - 1, 0, 0, "");
    }

    public static void ways(int m, int n, int i, int j, String str) {
        if (i == m && j == n) {
            System.out.println(str);
            return;
        }
        if (i == m + 1) {
            return;
        }
        if (j == n + 1) {
            return;
        }
        ways(m, n, i + 1, j, str + "V");
        ways(m, n, i, j + 1, str + "H");
    }
}
