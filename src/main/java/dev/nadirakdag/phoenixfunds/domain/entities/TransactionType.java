package dev.nadirakdag.phoenixfunds.domain.entities;

public enum TransactionType {

    DEPOSIT("deposit"),
    WITHDRAW("withdraw");

    private String value;

    TransactionType(String value) {
        this.value = value;
    }
}
