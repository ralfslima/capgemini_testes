// Override (sobrescrita)

public class DescontoPadrao {

    // Vale Transporte
    public void valeTransporte(double salario){
        System.out.println("Desconto do vale transporte padrão R$" + (salario * 0.06));
    }

    // Vale Alimentação
    public void valeAlimentacao(double salario){
        System.out.println("Desconto do vale alimentação padrão R$" + (salario * 0.08));
    }

}
