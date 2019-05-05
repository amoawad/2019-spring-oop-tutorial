import java.util.Observable;
import java.util.Random;

public class WeatherStation extends Observable {

    private int temprature;
    private int humidity;
    private double pressure;

    private Random random;

    public WeatherStation() {
        random = new Random();
    }

    public void captureMeasurements() {
        this.temprature = random.nextInt(40);
        this.humidity = random.nextInt(100);
        this.pressure = random.nextDouble();

        setChanged();
        notifyObservers(new Message(temprature, humidity, pressure));
    }

    public int getTemprature() {
        return temprature;
    }

    public int getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

}
