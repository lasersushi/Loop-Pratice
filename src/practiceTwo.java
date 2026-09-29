public class practiceTwo {
    public static void main(String[] args) {
        countdown(20,6);
    }
    public static void countdown(int start, int step) {
        int ans = 0;
        if (start >= 0) {
            System.out.print(start + " ");
        }
        ans = start - step;
        if (ans >= 0) {
            System.out.print(ans + " ");
        }
        while (ans >= 0) {
            ans = ans - step;
            if (ans >= 0) {
                System.out.print(ans + " ");
            }
        }
    }
}
