package controller;

import java.util.ArrayList;
import java.util.Scanner;

import dto.Student;
import service.StudentService;

public class StudentSearchNameController implements Controller {

	@Override
	public void execute() {
		System.out.println("[ 학생 이름 일부로 검색을 시작합니다. ]");
		Scanner sc = new Scanner(System.in);
		//학생 이름 일부 입력
		System.out.print("학생 이름 일부 : ");
		String name = sc.nextLine();
		
		// 
		ArrayList<Student> list = StudentService.getInstance().searchStudentName(name);
		
		if(list.isEmpty()) {
			System.out.println("[ 학생 정보가 없습니다. ]");
			return;
		}else {
			for(Student student : list) {
				System.out.println(student);
			}
		}
	}

}
