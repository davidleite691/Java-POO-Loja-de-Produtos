/* App 
Desafio — Loja de produtos físicos e digitais

Uma loja vende cadernos e cursos para download. 
Atualmente, o sistema trata todos os produtos da 
mesma maneira, mas a loja precisa calcular os 
preços e realizar as entregas conforme o tipo de produto.

Todo produto possui nome e preço-base. Porém, 
a loja só cadastra produtos de tipos específicos: 
não deve ser possível criar um produto genérico.

Para os produtos físicos, o preço final é o 
preço-base acrescido do frete. Ao realizar a entrega, 
o sistema deve exibir que o produto foi enviado para 
o endereço do cliente.

Para os produtos digitais, o preço final considera 
um desconto percentual sobre o preço-base. Ao realizar 
a entrega, o sistema deve exibir que o link de download 
foi enviado por e-mail.

O sistema precisa guardar produtos físicos e digitais 
em uma mesma lista e exibir o nome e o preço final de 
cada um, sem verificar o tipo do produto com if ou instanceof.

Além disso, a loja quer um recurso de entrega que 
possa atender futuramente a outras coisas além de 
produtos. Esse recurso deve permitir solicitar uma 
entrega sem precisar conhecer os detalhes de quem a executa.

Use estes dados para demonstrar o funcionamento:
Produto	Preço-base	Frete	Desconto	Preço final
Caderno	R$ 20,00	R$ 5,00	—	R$ 25,00
Curso de Java	R$ 100,00	—	10%	R$ 90,00


Seu objetivo é modelar essa solução usando classe 
abstrata, herança, interface e polimorfismo. Por enquanto, 
não precisa implementar menu, entrada pelo teclado ou controle de estoque.
*/
import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        List<abstractProduto> produtos = new ArrayList<>();
        produtos.add(new produtoFisico("Caderno", 20.00, 5.00));
        produtos.add(new produtoDigital("Curso de Java", 100.00, 10.00));
        
        entregarItem entregador = new entregarItem();

        for (abstractProduto p : produtos) {
            System.err.println("--------------------------------");
            System.out.println("Produto: " + p.getNome() + ", Preço final: R$ " + p.getPrecoFinal());
            entregador.entregar(p);
            System.err.println("--------------------------------");
        }

        Documento doc = new Documento("Relatório de Vendas", "João Silva");
        System.err.println("--------------------------------");
        entregador.entregar(doc);
        System.err.println("--------------------------------"); 
    }
}
