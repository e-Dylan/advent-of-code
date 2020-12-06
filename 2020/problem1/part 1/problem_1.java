import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

// flag: 776064

public class problem_1 {
	public static void main(String[] args) {
		Sum2020 summer = new Sum2020();
		Integer flag = summer.FindSumNumbers();
		System.out.println(flag);
	}
}

class Sum2020 {

	public ArrayList<Integer> nums = new ArrayList<Integer>();

	public Integer FindSumNumbers() {
		try {
			Scanner scanner = new Scanner(new File("C:/Users/Dylan/Desktop/build/advent_of_code/2020/problem_1/data.txt"));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				nums.add(Integer.parseInt(line));
			}
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < nums.size(); i++) {
			for (int j = i+1; j < nums.size(); j++) {
				Integer num1 = nums.get(i);
				Integer num2 = nums.get(j);
				if ((num1 + num2) == 2020) {
					return (num1 * num2);
				}
			}
		}
		return 0;
	}
}