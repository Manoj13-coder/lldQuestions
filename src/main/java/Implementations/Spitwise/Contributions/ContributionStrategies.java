package Implementations.Spitwise.Contributions;

import Implementations.Spitwise.TransactionRecord;
import Implementations.Spitwise.UserContributionChart;

import java.util.List;

public interface ContributionStrategies {
    List<UserContributionChart> getContributionByAmount(TransactionRecord transactionRecord);
}
