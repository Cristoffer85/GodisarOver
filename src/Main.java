public class godisarBlirKvar {
    public static void main(String[] args) {

// Definiera variabel för hur många godisar de får tillsammans
        int totalCandy = 137;
// Definiera variabel för hur många vänner de är
        int numberOfFriends = 3;
// Definiera variabel för hur många godisar de får var
        int candyPerFriend = totalCandy/numberOfFriends;
// Definiera variabel för hur många godisar som blir över
        int candyLeftOver = totalCandy % numberOfFriends;

// Skriv ut hur många godisar de får tillsammans
        System.out.println("Totalt antal godisar: " + totalCandy);
// Skriv ut hur många vänner de är
        System.out.println("Antal vänner: " + numberOfFriends);
// Skriv ut hur många godisar de får var
        System.out.println("Antal godisar per vän: " + candyPerFriend);
// Skriv ut hur många godisar som blir över
        System.out.println("Antal godisar kvar: " + candyLeftOver);








    }
}
