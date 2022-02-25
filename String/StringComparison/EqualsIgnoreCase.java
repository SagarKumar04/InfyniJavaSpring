package String.StringComparison;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Python";
        String str3 = "java";

        boolean result12 = str1.equalsIgnoreCase(str2);
        System.out.println(result12);

        boolean result13 = str1.equalsIgnoreCase(str3);
        System.out.println(result13);
    }
}
