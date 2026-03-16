public class PessoaColab {

    // Atributos
    private String nome;
    private int idade;

    // Construtor
    public PessoaColab(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Metodo para exibir o valor dos atributos
    protected void dadosPessoaColab(){
        System.out.println("Nome: "  + nome);
        System.out.println("Idade: " + idade);
    }

}
