// Java SMS (Student Management System) program

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int choice = 0;

		while (choice != 5) {
			System.out.println("1. Add student\n2. View Students\n3. Update Student\n" +
				"4. Delete Student\n5. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
				case 1: // Add student
					System.out.print("Enter ID: ");
					int id = sc.nextInt();
					sc.nextLine(); // Consume leftover newline
					System.out.print("Enter name: ");
					String name = sc.nextLine();
					System.out.print("Enter Age: ");
					int age = sc.nextInt();
					System.out.print("Enter Grade: ");
					String grade = sc.next();
					students.add(new Student(id, name, age, grade));
					System.out.println("Student Added!");
					break;

				case 2: // View Students
					System.out.println("Student Records:");
					for (Student s : students) s.display();
					break;

				case 3: //Update Student
					System.out.print("Enter ID to update: ");
					int updateID = sc.nextInt();
					for (Student s : students) {
						if (s.getID() == updateID) {
							System.out.print("Enter New Name: ");
							sc.nextLine(); // consume newline
							s.setName(sc.nextLine());
							System.out.print("Enter New Age: ");
							s.setAge(sc.nextInt());
							System.out.print("Enter New Grade: ");
							s.setGrade(sc.next());
							System.out.println("Student updated!");
							break;
						}
					}
					break;

				case 4: // Delete student
					System.out.print("Enter ID to Delete: ");
					int deleteID = sc.nextInt();
					students.removeIf(s -> s.getID() == deleteID);
					System.out.println("Student Deleted!");
					break;

				case 5: // Exit
					System.out.println("Exiting...");
					break;

				default:
					System.out.println("Invalid choice!");


			}
		}
		sc.close();
	}
}