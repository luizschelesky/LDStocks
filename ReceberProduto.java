public class ReceberProduto{
    
    public static String recebeProduto(Produto produto, String quantidade){

        Boolean checkNuvem;
        Boolean checkEstoque;

        // Metodo para atualizar a nuvem
        checkNuvem = AtualizaNuvem.atualizaNuvem(produto, quantidade);

        // Metodo para atualizar estoque
        checkEstoque = AtualizaEstoque.atualizaEstoque(produto, quantidade);


        String resposta = "";
        if(checkNuvem == false){
            resposta = resposta+"Erro ao atualizar a nuvem !\n";
        }else{
            resposta = resposta+"Nuvem Atualizada !\n";
        }

        if(checkEstoque == false){
            resposta = resposta+"Erro ao atualizar o estoque !\n";
        }else{
            resposta = resposta+"Estoque atualizado\n";
        }

        return resposta;

    }
}