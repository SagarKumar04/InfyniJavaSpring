package String.StringComparison;

public class Equals {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Python";
        String str3 = "java";

        boolean result12 = str1.equals(str2);
        System.out.println(result12);

        boolean result13 = str1.equals(str3);
        System.out.println(result13);
    }
}
