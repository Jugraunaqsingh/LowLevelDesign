package NotificationSystemQuestion;

public class SMSNotification implements Notification{
    public void message(String message){
        System.out.println(message+"\nsent via SMS");
    }
}
