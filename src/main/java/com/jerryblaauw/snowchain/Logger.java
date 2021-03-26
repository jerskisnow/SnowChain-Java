package com.jerryblaauw.snowchain;

import java.util.ArrayList;

public class Logger {

    public static void logTransaction(Transaction transaction) {
        System.out.println("---=[Transaction]=---");
        System.out.println("From: " + transaction.getSourceName());
        System.out.println("To: " + transaction.getDestinationName());
        System.out.println("Amount: " + transaction.getAmount());
        System.out.println("Hash: " + transaction.hashCode());
        System.out.println("CreationTime: " + transaction.getUnixTime());
    }

    public static void logBlock(Block block) {
        System.out.println("---=[Block]=---");
        ArrayList<Integer> hashList = new ArrayList<>();
        block.getTransactions().forEach(t -> hashList.add(t.hashCode()));
        System.out.println("Transactions: " + hashList);
        System.out.println("Hash: " + block.hashCode());
        System.out.println("Previous hash: " + block.getPreviousHash());
    }

}
