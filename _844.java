public class _844 {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t));
    }
    public static boolean backspaceCompare(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;
        while(i>=0 || j>=0) {
            int count=0;
            while(i>=0 && (count>0 || s.charAt(i)=='#')) {
                count+=(s.charAt(i)=='#')?1:-1;
                i--;
            }
            count=0;
            while(j>=0 && (count>0 || t.charAt(j)=='#')) {
                count+=(t.charAt(j)=='#')?1:-1;
                j--;
            }
            char left = i < 0 ? '@' : s.charAt(i);
            char right = j < 0 ? '@' : t.charAt(j);
            if(left!=right) {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}
