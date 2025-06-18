public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("1ST log message");

        Logger logger2 = Logger.getInstance();
        logger2.log("2ND log message");

        if (logger1 == logger2) {
            System.out.println("Both references point to the same instance");
        }
    }
}