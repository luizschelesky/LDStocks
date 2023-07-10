
public class AtualizaNuvem{
    
    // Metodo para adicionar Novo fornecedor na nuvem
    public static Boolean addFornecedor(Fornecedor fornecedor){
        return NuvemAtualizaNuvem.addFornecedor(fornecedor);
    }

    // Metodo para adicionar Novo produto na nuvem
    public static Boolean cadastraProduto(Produto produto, Fornecedor fornecedor){
        return NuvemAtualizaNuvem.cadastraProduto(produto, fornecedor);
    }

    // Metodo para atualizar a nuvem sobre chegada de produtos na loja
    public static Boolean atualizaNuvem(Produto produto, String quantidade){
        return NuvemAtualizaNuvem.atualizaNuvem(produto, quantidade);
    }

    // Metodo para apagar da nuvem o produto
    public static Boolean apagaProduto(Produto produto){
        return NuvemAtualizaNuvem.apagaProduto(produto);
    }

    // Metodo para enviar cliente para o servidor
    public static Boolean adicionarCliente(Cliente cliente){
        return NuvemAtualizaNuvem.adicionarCliente(cliente);
    }
}