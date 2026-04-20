package Implementations.LoggingSystem.Destinations;

import Implementations.LoggingSystem.Logs;

public class DatabaseLog implements DestinationStrategy{
    @Override
    public void processLog(Logs log) {
        System.out.println("DB log generated on : "+log.date+" of type "+log.logLevel+" having message "+log.message+" with context "+log.context);
    }
}
