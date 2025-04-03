import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número maior que 0.");
        } else {
            int a = 1, b = 1;
            
            System.out.println("Sequência de Fibonacci até o " + n + "º termo:");
            
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                
                int proximoTermo = a + b;
                a = b;  
                b = proximoTermo;
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
