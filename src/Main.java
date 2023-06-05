public class Main {
    public static void main(String[] args) {
        Transport[] transports = {
                new Bicycle("bicycle1"),
                new Car("Bugatti"),
                new Truck("Monster", 8)
        };
        ServiceStation serviceStation = new ServiceStation();

        for (Transport transport : transports) {
            serviceStation.check(transport);
        }

    }
}