package Implementations.LoggingSystem.Loggers;

import Implementations.LoggingSystem.LogLevels;
import Implementations.LoggingSystem.Logs;

import java.util.Objects;

public class Fatal implements Logger{
    Logger logger;

    public Fatal(Logger logger){
        this.logger = logger;
    }

    @Override
    public void message(Logs log) {
        if(Objects.nonNull(log) && log.logLevel == LogLevels.FATAL) {
            System.out.println("TIME : " + log.date + " " + "FATAL LOG : " + log.message + " context : " + log.context);
            return;
        }this.logger.message(log);
    }
}
