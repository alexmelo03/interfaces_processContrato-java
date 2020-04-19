package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Fatura;

public class ServicoContrato {
	
	private ServicoTaxaJurosOnLine servicoTaxaJurosOnLine;

	public ServicoContrato(ServicoTaxaJurosOnLine servicoTaxaJurosOnLine) {
		this.servicoTaxaJurosOnLine = servicoTaxaJurosOnLine;
	}
	
	public void processandoContrato(Contrato contrato, int meses) {
	     double parcelamentoBasico = contrato.getValorTotalContrato() / meses;
	for (int i = 1; i <= meses; i++) {
		Date dataContrato = addMeses(contrato.getDataContrato(), i);
		double updateParcelamento = parcelamentoBasico + servicoTaxaJurosOnLine.jurosSobreJuros(parcelamentoBasico, i);
		double parcelamentoFinal = updateParcelamento + servicoTaxaJurosOnLine.taxaJuros(updateParcelamento);
		contrato.addFatura(new Fatura(dataContrato, parcelamentoFinal));
		
	}
}
	
	private Date addMeses(Date dataContrato, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataContrato);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
	
	

}
