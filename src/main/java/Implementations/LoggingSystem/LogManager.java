package Implementations.LoggingSystem;

import Implementations.LoggingSystem.Destinations.DestinationStrategy;
import Implementations.LoggingSystem.Filters.FilterStrategy;
import Implementations.LoggingSystem.Formatter.Formatter;
import Implementations.LoggingSystem.Loggers.*;
import Implementations.LoggingSystem.Loggers.Error;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LogManager {

    List<Logs> historyOfLogs = new ArrayList<>();
    public List<DestinationStrategy> destinations = new ArrayList<>();
    static LogManager logManager;
    Logger logger = new Info(
            new Debug(
                    new Error(
                            new Fatal(
                                    new Warning(null)
                            )
                    )
            )
    );

    private LogManager(){}

    public static LogManager getLogManager(){
        if(logManager == null) {
            logManager = new LogManager();
        }return logManager;
    }

    public void printLog(LogLevels type, String message, Object context){
        Logs log = new Logs();
        log.message = message;
        log.context = context;
        log.date = LocalDateTime.now();
        log.logLevel = type;
        historyOfLogs.add(log);
        logger.message(log);
    }

    public List<Logs> getFilteredLogs(FilterStrategy filterStrategy){
        return filterStrategy.getLogs(historyOfLogs);
    }

    public void formattLog(Formatter formatter, Logs log){
        formatter.printMessage(log);
    }

    public void publishLog(Logs log){
        for(DestinationStrategy destination:destinations)
            destination.processLog(log);
    }

}
