@Component
public class ProdutoDaoService {

    private static List<Produto> produtos = new ArrayList<>();
    private int produtosCount = 3;

    static {
        produtos.add(new Produto(1, "Smartphone", "Marca1", 1000.0));
        produtos.add(new Produto(2, "Tablet", "Marca2", 2000.0));
        produtos.add(new Produto(3, "Laptop", "Marca3", 3000.0));
    }

    public List<Produto> findAll() {
        return produtos;
    }

    public Produto save(Produto produto) {
        if (produto.getId() == null) {
            produto.setId(++produtosCount);
        }
        produtos.add(produto);
        return produto;
    }

    public Produto findOne(Integer id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
}
