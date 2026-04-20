package org.driverClasses;

import Implementations.LoggingSystem.Destinations.ConsoleLog;
import Implementations.LoggingSystem.Destinations.DatabaseLog;
import Implementations.LoggingSystem.Filters.filterInfoLogs;
import Implementations.LoggingSystem.Formatter.StringFormatter;
import Implementations.LoggingSystem.LogLevels;
import Implementations.LoggingSystem.LogManager;
import Implementations.LoggingSystem.Logs;

public class LoggingSystem {
    public static void main(String[] args){
        LogManager logManager = LogManager.getLogManager();
        logManager.destinations.add(new ConsoleLog());
        logManager.destinations.add(new DatabaseLog());
        logManager.printLog(LogLevels.INFO, "Hello World", "metadata : header");
        for(Logs log:logManager.getFilteredLogs(new filterInfoLogs())) {
            logManager.formattLog(new StringFormatter(), log);
            logManager.publishLog(log);
        }
    }
}
