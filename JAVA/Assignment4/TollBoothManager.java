import java.util.Scanner;

public class TollBoothManager {


        private float carTollRate;
        private float truckTollRate;
        private float bikeTollRate;
        private int carCount;
        private int truckCount;
        private int bikeCount;
        private float totalIncome;


        public void setTollRates(float carRate, float truckRate, float bikeRate) {
            this.carTollRate = carRate;
            this.truckTollRate = truckRate;
            this.bikeTollRate = bikeRate;
        }

        public void logVehicleCount(int cars, int trucks, int bikes) {
            this.carCount = cars;
            this.truckCount = trucks;
            this.bikeCount = bikes;
        }

        public float calculateRevenue() {
            totalIncome = (carCount * carTollRate) + (truckCount * truckTollRate) + (bikeCount * bikeTollRate);
            return totalIncome;
        }

        public void printRecord() {
            int totalVehicles = carCount + truckCount + bikeCount;
            System.out.println("Total number of vehicles that passed: " + totalVehicles);
            System.out.println("Total revenue generated: ₹" + totalIncome);
        }
        public void AcceptRecord() {
            Scanner input = new Scanner(System.in);
            System.out.print("Set toll rate for Cars (₹): ");
            float carRate = input.nextFloat();
            System.out.print("Set toll rate for Trucks (₹): ");
            float truckRate = input.nextFloat();
            System.out.print("Set toll rate for Motorcycles (₹): ");
            float bikeRate = input.nextFloat();
            setTollRates( carRate,truckRate,bikeRate);
            System.out.print("Enter the number of Cars passed: ");
            int carCount = input.nextInt();
            System.out.print("Enter the number of Trucks passed: ");
            int truckCount = input.nextInt();
            System.out.print("Enter the number of Motorcycles passed: ");
            int bikeCount = input.nextInt();

            logVehicleCount(carCount, truckCount, bikeCount);


        }

    }

    class Toll {
        public static void main(String[] args) {
            TollBoothManager tollBooth =new TollBoothManager ();
            tollBooth.AcceptRecord();
            tollBooth.calculateRevenue();
            tollBooth.printRecord();


        }
    }