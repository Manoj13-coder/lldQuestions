package Implementations.Spitwise.Contributions;

import Implementations.Spitwise.TransactionRecord;
import Implementations.Spitwise.UserContributionChart;

import java.util.ArrayList;
import java.util.List;

public class CashContributionStrategy implements ContributionStrategies{
    @Override
    public List<UserContributionChart> getContributionByAmount(TransactionRecord transactionRecord) {
        return transactionRecord.getUserContributionChart();
    }
}
