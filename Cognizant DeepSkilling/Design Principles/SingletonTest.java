class Logger {
        
        private static Logger instance;

        private Logger() {
        }

        
        public static Logger getInstance() {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }

       
        public void log(String message) {
            System.out.println("Log: " + message);
        }
    }
public class SingletonTest {
    public static void main(String[] args) {

        
        Logger logger1 = Logger.getInstance();

        Logger logger2 = Logger.getInstance();

        
        logger1.log("Application started.");
        logger2.log("User logged in.");

        if (logger1 == logger2) {
            System.out.println("Only one instance of Logger exists.");
        } else {
            System.out.println("Multiple instances exist.");
        }

        System.out.println("Logger1 HashCode: " + logger1.hashCode());
        System.out.println("Logger2 HashCode: " + logger2.hashCode());
    }
}
 