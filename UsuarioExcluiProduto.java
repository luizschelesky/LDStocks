import java.util.Scanner;
public class UsuarioExcluiProduto{

    // Metodo para mostrar a tela para o usuario
    public static void mostraTela(){
        System.out.println("[Classe fonteira UsuarioExcluiProduto] Mostra tela para deletar produto do estoque.\n");

        // Recenbendo dados do usuario
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o nome ou modelo do produto: ");
        String produtoX = teclado.nextLine();
        System.out.println("");

        Produto produto = new Produto(produtoX);

        String resposta = ExcluirProduto.deletar(produto);

        System.out.println("[Classe fonteira UsuarioExcluiProduto] Mensagem gerada pela classe controle -> "+resposta);
    }
}