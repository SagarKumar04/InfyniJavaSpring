package String.StringComparison;

public class CompareTo {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Python";
        String str3 = "java";

        int result12 = str1.compareTo(str2);
        System.out.println(result12);

        int result13 = str1.compareTo(str3);
        System.out.println(result13);

        int result21 = str2.compareTo(str1);
        System.out.println(result21);

        String str4 = "Applesabcd";
        String str5 = "Applesabcdefghu";
        int result45 = str4.compareTo(str5);
        System.out.println(result45);
    }
}
