import java.util.Random;

class GameAthlete {
    String name;
    int energy;
    int skillPower;
    int maxEnergy;
    boolean isActive;

    static int totalAthletes = 0;

    GameAthlete() {
        this.name = "Player";
        this.energy = 100;
        this.skillPower = 10;
        this.maxEnergy = 100;
        this.isActive = true;
        totalAthletes++;
    }

    GameAthlete(String name, int energy, int skillPower, int maxEnergy) {
        this.name = name;
        this.energy = energy;
        this.skillPower = skillPower;
        this.maxEnergy = maxEnergy;
        this.isActive = true;
        totalAthletes++;
    }

    void compete(GameAthlete opponent) {
        if (this.isActive && opponent.isActive) {
            opponent.energy -= this.skillPower;
            if (opponent.energy <= 0) {
                opponent.energy = 0;
                opponent.isActive = false;
                System.out.println(opponent.name + " is out of energy and can no longer compete!");
            } else {
                System.out.println(this.name + " attacked " + opponent.name + " and reduced energy by " + this.skillPower);
            }
        } else {
            System.out.println("One of the athletes cannot compete.");
        }
    }

    void rest(int amount) {
        if (isActive) {
            this.energy += amount;
            if (this.energy > this.maxEnergy) {
                this.energy = this.maxEnergy;
            }
            System.out.println(this.name + " rested and recovered energy. Current energy: " + this.energy);
        }
    }

    void train() {
        if (isActive) {
            Random random = new Random();
            int gain = random.nextInt(11);
            this.skillPower += gain;
            System.out.println(this.name + " trained and gained " + gain + " skill power. Current skill power: " + this.skillPower);
        }
    }

    void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Energy: " + energy + "/" + maxEnergy);
        System.out.println("Skill Power: " + skillPower);
        System.out.println("Active: " + isActive);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Name : S.Ajay Kumar");
        System.out.println("Roll No : 2024503701");
        GameAthlete a1 = new GameAthlete();
        GameAthlete a2 = new GameAthlete("Athlete2", 120, 15, 120);
        GameAthlete a3 = new GameAthlete("Athlete3", 80, 20, 80);

        System.out.println("Initial Stats:");
        a1.displayStats();
        a2.displayStats();
        a3.displayStats();

        a1.compete(a2);
        a2.compete(a3);
        a3.compete(a1);

        a1.rest(15);
        a2.rest(20);

        a1.train();
        a2.train();
        a3.train();

        System.out.println("\nFinal Stats:");
        a1.displayStats();
        a2.displayStats();
        a3.displayStats();

        System.out.println("Total Athletes: " + GameAthlete.totalAthletes);
    }
}
