import java.util.Scanner;

public class UsuarioRecebeProduto{

    // Metodo para mostra a tela para o usuario
    public static void mostraTela(){
        System.out.println("[Classe fonteira UsuarioRecebeProduto] Mostra tela para receber produto.\n");

         // Recenbendo dados do usuario
         Scanner teclado = new Scanner(System.in);
         System.out.print("Informe o nome do produto: ");
         String modelo = teclado.nextLine();
         System.out.print("\nInforme a quantidade: ");
         String quantidade = teclado.nextLine();
         System.out.println("");

        Produto produto = new Produto(modelo);

        String resposta = ReceberProduto.recebeProduto(produto, quantidade);

        System.out.println("[Classe fonteira UsuarioRecebeProduto] Mensagem criada pela classe controle -> "+resposta+"\n");

    }
}