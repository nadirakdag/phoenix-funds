package dev.nadirakdag.phoenixfunds.domain.entities;

public enum AccountCurrency {

    TRY("try"),
    EUR("eur"),
    USD("usd");

    private String value;

    AccountCurrency(String value) {
        this.value = value;
    }
}
