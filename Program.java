package HW_3;

public class Program {
    public static void main(String[] args) {
        LinkedList<Warrior> ll = new LinkedList<>();
        ll.addElement(new Warrior("Воин", 15));
        ll.addElement(new Warrior("Лучник", 25));
        ll.addElement(new Warrior("Мечник", 30));
        ll.addElement(new Warrior("Орк", 50));
        System.out.println(ll);
        ll.revert();
        System.out.println();
        System.out.println(ll);
    }
}
