import java.util.Scanner;
import java.io.File;
import java.io.IOException;

// Key: 404

public class problem_2 {
	public static void main(String[] args) {
		Solver solver = new Solver();
		int numValid = solver.findPasswords();
		System.out.println(numValid);
	}
}

class Solver {
	int findPasswords() {
		int numValid = 0;
		try {
			Scanner scanner = new Scanner(new File("C:/Users/Dylan/Desktop/build/advent_of_code/2020/problem_2/part2/data.txt"));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine().strip();
				String[] lines = line.split(": ");
				String pass = lines[1];
				String[] rules = lines[0].split(" ");
				char letter = rules[1].charAt(0);
				int pos1 = Integer.parseInt(rules[0].split("-")[0]);
				int pos2 = Integer.parseInt(rules[0].split("-")[1]);
				
				// System.out.println(pos1);
				// System.out.println(pos2);

				if ((pass.charAt(pos1-1) == letter && pass.charAt(pos2-1) != letter) || (pass.charAt(pos1-1) != letter && pass.charAt(pos2-1) == letter)) {
					// only one of the two positions is the letter
					
					numValid++;
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return numValid;
	}
}