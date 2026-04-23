package Implementations.Spitwise;

public class UserContributionChart {

    private User user;
    private double contribution;

    public UserContributionChart(User user,
                                 double contribution){
        this.user = user;
        this.contribution = contribution;
    }

    public void setUser(User user){
        this.user = user;
    }

    public User getUser(){
        return this.user;
    }

    public void setContribution(double contribution){
        this.contribution = contribution;
    }

    public double getContribution(){
        return this.contribution;
    }

}
