package entities;

import java.time.LocalDate;
import java.util.List;

public class Contract {
	
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	
	private List<Installment> installment;

	public Contract(Integer number, LocalDate date, Double totalValue, List<Installment> installment) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.installment = installment;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallment() {
		return installment;
	}

	public void setInstallment(List<Installment> installment) {
		this.installment = installment;
	}
}
