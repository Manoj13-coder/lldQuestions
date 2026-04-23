package org.driverClasses;

import Implementations.Spitwise.Contributions.ContributionStrategiesEnum;
import Implementations.Spitwise.Group;
import Implementations.Spitwise.Settlements.SettlementStrategies;
import Implementations.Spitwise.Settlements.SimplifySettlementStrategy;
import Implementations.Spitwise.TransactionRecord;
import Implementations.Spitwise.User;
import Implementations.Spitwise.UserContributionChart;

import java.util.ArrayList;

public class Spitwise {
    public static void main(String[] args){
        User user1 = new User();
        user1.setEmail("abcd1@gmail.com");
        user1.setPhone("1234567890");
        user1.setName("Manoj_1");
        User user2 = new User();
        user2.setEmail("abcd2@gmail.com");
        user2.setPhone("1234567899");
        user2.setName("Manoj_2");
        User user3 = new User();
        user3.setEmail("abcd3@gmail.com");
        user3.setPhone("1234567897");
        user3.setName("Manoj_3");
        Group group = new Group("Goa Trip");
        group.addUser(user1);
        group.addUser(user2);
        group.addUser(user3);
        UserContributionChart userContributionChart1 = new UserContributionChart(user2, 5000d);
        UserContributionChart userContributionChart2 = new UserContributionChart(user3, 3000d);
        TransactionRecord transactionRecord = new TransactionRecord(user1, 10000d, "Goa Expenses", ContributionStrategiesEnum.CASH, new ArrayList<>());
        transactionRecord.addContributor(userContributionChart1);
        transactionRecord.addContributor(userContributionChart2);
        group.addTransactionRecord(transactionRecord);
        SettlementStrategies settlementStrategies = new SimplifySettlementStrategy();
        try {
            settlementStrategies.getSettlementTransactionRecord(group.getTransactionRecords());
        }catch(Exception ex){
            System.out.println(ex.getStackTrace());
        }
    }
}
