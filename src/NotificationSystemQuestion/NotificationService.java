package NotificationSystemQuestion;

public class NotificationService {
    Notification notif;
    public NotificationService(User x){
        for(String type:x.PreferredChannels){
            Notification n=NotificationFactory.getnotifier(type);
            Notification loggernotifier=new LoggingDecorator(n);
            loggernotifier.message("hello from decorated "+ type);


        }

    }


}
