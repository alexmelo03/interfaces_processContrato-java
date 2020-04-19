package model.services;

public class ServicoPagamento implements ServicoTaxaJurosOnLine {
	
	private static final double TAXA_PAGAMENTO = 0.02;
	private static final double JUROS_MES = 0.01;

	@Override
	public double taxaJuros(double valorParcela) {
		return valorParcela * TAXA_PAGAMENTO;
	}

	@Override
	public double jurosSobreJuros(double valorParcela, int meses) {
		return valorParcela * JUROS_MES * meses;
	}

}
