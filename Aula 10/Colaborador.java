public class Colaborador extends PessoaColab {

    // Atributos
    private String cargo;
    private double salario;

    // Construtor
    public Colaborador(String cargo, double salario, String nome, int idade){
        super(nome, idade);

        this.cargo = cargo;
        this.salario = salario;

        dadosPessoaColab();
        dadosColaborador();
    }

    // Metodo para exibir o valor dos atributos
    private void dadosColaborador(){
        System.out.println("Cargo: "   + cargo);
        System.out.println("Salário: " + salario);
    }

}
