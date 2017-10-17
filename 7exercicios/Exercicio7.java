import java.util.Scanner;
public class Exercicio7{

	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String nome = "";
        float[] vetor = new float[3];
        System.out.println("Digite seu nome:");
        nome = s.nextLine();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o valor da M["+(i+1)+"]:");
            vetor[i] = s.nextInt();
        }
        
        float media=(vetor[0]+vetor[1]+vetor[2])/3;
        System.out.println("\n\n");
        System.out.println("Aluno:"+ nome);
        System.out.println("Média:" +media);
        if(media>=6){
            System.out.println("Aprovado.");
        }else{
            System.out.println("Reprovado.");
        }


}

}