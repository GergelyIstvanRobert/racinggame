package org.fasttrackit;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Track [] tracks = new  Track[3];
    private List<Vehicle> competitors = new ArrayList<>();



    public void start() {
        initializeTrakcs();
        displayTracks();

        initializeCompetitors();

//enhanced for
        for (Vehicle vehicle : competitors) {
            System.out.println("It`s" + vehicle.getName() + "`s turn. ");
        }

        System.out.println("Starting game...");
        String vehicleName = getVehicleNameFromUser();
        System.out.println("Name from user:" + vehicleName);


    }
    private void  initializeTrakcs () {
        Track track1 = new Track();
        track1.setName("Silverstone");
        track1.setLength(4.2);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Transylvania");
        track2.setLength(400.2);

        tracks[1] = track2;
    }
    private  void displayTracks () {
        System.out.println("Avaliable traks : ");
        //classic for loop
        for (int i = 0; i < tracks.length; i++){
            if (tracks[i] != null) {
                int j = i+1;
                System.out.println(j+"." + tracks[i].getName() + "-" + tracks[i].getLength() + "km");
                //(i+1) + "." +(tracks[i].getName() + "-" + tracks [i].getLenght() + " km"
            }
        }
    }





    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int getPlayersCountFromUser() {
        System.out.println("Please enter number of players");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private void  initializeCompetitors() {
        int playerCount = getPlayersCountFromUser();
        System.out.println("Number of player:" + playerCount);
        for (int i = 1; i <= playerCount; i++){
            System.out.println("Adding player " + i);

            Vehicle vehicle = new Vehicle();
            vehicle.setName(getVehicleNameFromUser());
            vehicle.setFuelLevel(80);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(6,15));
            vehicle.setMaxSpeed(300);

            System.out.println("Vehicle for player" + i + ": " +vehicle.getName() + "- Mileage: " + vehicle.getMileage());
            competitors.add(vehicle);

        }

    }
}




