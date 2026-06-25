public class Logger {

    // Holds the single object of Logger
    private static Logger loggerObj;

    // Prevent object creation from outside
    private Logger() {
    }

    // Returns the only instance of Logger
    public static Logger getInstance() {
        if (loggerObj == null) {
            synchronized (Logger.class) {
                if (loggerObj == null) {
                    loggerObj = new Logger();
                }
            }
        }
        return loggerObj;
    }

    // Prints log message
    public void log(String text) {
        System.out.println("Log: " + text);
    }
}
