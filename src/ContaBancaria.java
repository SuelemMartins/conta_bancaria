

import java.util.Scanner;
public class ContaBancaria {
    public static void main(String[] args) {

         String  nome = "Suelem Martins";
         String  timpoConta = "Corrente";
         double  saldoInicial = 2500;
         int opcao = 0;



        System.out.println("*******************************");
        System.out.println("\nNome do cliente:" + nome);
        System.out.println("Tipo conta:" + timpoConta);
        System.out.println("Saldo atual:" + saldoInicial);
        System.out.println("\n*******************************");

        String menu = """
                ** Digite opção **
                1- Consulta saldo
                2- Transferir valor
                3- Receber valor 
                4- Sair
                """.formatted(nome, timpoConta, saldoInicial, opcao);
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4 ) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao == 1 ){
                System.out.println("O saldo atualizado é:" + saldoInicial);
            } // <--- CHAVE DE FECHAMENTO DO if (opcao == 1) FOI ADICIONADA AQUI.
            else if (opcao == 2) {
                System.out.println("Qual o valoe que deseja tranferir");
                double valor = leitura.nextDouble();
                if (valor > saldoInicial) {
                    System.out.println("Não a saldo para realizar a tranferencia");
                } else {
                    saldoInicial -= valor;
                    System.out.println("Novo saldo" + saldoInicial);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido:");
                double valor = leitura.nextDouble();
                saldoInicial += valor;
                System.out.println("Novo saldo" + saldoInicial);
            } else if(opcao != 4) {
                System.out.println("Opção inválida");

            }

        }

    }

}














