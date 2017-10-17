import java.util.Scanner;
public class Exercicio6{

	public static void main(String[] args){
        
        float[] vetor = new float[10];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o valor número["+i+"]:");
            vetor[i] = s.nextInt();
        }
        
        float menor=vetor[0],maior=vetor[0],media=0;
        for (int i = 0; i < 10; i++) {
            if(menor > vetor[i]){
                menor = vetor[i];
            }
            if(maior < vetor[i]){
                maior = vetor[i];
            }
            media+=vetor[i];
            if(i==9){
                media=media/10;
            }
        }
        System.out.println("Media dos valores:"+media);
        System.out.println("Menor valor:"+menor);
        System.out.println("Maior valor:"+maior);


}

}