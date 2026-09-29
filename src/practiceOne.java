public class practiceOne {
    public static void main(String[] args) {
        System.out.println(sumDigits(4821));
    }
    public static int sumDigits(int n) {
        String intAsString = String.valueOf(n);
        int digits = intAsString.length();
        String result = "";
        int tempAns = 0;
        int finalAns = 0;
        for (int i = 1; i < digits; i++) {
            result = result + intAsString.substring(i,i+1);
            tempAns = Integer.parseInt(result);
            finalAns = finalAns + tempAns;
        }
        return finalAns;
    }
}
