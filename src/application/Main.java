package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.OnlinePaymentService;
import services.PayPalService;
import services.contractServices;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Installment> installmentList = new ArrayList<>();
		
		System.out.println("Entre os dados do contrato:");
		
		int number = 8028;
		System.out.println("Numero: " + number);

		String date = "25/06/2018";
		System.out.println("Data (dd/MM/yyyy): " + date);
		
		Double contractValue =  600.00;
		System.out.println("Valor do contrato: " + contractValue);
		
		Contract contract = new Contract(number, LocalDate.parse(date, dateTimeFormatter), contractValue, installmentList);
		
		int installmentNumber = 3;
		System.out.println("Entre com o numero de parcelas: " + installmentNumber);
		
		System.out.println("Parcelas: ");
		contractServices contractServices = new contractServices(new PayPalService());
		contractServices.processContract(contract, installmentNumber);
		
		for (Installment installment : installmentList) {
			System.out.println(installment.getDueDate().format(dateTimeFormatter) + " - " + installment.getAmount());					
		}
		
		scanner.close();
	}
}
