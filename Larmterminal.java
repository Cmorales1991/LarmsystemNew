import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Larmterminal {

    public static void simulateAlarm(Scanner scanner) {
        Random random = new Random();
        if (Room.rooms.isEmpty()) {
            System.out.println("Inga rum är skapade.");
            return;
        }
        int roomIndex = random.nextInt(Room.rooms.size());
        Room roomChoice = Room.rooms.get(roomIndex);

        System.out.println("Valt rum: " + roomChoice.getName());
        System.out.println("Välj ett larm att simulera:");

        List<Alarm> larmLista = roomChoice.getAllAlarms();

        if (larmLista.isEmpty()) {
            System.out.println("Inga larm tillgängliga i detta rum.");
            return;
        }
        for (int i = 0; i < larmLista.size(); i++) {
            System.out.println((i + 1) + ". " + larmLista.get(i).getLarmType());
        }
            System.out.print("Välj ett larm: ");
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt() - 1;
        if (choice >= 0 && choice < larmLista.size()) {
            Alarm chosenAlarm = larmLista.get(choice);
            System.out.println("Simulerar larm: " + chosenAlarm.getLarmType() + " i " + roomChoice.getName());chosenAlarm.activate();
        } else {
            System.out.println("Ogiltigt val. Försök igen.");
            }
        }
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        Room.createRooms();
        boolean startMenu = true;
        while (startMenu) {
            System.out.println("---------Larmsystemet---------");
            System.out.println("1. Aktivera alla larm");
            System.out.println("2. Avaktivera alla larm");
            System.out.println("3. Visa alla rum");
            System.out.println("4. Simulera en händelse");
            System.out.println("5. Återställ larm");
            System.out.println("6. Avsluta");
            System.out.print("Ditt val:");

            int choice = scanner.nextInt();

            if (choice == 1) {
                Room.activeAllAlarms();
            } else if (choice == 2) {
                Room.deactiveAllAlarms();
            } else if (choice == 3) {
               Room.showInfo();
            } else if (choice == 4) {
                simulateAlarm(scanner);
            } else if (choice == 5) {
                Room.restoreAlarms();
            } else if (choice == 6) {
                startMenu = false;
                System.out.println("Avslutar programmet...");
            } else {
                System.out.println("Felaktigt val! Försök igen.");
            }
        }
        scanner.close();
    }
}