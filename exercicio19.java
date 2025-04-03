import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos números você quer inserir? ");
        int n = scanner.nextInt();
        
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;
        
        for (int i = 0; i < n; i++) {
            int numero;
            
            while (true) {
                System.out.print("Digite um número entre 0 e 1000: ");
                numero = scanner.nextInt();
                
                if (numero >= 0 && numero <= 1000) {
                    break;
                } else {
                    System.out.println("Número inválido! Tente novamente.");
                }
            }
            
            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
            
            soma += numero;
        }
        
        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
        
        scanner.close();
    }
}
