package Implementations.LoggingSystem.Filters;

import Implementations.LoggingSystem.LogLevels;
import Implementations.LoggingSystem.Logs;

import java.util.ArrayList;
import java.util.List;

public class filterInfoLogs implements FilterStrategy{

    @Override
    public List<Logs> getLogs(List<Logs> logs) {
        List<Logs> filteredLogs = new ArrayList<>();
        for(Logs log:logs)
            if(log.logLevel == LogLevels.INFO)
                filteredLogs.add(log);
        return filteredLogs;
    }
}
