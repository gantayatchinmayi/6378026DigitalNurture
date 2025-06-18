public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger instance created");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        System.out.println("LOG: " + msg);
    }
}
/*
 * Logger instance created
 * LOG: 1ST log message
 * LOG: 2ND log message
 * Both references point to the same instance
 * PS C:\Users\USER\OneDrive\Desktop\chinmayee\week1\SingletonPatternExample>
 */