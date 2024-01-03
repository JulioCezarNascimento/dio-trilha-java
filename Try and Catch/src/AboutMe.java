import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        try{
            System.out.println("Qual seu nome?");
            String nome = sc.next();

            System.out.println("Qual seu sobrenome?");
            String sobrenome = sc.next();

            System.out.println("Digite sua idade");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura");
            double altura = sc.nextDouble();

            //Imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, me chamo" + nome.toUpperCase() + " " + sobrenome.toLowerCase());
            System.out.println("Tenho" + idade + "anos");
            System.out.println("Minha altura e" + altura + "m");
            sc.close();
        }catch(InputMismatchException e){
            System.err.println("Os campos idade e altura devem ser numericos");
        }
    }
}