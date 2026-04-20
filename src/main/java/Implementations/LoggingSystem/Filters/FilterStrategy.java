package Implementations.LoggingSystem.Filters;

import Implementations.LoggingSystem.Logs;

import java.util.List;

public interface FilterStrategy {
    List<Logs> getLogs(List<Logs> logs);
}
