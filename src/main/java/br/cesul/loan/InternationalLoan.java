package br.cesul.loan;

public class InternationalLoan extends Loan {
    private Double exchangeRate;
    private Double transactionFee;

    public InternationalLoan(String customer, Double value, Integer installments, Double interestRate, Double exchangeRate, Double transactionFee) {
        super(customer, value, installments, interestRate);
        this.exchangeRate = exchangeRate;
        this.transactionFee = transactionFee;
    }

    @Override
    public Double getTotalLoan() {
        double localValue = value * (exchangeRate / 100);
        double interest = localValue * (interestRate / 100);
        double transaction = localValue* (transactionFee / 100);

        return localValue + interest + transaction;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public Double getTransactionFee() {
        return transactionFee;
    }
}