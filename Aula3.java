import java.util.Scanner;
public class Aula3 {
    public static void main(String[] args) {
        Scanner leitorTxt = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        String nome = leitorTxt.nextLine();
        System.out.println(nome);

        System.out.println("Digite o segundo nome");
        String nome2 = leitorTxt.nextLine();
        System.out.println(nome2);

        System.out.println("Digite o terceiro nome");
        String nome3 = leitorTxt.nextLine();
        System.out.println(nome3);

        System.out.println("Digite o quarto nome");
        String nome4 = leitorTxt.nextLine();
        System.out.println(nome4);

        System.out.println("Digite o quinto nome");
        String nome5 = leitorTxt.nextLine();
        System.out.println(nome5);
        leitorTxt.close();


    }
    
}
