package NotificationSystemQuestion;

public class WhatsAppNotification implements Notification{
    public void message(String message){
        System.out.println(message+"\nsent via WhatsApp");
    }
}
