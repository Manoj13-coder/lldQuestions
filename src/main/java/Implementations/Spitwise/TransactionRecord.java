package Implementations.Spitwise;

import Implementations.Spitwise.Contributions.ContributionStrategies;
import Implementations.Spitwise.Contributions.ContributionStrategiesEnum;

import java.util.ArrayList;
import java.util.List;

public class TransactionRecord {

    private User user;
    private double moneySpent;
    private String purpose;
    private ContributionStrategiesEnum contributionStrategiesEnum;
    private List<UserContributionChart> userContributionChart;

    public TransactionRecord(User user,
                             double moneySpent,
                             String purpose,
                             ContributionStrategiesEnum contributionStrategiesEnum,
                             List<UserContributionChart> userContributionChart){
        this.user = user;
        this.moneySpent = moneySpent;
        this.purpose = purpose;
        this.contributionStrategiesEnum = contributionStrategiesEnum;
        this.userContributionChart = userContributionChart;
    }

    public User getUser(){
        return this.user;
    }

    public double getMoneySpent(){
        return moneySpent;
    }

    public void setUser(User user){
        this.user = user;
    }

    public void setMoneySpent(double moneySpent){
        this.moneySpent = moneySpent;
    }

    public void setPurpose(String purpose){
        this.purpose = purpose;
    }

    public String getPurpose(){
        return this.purpose;
    }

    public void addContributor(UserContributionChart userContributionChart){
        this.userContributionChart.add(userContributionChart);
    }

    public void removeContributor(UserContributionChart userContributionChart){
        this.userContributionChart.remove(userContributionChart);
    }

    public List<UserContributionChart> getUserContributionChart(){
        return new ArrayList<>(this.userContributionChart);
    }

    public void setContributionStrategiesEnum(ContributionStrategiesEnum contributionStrategiesEnum){
        this.contributionStrategiesEnum = contributionStrategiesEnum;
    }

    public ContributionStrategiesEnum getContributionStrategiesEnum(){
        return this.contributionStrategiesEnum;
    }

}
