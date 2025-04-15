import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa pessoa = null;
        String opcao;

        do {
            System.out.println("\nMenu");
            System.out.println("1 - Cadastrar uma nova pessoa");
            System.out.println("2 - Editar dados de uma pessoa cadastrada");
            System.out.println("3 - Apresentar dados de uma pessoa cadastrada");
            System.out.println("4 - Excluir dados de uma pessoa cadastrada");
            System.out.println("0 - Sair");
            opcao = teclado.nextLine();

            switch (opcao) {

                //cadastrar
                case "1":
                    System.out.println("Digite o nome:");
                    String nome = teclado.nextLine();
                    System.out.println("Digite a idade:");
                    int idade = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Digite o email:");
                    String email = teclado.nextLine();
                    pessoa = new Pessoa(nome, idade, email);
                    System.out.println("Pessoa cadastrada com sucesso!");
                break;

                //editar
                case "2":
                    if (pessoa != null) {
                        System.out.print("Digite o novo nome: ");
                        String novoNome = teclado.nextLine();
                        System.out.print("Digite a nova idade: ");
                        int novaIdade = teclado.nextInt();
                        teclado.nextLine();
                        System.out.print("Digite o novo email: ");
                        String novoEmail = teclado.nextLine();
                        pessoa.editar(novoNome, novaIdade, novoEmail);
                        System.out.println("Pessoa editada com sucesso!");
                    } else {
                        System.out.println("Nenhuma pessoa encontrada");
                    }
                break;

                    //apresentar
                case "3":
                    if (pessoa != null) {
                        pessoa.apresentar();
                    } else {
                            System.out.println("Nenhuma pessoa encontrada.");
                    }
                break;

                //excluir
                case "4":
                    if (pessoa != null) {
                        pessoa.excluir();
                        pessoa = null;
                        System.out.println("Cadastro de pessoa excluído com sucesso!");
                    } else {
                        System.out.println("Nenhuma pessoa cadastrada");
                    }
                break;

                //sair
                case "0":
                    System.out.println("Saindo do programa...");
                break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                break;

                }
            } while (!opcao.equals("0"));
            teclado.close();
    }
}