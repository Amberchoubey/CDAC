public class Logger {
    private static Logger instance;
    private StringBuilder logMessages;

    private Logger() {
        logMessages = new StringBuilder();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        logMessages.append(message).append(" ");
    }

    public String getLog() {
        return logMessages.toString();
    }

    public void clearLog() {
        logMessages.setLength(0); 
    }

    @Override
    public String toString() {
        return getLog();
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First log message");
        logger2.log("Second log message");

        System.out.println("Log messages");
        System.out.println(logger1.getLog()); 

        logger1.clearLog();
        System.out.println("Log after clearing");
        System.out.println(logger2.getLog()); 
    }
}
