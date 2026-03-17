public class DescontoDesenvolvedor extends DescontoPadrao {

    // Vale Alimentação
    @Override
    public void valeAlimentacao(double salario){
        System.out.println("Desconto do vale alimentação desenvolvedor R$" + (salario * 0.12));
    }

}
