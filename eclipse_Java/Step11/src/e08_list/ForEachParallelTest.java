package e08_list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class ForEachParallelTest {
	
	public static void main(String[] args) {
		
		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		
		// 샘플 데이터 10건 리스트에 추가
		
		list.add(new StudentDTO("1234", "홍길동", "컴퓨터공학과", 3.5));
		list.add(new StudentDTO("5678", "김철수", "전자공학과", 4.5));
		list.add(new StudentDTO("9876", "이영희", "수학과", 4.0));
		list.add(new StudentDTO("1240", "아몰라", "정하기", 2.0));
		list.add(new StudentDTO("1230", "개많아", "힘들다", 3.3));
		list.add(new StudentDTO("4024", "좀많네", "다넣어", 4.2));
		list.add(new StudentDTO("9429", "왜하필", "야하는", 1.5));
		list.add(new StudentDTO("9859", "이렇게", "걸까나", 2.2));
		list.add(new StudentDTO("2942", "넣을까", "그만넣", 4.5));
		list.add(new StudentDTO("9402", "궁금쓰", "고싶다", 2.0));
		
		// 전체 학생 정보 출력
		for(StudentDTO dto : list) {
			dto.printInfo();
		}
		System.out.println("-----------------------------");
		
		// forEach, Consumer 익명 클래스로 작성
		list.forEach(new Consumer<StudentDTO>() {
			@Override
			public void accept(StudentDTO t) {
				t.printInfo();
			}
		});
		
		System.out.println("-----------------------------");
		// lambda 식 forEach
		list.forEach(t -> t.printInfo());
		
		// 학생 전체 평점의 평균을 출력
		double score = 0.0;
		
		for(StudentDTO dto : list) {
			score += dto.getScore();
			
		}
		score /= list.size();
		System.out.println("전체 학생 평균 : "+score);
		
		double avg = 0.0;
		ArrayList<Double> scoreList = new ArrayList<Double>();
		list.forEach(t -> scoreList.add(t.getScore()));
		// acc : 누적된 값 (리턴되서 받는값), cur : 현재 데이터
		avg = scoreList.parallelStream().reduce(0.0, (acc, cur) -> acc + cur);
		//										0.0 acc 초기값 			acc + cur 리턴 되어서 acc로?
		//										
		System.out.println("전체 학생 평균 : "+avg / list.size());
		
		//평점이 제일 높은 학생 정보를 출력
		StudentDTO max = list.get(0);
		for(StudentDTO dto : list) {
			if(max.getScore() < dto.getScore())
				max = dto;
		}
		max.printInfo();
		
		System.out.println("--------------------------------------------------");
		
		//람다식 forEach사용(GPT)
//		StudentDTO[] maxStudent = {null};
//		
//		list.forEach(t -> {
//			if(maxStudent[0] == null || t.getScore() > maxStudent[0].getScore()) {
//				maxStudent[0] = t; // 더 높은 평점을 가진 학생으로 갱신
//			}
//		});
//		
//		//최고 평점을 가진 학생 정보 출력
//		if(maxStudent[0] != null) {
//			System.out.print("최고 평점을 가진 학생 : ");
//			maxStudent[0].printInfo();
//		}
		
		// 강사님
		StudentDTO maxStudent = list.parallelStream().reduce(list.get(0), 
				(acc, cur) -> acc.getScore() < cur.getScore() ? cur : acc);
		maxStudent.printInfo();
		/*
		 * acc에는 0번 값이 들어감
		 * cur 1번째 값이 들어감
		 * 람다식 조건 acc(0번) < cur(1번) ? cur : acc = true면 cur을 acc로 리턴 false면 acc를 그대로 리턴
		 */
		System.out.println("--------------------------------------------------");
		
		//평점이 3.0이상인 학생 정보를 출력
//		for(StudentDTO dto : list) {
//			if(dto.getScore() >= 3.0) {
//				dto.printInfo();
//			}
//		}
		
//		List<StudentDTO> filter = list.parallelStream().filter(new Predicate<StudentDTO>() {
//			public boolean test(StudentDTO t) {
//				return t.getScore() >= 3.0;
//			};
//		}).toList();
//		filter.forEach(t -> t.printInfo());
		
		// 람다식
		List<StudentDTO> filterList = list.parallelStream().
				filter(t -> t.getScore() >= 3.0).toList();
		filterList.forEach(t -> t.printInfo());
		
	}

}
