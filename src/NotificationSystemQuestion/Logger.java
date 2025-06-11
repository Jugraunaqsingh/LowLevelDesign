package NotificationSystemQuestion;

public class Logger {
    private static Logger instance;
    private Logger(){}
    public static Logger getInstance(){
        if(instance==null){
            instance=new Logger();
            //this is called lazy loading
            //singleton pattern
            //single point of logging access
            //prevents multiple logger instances
        }
        return instance;
    }
    public void log(String mssg){
        System.out.println("[LOG]"+mssg);
    }

}
