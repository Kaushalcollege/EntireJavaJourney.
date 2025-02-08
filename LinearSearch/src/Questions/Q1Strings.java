package Questions;

public class Q1Strings {
    public static void main(String ...args) {
        String s1 = "Kaushal";
        char target = 'u';
        System.out.println(searchstring(s1,target));
        System.out.println(searchstring(s1,target));
    }
    static boolean searchstring(String s1,char target) {
        if (s1.isEmpty())
        {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
    static boolean searchstring1(String s1,char target) {
        if (s1.isEmpty())
        {
            return false;
        }
        for (char c : s1.toCharArray()) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }
}
