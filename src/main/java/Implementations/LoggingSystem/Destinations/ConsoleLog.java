package Implementations.LoggingSystem.Destinations;

import Implementations.LoggingSystem.Logs;

public class ConsoleLog implements DestinationStrategy{
    @Override
    public void processLog(Logs log) {
        System.out.println("Console log generated on : "+log.date+" of type "+log.logLevel+" having message "+log.message+" with context "+log.context);
    }
}
