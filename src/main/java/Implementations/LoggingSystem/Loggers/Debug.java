package Implementations.LoggingSystem.Loggers;

import Implementations.LoggingSystem.LogLevels;
import Implementations.LoggingSystem.Logs;

import java.util.Objects;

public class Debug implements Logger{
    Logger logger;

    public Debug(Logger logger){
        this.logger = logger;
    }

    @Override
    public void message(Logs log) {
        if(Objects.nonNull(log) && log.logLevel == LogLevels.DEBUG) {
            System.out.println("TIME : " + log.date + " " + "DEBUG LOG : " + log.message + " context : " + log.context);
            return;
        }this.logger.message(log);
    }
}
