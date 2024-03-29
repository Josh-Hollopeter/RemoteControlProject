import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String virtualRemote = "";

		do {
			System.out.println("To begin, turn on the remote control: Type ON to power remote");
			virtualRemote = input.next();

		} while (!virtualRemote.equals("ON"));

		turnON();

		while (true) {
			System.out.println("Enter a button 0 - 9 enter OFF to power down");
			virtualRemote = input.next();
			if (virtualRemote.equals("OFF")) {
				turnOff();
				break;

			} else {
				switch (virtualRemote) {
					case "0":
					case "1":
					case "2":
					case "3":
					case "4":
					case "5":
					case "6":
					case "7":
					case "8":
					case "9":
						pressButton();
						continue;
					default:
						System.out.println("Command not recognized");
				}

			}
		}
		input.close();
	}

	public static void turnON() {
		System.out.println("TURNING ON...");

	}

	public static void pressButton() {
		System.out.println("Boop!");

	}

	public static void turnOff() {
		System.out.println("TURNING OFF...");
	}

}
