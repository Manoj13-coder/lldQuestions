package Implementations.Spitwise.Settlements;

import Implementations.Spitwise.TransactionRecord;

import java.util.List;

public interface SettlementStrategies {
    void getSettlementTransactionRecord(List<TransactionRecord> transactionRecords) throws Exception;
}
