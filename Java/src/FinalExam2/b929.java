package FinalExam2;

import java.util.HashSet;
import java.util.Set;

public class b929 {
    public static void main(String [] args){
        String[] arr = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(arr));
    }
    static public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email: emails) {
            String[] arr = email.split("@");
            String local = arr[0];
            local = local.substring(0, local.indexOf("+"));
            local = local.replaceAll("\\.", "");
            set.add(local + "@" + arr[1]);
        }
        return set.size();
    }
}