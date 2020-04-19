package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private Integer numContrato;
	private Date dataContrato;
	private Double valorTotalContrato;
	
	private List<Fatura> faturas = new ArrayList<>();
	
	
	public Contrato(Integer numContrato, Date dataContrato, Double valorTotalContrato) {
		this.numContrato = numContrato;
		this.dataContrato = dataContrato;
		this.valorTotalContrato = valorTotalContrato;
	}

	public Integer getNumContrato() {
		return numContrato;
	}

	public void setNumContrato(Integer numContrato) {
		this.numContrato = numContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorTotalContrato() {
		return valorTotalContrato;
	}

	public void setValorTotalContrato(Double valorTotalContrato) {
		this.valorTotalContrato = valorTotalContrato;
	}
	
	public void addFatura(Fatura fatura) {
		faturas.add(fatura);
	}
	
	public void removeFatura(Fatura fatura) {
		faturas.remove(fatura);
	}

}
