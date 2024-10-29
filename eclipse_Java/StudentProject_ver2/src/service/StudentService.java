package service;

import java.util.ArrayList;
import java.util.Scanner;

import dto.Student;

public class StudentService {

	private static StudentService instance; // 
	
	private ArrayList<Student> list;

	private StudentService() {
		list = new ArrayList<Student>();
		
		//샘플데이터 3 ~ 4건
		list.add(new Student("123", "이씨", "컴공", 2.5));
		list.add(new Student("456", "김씨", "법학", 3.5));
		list.add(new Student("789", "박씨", "방송", 4));
	}

	public static StudentService getInstance() {
		
		if(instance == null) {
			instance = new StudentService();
		}
		return instance;
	}
	
	// 학생정보를 학번으로 검색
	private Student searchStudent(String studentNo) { // null객체 리턴---------------학번검색
		
		// 매개변수로 받은 학번과 동일한 학번이 있으면 해당 객체를 student에 저장
		
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).getStudentNo().equals(studentNo)) {
//				return list.get(i); // 검색 결과가 있을때 해당 객체 리턴
//			}
//		}
		
		for(Student std : list) {
			if(std.getStudentNo().equals(studentNo)) {
				return std; // 검색 결과가 있을때 해당 객체 리턴
			}
		}
		return null; // 해당 결과가 없을때 null 리턴
	}

	public void insertStudent() {//---------------------------------------------------추가+중복
		// 학생정보 입력
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 정보 추가를 진행합니다.......");
        
        // 1. 사용자로부터 학생 정보를 입력받음
        
        String studentNo = "";
        while(true) {
        	System.out.print("등록할 학번 입력 : ");
        	studentNo = sc.nextLine();
        	// 학번 중복 체크
        	if(searchStudent(studentNo) != null) {
        		System.out.println("학번이 중복 되었습니다. 다시 입력해 주세요");
        		continue;
        	}
        	break;
        }
        System.out.print("등록할 학생이름 입력 : ");
        String studentName = sc.nextLine();
        System.out.print("등록할 학과명 입력 : ");
        String majorName = sc.nextLine();
        System.out.print("등록할 학생 평점 입력 : ");
        double score = sc.nextDouble();
        
        
        
		// 리스트에 학생정보 추가
        list.add(new Student(studentNo, studentName, majorName, score));
	}
//--------------------------------------------------------------------------------------학번검색
	public void searchStudent() {
        Scanner sc = new Scanner(System.in);

        // 학번 입력받아서 검색 수행
        System.out.print("찾으실 학생 학번을 입력하세요 : ");
        String studentNo = sc.nextLine();
        
        // 검색 결과 출력
        // Me
        if (searchStudent(studentNo) == null) {
            System.out.println("해당 학번 학생이 없습니다.");
        } else {
            System.out.println(searchStudent(studentNo));
        }
        //강사님
//        Student std = searchStudent(studentNo);
//        if(std == null) {
//            System.out.println("해당 학번 학생이 없습니다.");
//        }else {
//        	System.out.println(std);
//        }
    
        
	}

	public void deleteStudent() {//-----------------------------------------------------삭제
        Scanner sc = new Scanner(System.in);

        // 1. 삭제할 학생의 학번을 입력받음
        System.out.print("삭제할 학생의 학번을 입력하세요: ");
        String studentNo = sc.nextLine();
        
//        if(searchStudent(studentNo) == null) {
//        	System.out.println("삭제할 학생 학번이 존재하지 않습니다.");
//        }else {
//        	System.out.println("삭제할 "+searchStudent(studentNo));
//        	list.remove(searchStudent(studentNo));
//        }
        
        Student std = searchStudent(studentNo);
        if(std == null ) {
        	System.out.println("[ 삭제할 학생 정보가 존재하지 않습니다. ]");
        }else{
        	System.out.println("삭제할 "+std+" \n-[삭제완료]-");
        	list.remove(std);
        }
	}

	public void updateStudent() {//----------------------------------------------------수정
        Scanner sc = new Scanner(System.in);

        // 1. 수정할 학생의 학번을 입력받음
        System.out.print("수정할 학생의 학번을 입력하세요: ");
        String studentNo = sc.nextLine();

        // 2. 입력받은 학번으로 학생 검색
        Student std = searchStudent(studentNo);

        // 3. 검색 결과가 없을 경우 처리
        if (std == null) {
            System.out.println("[ 수정할 해당 학번의 학생이 없습니다. ]");
            return;
        }
        
        // 4. 수정할 학생의 기존 정보 출력
        System.out.println("수정할  " + std);

        // 5. 사용자로부터 새로운 학생 정보를 입력받기
        System.out.print("새로운 학생 이름 입력: ");
        String newStudentName = sc.nextLine();
        System.out.print("새로운 학과명 입력: ");
        String newMajorName = sc.nextLine();
        System.out.print("새로운 평점 입력: ");
        double newScore = sc.nextDouble();

        // 6. 기존 학생 객체의 정보 수정
        std.setStudentName(newStudentName); // 이름 수정
        std.setMajorName(newMajorName);     // 학과명 수정
        std.setScore(newScore);             // 평점 수정

        // 7. 수정 완료 메시지 출력
        System.out.println("[ 학생 정보가 수정되었습니다. ]");
        
        
        
	}

	public void infoAllStudent() {//------------------------------------------------전체출력
        System.out.println("전체 학생 정보 출력.......");
        for(Student std : list) {
			System.out.println(std);
		}
		

	}

	public void searchStudentName() {
		// 학생 이름 일부 입력
        Scanner sc = new Scanner(System.in);
        
        // 1. 검색할 학생의 학번을 입력받음
        System.out.print("검색할 학생의 이름 일부 입력하세요: ");
        String name = sc.nextLine(); // 사용자로부터 검색할 이름 입력받기
        
        int count = 0;
		// 반복문
        for(int i = 0; i < list.size(); i++) {
        	// 입력한 검색어가 학생 이름에 있는지 확인 후 출력
        	if(list.get(i).getStudentName().indexOf(name) != -1) {
        		System.out.println(list.get(i));
        		count++;
        	}
        }
		// 검색 결과가 없으면, '해당 검색 결과가 없습니다.' 메세지 출력
        if(count == 0) {
        	System.out.println("해당 검색 결과가 없습니다.");
        }else {
        	System.out.println(count+" 건이 검색 되었습니다.");
        }
	}
	
	
	
	
	
	
}
