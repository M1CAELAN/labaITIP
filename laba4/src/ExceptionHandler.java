import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class ExceptionHandler {
    private static final String LOG_FILE = "exception_log.txt";

    public static void handleException(Exception e) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            writer.println("Exception occurred at " + LocalDateTime.now());
            writer.println("Exception type: " + e.getClass().getName());
            writer.println("Message: " + e.getMessage());
            writer.println("Stack trace:");
            e.printStackTrace(writer);
            writer.println();
        } catch (IOException ex) {
            System.err.println( "Error writing to log file:" + ex.getMessage());
        }
    }
}
