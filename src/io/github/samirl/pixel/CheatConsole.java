package io.github.samirl.pixel;

import java.util.Scanner;

public class CheatConsole {
	Scanner scan = new Scanner(System.in);
	public void run() {
		System.out.println("Welcome to the cheat console!");
		System.out.println("Please enter command:");
		String command = scan.next();
		if(command.equalsIgnoreCase("help")) {
			System.out.println("Commands are in format classname.method.value");
			this.run();
			return;
		}
		String[] args = command.toLowerCase().split(".");
		switch(args[0]) {
		case "shotgun":
			switch(args[1]) {
			case "id":
				
			}
		}
	}
}
