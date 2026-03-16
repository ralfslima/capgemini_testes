public class Produto {

    // Atributos
    private String nome;
    private double valor;
    private int quantidadeEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}

/*
    MODIFICADORES DE ACESSO
    public    -> Qualquer um tem acesso.
    private   -> Disponível apenas na classe onde é criado.
    protected -> Disponível na classe onde são criados ou herdados.
    default   -> Atributos e métodos disponíveis apenas no mesmo pacote.
*/