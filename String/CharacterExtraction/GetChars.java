package String.CharacterExtraction;

public class GetChars {
    public static void main(String[] args) {
        String str = "Java is a programming language";

        int startIndex = 3;
        int endIndex = 12;
        char destination[] = new char[(endIndex - startIndex) * 2];
        int destinationStart = 6;

        str.getChars(startIndex, endIndex, destination, destinationStart);

        //convert a character array to a string
        String result = new String(destination);

        System.out.println("result: " + result);
    }
}
