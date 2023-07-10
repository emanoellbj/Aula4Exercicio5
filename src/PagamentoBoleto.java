
public class PagamentoBoleto implements ProcessadorPagamento{

	@Override
	public void processarPagamento(double valor) {
        System.out.println("Processando pagamento via boleto no valor de R$ " + valor);
	}

}
