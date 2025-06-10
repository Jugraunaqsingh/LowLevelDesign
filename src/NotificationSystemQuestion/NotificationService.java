package NotificationSystemQuestion;

public class NotificationService {
    Notification notif;
    public NotificationService(Notification type){
        this.notif=type;

    }
    public void notify(String message){
        notif.message(message);
    }

}
