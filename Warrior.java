package HW_3;

public class Warrior {
    private String name;
    private int strength;

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return String.format("Класс: %s - Сила: %d", name,strength);
    }
    public Warrior(String name, int strength){
        this.name = name;
        this.strength = strength;
    }

}
