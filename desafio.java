import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nome = "Vitor Souza";
        String tipoConta = "Conta Corrente";
        double saldo = 1599.99;

        System.out.println("****************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n****************************");

        int opcao = 0;
        String menu = """
                ** Digite sua opção **
                1 - Consultar valor
                2 - Tranferir valor
                3 - Receber valor
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atuzlizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor você deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo suficiente para realizar a transferencia!");
                }else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);


                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            }else if (opcao != 4){
                System.out.println("Opção invalida!");
            }

            }
        }
    }