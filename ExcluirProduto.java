public class ExcluirProduto{

    // Metodo para deletar o produto
    public static String deletar(Produto produto){
        Boolean checkEstoque = AtualizaEstoque.apagaProdutoEstoque(produto);
        Boolean checkNuvem = AtualizaNuvem.apagaProduto(produto);

        String resposta = "";
        if(checkEstoque){
            resposta = resposta+"Produto apagado do estoque !\n";
        }else{
            resposta = resposta+"Erro ao apagar produto do estoque\n";
        }

        if(checkNuvem){
            resposta = resposta+"Produto apagado da nuvem\n";
        }else{
            resposta = resposta+"Erro ao apagar produto da nuvem !\n";
        }

        return resposta;
    }
}