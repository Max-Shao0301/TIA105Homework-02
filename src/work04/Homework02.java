package work04;

public class Homework02 {
    public static void main(String[] args) {
        new ReverseString().reverse("Hello World");
    }
}

class ReverseString{
    public void reverse(String str) {
        char[] charArray = str.toCharArray();
        char[] reversed = new char[charArray.length];//接收倒敘
        for (int i = charArray.length - 1, j = 0; i >=0; i--, j++) {
            reversed[j] = charArray[i];
        }
        for (char s : reversed) {
            System.out.print(s);
        }
    }
}