import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    // Classe Contato (Atividade 12)
    public static class Contato{
        String nome;
        String email;
        String telefone;
    }

    // Classes - Atividade 13
    public static class Produto{
        int codigo;
        String nome;
        double valor;

        public Produto(int codigo, String nome, double valor){
            this.codigo = codigo;
            this.nome = nome;
            this.valor = valor;
        }
    }

    public static class Carrinho{
        int codigo;
        int quantidade;
    }
















    // Metodo responsavel pela inicialização do projeto
    public static void main(String[] args) {

    // 1ª Atividade (JOptionPane)
    //    String nome   = JOptionPane.showInputDialog("Informe um nome");
    //    String idade  = JOptionPane.showInputDialog("Informe uma idade");
    //    String cidade = JOptionPane.showInputDialog("Informe uma cidade");
    //
    //    JOptionPane.showMessageDialog(null, "Bom dia " + nome + " você tem " + idade + " anos, e mora em " + cidade);

      //1ª Atividade (Scanner)
        //    Scanner obterDados = new Scanner(System.in);
        //
        //    System.out.println("Informe um nome");
        //    String nome = obterDados.next();
        //
        //    System.out.println("Informe uma idade");
        //    int idade = obterDados.nextInt();
        //
        //    System.out.println("Informe uma cidade");
        //    String cidade = obterDados.next();
        //
        //    System.out.println("Bom dia " + nome + " você tem " + idade + " anos, e mora em " + cidade);


    //2ª Atividade
    //    Scanner obterDados = new Scanner(System.in);
    //
    //    System.out.println("Qual a primeira nota?");
    //    double nota1 = obterDados.nextDouble();
    //
    //    System.out.println("Qual a segunda nota?");
    //    double nota2 = obterDados.nextDouble();
    //
    //    System.out.println("Qual a terceira nota?");
    //    double nota3 = obterDados.nextDouble();
    //
    //    double media = (nota1+nota2+nota3) / 3;
    //
    //    System.out.println(media >= 7 ? "Aprovado(a) com média " + media : "Reprovado(a) com média " + media);
    //
    //    //if(media >= 7)
    //    //    System.out.println("Aprovado(a) com média " + media);
    //    //else
    //    //    System.out.println("Reprovado(a) com média " + media);

    //3ª Atividade
    //    int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º número."));
    //    int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2º número."));
    //
    //    //JOptionPane.showMessageDialog(null, numero1 == numero2 ? numero1+numero2 : numero1*numero2);
    //
    //    if(numero1 == numero2)
    //        JOptionPane.showMessageDialog(null, "A soma dos valores é: " + (numero1+numero2));
    //    else
    //        JOptionPane.showMessageDialog(null, "A multiplicação dos valores é: " + (numero1*numero2));

    //4ª Atividade
    //    Scanner obterDados = new Scanner(System.in);
    //
    //    System.out.println("Qual ano deseja informar?");
    //    int ano = obterDados.nextInt();
    //
    //    //if((ano % 4 == 0 && ano % 100 == 00) || (ano % 400 == 0)) <- Completa
    //    if(ano % 4 == 0)
    //        System.out.println("É um ano bissexto");
    //    else
    //        System.out.println("Não é um ano bissexto");

    //5ª Atividade
    //    int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
    //    int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));
    //    int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro valor"));
    //
    //    int menor = numero1;
    //
    //    if(numero2 < menor)
    //        menor = numero2;
    //
    //    if(numero3 < menor)
    //        menor = numero3;
    //
    //    JOptionPane.showMessageDialog(null, "O menor valor é " + menor);


    //6ª Atividade
    //    Scanner obterDados = new Scanner(System.in);
    //
    //    System.out.println("Qual número deseja informar?");
    //    int numero = obterDados.nextInt();
    //
    //    System.out.println("O sucessor é: "   + (numero+1));
    //    System.out.println("O antecessor é: " + (numero-1));


    //7ª Atividade
    //int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
    //
    //String retorno = "A tabuada de " + numero + " é:";
    //
    //for(int indice = 0; indice < 11; indice++){
    //    retorno += "\n" + numero + " X " + indice + " = " + (numero * indice);
    //}
    //
    //JOptionPane.showMessageDialog(null, retorno);

    //8ª Atividade
    //int quantidade = 0;
    //String nome = "";
    //
    //do{
    //    nome = JOptionPane.showInputDialog("Informe um nome");
    //
    //    if(!nome.equalsIgnoreCase("sair"))
    //        quantidade++;
    //
    //}while(!nome.equalsIgnoreCase("sair"));
    //
    //JOptionPane.showMessageDialog(null, "Houveram " + quantidade + " registros.");

    //9ª Atividade
    //String nomeAlunoMaiorMedia = "";
    //String nome = "";
    //double maiorMedia = 0;
    //
    //Scanner obterDados = new Scanner(System.in);
    //
    //do{
    //    System.out.println("Informe um nome ou SAIR para finalizar");
    //    nome = obterDados.next();
    //
    //    if(nome.equalsIgnoreCase("sair"))
    //        break;
    //
    //    System.out.println("Informe a primeira nota");
    //    double nota1 = obterDados.nextDouble();
    //
    //    System.out.println("Informe a segunda nota");
    //    double nota2 = obterDados.nextDouble();
    //
    //    double media = (nota1 + nota2) / 2;
    //
    //    if(media > maiorMedia){
    //        maiorMedia = media;
    //        nomeAlunoMaiorMedia = nome;
    //    }
    //
    //    //if(!nome.equalsIgnoreCase("sair")){
    //    //    System.out.println("Informe a primeira nota");
    //    //    double nota1 = obterDados.nextDouble();
    //    //
    //    //    System.out.println("Informe a segunda nota");
    //    //    double nota2 = obterDados.nextDouble();
    //    //
    //    //    double media = (nota1 + nota2) / 2;
    //    //
    //    //    if(media > maiorMedia){
    //    //        maiorMedia = media;
    //    //        nomeAlunoMaiorMedia = nome;
    //    //    }
    //    //}
    //
    //}while(!nome.equalsIgnoreCase("sair"));
    //
    //System.out.println("Aluno(a) " + nomeAlunoMaiorMedia + " obteve a maior média: " + maiorMedia);


    //10ª Atividade
    //int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número"));
    //int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número"));
    //int contador = 0, pares = 0, impares = 0;
    //double soma = 0;
    //
    //while(numero1 <= numero2){
    //    // Contabilização
    //    contador++;
    //
    //    // Somar valores
    //    soma += numero1;
    //
    //    // Verificar se é par ou ímpar
    //    if(numero1 % 2 == 0)
    //        pares++;
    //    else
    //        impares++;
    //
    //    // Incremento
    //    numero1++;
    //}
    //
    //String mensagem = "***INFORMAÇÕES***";
    //        mensagem+= "\nQuantidade de números informados: " + contador;
    //        mensagem+= "\nQuantidade de números pares: " + pares;
    //        mensagem+= "\nQuantidade de números ímpares: " + impares;
    //        mensagem+= "\nMédia geral: " + (soma / contador);
    //
    //JOptionPane.showMessageDialog(null, mensagem);

    //11ª Atividade
    //ArrayList<Integer> numeros = new ArrayList<>();
    //
    //Scanner obterDados = new Scanner(System.in);
    //
    //for(int indice = 1; indice < 6; indice++){
    //    System.out.println("Informe o " + indice + "º número.");
    //    numeros.add(obterDados.nextInt());
    //}
    //
    //Collections.sort(numeros); // Ordenação (Menor para o Maior ou A..Z)
    //Collections.sort(numeros, Collections.reverseOrder()); // Ordenação (Maior para o Menor ou Z..A)
    //
    //for(int numero : numeros){
    //    System.out.println(numero);
    //}

    //12ª Atividade
    //ArrayList<Contato> contatos = new ArrayList<>();
    //int opcao = 0;
    //
    //String menu = "***MENU***";
    //       menu+="\n1º - Cadastrar";
    //       menu+="\n2º - Listar";
    //       menu+="\n3º - Remover";
    //       menu+="\n4º - Finalizar";
    //
    //do{
    //    opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
    //
    //    switch (opcao){
    //        case 1:
    //            Contato c = new Contato();
    //            c.nome     = JOptionPane.showInputDialog("Informe o nome");
    //            c.email    = JOptionPane.showInputDialog("Informe o e-mail");
    //            c.telefone = JOptionPane.showInputDialog("Informe o telefone");
    //
    //            contatos.add(c);
    //
    //            JOptionPane.showMessageDialog(null, "Contato registrado com sucesso!");
    //        break;
    //
    //        case 2:
    //            String lista = "Listagem de dados:";
    //
    //            for(Contato obj : contatos){
    //                lista+="\nNome: "     + obj.nome;
    //                lista+="\nE-mail: "   + obj.email;
    //                lista+="\nTelefone: " + obj.telefone;
    //                lista+="\n----------------------------";
    //            }
    //
    //            JOptionPane.showMessageDialog(null, lista);
    //        break;
    //
    //        case 3:
    //            String nome = JOptionPane.showInputDialog("Informe o nome do contato para remoção");
    //            boolean contatoEncontrado = false;
    //
    //            for(int indice = 0; indice < contatos.size(); indice++){
    //                if(contatos.get(indice).nome.equals(nome)){
    //                    contatos.remove(indice);
    //                    contatoEncontrado = true;
    //                    JOptionPane.showMessageDialog(null, "Contato removido com sucesso!");
    //                }
    //            }
    //
    //            if(!contatoEncontrado)
    //                JOptionPane.showMessageDialog(null, "Contato não encontrado!");
    //
    //        break;
    //
    //        case 4:
    //            JOptionPane.showMessageDialog(null, "Sistema finalizado!");
    //        break;
    //
    //        default:
    //            JOptionPane.showMessageDialog(null, "Opção inválida!");
    //    }
    //
    //}while(opcao != 4);

    //13ª Atividade
    // Criar lista contendo 10 produtos
    //Produto p1 = new Produto(1, "TV Samsung 32", 3400);
    //Produto p2 = new Produto(2, "iPhone 17", 8500);
    //Produto p3 = new Produto(3, "Galaxy S26", 7000);
    //Produto p4 = new Produto(4, "TV LG 40", 4200);
    //Produto p5 = new Produto(5, "Galaxy S25", 5600);
    //Produto p6 = new Produto(6, "TV Samsung 50", 5700);
    //Produto p7 = new Produto(7, "Notebook Dell 7474", 4800);
    //Produto p8 = new Produto(8, "Notebook Lenovo 4314", 4250);
    //Produto p9 = new Produto(9, "Monitor AOC 24", 1900);
    //Produto p10 = new Produto(10, "MacBook Air", 9500);
    //
    //ArrayList<Produto> produtos = new ArrayList<>();
    //produtos.add(p1);
    //produtos.add(p2);
    //produtos.add(p3);
    //produtos.add(p4);
    //produtos.add(p5);
    //produtos.add(p6);
    //produtos.add(p7);
    //produtos.add(p8);
    //produtos.add(p9);
    //produtos.add(p10);
    //
    //// Produtos selecionados (carrinho de compras)
    //ArrayList<Carrinho> carrinho = new ArrayList<>();
    //
    //// Variáveis
    //int codigo = 0;
    //
    //// Menu
    //String menu = "***MENU***";
    //for(Produto p : produtos){
    //    menu+="\n" + p.codigo + " - " + p.nome;
    //}
    //menu+="\n11 - Finalizar";
    //
    //// Scanner
    //Scanner obterDados = new Scanner(System.in);
    //
    //// Laço
    //do{
    //    // Obter a opção (produto ou finalizar)
    //    System.out.println(menu);
    //    codigo = obterDados.nextInt();
    //
    //    // Verificar se o código é diferente de 11
    //    if(codigo != 11){
    //
    //        int posicaoProdutoCarrinho = -1;
    //
    //        for(int indice = 0; indice < carrinho.size(); indice++){
    //            if(codigo == carrinho.get(indice).codigo){
    //                posicaoProdutoCarrinho = indice;
    //            }
    //        }
    //
    //        if(posicaoProdutoCarrinho == -1){
    //            Carrinho c = new Carrinho();
    //            c.codigo = codigo;
    //            c.quantidade = 1;
    //
    //            carrinho.add(c);
    //        } else {
    //            Carrinho c = carrinho.get(posicaoProdutoCarrinho);
    //            c.quantidade++;
    //
    //            carrinho.set(posicaoProdutoCarrinho, c);
    //        }
    //
    //    }
    //
    ////        System.out.println("----------------------");
    ////        for(Carrinho c : carrinho){
    ////            System.out.println(c.codigo + " - " + c.quantidade);
    ////        }
    ////        System.out.println("----------------------");
    //
    //}while(codigo != 11);
    //
    //// Variável para somar o total da compra
    //double total = 0;
    //
    //// Exibir os produtos que foram selecionados (carrinho)
    //String produtosSelecionados = "***CARRINHO DE COMPRAS***";
    //for(Carrinho c : carrinho){
    //
    //    // Extrair nome e valor
    //    String nomeProdutoSelecionado = "";
    //    double valorProdutoSelecionado = 0;
    //
    //    for(Produto p : produtos){
    //        if(p.codigo == c.codigo){
    //            nomeProdutoSelecionado = p.nome;
    //            valorProdutoSelecionado = p.valor;
    //        }
    //    }
    //
    //    total += (valorProdutoSelecionado * c.quantidade);
    //
    //    produtosSelecionados += "\nCódigo:" + c.codigo;
    //    produtosSelecionados += "\nNome:" + nomeProdutoSelecionado;
    //    produtosSelecionados += "\nValor:" + valorProdutoSelecionado;
    //    produtosSelecionados += "\nQuantidade:" + c.quantidade;
    //    produtosSelecionados += "\n-----------------------------------";
    //}
    //
    //produtosSelecionados += "\n\nTotal R$ " + total;
    //
    //System.out.println(produtosSelecionados);





    //14ª Atividade
    ArrayList<String> nomes = new ArrayList<>();

    do{
        String nome = JOptionPane.showInputDialog("Informe um nome");

        boolean existeNome = false;

        for(String n : nomes){
            if(n.equals(nome)){
                existeNome = true;
            }
        }

        if(existeNome)
            JOptionPane.showMessageDialog(null, "O nome informado já existe na lista!");
        else {
            nomes.add(nome);
            JOptionPane.showMessageDialog(null, "Nome cadastrado com sucesso!");
        }

    }while(nomes.size() < 5);

    String listaNomes = "Os nomes cadastrados foram:";
    for(String n : nomes){
        listaNomes+="\n" + n;
    }

    JOptionPane.showMessageDialog(null, listaNomes);














//        System.out.println(Estatico.nome);
//        Estatico.mensagem();
//
//
//        DescontoPadrao objDescontoPadrao = new DescontoPadrao();
//        objDescontoPadrao.valeAlimentacao(1000);
//        objDescontoPadrao.valeTransporte(1000);
//
//        DescontoPadrao objDescontoDesenvolvedor = new DescontoDesenvolvedor();
//        objDescontoDesenvolvedor.valeAlimentacao(1000);
//        objDescontoDesenvolvedor.valeTransporte(1000);
//
//
//
//        System.out.println("---------------------------------");
//
//
//
//
//
//        //************* ORIENTAÇÃO A OBJETOS
//        Pessoa obj1 = new Pessoa();
//        obj1.nome = "Carla";
//        obj1.idade = 33;
//        obj1.apresentacao();
//
//        Produto obj2 = new Produto();
//        obj2.setNome("Smartphone Galaxy S26");
//        obj2.setValor(8500);
//        obj2.setQuantidadeEstoque(250);
//        System.out.println(obj2.getNome());
//
//        Aluno obj3 = new Aluno("Marcelo", 8, 9);
//        Aluno obj4 = new Aluno("Isabela", 8, 8, 10);
//
//
//        Colaborador obj5 = new Colaborador("Analista de Sistemas", 8000, "Roger", 41);
//





        //************* LÓGICA E ALGORITMOS
        //************* Exibir mensagem
        //System.out.println("Hello World!");

        //************* Variáveis
        //String nome = "Roberto";
        //int idade = 31;
        //double altura = 1.71;

        // Concatenação
        //System.out.println("Olá " + nome +", você tem " + idade + " anos.");

        //************* Console/Terminal
        //Scanner obj = new Scanner(System.in);

        // Obter o nome
        //System.out.println("Qual é o seu nome?");
        //String nome = obj.next();

        // Concatenação
        //System.out.println("Bom dia " + nome + "!");

        //*************Modal
        //String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        //JOptionPane.showMessageDialog(null, "Bom dia " + nome);

        //*************Constante
        //final String nome = "Ralf";

        //************* Operadores
        //        System.out.println(5 + 6);
        //        System.out.println(8 - 3);
        //        System.out.println(5 * 9);
        //        System.out.println(10 / 2);
        //        System.out.println(9 % 2);
        //
        //        System.out.println(10 > 9);  // Maior
        //        System.out.println(10 >= 9); // Maior ou Igual
        //        System.out.println(10 < 9);  // Menor
        //        System.out.println(10 <= 9); // Menor ou Igual
        //        System.out.println(10 == 9); // Igual
        //        System.out.println(10 != 9); // Diferente
        //
        //        double media = 8;
        //        int faltas = 10;
        //        boolean aprovado = true;
        //        System.out.println(media >= 7 && faltas <= 10);  // E
        //        System.out.println(media >= 7 || faltas <= 10);  // OU
        //        System.out.println(!aprovado);                   // Negação

        //************* Condicional - Simples
        //int idade = 20;
        //
        //if(idade >= 18)
        //    System.out.println("Maior de idade");
        //else
        //    System.out.println("Menor de idade");

        //String nome = "Natália";
        //int idade = 18;
        //
        //if(idade >= 18) {
        //    System.out.println(nome + " é maior de idade!");
        //    System.out.println("A idade da " + nome + " é " + idade);
        //} else {
        //    System.out.println(nome + " é menor de idade!");
        //    System.out.println("A idade da " + nome + " é " + idade);
        //}

        //************* Condicional - Estruturada/Composta
        //double media = 6;
        //
        //if(media >= 7)
        //    System.out.println("Aprovado(a)");
        //else if(media >= 5)
        //    System.out.println("Em recuperação");
        //else
        //    System.out.println("Reprovado(a)");

        //************* Condicional - Aninhada
        //double media = 8.5;
        //int faltas = 7;
        //
        //if(faltas <= 10) {
        //
        //    if(media >= 7)
        //        System.out.println("Aprovado(a).");
        //    else
        //        System.out.println("Reprovado(a) por média.");
        //
        //} else {
        //    System.out.println("Reprovado(a) por faltas.");
        //}

        //************* Condicional + Operadores Lógicos
        //double total = 1560.88;
        //String pagamento = "à vista";
        //
        ////if (total >= 1000 && pagamento == "à vista")   <- E
        //if (total >= 1000 || pagamento == "à vista")  // <- OU
        //    System.out.println("Total R$" + (total * 0.9));
        //else
        //    System.out.println("Total R$ " + total);

        //************* Operador ternário
        //double media = 9;
        //
        //System.out.println(media >= 7 ? "Aprovado(a)" : "Reprovado(a)");
        //
        //System.out.println(
        //        media >= 7
        //        ?
        //            "Aprovado(a)"
        //        :
        //            media >= 5
        //            ?
        //            "Em recuperação"
        //            :
        //            "Reprovado(a)"
        //);

        //************* Exercícios
        //1º Peça um nome e uma cidade, em seguida concatene uma frase.
        //String nome   = JOptionPane.showInputDialog(null, "Qual é o seu nome?");
        //String cidade = JOptionPane.showInputDialog(null, "Qual é a sua cidade?");
        //JOptionPane.showMessageDialog(null, "Bom dia " + nome + ", você mora em " + cidade);

        //2º Peça dois números reais (double) e realizar a média. Informe a situação
        // do aluno. Aprovado para média 7 ou superior e reprovado para média
        // inferior a 7.
        //double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
        //double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
        //
        //double media = (nota1 + nota2) / 2;
        //
        //if(media >= 7)
        //    JOptionPane.showMessageDialog(null, "Aprovado(a) com média " + media);
        //else
        //    JOptionPane.showMessageDialog(null, "Reprovado(a) com média " + media);


        //3º Peça dois números inteiros. Se forem iguais, some, caso contrário
        // multiplique os valores.
        //int numero1 = Integer.parseInt(JOptionPane.showInputDialog("1º número"));
        //int numero2 = Integer.parseInt(JOptionPane.showInputDialog("2º número"));
        //
        //if(numero1 == numero2)
        //    JOptionPane.showMessageDialog(null, numero1+numero2);
        //else
        //    JOptionPane.showMessageDialog(null, numero1*numero2);

        //JOptionPane.showMessageDialog(
        //        null,
        //        numero1 == numero2 ? numero1 + numero2 : numero1 * numero2
        //);


        //4º Peça o nome do produto e o valor. Caso o produto tenha valor superior
        // a R$100,00, dê um desconto de 5%.
        //String nome  = JOptionPane.showInputDialog("Informe o nome do produto");
        //double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
        //
        //if(valor > 100)
        //    JOptionPane.showMessageDialog(null, nome + "\nDESCONTO! R$" + (valor * 0.95));
        //else
        //    JOptionPane.showMessageDialog(null, nome + "\nSEM DESCONTO! R$ " + valor);

        //5º Peça um número inteiro, retorne se é par ou ímpar.
        //int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
        //JOptionPane.showMessageDialog(null, numero % 2 == 0 ? "Par" : "Ímpar");

        //6º (Bônus) Peça dois números inteiros, em seguida some.

        //a)
        //int numero1 = 8;
        //int numero2 = 9;
        //System.out.println("A soma dos valores é: " + (numero1+numero2));

        //b)
        //Scanner obj = new Scanner(System.in);

        //System.out.println("Informe o 1º número.");
        //int numero1 = obj.nextInt();
        //System.out.println("Informe o 2º número.");
        //int numero2 = obj.nextInt();

        //System.out.println("A soma dos valores é: " + (numero1+numero2));

        //c)
        //int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º número"));
        //int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2º número"));

        //JOptionPane.showMessageDialog(null, "A soma dos valores é: " + (numero1+numero2));


        //************* ESTRUTURA DE ESCOLHA (SWITCH CASE)
        //String linguaguem = "Java";
        //
        //switch (linguaguem) {
        //    case "Java":
        //        System.out.println("Linguagem de programação multiplataforma da Orale");
        //    break;
        //
        //    case "C#":
        //        System.out.println("Linguagem de programação multiplataforma da Microsoft");
        //    break;
        //
        //    case "HTML":
        //        System.out.println("Linguagem de marcação");
        //    break;
        //
        //    case "CSS":
        //        System.out.println("Linguagem de estilos");
        //    break;
        //
        //    default:
        //        System.out.println("Linguagem desconhecida");
        //}

        //if(linguaguem == "Java")
        //    System.out.println("Linguagem de programação multiplataforma da Orale");
        //else if(linguaguem == "C#")
        //    System.out.println("Linguagem de programação multiplataforma da Microsoft");
        //else if(linguaguem == "HTML")
        //    System.out.println("Linguagem de marcação");
        //else if(linguaguem == "CSS")
        //    System.out.println("Linguagem de estilos");
        //else
        //    System.out.println("Linguagem desconhecida");


        //************* LAÇOS DE REPETIÇÃO
        //for(int indice = 10; indice >= 1; indice--) {
        //    System.out.println(indice);
        //}

        //String nome = "";
        //
        //do{
        //    nome = JOptionPane.showInputDialog("Informe o nome");
        //
        //    if(!nome.equals("sair"))
        //        JOptionPane.showMessageDialog(null, "Bom dia " + nome);
        //    else
        //        JOptionPane.showMessageDialog(null, "Sistema finalizado!");
        //}while(!nome.equals("sair"));


        //int indice = 1;

        //do {
        //    System.out.println(indice);
        //    indice++;
        //} while(indice <= 10);

        //while (indice <= 10) {
        //    System.out.println(indice);
        //    indice++;
        //}

        //************* EXERCÍCIOS
        //1º O usuário informa um número inteiro, retorne a tabuada daquele valor.
        //int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
        //
        //String tabuada = "A tabuada de " + numero + " é:\n";
        //
        //for(int indice = 0; indice < 11; indice++) {
        //    tabuada += numero + " X " + indice + " = ";
        //    tabuada += (numero * indice) + "\n";
        //}
        //
        //JOptionPane.showMessageDialog(null, tabuada);

        //2º Peça um nome e uma média, enquanto o nome for diferente de sair
        // continue pedindo essas informações.
        // Após finalizar o laço, informe a quantidade de pessoas que foram cadastradas.
        // Exiba também a média das médias.
        //int contador = 0;
        //double somaMedias = 0;
        //String nome = "";
        //
        //do {
        //    nome = JOptionPane.showInputDialog("Informe um nome");
        //
        //    if (nome.equals("sair"))
        //        break;
        //
        //    double media = Double.parseDouble(JOptionPane.showInputDialog("Informe uma média"));
        //
        //    contador++;
        //    somaMedias += media;
        //
        //} while(!nome.equals("sair"));
        //
        //String mensagem = "*** RETORNO ***";
        //       mensagem+= "\nQuantidade de pessoas: " + contador;
        //       mensagem+= "\nA média das médias é: " + (somaMedias/contador);
        //
        //JOptionPane.showMessageDialog(null, mensagem);

        // 3º Peça dois números, em seguida crie um laço de repetição,
        // Iniciando do número1 até o número2.
        // Exiba os valores de cada posição do índice.
        // Exiba a quantidade de pares e ímpares
        //int pares = 0, impares = 0;
        //
        //int numero1 = Integer.parseInt(JOptionPane.showInputDialog("1º número"));
        //int numero2 = Integer.parseInt(JOptionPane.showInputDialog("2º número"));
        //
        //String exibirNumeros = "Os números informados são:\n";
        //
        //while (numero1 <= numero2) {
        //    exibirNumeros += numero1 + "\n";
        //
        //    if (numero1 % 2 == 0)
        //        pares++;
        //    else
        //        impares++;
        //
        //    numero1++;
        //}
        //
        //exibirNumeros += "Pares: " + pares;
        //exibirNumeros += "\nÍmpares: " + impares;
        //
        //JOptionPane.showMessageDialog(null, exibirNumeros);

        //************* VETOR
        //String[] nomes = {"Robson", "Camila", "Paulo", "Rebeca", "Jéssica"};

        //nomes[0] = "Samuel";
        //nomes[1] = "";

        //System.out.println(nomes[0]);

        //for (int indice = 0; indice < nomes.length; indice++) {
        //    System.out.println(nomes[indice]);
        //}

        //for (String nome : nomes) {
        //    if(!nome.equals(""))
        //        System.out.println(nome);
        //}

        //************* MATRIZ
        //String[][] dados = {
        //        {"Robson", "São Paulo", "33"},
        //        {"Camila", "Campinas",  "28"},
        //        {"Paulo",  "Maringá",   "42"}
        //};

        //System.out.println(dados[2][1]);

        //for (int indice = 0; indice < dados.length; indice++) {
        //    System.out.println("\nNome: " + dados[indice][0]);
        //    System.out.println("Cidade: " + dados[indice][1]);
        //    System.out.println("Idade: "  + dados[indice][2]);
        //}

        //************* ARRAYLIST
        //ArrayList<String> nomes = new ArrayList<>();
        //
        //nomes.add("Robson");
        //nomes.add("Camila");
        //nomes.add("Paulo");
        //
        //nomes.set(0, "Samuel");
        //
        //nomes.remove(1);
        //
        //System.out.println("Quantidade de registros: " + nomes.size());
        //
        //for(String nome : nomes) {
        //    System.out.println(nome);
        //}


//        ArrayList<Pessoa> dados = new ArrayList<>();
//
//        Pessoa p1 = new Pessoa();
//        p1.nome = "Robson";
//        p1.cidade = "São Paulo";
//        p1.idade = 33;
//
//        Pessoa p2 = new Pessoa();
//        p2.nome = "Camila";
//        p2.cidade = "Campinas";
//        p2.idade = 28;
//
//        dados.add(p1);
//        dados.add(p2);
//
//        for(Pessoa p : dados){
//            System.out.println("Nome:   " + p.nome);
//            System.out.println("Cidade: " + p.cidade);
//            System.out.println("Idade:  " + p.idade);
//        }
























    }

    // Molde (Classe)
//    public static class Pessoa{
//        String nome;
//        String cidade;
//        int idade;
//    }

}







