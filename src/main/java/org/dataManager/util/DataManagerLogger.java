package org.dataManager.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class DataManagerLogger {
    private DataManagerLogger() {

    }

    private static final Logger LOGGER = Logger.getLogger(DataManagerLogger.class.getName());

    public static void log(Level level, String message) {
        LOGGER.log(level, message);
    }
}
