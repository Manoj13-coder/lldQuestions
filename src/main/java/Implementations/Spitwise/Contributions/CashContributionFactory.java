package Implementations.Spitwise.Contributions;

public class CashContributionFactory {

    public ContributionStrategies getContributionStrategy(ContributionStrategiesEnum contributionStrategiesEnum) throws Exception{
        if(ContributionStrategiesEnum.CASH == contributionStrategiesEnum)
            return new CashContributionStrategy();
        else
            throw new Exception("Desired contribution strategy not exist");
    }

}
