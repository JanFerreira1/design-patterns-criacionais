// Interface Produto
interface Produto {
    void exibir();
}

// Produto concreto A
class ProdutoA implements Produto {
    public void exibir() {
        System.out.println("Produto A criado.");
    }
}

// Produto concreto B
class ProdutoB implements Produto {
    public void exibir() {
        System.out.println("Produto B criado.");
    }
}

// Classe abstrata Fabrica
abstract class Fabrica {
    abstract Produto criarProduto();
}

// Fabrica concreta A
class FabricaA extends Fabrica {
    Produto criarProduto() {
        return new ProdutoA();
    }
}

// Fabrica concreta B
class FabricaB extends Fabrica {
    Produto criarProduto() {
        return new ProdutoB();
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new FabricaA();
        Produto produto = fabrica.criarProduto();
        produto.exibir();
    }
}