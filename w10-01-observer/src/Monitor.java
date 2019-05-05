import java.util.Observable;
import java.util.Observer;

public class Monitor implements Observer {

    @Override
    public void update(Observable observable, Object message) {
        WeatherStation ws = (WeatherStation) observable;
        System.out.println("T: " + ws.getTemprature() + ", H:"+
            ws.getHumidity()+ ", P: " + ws.getPressure());
    }

}
