package month03.week01.day05.backend;


public class Main {
    static void feedAll(Animal[] animals, String foods) {
        System.out.println("\n=== Buh amitad " + foods + " uguj bna ===");
        for(Animal a : animals) {
            a.eat(foods);
        }
    }

    static void morningRoutine(Animal[] animals) {
        System.out.println("\n=== Doing Morning Routine ===");
        for(Animal a : animals) {
            a.sound();
            a.checkup();
        }
    }

    static Animal heaviest(Animal[] animals) {
        Animal heaviest = animals[0];
        for(Animal a : animals) {
            if (a.weight > heaviest.weight) {
                heaviest.weight = a.weight;
            }
        }
        return heaviest;
    }

    static int countByType(Animal[] animals, String type) {
        int count = 0;
        for(Animal a : animals) {
            if (a.getType().equals(type)) {
                count++;
            }
        }
        return count;
    }
    static void showAllProfiles(Animal[] animals) {
        System.out.println("\n=== all animal infos ===");
        for(Animal a : animals) a.showProfile();
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        Animal[] animals = {
            new Lion("Sharpy", 3, 60.3, true, 13),
            new Elephant("Trunky", 12, 1000, true, 30),
            new Giraffe("Longy", 4, 200, false, 50),
            new Penguin("Bird", 1, 50.6, true, false),
            new Lion("Edgy", 5, 64.2, false, 11)
        };

        showAllProfiles(animals);
        morningRoutine(animals);
        feedAll(animals, "max");
         
        Animal big = heaviest(animals);
        System.out.println("\nHamgiin hund: " + big.name + " (" + big.weight + " kg");
    }
}
