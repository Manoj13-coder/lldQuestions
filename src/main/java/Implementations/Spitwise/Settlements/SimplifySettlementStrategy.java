package Implementations.Spitwise.Settlements;

import Implementations.Spitwise.Contributions.CashContributionFactory;
import Implementations.Spitwise.Contributions.CashContributionStrategy;
import Implementations.Spitwise.Contributions.ContributionStrategies;
import Implementations.Spitwise.TransactionRecord;
import Implementations.Spitwise.User;
import Implementations.Spitwise.UserContributionChart;

import java.util.*;

public class SimplifySettlementStrategy implements SettlementStrategies{

    @Override
    public void getSettlementTransactionRecord(List<TransactionRecord> transactionRecords) throws Exception{
        PriorityQueue<UserContributionChart> takers = new PriorityQueue<>((a, b)->Double.compare(b.getContribution(), a.getContribution()));
        PriorityQueue<UserContributionChart> givers = new PriorityQueue<>((a, b)->Double.compare(a.getContribution(), b.getContribution()));
        HashMap<User, Double> moneyOwed = new HashMap<>();
        for(TransactionRecord transactionRecord:transactionRecords){
            CashContributionFactory cashContributionFactory = new CashContributionFactory();
            ContributionStrategies contributionStrategies = cashContributionFactory.getContributionStrategy(transactionRecord.getContributionStrategiesEnum());
            List<UserContributionChart> userContributionCharts = contributionStrategies.getContributionByAmount(transactionRecord);
            moneyOwed.put(transactionRecord.getUser(), moneyOwed.getOrDefault(transactionRecord.getUser(), 0D)+transactionRecord.getMoneySpent());
            for(UserContributionChart userContributionChart: userContributionCharts){
                User user = userContributionChart.getUser();
                moneyOwed.put(user, moneyOwed.getOrDefault(user, 0D)+(-1D*userContributionChart.getContribution()));
            }
        }
        for(Map.Entry<User, Double> data:moneyOwed.entrySet()){
            if(data.getValue() < 0D){
                UserContributionChart userContributionChart = new UserContributionChart(data.getKey(), data.getValue());
                givers.offer(userContributionChart);
            }else if(data.getValue() > 0D){
                UserContributionChart userContributionChart = new UserContributionChart(data.getKey(), data.getValue());
                takers.offer(userContributionChart);
            }
        }
        while(!takers.isEmpty()) {
            UserContributionChart userContributionChart = takers.poll();
            double required = userContributionChart.getContribution();
            while (required > 0D && !givers.isEmpty()) {
                UserContributionChart userContributionChart1 = givers.poll();
                double min = Math.min(required, Math.abs(userContributionChart1.getContribution()));
                required-=min;
                System.out.println(userContributionChart1.getUser().getName()+" needs to pay Rs "+min+" amount to "+userContributionChart.getUser().getName());
                userContributionChart1.setContribution(userContributionChart1.getContribution()+min);
                if(Double.compare(userContributionChart1.getContribution(), 0D) != 0)
                    givers.offer(userContributionChart1);
            }
        }
    }
}
