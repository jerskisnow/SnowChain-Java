package com.jerryblaauw.snowchain;

import java.util.Arrays;

public class SnowChain {
    public static void main(String[] args) {
        Transaction firstTransaction = new Transaction("A", "C", 50L);
        Logger.logTransaction(firstTransaction);
        Transaction secondTransaction = new Transaction("B", "B", 250L);
        Logger.logTransaction(secondTransaction);
        Transaction thirdTransaction = new Transaction("C", "A", 300L);
        Logger.logTransaction(thirdTransaction);

        Block firstBlock = new Block(0, Arrays.asList(firstTransaction, secondTransaction));
        Logger.logBlock(firstBlock);
        Block secondBlock = new Block(firstBlock.hashCode(), Arrays.asList(thirdTransaction));
        Logger.logBlock(secondBlock);
    }

}
