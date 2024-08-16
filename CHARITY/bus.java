public class bus {
        public static void main(String[] args) {
            int totalDistance = 10000;
            int speed = 250; // km/hr
            int stopTimeMinutes = 5;

            int refuelStopDistance = 200;
            int refuelStops = totalDistance / refuelStopDistance;

            double travelTimeHours = (double) totalDistance / speed;
            double totalStopTimeHours = (double) refuelStops * stopTimeMinutes / 60;

            double totalTimeHours = travelTimeHours + totalStopTimeHours;

            System.out.println("Total return journey time: " + totalTimeHours + " hours");
        }
    }

