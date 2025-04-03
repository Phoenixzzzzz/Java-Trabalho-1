import java.util.Scanner;

public class exercicio10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        do{
        System.out.println("Digite o valor 'N':");
        N = scanner.nextInt();
        
        if(N <= 0){
            System.out.println("O valor nao pode ser menor ou igual a 0!\n ");
        }
        } while (N <= 0);
        System.out.println("");

        for(int i = 1; i<=N; i++){
            System.out.printf("%d \n",i);
        }
    }
}