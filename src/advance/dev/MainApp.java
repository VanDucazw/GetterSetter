package advance.dev;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Student[] students = input();
		print(students);
		Arrays.sort(students, (s1, s2) -> Double.compare(s1.getAverageScore(), s2.getAverageScore()));
		System.out.println("Sau khi sắp xếp:");
		print(students);
	}

	public static Student[] input() {
		Scanner scanner = new Scanner(System.in);
		Student[] students = new Student[10];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			System.out.print("Nhập tên sinh viên thứ " + (i + 1) + ": ");
			students[i].setName(scanner.nextLine());
			System.out.print("Nhập tuổi: ");
			students[i].setAge(scanner.nextInt());
			scanner.nextLine(); // Consume newline left-over
			System.out.print("Nhập địa chỉ: ");
			students[i].setAddress(scanner.nextLine());
			System.out.print("Nhập số điện thoại: ");
			students[i].setPhoneNumber(scanner.nextLine());
			System.out.print("Nhập điểm trung bình: ");
			students[i].setAverageScore(scanner.nextDouble());
			scanner.nextLine(); // Consume newline left-over
		}
		scanner.close();
		return students;
	}

	public static void print(Student[] students) {
		for (Student student : students) {
			System.out.println("Tên: " + student.getName() + ", Tuổi: " + student.getAge() + ", Địa chỉ: "
					+ student.getAddress() + ", Số điện thoại: " + student.getPhoneNumber() + ", Điểm TB: "
					+ student.getAverageScore());
		}
	}
}
