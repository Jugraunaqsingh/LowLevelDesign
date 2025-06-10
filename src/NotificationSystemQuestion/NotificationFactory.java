package NotificationSystemQuestion;
import java.util.*;
import java.util.function.Supplier;


public class NotificationFactory {
    static final Map<String,Supplier<Notification>> factorymap=new HashMap<>();
    static{
        factorymap.put("email",()->new EmailNotification());
        factorymap.put("sms",()->new SMSNotification());
        factorymap.put("whatsapp",()->new WhatsAppNotification());
        // We can add more such for the choice we wanna have
    }
    public static Notification getnotifier(String type){
        Supplier<Notification> supp=factorymap.get(type.toLowerCase());
        if(supp==null){
           throw new IllegalArgumentException("invalid notif type");

        }
        return supp.get();

    }


}
