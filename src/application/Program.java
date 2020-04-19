package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Fatura;
import model.services.ServicoContrato;
import model.services.ServicoPagamento;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato");
		System.out.print("Número do contrato: ");
		int numContrato = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		Date dataContrato = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		double valorTotalContrato = sc.nextDouble();
		
		Contrato contrato = new Contrato(numContrato, dataContrato, valorTotalContrato);
		
		System.out.print("Digite o número de parcelas: ");
		int n = sc.nextInt();
		
		ServicoContrato servicoContrato = new ServicoContrato(new ServicoPagamento());
		
		servicoContrato.processandoContrato(contrato, n);
		
		System.out.println("Faturas:");
		for (Fatura x : contrato.getFaturas()  ) {
			System.out.println(x);
		}
		
		
		
		sc.close();

	}

}
