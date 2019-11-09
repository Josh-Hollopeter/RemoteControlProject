import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		// TODO: add pressButton() method
		// TODO: add turnON() method
		Scanner input = new Scanner(System.in);
		String remotePower = "";
		do {
			System.out.println("To begin, turn on the remote control type ON to power remote");
			remotePower = input.next();

		} while (!remotePower.equals("ON"));
		input.close();

		if (remotePower.equals("ON")) {
			turnON();
		}
	}
	public static void turnON() {
		System.out.println("TURNING ON...");
	}
}
