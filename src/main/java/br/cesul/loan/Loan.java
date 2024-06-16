package br.cesul.loan;

public abstract class Loan {
    private final String customer;
    protected final Double value;
    private final Integer installments;
    protected final Double interestRate;

    public Loan(String customer, Double value, Integer installments, Double interestRate) {
        this.customer = customer;
        this.value = value;
        this.installments = installments;
        this.interestRate = interestRate;
    }

    public abstract Double getTotalLoan();

    public String getCustomer() {
        return customer;
    }

    public Double getValue() {
        return value;
    }

    public Integer getInstallments() {
        return installments;
    }

    public Double getInterestRate() {
        return interestRate;
    }
}