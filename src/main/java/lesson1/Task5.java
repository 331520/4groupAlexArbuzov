package lesson1;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
public class Task5 {
    public static void main(String[] args) {
        try {
            System.out.println(reverse("Hello world!!!"));
            System.out.println(reverseArr("Hello world!!!"));
        } catch (Exception e) {
            System.out.println("Something horrible happened : " + e.getLocalizedMessage());// мало ли...
        }
    }

    //By StringBuilder reverse()
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        str = sb.reverse().toString();
        return str;
    }

    //By array decrement
    public static String reverseArr(String str) {
        String res = "";
        char[] ch = str.toCharArray();
        for (int i = ch.length-1; i >= 0; i--) {
            //System.out.print(ch[i]);
            res += ch[i];
        }
        return res;
    }
}
