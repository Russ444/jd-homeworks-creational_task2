import java.text.SimpleDateFormat;
import java.util.Date;

class Logger {
    private static Logger instance;
    private int num = 1;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        String timestamp = dateFormat.format(new Date());
        System.out.println("[" + timestamp + " " + num++ + "] " + msg);
    }
}