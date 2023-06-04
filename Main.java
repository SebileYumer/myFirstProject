import java.util.Scanner;




public class Main {
    //Да се напише програма, в която имате масив с 5 елемента - дробни
    //числа. Потребителя въвежда номер на число което да се отпечата
    //(число от 1 до 5) и програмата отпечатва съответното число. Ако
    //потребителя въведе невалиден номер на елемент трябва да хвърляте
    //изключение
    //Направете задачата по 2 начина: чрез try/catch и чрез throw new
    //Exception
    public static void printNumberArray(double[] matrix, int n){
        if(n>0 && n<= matrix.length) {
            for (int i = 0; i < matrix.length; i++) {
                if (i == (n - 1)) {
                    System.out.println(matrix[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        double[] matrix = {1.2, 2.3, 3.4, 4.5, 5.6};
        Scanner input = new Scanner(System.in);
       try{
            System.out.print("Въведете номер на елемент от масива, който да се отпечата[1..5]: ");
            int n = input.nextInt();
            printNumberArray(matrix, n);
       } catch (Exception e) {
           System.out.println(e);
        }
    }
}