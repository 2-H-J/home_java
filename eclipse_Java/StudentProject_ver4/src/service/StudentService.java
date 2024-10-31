package service;

import java.util.ArrayList;
import java.util.Scanner;

import dto.Student;

public class StudentService {
	// instance를 통해 클래스의 인스턴스가 단 하나만 생성
	// 클래스의 싱글턴 인스턴스를 저장할 정적 변수
	private static StudentService instance; // StudentService의 유일한 인스턴스
	
	private ArrayList<Student> list = new ArrayList<Student>();
	
	
	
// 샘플데이터
	private StudentService() {
		
		//샘플데이터 3~4건
		list.add(new Student("1234", "홍길동", "컴퓨터공학과", 3.5));
		list.add(new Student("5678", "김철수", "전자공학과", 3.8));
		list.add(new Student("9876", "이영희", "수학과", 4.0));
	}
	
	public static StudentService getInstance() {
		// // 인스턴스가 null이면, 아직 생성되지 않았음을 의미
		if(instance == null)
			// 새로운 StudentService 객체를 생성하고, instance 변수에 저장
			instance = new StudentService();
		return instance;  // 이미 생성된 경우에는 기존 인스턴스를 반환
	}
	/*
	 * 싱글턴 인스턴스를 반환하는 메서드.
	 * - 이 메서드는 StudentService 클래스의 유일한 인스턴스를 반환합니다.
	 * - 이미 인스턴스가 생성되어 있다면, 그 인스턴스를 반환하고,
	 *   생성되지 않았다면 새로운 인스턴스를 생성합니다.
	 * - 인스턴스가 단 하나만 존재하도록 보장합니다.
	 */
	
	public ArrayList<Student> getList() {
		return list;
	}
// 추가-------------------------------------------------------------------
	public boolean insertStudent(Student sutdent) {
		
		//리스트에 학생정보 추가
		return list.add(sutdent);
		
	}
// 검색-------------------------------------------------------------------
	public Student searchStudent(String studentNo) { // 검색할 학번을 인자값으로 받음
		
		int idx = list.indexOf(new Student(studentNo, null, null, 0));
		
		if(idx == -1) {
			return null;
		}else {
			return list.get(idx);
		}
	}
// 삭제-------------------------------------------------------------------
	public boolean deleteStudent(String studentNo) {
		
		return list.remove((new Student(studentNo, null, null, 0)));
	}
// 수정-------------------------------------------------------------------
//	public void updateStudent() {
//	}
// 전체출력---------------------------------------------------------------
//	public void printAllStudent() {
//	}
// 이름검색---------------------------------------------------------------
	public ArrayList<Student> searchStudentName(String name) {
		// 검색 결과 저장할 리스트
		ArrayList<Student> result = new ArrayList<Student>();
		
		//반복문
		for(int i=0;i<list.size();i++) {
		//	입력한 검색어가 학생 이름에 있는지 확인 후 출력
			if(list.get(i).getStudentName().indexOf(name) != -1) {
				result.add(list.get(i));
			}
		}
		
		return result;
	}



	
	
}