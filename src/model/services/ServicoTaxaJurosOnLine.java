package model.services;

public interface ServicoTaxaJurosOnLine {
	
	double taxaJuros(double valorParcela);
	double jurosSobreJuros(double valorParcela, int meses);

}
