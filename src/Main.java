
public class Main {
	
	public static void main(String[] args) {
		ProcessadorPagamento pagamentoCartao = new PagamentoCartao();
		pagamentoCartao.processarPagamento(300.0);

		ProcessadorPagamento pagamentoBoleto = new PagamentoBoleto();
		pagamentoBoleto.processarPagamento(500.0);
	}

}
