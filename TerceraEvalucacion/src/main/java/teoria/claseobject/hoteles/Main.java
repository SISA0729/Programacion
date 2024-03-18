package teoria.claseobject.hoteles;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("1234","PLAYA",150);
        Hotel hotel2 = new Hotel("1234","PLAYA",150);

        System.out.println(hotel1.equals(hotel2));

        Hotel hotel3 = new Hotel("1234","MONTAÑA",200);


    }

}
