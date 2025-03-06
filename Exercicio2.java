import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        System.out.print("Distancia total percorrida (em kilometros):");
        float Distancia = read.nextFloat();

        System.out.print("Combustivel gasto (em litros):");
        float Gasolina = read.nextFloat();

        System.out.println(Gasolina / Distancia+" Kilometros por litro");
    }
}