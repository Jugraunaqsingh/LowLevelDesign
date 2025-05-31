package OOPS;


public class NotificationSystem {
    private notif n;
    NotificationSystem(notif n){
        this.n=n;
    }
    void notify(String mssg){
        n.sendmssg(mssg);
    }

}
