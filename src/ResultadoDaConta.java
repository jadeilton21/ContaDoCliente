import java.util.Objects;
import java.util.Scanner;

public class ResultadoDaConta {




    public static void main(String[] args){

        Scanner computador = new Scanner(System.in);
        System.out.print("--> Sua Agencia é: " );
        int agencia1 = computador.nextInt();
        System.out.print("--> Quem é o titular da conta? ");
        String nome1 = computador.next();
        System.out.print("--> Qual o numero da sua conta? " );
        int numero1 = computador.nextInt();
        System.out.print("--> Qaul o saldo da sua conta? ");
        float saldo1 = computador.nextFloat();

        System.out.println("=========================================");
        ContaDoCliente conta1 = new ContaDoCliente(nome1,numero1,agencia1, saldo1);

        conta1.status();

        System.out.println("=========================================");
        System.out.print("--> Qual seu cpf: " );
        String cpf1 = computador.next();
        System.out.print("--> Qual sua profissão? " );
        String profissao1 = computador.next();
        System.out.print("--> Confirme seu nome: ");
        String nome2 = computador.next();
        System.out.println("=========================================");
        AtribultosDoCliente cliente = new AtribultosDoCliente(nome2,cpf1,profissao1);
        cliente.status2();
        System.out.println("=========================================");
        if(Objects.equals(cliente.getNome(), conta1.getTitular())){
            System.out.println("--> Você é o cliente dessa conta!!! Aproveite");
        }else{
            System.out.println("--> Você não é o cliente dessa conta!!");
        }




    }
}
