import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        System.out.print("num:");
        int num1 = read.nextInt();

        System.out.print("num2:");
        int num2 = read.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        
    }
}