public class Exercicio2{
	
	public static void main(String[] args){
        String value= args[0];
        String dia = "";
    switch(value){
    case "2":
        dia="Segunda";
        break;
    case "3":
        dia="Terca";
        break;
    case "4":
        dia="Quarta";
        break;
    case "5":
        dia="Quinta";
        break;
    case "6":
        dia="Sexta";
        break;
    case "7":
        dia="Sábado";
        break;
    case "1":
        dia="Domingo";
        break;
    }
    System.out.println(dia);
}
}