public class Produto {

    public String nome;
    public double preco;
    public int quantidade;


    public void adicionarProduto(int novoProduto){

        quantidade += novoProduto;
    }

    public void venderProduto(int vendadeDeProduto) {
        if (vendadeDeProduto > quantidade) {
            System.out.println("Estoque insuficiente! Estoque atual: " + quantidade);
        } else {
            quantidade -= vendadeDeProduto;
            System.out.println(vendadeDeProduto + " unidades vendidas. Estoque restante: " + quantidade);
        }
    }
}

