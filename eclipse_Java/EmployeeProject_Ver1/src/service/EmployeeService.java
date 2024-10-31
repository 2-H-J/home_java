package service;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import dto.Employee;

public class EmployeeService {
	// instance를 통해 클래스의 인스턴스가 단 하나만 생성
	// 클래스의 싱글턴 인스턴스를 저장할 정적 변수
	private static EmployeeService instance;
	
	private ArrayList<Employee> list; // 배열생성
	
//	디폴트 생성자 + 샘플데이터
	public EmployeeService() {
		list = new ArrayList<Employee>();
		// 샘플데이터
		list.add(new Employee("123", "정씨", "팀장", "인사과", 4500));
		list.add(new Employee("456", "김씨", "과장", "인사과", 3500));
		list.add(new Employee("789", "이씨", "부장", "인사과", 2500));
		list.add(new Employee("135", "홍씨", "사원", "인사과", 2500));
		list.add(new Employee("246", "박씨", "사원", "인사과", 2500));
		list.add(new Employee("680", "진씨", "팀장", "개발팀", 5000));
		list.add(new Employee("579", "안씨", "과장", "개발팀", 4000));
		list.add(new Employee("424", "허씨", "부장", "개발팀", 3000));
		list.add(new Employee("124", "민씨", "사원", "개발팀", 2900));
		list.add(new Employee("590", "장씨", "사원", "개발팀", 2800));
	}

	public static EmployeeService getInstance() {
// 인스턴스가 null이면, 아직 생성되지 않았음을 의미 새로운 객체 생성 instance변수에 저장
		if(instance == null)
			instance = new EmployeeService();
		
		return instance; // 이미 생성된 경우에 기존 인스턴스 값 반환
	}
	/*
	 * 싱글턴 인스턴스를 반환하는 메서드.
	 * - 이 메서드는 StudentService 클래스의 유일한 인스턴스를 반환합니다.
	 * - 이미 인스턴스가 생성되어 있다면, 그 인스턴스를 반환하고,
	 *   생성되지 않았다면 새로운 인스턴스를 생성합니다.
	 * - 인스턴스가 단 하나만 존재하도록 보장합니다.
	*/
	
	
	
	// 1. 추가-----------------------------------------------------------------------------
	// 직원 정보 입력 추가
	// 사번, 사원명, 직급, 부서, 연봉
	public void insertEmployee() {
		Scanner sc = new Scanner(System.in);
		String empNo = ""; // 중복 체크를 위해 Scanner 받을 변수
		
		// 중복 체크
		while(true) { // 무한 루프 실행
			System.out.print("등록할 사번 입력 : ");
			empNo = sc.nextLine();
			// 사용자가 입력한 한 줄 전체를 문자열로 반환합니다.
			// 사용자가 문자를 입력하고 Enter를 누르면 그 입력을 읽습니다.
			
		    // list는 Employee 객체들을 저장하는 리스트
		    // list에서 contains() 메서드는 내부적으로
			// 객체의 equals() 메서드를 사용하여 중복 여부를 확인
		    // 새로운 Employee 객체를 생성해서 해당 사번이 이미 리스트에 있는지 확인
			// (이름, 직급, 부서, 연봉은 null 또는 0으로 임시 값 사용)
		    // String으로 사번을 비교하는 것이 아닌
			// Employee 객체의 equals() 메서드를 사용하여 비교
			if(list.contains(new Employee(empNo, null, null, null, 0))) {
				System.out.println("입력하신 사번은 중복되었습니다. 다시 입력 해주세요.");
				continue; // 중복이므로 다시 학번 입력을 받기 위해 루프를 계속 실행
				// continue를 만나면 이후 문장을 수행하지 않고 반복문의 증감식으로
				// 돌아가기 때문에 while(true) 무한 루프 반복문으로 돌아간다.
			}
			break; // 중복이 없으면 무한 루프 종료
		}
		System.out.print("등록할 사원 이름 입력 : ");
		String empName = sc.nextLine();
		System.out.print("등록할 사원 직급 입력 : ");
		String posn = sc.nextLine();
		System.out.print("등록할 사원 부서 입력 : ");
		String deptName = sc.nextLine();
		System.out.print("등록할 사원 연봉 입력 : ");
		int sal = sc.nextInt();
		sc.nextLine();
		//sc.nextLine() 호출 이유:
		//nextInt()은 숫자만 읽고 그 뒤에 입력된 개행 문자(Enter)를 버퍼에 남깁니다.
		//이 개행 문자가 다음 nextLine()에서 처리되지 않으면,
		//입력 대기 없이 빈 문자열이 입력되게 됩니다.
		//이를 방지하기 위해, 숫자를 입력받은 후 남아 있는 개행 문자를 처리하기 위해 
		//sc.nextLine()을 한 번 호출해서 버퍼를 비워 줍니다.
		
		list.add(new Employee(empNo, empName, posn, deptName, sal));
	}
	//-------------------------------------------------------------------------------------
	
	// 2. 검색-----------------------------------------------------------------------------
	public void searchEmployee() {
		// 사번 입력 받아서 검색
		Scanner sc = new Scanner(System.in);
		String empNo;
		System.out.print("검색할 사번 입력 : ");
		empNo = sc.nextLine(); // 입력받은 사번을 empNo 변수에 저장
		
		// indexOf로 검색 조건
	    // list에서 해당 사번을 가진 Employee 객체를 검색
	    // Employee 객체를 생성할 때, 사번만 중요하므로 나머지 필드는 null 또는 0으로 설정
	    // Employee 객체의 equals() 메서드를 통해 사번만 비교하여 검색
		int idx = list.indexOf(new Employee(empNo, null, null, null, 0));
		// new Employee(empNo, null, null, null, 0) : 
	    // 새로운 Employee 객체를 생성하고, 
		// 이 객체의 사번(empNo)을 기준으로 리스트에서 인덱스를 찾음
	    // indexOf()는 equals() 메서드를 사용하여 객체를 비교하므로,
		// 사번을 기준으로 객체를 찾을 수 있음
	    // 찾은 인덱스 번호를 idx에 저장, 만약 해당 사번의 객체가 없으면 -1이 반환됨
		
		// equals() 메서드는 indexOf() 메서드 내부에서 자동으로 호출됩니다.
		// 리스트에 있는 Employee 객체들과 새로 생성된 Employee 객체(사번만 가지고 있는) 
		// 사이의 비교를 할 때, equals() 메서드가 호출되어 객체의 동일성 여부를 결정합니다.
		
		// 조건문을 통해 인덱스 값이 -1인지 확인하여, 사번을 가진 객체가 존재하는지 확인
		if(idx == -1) {
			System.out.println("입력하신 사번정보가 없습니다.");
		}else {
			System.out.println(list.get(idx));// 검색된 직원의 정보를 출력
		}
	}
	
	// 3. 삭제-----------------------------------------------------------------------------
	public void deleteEmployee() {
	    // 사번을 입력받아 해당 사번을 가진 직원 정보를 삭제하는 메서드

	    // 1. Scanner 객체를 생성하여 사용자로부터 입력을 받을 준비를 함
	    Scanner sc = new Scanner(System.in);
	    String empNo;  // 사번을 저장할 변수 선언

	    // 2. 사용자로부터 삭제할 사번을 입력받음
	    System.out.print("삭제하실 사번 입력 : ");
	    empNo = sc.nextLine();  // 입력받은 사번을 empNo 변수에 저장

	    // 3. list.remove()를 사용하여 해당 사번을 가진 Employee 객체를 리스트에서 삭제
	    // Employee 객체를 생성할 때, 사번만 중요하므로 나머지 필드는 null 또는 0으로 설정
	    // Employee 객체의 equals() 메서드를 통해 사번만 비교하여 삭제할 대상을 찾음
	    if (list.remove(new Employee(empNo, null, null, null, 0))) {
	        // list.remove()는 객체가 리스트에서 성공적으로 삭제되면 true를 반환
	        // equals() 메서드가 사번을 기준으로 정의되어 있다면, 동일한 사번을 가진 객체가 삭제됨
	        System.out.println("입력하신 사번의 정보를 삭제하였습니다.");  // 삭제 성공 메시지 출력
	    } else {
	        // remove()가 false를 반환하면, 해당 사번을 가진 객체가 리스트에 없다는 의미
	        System.out.println("삭제하실 사번이 존재 하지 않습니다.");  // 삭제 실패 메시지 출력
	    }
	}
	
	// 4. 수정-----------------------------------------------------------------------------
	
	
	// 5. 전체 출력------------------------------------------------------------------------
	public void PrintAll() {
		for(Employee emp : list) {
			System.out.println(emp);
		}
	}
	
	// 6. 부서 검색------------------------------------------------------------------------


	
	
	
}
