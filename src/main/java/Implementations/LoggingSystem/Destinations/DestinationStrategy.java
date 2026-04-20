package Implementations.LoggingSystem.Destinations;

import Implementations.LoggingSystem.Logs;

public interface DestinationStrategy {
    void processLog(Logs log);
}
