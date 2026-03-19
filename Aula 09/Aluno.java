public class Aluno {

    // Atributos
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    // Construtor
    public Aluno(String nome, double nota1, double nota2){
        this.nome  = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;

        System.out.println(nome + " obteve média: " + mediaDuasNotas());
    }

    public Aluno(String nome, double nota1, double nota2, double nota3){
        this.nome  = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

        System.out.println(nome + " obteve média: " + mediaTresNotas());
    }

    // Média de duas notas
    private double mediaDuasNotas(){
        return (nota1 + nota2) / 2;
    }

    // Média de três notas
    private double mediaTresNotas(){
        return (nota1 + nota2 + nota3) / 3;
    }

}
