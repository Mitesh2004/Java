class Continent { String continent = "Asia"; }
class Country extends Continent { String country = "India"; }
class State extends Country { String state = "Maharashtra"; }

public class Place {
    public static void main(String[] args) {
        State place = new State();
        System.out.println("State: " + place.state + ", Country: " + place.country + ", Continent: " + place.continent);
    }
}
