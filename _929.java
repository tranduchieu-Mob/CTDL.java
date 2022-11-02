import java.util.HashSet;
import java.util.Set;

public class _929 {
    public static void main(String[] args) {
        String [] emails = {"test.email+alex@leetcode.com",
                            "test.e.mail+bob.cathy@leetcode.com",
                            "testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String str : emails) {
            StringBuilder sb = new StringBuilder();
            boolean domain = false;
            boolean ignored = false;
            for (char c : str.toCharArray()) {
                if (c == '@') {
                    sb.append(c);
                    domain = true;
                } else if (domain) {
                    if (c == '.' || Character.isLetter(c))
                        sb.append(c);
                } else {
                    if (!ignored && Character.isLetter(c))
                        sb.append(c);
                    else if (c == '+')
                        ignored = true;
                }
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
