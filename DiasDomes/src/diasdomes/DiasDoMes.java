package diasdomes;
import java.util.Scanner;
public class DiasDoMes {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int day;
        int digYear;
        short digMonth;
        String year;
        
        String month[] = {"","Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho",
                            "Agosto","Setembro","Outubro","Novembro","Dezembro"};
            // verifica se o número digitado está entre 1 e 12
        do{
        System.out.println("Digite um número de acordo com o mês (1..12)");
            digMonth = entry.nextShort();
        }while(digMonth < 1 || digMonth > 12);
        
        System.out.println("Digite um ano:");
            digYear = entry.nextInt();
        
        switch(digMonth){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31;
                break;
            default: day = 30;
        }
        if((digYear % 4 == 0 && digYear % 100 != 0) || (digYear % 400 == 0)){
            year = "é bissexto";
            if(digMonth == 2)
                day = 29;
        }else{
        year = "não é bissexto";
            if(digMonth == 2)
                day = 28;
        }
        
        System.out.printf("No ano de %d, o mês de %s tem %d dias e o ano  %s. \n",digYear,month[digMonth],day,year);
    }
}
