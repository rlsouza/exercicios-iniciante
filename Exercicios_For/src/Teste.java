public class Teste {
public static void main(String[] args) {
        int vetor[] = {1,2,3};
     
        System.out.println("inicial");
        imprimirElementos(vetor);
         
        boolean flag;
        do {
            flag = false;
             
            for (int i = 1; i < vetor.length; i++) {
                if (vetor[i - 1] > vetor[i]) {
                    int temp = vetor[i -1];
                    vetor[i - 1] = vetor[i];
                    vetor[i] = temp;
                    flag = true;
                }
            }
        } while (flag);
         
        System.out.println("Ordernados");
        imprimirElementos(vetor);
         
 
        if (vetor.length > 0) 
                      System.out.println("Menor: " + vetor[0] + " Maior: " + vetor[vetor.length -1]);
                else 
                      System.out.println("N�o h� elementos no vetor");
    }
 
    private static void imprimirElementos(int vetor[]) {
        for (int elementos : vetor) {
            System.out.print(elementos + " - ");
        }
        System.out.println();
    }
}
