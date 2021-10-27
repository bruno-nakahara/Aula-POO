import java.math.BigDecimal;

public class ExecutarTeste {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("OO");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Spring Boot API Rest");
		produto2.setValor(BigDecimal.valueOf(200));
		
		Produto produto3 = new Produto();
		produto3.setId(2L);
		produto3.setNome("ReactJS");
		produto3.setValor(BigDecimal.valueOf(150));
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Curso Formação Java");
		venda.setEnderecoEntrega("Por email");
		venda.setId(10L);
		venda.setNomeCliente("Bruno");
		
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		venda.getListaProdutos().add(produto3);
		
		for (Produto produto : venda.getListaProdutos()) {
			System.out.println("Descrição do produto: " + produto);
		}
		
		System.out.println("Venda: " + venda);
		System.out.println("Valor da venda: R$" + venda.getValorTotal());
	}
}
