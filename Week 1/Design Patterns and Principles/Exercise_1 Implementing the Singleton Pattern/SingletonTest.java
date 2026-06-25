public class SingletonTest {

    public static void main(String[] args) {

        // Fetch the Logger instance twice
        Logger firstLogger = Logger.getInstance();
        Logger secondLogger = Logger.getInstance();

        System.out.println();

        // Verify whether both references point to the same object
        if (firstLogger == secondLogger) {
            System.out.println("Both references point to the same Logger object.");
        } else {
            System.out.println("Different Logger objects were created.");
        }

        // Display sample log messages
        firstLogger.log("Testing first log entry.");
        secondLogger.log("Testing second log entry.");
    }
}
