import java.util.Observable;
import java.util.Observer;

public class Service implements Observer {

    public void printMeasurements(int temp, int humidity, double pressure) {
        System.out.println("T: " + temp + ", H:"+
                humidity + ", P: " + pressure);
    }

    @Override
    public void update(Observable observable, Object message) {
        Message msg = (Message) message;
        printMeasurements(msg.temprature, msg.humidity, msg.pressure);
    }
}
