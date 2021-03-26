package com.jerryblaauw.snowchain;

import java.util.Objects;

public class Transaction {
    private String sourceName;
    private String destinationName;
    private Long amount;
    private Long unixTime;

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getDestinationName() {
        return this.destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public Long getAmount() {
        return this.amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getUnixTime() {
        return this.unixTime;
    }

    public Transaction(String sourceName, String destinationName, Long amount) {
        this.sourceName = sourceName;
        this.destinationName = destinationName;
        this.amount = amount;
        this.unixTime = System.currentTimeMillis() / 1000L;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Transaction trx = (Transaction) object;

        if (!Objects.equals(sourceName, trx.sourceName)) return false;
        if (!Objects.equals(destinationName, trx.destinationName)) return false;
        return Objects.equals(amount, trx.amount);
    }

    @Override
    public int hashCode() {
        int result = sourceName != null ? sourceName.hashCode() : 0;
        result = 31 * result + (destinationName != null ? destinationName.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }
}
