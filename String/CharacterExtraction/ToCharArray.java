package String.CharacterExtraction;

public class ToCharArray {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        int length = str.length();

        char ch[] = str.toCharArray();

        //System.out.println("ch: " + ch);

        String result = "";
        for(int i = 0; i < length; i++) {
            char c = ch[i];
            result = result + c;
        }
        System.out.println("result: " + result);
    }
}
