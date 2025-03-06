import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        System.out.print("Nome do vendedor:");
        String Vendedor = read.nextLine();

        System.out.print("Salario Fixo:");
        Float Salario = read.nextFloat();

        System.out.print("Vendas no mês:");
        int Vendas = read.nextInt();

        System.out.println(Vendedor);
    }
}