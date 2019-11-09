import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String remotePower = "";

		do {
			System.out.println("To begin, turn on the remote control type ON to power remote");
			remotePower = input.next();

		} while (!remotePower.equals("ON"));

		while (!remotePower.equals("OFF")) {
			System.out.println("Enter a button 0 - 9 enter OFF to power down");
			remotePower = input.next();
			if (remotePower.equals("ON")) {
				turnON();
				remotePower = "loop";
				continue;
			} else if (remotePower.equals("OFF")) {
				turnOff();
				break;

			} else {
				switch (remotePower) {
					case "0":
						pressButton();
						continue;
					case "1":
						pressButton();
						continue;
					case "2":
						pressButton();
						continue;
					case "3":
						pressButton();
						continue;
					case "4":
						pressButton();
						continue;
					case "5":
						pressButton();
						continue;
					case "6":
						pressButton();
						continue;
					case "7":
						pressButton();
						continue;
					case "8":
						pressButton();
						continue;
					case "9":
						pressButton();
						continue;
					default:
						System.out.println("Comand not recognized");
				}

			}
		}
		input.close();
	}

	public static void turnON() {
		System.out.println("TURNING ON...");

	}

	public static void pressButton() {
		System.out.println("Boop");

	}

	public static void turnOff() {
		System.out.println("TURNING OFF...");
	}

}
