import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
       
        //Inicializando program
        System.out.println("\n\t[PROGRAMA INICIALIZADO]");

        Scanner teclado = new Scanner(System.in);

        Login login;
        Boolean verificacao;
        do{

            //Mostrando para o usuario tela de login
            verificacao = UsuarioEfetuaLogin.mostraTela();
            
            //Verificando login
            if(verificacao){

                // Usuario acessa o sistema

                Boolean sair = false;
                String opcao = "-1";
                do{

                    // Mostrando menu de opcoes
                    System.out.print("\tEscolha uma opcao: \n[0] - Finalizar Programa \n[1] - Cadastrar Fornecedor \n[2] - Cadastrar Produto \n[3] - Receber Produto \n[4] - Deletar Produtos \n[5] - Cadastrar Cliente \n[6] - Despachar produto \n-> ");
                    opcao = teclado.nextLine();
                    int opcaoInteiro = Integer.parseInt(opcao);
                    System.out.println("");

                    switch(opcaoInteiro){
                        case 0: 
                            sair = true;
                            break;
                         
                        case 1: 
                            UsuarioCadastraFornecedor.mostraTela();
                            break;

                        case 2: 
                            UsuarioCadastraProduto.mostraTela();
                            break;

                        case 3: 
                            UsuarioRecebeProduto.mostraTela();
                            break;

                        case 4: 
                            UsuarioExcluiProduto.mostraTela();
                            break;
 
                        case 5: 
                            UsuarioCadastraCliente.mostraTela();
                            break;
                        
                        case 6: 
                            System.out.println("Funcao nao desenvolvida...\n");
                            break;

                        default:
                            System.out.println("Opcao invalida tente novamente. ");
                            break;
                    }

                }while(!sair);

            }

        }while(!verificacao);

        System.out.println("\n\tPROGRAMA FINALIZADO [Print classe Menu] ");
            
    }
}