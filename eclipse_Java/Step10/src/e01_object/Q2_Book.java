package e01_object;
/*
 * Q2. 207 ~ 208페이지에 Book 클래스에도 equals 메서드
	재정의 한 후 테스트
*/
public class Q2_Book {
	
	private String bookName;
	private String author;
	
	public Q2_Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Q2_Book [ bookName : " + bookName + " / author : " + author + " ]";
	}
	
	@Override
		public boolean equals(Object obj) {
		// 1. 메모리 주소(해시값)이 같으면 같은 객체
		if(this == obj) {
			return true;
		}
		// 2. null인지 체크 : 값이 비어있는 null이면 에러가 발생
		if(obj == null) {
			return false;
		}
		// 3. 받아온 obj가 현재 객체랑 비교할 수 있는 타입인지 확인
		if(obj != obj.getClass()) {
			// 1. obj를 형변환
			Q2_Book temp = (Q2_Book) obj;
			// 2. 내용 비교를 해서 결과값 리턴
			return bookName.equals(temp.bookName) && author == temp.author;
		}
		// 4. 3번이 거짓이면 타입이 다르기 때문에 거짓으로 처리
			return false;
		}

	public static void main(String[] args) {
		Q2_Book bk1 = new Q2_Book("아몰랑", "누구세요");
		Q2_Book bk2 = new Q2_Book("아몰랑", "누구세용");
		Q2_Book bk3 = new Q2_Book("아몰랑", "누구세요");
		
		System.out.println(bk1.toString());
		System.out.println(bk2.toString());
		System.out.println(bk3.toString());
		
		System.out.println(bk1.equals(bk2));
		System.out.println(bk1.equals(bk3));
	}
	
}
