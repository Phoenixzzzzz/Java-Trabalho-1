public class exercicio14 {

    public static void main(String[] args) {
    
        int populacaoA = 80000;
        int populacaoB = 200000;
        double taxaCrescimentoA = 0.03;
        double taxaCrescimentoB = 0.015;

        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += (int)(populacaoA * taxaCrescimentoA);
            populacaoB += (int)(populacaoB * taxaCrescimentoB);
            anos++;
        }

        System.out.println("A população do país A ultrapassará ou igualará a do país B em " + anos + " anos.");
        System.out.println("População de A: " + populacaoA);
        System.out.println("População de B: " + populacaoB);
    }
}
