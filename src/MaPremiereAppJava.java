public class MaPremiereAppJava {
    public static void main(String[] args){
        byte numberOfCarSeats = 5;
        byte numberOfCarDoors = 3;
        byte numberOfOwners = 5;

        short enginPower = 362;
        short co2Emission = 333;
        short cylinder = 5654;

        int price = 36000;
        int kilometer = 22850;

        long registrationNumber = 1231561561567L;

        float combinedFuelConsumption = 15.5F;
        float roadConsumption = 20.4F;
        float townConsumption = 21.6F;

        double averageConsumption = 151.568475652e-1; //Cela ne fonction qu'avec les doubles et les flottantes
        boolean isDamaged = true;
        char energyClass = 'F';

        System.out.println("Dodge Challenger SRT");
        System.out.println("Prix: €" + price);
        System.out.println("Kilométrage: " + kilometer + "KM");
        System.out.println("La voiture est endommagée: " + isDamaged);
        System.out.println("Immatriculation " + registrationNumber);
        System.out.println("Cylindrée: " + cylinder);
        System.out.println("Puissance: " + enginPower);
        System.out.println("Emission de CO2: " + co2Emission + "g/km");
        System.out.println("La classe de l'éfficatité énergétique: " + energyClass);
        System.out.println("Consommation combinée de Carburant : " + combinedFuelConsumption);
        System.out.println("Consommation Carburant en ville: " + townConsumption);
        System.out.println("Consommation Carburant sur route: " + roadConsumption);
        System.out.println("Consommation Moyenne de Carburant : " + averageConsumption);
        System.out.println("Le nombre de propriétaire précédents: " + numberOfOwners);
        System.out.println("Le nombre de places: " + numberOfCarSeats);
        System.out.println("Le nombre de portes: " + numberOfCarDoors);

        System.out.println("Conversion");
        short newNumberOfCarSeats = numberOfCarSeats;
        System.out.println("Nouvelle valeur du nombre de places: " + newNumberOfCarSeats);

        int newKilometer = kilometer;
        System.out.println("Nouvelle valeur du kilométrage: " + newKilometer);

        byte newEnginPower = (byte) enginPower; //Casting
        System.out.println("Nouvelle valeur de a puissance: " + newEnginPower);


    }
}
