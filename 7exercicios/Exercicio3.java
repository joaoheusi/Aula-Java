public class Exercicio3{

	    public static void main(String[] args){
        
        String value = args[0];
        String[] mes = new String[13];
        mes[1] = "Janeiro";
        mes[2] = "Fevereiro";
        mes[3] = "Março";
        mes[4] = "Abril";
        mes[5] = "Maio";
        mes[6] = "Junho";
        mes[7] = "Julho";
        mes[8] = "Agosto";
        mes[9] = "Setembro";
        mes[10] = "Outubro";
        mes[11] = "Novembro";
        mes[12] = "Dezembro";
        
        int valor = Integer.parseInt(value);
        System.out.println(mes[valor]);
        
}
}