import java.util.List;

public abstract class Padrao {

    public abstract String cadastrar(Object obj);
    public abstract List<Object> selecionar();
    public abstract String alterar(Object obj);
    public abstract String remover(int codigo);

    public Object filtrarPorCodigo(List<Object> lista, int codigo){
        for(int indice=0; indice < lista.size(); indice++){
            //lista[indice].getCodigo() == codigo...
        }

        return "";
    }
}



/*
* 1º Podemos ter métodos obrigatórios ou opcionais
* 2º Métodos obrigatórios não possuem "corpo"
* 3º Não é possível criar objetos da classe Padrao
* */
