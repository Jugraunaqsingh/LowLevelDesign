package OOPS;

public class Main {
    public static void main(String[] args) {
        notif type=new SMSnotification();
        NotificationSystem n=new NotificationSystem(type);
        n.notify(" you have due payments");
    }
}
