package Implementations.LoggingSystem.Formatter;

import Implementations.LoggingSystem.Logs;

public class StringFormatter implements Formatter{
    @Override
    public void printMessage(Logs log) {
        System.out.println("Log generated on : "+log.date+" of type "+log.logLevel+" having message "+log.message+" with context "+log.context);
    }
}
