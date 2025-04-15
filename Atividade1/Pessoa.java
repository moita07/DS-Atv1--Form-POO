public class Pessoa {
    private String nome;
    private String email;
    private int idade;

    //construtor
    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    //método para editar
    public void editar(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    //método para exibir
    public void apresentar() {
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade+" anos");
        System.out.println("Email: "+email);
    }

    //método para excluir
    public void excluir() {
        this.nome = null;
        this.idade = 0;
        this.email = null;
    }

}
