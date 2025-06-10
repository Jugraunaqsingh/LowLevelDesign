package NotificationSystemQuestion;

public class Main {
    public static void main(String[] args) {

        Notification n1= NotificationFactory.getnotifier("email");
        NotificationService s1=new NotificationService(n1);
        s1.notify("hello raunaq");

        //VIA SMS

        Notification n2=NotificationFactory.getnotifier("sms");
        NotificationService s2=new NotificationService(n2);
        s2.notify("hello raunaq pingg");


    }
}
