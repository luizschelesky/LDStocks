public class CadastrarCliente{

    public static String cadastrar(Cliente cliente){
        Boolean checkLista = ListaClientesCadastraCliente.adicionarCliente(cliente);
        Boolean checkNuvem = AtualizaNuvem.adicionarCliente(cliente);

        String resposta = "";
        if(checkLista && checkNuvem){
            resposta = "Cliente cadastrado com sucesso !\n";
        }else {
            resposta = "Erro ao cadastrar cliente !\n";
        }
        return resposta;
    }
}