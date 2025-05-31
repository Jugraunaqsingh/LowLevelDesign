package strategydp;
import strategydp.strategy.drivestr;
public class vehicle {
    drivestr obj;
    vehicle(drivestr x){
        this.obj=x;
    }
    public void drive(){
        obj.drive();

    }

}
