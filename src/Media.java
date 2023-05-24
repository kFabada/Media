import java.util.Locale;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double  n1, n2, n3, media;

        System.out.println("DIGITE O NOME DO ALUNO");
        nome = sc.next();
        System.out.println("DIGITE A PRIMEIRA NOTA");
        n1 = sc.nextDouble();
        System.out.println("DIGITE A SEGUNDA NOTA");
        n2 = sc.nextDouble();
        System.out.println("DIGITE A TERCEIRA NOTA");
        n3 = sc.nextDouble();
        media = (n1 + n2 + n3) / 3;
        if (media >= 7){
            System.out.printf("O ALUNO " + nome + " PASSOU = %.2f "  , media);
        }
        else if (media >= 5){
            System.out.printf("O ALUNO " + nome +" TA EM RECUPERAÇÃO = %.2f  " , media);
        }
        else{
            System.out.printf("O ALUNO"  + nome + " FOI REPROVADO = %.2f " , media);
        }


    }
}