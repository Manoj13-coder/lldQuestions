package Implementations.LoggingSystem.Loggers;

import Implementations.LoggingSystem.LogLevels;
import Implementations.LoggingSystem.Logs;

import java.util.Objects;

public class Error implements Logger{
    Logger logger;

    public Error(Logger logger){
        this.logger = logger;
    }

    @Override
    public void message(Logs log) {
        if(Objects.nonNull(log) && log.logLevel == LogLevels.ERROR) {
            System.out.println("TIME : " + log.date + " " + "ERROR LOG : " + log.message + " context : " + log.context);
            return;
        }this.logger.message(log);
    }
}
