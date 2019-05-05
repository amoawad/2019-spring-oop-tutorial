public class Main {

    public static void main(String[] args) {

        Monitor indoorMonitor = new Monitor();
        Monitor outdoorMonitor = new Monitor();
        Service service = new Service();

        WeatherStation weatherStation = new WeatherStation();

        weatherStation.addObserver(indoorMonitor);
        weatherStation.addObserver(outdoorMonitor);
        weatherStation.addObserver(service);

        weatherStation.captureMeasurements();

        weatherStation.deleteObserver(outdoorMonitor);

        weatherStation.captureMeasurements();

    }

}
