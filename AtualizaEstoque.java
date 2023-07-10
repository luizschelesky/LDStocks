public class AtualizaEstoque{

    // Metodo para atualizar estoque sobre chegada de produtos
    public static Boolean atualizaEstoque(Produto produto, String quantidade){
        return EstoqueAtualizaEstoque.atualizaEstoque(produto, quantidade);
    }

    // Metodo para apaga produto do estoque
    public static Boolean apagaProdutoEstoque(Produto produto){
        return EstoqueAtualizaEstoque.apagarProduto(produto);
    }
}