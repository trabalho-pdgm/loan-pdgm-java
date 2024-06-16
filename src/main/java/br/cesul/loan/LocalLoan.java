package br.cesul.loan;

public class LocalLoan extends Loan {
    private Double inflationRate;

    public LocalLoan(String customer, Double value, Integer installments, Double interestRate, Double inflationRate) {
        super(customer, value, installments, interestRate);
        this.inflationRate = inflationRate;
    }

    @Override
    public Double getTotalLoan() {
        return value + (value * (interestRate / 100)) + (value * (inflationRate / 100));
    }

    public Double getInflationRate() {
        return inflationRate;
    }
}