package OOPS;

public class NotificationFactory {

    public static notif getnotif(String type){
        switch (type.toLowerCase()){
            case "email":
                return new Emailnotif();
            case "sms":
                return new SMSnotification();
            default:
                throw new IllegalArgumentException("unknown type");

        }
    }
}
