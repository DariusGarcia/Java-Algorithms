package Algorithms;

public class ReverseIterateString {
    public static void reverseIterateString(String string) {
        for (int i = string.length() - 1; i >= 0; i--) {
            char inputString = string.charAt(i);
            System.out.print(inputString);
        }
    }
}

// -------------- Code to include in Main class --------------

//    String str = "Darius Garcia Jr.";
//    ReverseIterateString.reverseIterateString(str);

