package controller;

import java.util.ArrayList;

import dto.Student;
import service.StudentService;

public class StudentPrintAllController implements Controller {

	@Override
	public void execute() {
		ArrayList<Student> list = StudentService.getInstance().getList();
		
		System.out.println("[ 전체 학생 정보를 출력합니다. ]");
		for(Student std : list) {
			System.out.println(std);
		}
		
		
		
	}

}
