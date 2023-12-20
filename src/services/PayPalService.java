package services;

public class PayPalService implements OnlinePaymentService{

	@Override
	public Double paymentFee(Double amount) {
		return amount * 1.02;
	}

	@Override
	public Double interest(Double amount, Integer month) {
		return 0.01 * month * amount;
	}
}
