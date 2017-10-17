public class Exercicio5{

	public static void main(String[] args){
        
        
        float dias  = Integer.parseInt(args[0]);
        float salarioIntegral = Float.parseFloat(args[1]);
        float salarioCalculado = dias*salarioIntegral/22;
        System.out.println(salarioCalculado);
        
}

	
}