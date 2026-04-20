package Implementations.LoggingSystem.Loggers;

import Implementations.LoggingSystem.LogLevels;
import Implementations.LoggingSystem.Logs;

import java.util.Objects;

public class Info implements Logger{

    Logger logger;

    public Info(Logger logger){
        this.logger = logger;
    }

    @Override
    public void message(Logs log) {
        if(Objects.nonNull(log) && log.logLevel == LogLevels.INFO) {
            System.out.println("TIME : " + log.date + " " + "INFO LOG : " + log.message + " context : " + log.context);
            return;
        }this.logger.message(log);
    }

}
