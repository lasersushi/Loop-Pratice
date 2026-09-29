public class practiceThree {
    public static void main(String[] args) {
        System.out.println(countVowels("ROBOTICS RULES"));
    }

    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String result = s.substring(i, i + 1);
            if (result.equalsIgnoreCase("a") || result.equalsIgnoreCase("e") || result.equalsIgnoreCase("i")
                    || result.equalsIgnoreCase("o") || result.equalsIgnoreCase("u")) {
                count++;
            }
        }
        return count;
    }
}
