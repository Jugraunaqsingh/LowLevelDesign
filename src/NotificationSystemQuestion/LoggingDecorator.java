package NotificationSystemQuestion;

public class LoggingDecorator implements Notification{
    private Notification wrapped;
    public LoggingDecorator(Notification w){
        this.wrapped=w;
    }
    public void message(String msg){
        Logger.getInstance().log("Logging before sending"+msg);
        wrapped.message(msg);
    }
}
