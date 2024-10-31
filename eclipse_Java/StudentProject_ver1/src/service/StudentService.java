package service;

import java.util.Scanner;
import dto.Student; // Student 클래스는 학생 데이터를 관리하는 DTO 클래스입니다.

/*
 * StudentService 클래스: 학생 데이터를 배열로 관리하며 CRUD 작업을 수행
 * 기능: 학생 데이터 추가, 삭제, 검색, 수정, 전체 출력
 */
public class StudentService {

    // 학생 정보를 저장할 배열
    private Student[] arr; // Student 객체를 저장하는 배열
    // 현재 배열에서 사용 중인 인덱스
    private int idx;

    // 기본 생성자: 초기 배열 생성 및 샘플 데이터 추가
    public StudentService() {
        arr = new Student[5]; // 초기 배열 크기 설정

        // 샘플 데이터 추가
        arr[idx++] = new Student("1234", "김씨", "컴공", 2.4);
        arr[idx++] = new Student("2345", "이씨", "법학", 3.1);
        arr[idx++] = new Student("3456", "정씨", "방송", 2.9);
    }

    // 학생 추가 메서드-------------------------------------------------------------------추가
    public void insertStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 정보 추가를 진행합니다.......");
        
        // 1. 사용자로부터 학생 정보를 입력받음
        System.out.print("등록할 학번 입력 : ");
        String studentNo = sc.nextLine();
        System.out.print("등록할 학생이름 입력 : ");
        String studentName = sc.nextLine();
        System.out.print("등록할 학과명 입력 : ");
        String majorName = sc.nextLine();
        System.out.print("등록할 학생 평점 입력 : ");
        double score = sc.nextDouble();

        // 2. 배열의 공간이 부족할 경우 배열 크기를 늘림
        if (idx == arr.length) {
            Student[] temp = new Student[arr.length + 5]; // 배열 크기 확장
            System.arraycopy(arr, 0, temp, 0, arr.length); // 기존 배열을 새 배열로 복사
            arr = temp; // 참조 변경
        }

        // 3. 새로운 학생 객체를 배열에 추가
        arr[idx++] = new Student(studentNo, studentName, majorName, score); // 새로운 학생 추가
    }

    // 학생 삭제 메서드-------------------------------------------------------------------삭제
    public void deleteStudent() {
        Scanner sc = new Scanner(System.in);

        // 1. 삭제할 학생의 학번을 입력받음
        System.out.print("삭제할 학생의 학번을 입력하세요: ");
        String studentNo = sc.nextLine();

        // 2. 입력받은 학번으로 학생 검색
        int index = searchStudent(studentNo); // 해당 학번의 학생 인덱스 찾기

        // 3. 검색 결과가 없을 경우 처리
        if (index == -1) {
            System.out.println("해당 학번의 학생이 없습니다."); // 학생이 없다는 메시지 출력
            return; // 메서드 종료
        }

        // 4. 삭제할 학생의 기존 정보 출력
        System.out.println("삭제할 학생 정보: " + arr[index]);

        // 5. 삭제 진행: 배열 요소를 앞으로 이동하여 삭제된 것처럼 처리
        for (int i = index; i < idx - 1; i++) {
            arr[i] = arr[i + 1];
        }
        idx--; // 인덱스 감소로 요소 수 감소
    }

    // 학생 검색 메서드: 학번을 입력받아 검색하고 인덱스를 반환--------------------------검색
    private int searchStudent(String studentNo) {
        // 배열을 순회하며 학번이 일치하는 학생 찾기
        for (int i = 0; i < idx; i++) {
            if (arr[i].getStudentNo().equals(studentNo)) {
                return i; // 찾은 학생의 인덱스 반환
            }
        }
        return -1; // 일치하는 학생이 없을 경우 -1 반환
    }

    // 외부에서 호출하는 검색 메서드
    public void searchStudent() {
        Scanner sc = new Scanner(System.in);

        // 학번 입력받아서 검색 수행
        System.out.print("찾으실 학생 학번을 입력하세요 : ");
        String studentNo = sc.nextLine();
        int index = searchStudent(studentNo);

        // 검색 결과 출력
        if (index == -1) {
            System.out.println("해당 학번 학생이 없습니다.");
        } else {
            System.out.println(arr[index]);
        }
    }

    // 학생 정보 수정 메서드--------------------------------------------------------------수정
    public void updateStudent() {
        Scanner sc = new Scanner(System.in);

        // 1. 수정할 학생의 학번을 입력받음
        System.out.print("수정할 학생의 학번을 입력하세요: ");
        String studentNo = sc.nextLine();

        // 2. 입력받은 학번으로 학생 검색
        int index = searchStudent(studentNo);

        // 3. 검색 결과가 없을 경우 처리
        if (index == -1) {
            System.out.println("해당 학번의 학생이 없습니다.");
            return;
        }

        // 4. 수정할 학생의 기존 정보 출력
        System.out.println("수정할 학생 정보: " + arr[index]);

        // 5. 사용자로부터 새로운 학생 정보를 입력받기
        System.out.print("새로운 학생 이름 입력: ");
        String newStudentName = sc.nextLine();
        System.out.print("새로운 학과명 입력: ");
        String newMajorName = sc.nextLine();
        System.out.print("새로운 평점 입력: ");
        double newScore = sc.nextDouble();

        // 6. 기존 학생 객체의 정보 수정
        arr[index].setStudentName(newStudentName); // 이름 수정
        arr[index].setMajorName(newMajorName);     // 학과명 수정
        arr[index].setScore(newScore);             // 평점 수정

        // 7. 수정 완료 메시지 출력
        System.out.println("학생 정보가 수정되었습니다.");
    }

    // 전체 학생 정보 출력 메서드----------------------------------------------------전체출력
    public void infoAllStudent() {
        // 학생 정보가 없는 경우 처리
        if (idx == 0) {
            System.out.println("등록된 학생 정보가 없습니다.");
            return;
        }

        // 등록된 모든 학생 정보 출력
        System.out.println("전체 학생 정보 출력:");
        System.out.println("학번\t이름\t학과명\t점수");
        System.out.println("--------------------------------");

        // 현재 등록된 학생 수만큼 반복하여 정보 출력
        for (int i = 0; i < idx; i++) {
            Student student = arr[i]; // 배열에서 학생 객체 가져오기
            System.out.printf("%s\t%s\t%s\t%.2f\n",
                    student.getStudentNo(),   // 학번 출력
                    student.getStudentName(), // 이름 출력
                    student.getMajorName(),   // 학과명 출력
                    student.getScore());      // 평점 출력
        }
    }
    
	// 학생 정보 이름 일부를 일부가 일치하면 출력
	public void searchStudentName() {
		// 학생 이름 일부 입력
        Scanner sc = new Scanner(System.in);
        
        // 1. 검색할 학생의 학번을 입력받음
        System.out.print("검색할 학생의 이름 일부 입력하세요: ");
        String name = sc.nextLine(); // 사용자로부터 검색할 이름 입력받기
        
        int count = 0;
		// 반복문
        for(int i = 0; i < idx; i++) {
        	// 입력한 검색어가 학생 이름에 있는지 확인 후 출력
        	if(arr[i].getStudentName().indexOf(name) != -1) {
        		System.out.println(arr[i]);
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
