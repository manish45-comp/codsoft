import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks obtained");
		int[] marks = new int[5];
		for (int i = 0 ;i<marks.length;i++){
			System.out.println("Enter marks for subject"+ (i+1));
			marks[i] = scanner.nextInt();
		}
		scanner.close();
	}
}
