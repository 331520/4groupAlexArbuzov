package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом while
*/

public class Task3 {

    public static void main(String[] args) {
        String s = "Alex ";
        int i= 0;
        while (i < 5) { // repeat 5 times
            int j= 0;
            while (j < 10) { //print name 10 times
                System.out.print(j == 9 ? s + "\r\n" : s); //last word in the string will be printed with the "return"
                j++;
            }
            i++;
        }
    }
}