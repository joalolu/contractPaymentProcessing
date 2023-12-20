package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class contractServices {
	
	private OnlinePaymentService onlinePaymentService;

	public contractServices(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public OnlinePaymentService getOnlinePaymentService() {
		return onlinePaymentService;
	}

	public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer month) {
		LocalDate dueDate = contract.getDate();
		
		int monthInProcess = 1;
		for (int i = 0; i < month; i++) {
			double installmentValue = contract.getTotalValue() / month;
			double installmentTotalValue = onlinePaymentService.paymentFee(installmentValue)
					+ onlinePaymentService.interest(onlinePaymentService.paymentFee(installmentValue), monthInProcess);
			
			dueDate = dueDate.plusMonths(1);
			contract.getInstallment().add(new Installment(dueDate, installmentTotalValue));
			monthInProcess++;
		}
	}	
}
