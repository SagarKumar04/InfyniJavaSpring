package String;

public class Substring {
    public static void main(String[] args) {
        String str = "Java is a programming language";

        String subStr1 = str.substring(10);
        String subStr2 = str.substring(10, 18);

        System.out.println("subStr1: " + subStr1);
        System.out.println("subStr2: " + subStr2);
    }
}
