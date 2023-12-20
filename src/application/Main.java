package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		System.out.print("Data (dd/MM/yyyy: ");
		System.out.print("Valor do contrato: ");
		System.out.print("Entre com o numero de parcelas: ");
		
		System.out.println("Parcelas: ");
		/*
		25/07/2018 - 206.04
		25/08/2018 - 208.08
		25/09/2018 - 210.12
		*/
		scanner.close();
	}
}
