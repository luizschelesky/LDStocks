import java.util.Scanner;

public class UsuarioCadastraProduto{

    // Metodo para mostra tela para o usuario
    public static void mostraTela(){
        System.out.println("[Classe fonteira UsuarioCadastraProduto] Mostra tela para cadastro de produto.\n");

        Produto produto = criaProduto();

        Fornecedor fornecedor = criaFornecedor();

        Boolean check = enviaDados(produto, fornecedor);

        if(check){
            System.out.println("Produto cadastrado com sucesso ! [Print Classe fornteira UsuarioCadastraProduto]\n");
        }else{
            System.out.println("Erro ao cadastrar Produto ! [Print Classe fornteira UsuarioCadastraProduto]\n");
        }
    }

    // Metodo para criar objeto fornecedor
    private static Fornecedor criaFornecedor(){

        // Recenbendo dados do usuario
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o nome ou Cnpj do Fornecedor: ");
        String x = teclado.nextLine();
        System.out.println("");

        Fornecedor fornecedor = new Fornecedor(x);
        return fornecedor;
    }

    // Metodo para criar objeto produto
    private static Produto criaProduto(){

        // Recenbendo dados do usuario
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o nome do Produto: ");
        String nome = teclado.nextLine();
        System.out.print("\nInforme o modelo: ");
        String modelo = teclado.nextLine();
        System.out.print("\nInforme o preco: ");
        String preco = teclado.nextLine();
        System.out.println("");

        Produto produto = new Produto(nome, modelo, preco);
        return produto;
    }

    // Metodo para enviar os dados para classe controle
    private static Boolean enviaDados(Produto produto, Fornecedor fornecedor){
        return CadastrarProduto.cadastraProduto(produto, fornecedor);
    }
}