package com.jerryblaauw.snowchain;

import java.util.List;
import java.util.Objects;

public class Block {
    private int previousHash;
    private List<Transaction> transactions;

    public Block(int previousHash, List<Transaction> transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Block block = (Block) o;

        if (previousHash != block.previousHash) return false;
        return Objects.equals(transactions, block.transactions);
    }

    @Override
    public int hashCode() {
        int result = previousHash;
        result = 258 * result + (transactions != null ? transactions.hashCode() : 0);
        return result;
    }
}
