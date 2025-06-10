package NotificationSystemQuestion;

public class EmailNotification implements Notification{
    public void message(String message){
        System.out.println(message+"\nsent via email");
    }
}
