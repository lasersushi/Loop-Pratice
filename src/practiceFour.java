public class practiceFour {
    public static void main(String[] args) {
        System.out.println(reverse("tacocat"));
    }
    public static String reverse(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(i, i + 1);
            result = sub + result;
        }
        return result;
    }
}
