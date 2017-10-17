public class Exercicio4{

	public static void main(String[] args){
        
        
        float peso = Integer.parseInt(args[0]);
        float altura = Float.parseFloat(args[1]);
        float Imc = peso/(altura*altura);
        System.out.println(Imc);
        
}

}