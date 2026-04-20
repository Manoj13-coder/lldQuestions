package Implementations.LoggingSystem.Loggers;

import Implementations.LoggingSystem.LogLevels;
import Implementations.LoggingSystem.Logs;

import java.util.Objects;

public class Warning implements Logger{
    Logger logger;

    public Warning(Logger logger){
        this.logger = logger;
    }

    @Override
    public void message(Logs log) {
        if(Objects.nonNull(log) && log.logLevel == LogLevels.WARNING) {
            System.out.println("TIME : " + log.date + " " + "WARNING LOG : " + log.message + " context : " + log.context);
            return;
        }this.logger.message(log);
    }
}
