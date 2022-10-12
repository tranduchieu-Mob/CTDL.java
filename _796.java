public class _796 {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        String s2 = s + s;
        return (s2.contains(goal));
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }
}
