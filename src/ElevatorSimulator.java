public class ElevatorSimulator {
    public static void main(String[] args) {
        Person person1 = new Person(1, 60);
        Person person2 = new Person(2, 100);
        Person person3 = new Person(3, 185);
        Person person4 = new Person(4, 110);
        Person person5 = new Person(5, 60);

        Elevator elevator = new Elevator();
        elevator.add(person1);
        elevator.add(person2);
        elevator.add(person3);
        elevator.add(person4);
        elevator.add(person5);

        elevator.clear();

        elevator.add(person1);
        elevator.add(person2);
        elevator.add(person3);
        
        elevator.start();


    }
}
