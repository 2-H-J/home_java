package jdbc_ex;

import java.sql.*;

public class JDBCTest1 {
    public static void main(String[] args) {
        // JDBC 사용 예제 - 데이터베이스와 연결하고 데이터를 조회함

        try {
            // 1. JDBC 드라이버 클래스 로딩
            // JDBC 드라이버 클래스를 로딩하여 메모리에 등록합니다.
            // Class.forName("oracle.jdbc.driver.OracleDriver")는
            // 오라클 데이터베이스에 연결하기 위해 필요합니다.
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("-Driver loading complete-"); // 드라이버 로딩 확인용 메시지

            // 2. 데이터베이스 연결
            // try-with-resources 문법을 사용하여 자동으로 자원 해제
            try(Connection conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@192.168.219.104:1521:xe", // 데이터베이스 URL
                    "C##SCOTT",                                   // 데이터베이스 사용자 이름
                    "TIGER"))                                    // 데이터베이스 비밀번호
            {
                System.out.println("-Database connection complete-");

                // 3. SQL문 작성
                // SQL 쿼리문을 문자열로 작성하여 준비합니다.
                String sql = "SELECT * FROM PERSON";

                // 4. SQL문 실행 준비 - Statement 객체 생성
                // Statement 객체를 생성하여 데이터베이스로 쿼리를 전송할 준비를 합니다.
                Statement stmt = conn.createStatement();

                // 5. SQL문 실행 및 결과 받기
                // executeQuery(sql): 데이터베이스에 쿼리를 실행하고, 결과를 ResultSet 객체에 담습니다.
                ResultSet rs = stmt.executeQuery(sql);

                // 6. 결과를 받아서 출력하기
                // ResultSet을 사용해 쿼리 결과를 한 행씩 반복하며 출력합니다.
                while (rs.next()) {
                    System.out.println(rs.getString("PID")+" - "+rs.getString("PNAME")+" - "+rs.getString("PAGE"));
                    // 컬럼 PID - PNAME - PAGE 순으로 나옴
                    System.out.println(rs.getString(2));// rs.getString(2)는 결과의 두 번째 열의 값을 가져옵니다.
                }

            } catch (SQLException e) {
                // SQLException 예외 처리
                // 데이터베이스 연결 또는 SQL 실행 중 오류가 발생할 경우 처리
                throw new RuntimeException(e);
            }

        } catch (ClassNotFoundException e) {
            // Class.forName 오류 처리
            // JDBC 드라이버 클래스를 찾을 수 없는 경우 발생
            throw new RuntimeException(e);
        }

    }
}
//-------------------------------------------------------------------------------------------------------------------------------------------
// GPT 개선사항 적용
//package jdbc_ex;
//
//import java.sql.*;
//
//// JDBCTest1 클래스는 데이터베이스에 연결하고, 쿼리를 실행하여
//// 결과를 출력하는 기능을 담당합니다.
//public class JDBCTest1 {
//
//    public static void main(String[] args) {
//        // JDBCTest1 객체 생성 및 메서드 호출
//        JDBCTest1 jdbcTest = new JDBCTest1();
//
//        // 1. 기본 쿼리 실행 - 테이블의 모든 행을 조회
//        jdbcTest.runQuery("SELECT * FROM PERSON");
//
//        // 2. 매개변수화된 쿼리 실행 - 특정 이름으로 조회
//        jdbcTest.findPersonByName("John"); // 검색할 이름을 "John"으로 지정
//    }
//
//    // JDBCTest1 생성자
//    // 객체 생성 시 JDBC 드라이버를 로딩합니다.
//    public JDBCTest1() {
//        loadDriver(); // JDBC 드라이버 로딩 메서드 호출
//    }
//
//    // 1. JDBC 드라이버 로딩 메서드
//    // 데이터베이스와의 연결을 위해 JDBC 드라이버를 메모리에 로드합니다.
//    private void loadDriver() {
//        try {
//            // Class.forName()을 통해 드라이버 클래스 로딩
//            Class.forName(DBConfig.DRIVER);
//            System.out.println("-Driver loading complete-"); // 드라이버 로딩 성공 메시지
//        } catch (ClassNotFoundException e) {
//            // 드라이버 클래스가 없는 경우 예외 처리
//            System.err.println("JDBC Driver not found.");
//            e.printStackTrace();
//        }
//    }
//
//    // 2. 데이터베이스 연결 메서드
//    // DBConfig에 정의된 URL, 사용자 이름, 비밀번호를 사용하여
//    // 데이터베이스와 연결을 설정하고 Connection 객체를 반환합니다.
//    private Connection connect() {
//        try {
//            // DriverManager를 사용하여 데이터베이스에 연결
//            return DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PASSWORD);
//        } catch (SQLException e) {
//            // 연결 실패 시 예외 처리
//            System.err.println("Connection failed.");
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    // 3. 기본 쿼리 실행 메서드
//    // 매개변수로 전달된 SQL 쿼리를 실행하고, 그 결과를 출력합니다.
//    public void runQuery(String query) {
//        // try-with-resources 문법으로 자원을 자동으로 해제
//        try (Connection conn = connect(); // 데이터베이스 연결
//             Statement stmt = conn.createStatement(); // Statement 객체 생성
//             ResultSet rs = stmt.executeQuery(query)) { // 쿼리 실행 및 결과 저장
//
//            // ResultSet을 반복하여 각 행을 출력
//            while (rs.next()) {
//                System.out.println(rs.getString(2)); // 결과의 두 번째 열 값을 출력
//            }
//
//        } catch (SQLException e) {
//            // SQL 쿼리 실행 오류 처리
//            System.err.println("SQL execution error.");
//            e.printStackTrace();
//        }
//    }
//
//    // 4. PreparedStatement를 사용한 매개변수화된 쿼리 실행 메서드
//    // 이름을 매개변수로 받아, 해당 이름의 데이터를 검색하고 결과를 출력합니다.
//    public void findPersonByName(String name) {
//        // 매개변수화된 쿼리 - 입력받은 이름을 조건으로 지정
//        String query = "SELECT * FROM PERSON WHERE PNAME = ?";
//
//        // try-with-resources 문법으로 자원을 자동으로 해제
//        try (Connection conn = connect(); // 데이터베이스 연결
//             PreparedStatement pstmt = conn.prepareStatement(query)) { // PreparedStatement 생성
//
//            pstmt.setString(1, name); // 첫 번째 물음표(?)에 name 매개변수 바인딩
//            ResultSet rs = pstmt.executeQuery(); // 쿼리 실행 및 결과 저장
//
//            // ResultSet을 반복하여 각 행을 출력
//            while (rs.next()) {
//                System.out.println("PID: " + rs.getString("PID"));
//                System.out.println("PName: " + rs.getString("PNAME")); // NAME 열 출력
//                System.out.println("PAge: " + rs.getInt("PAGE")); // AGE 열 출력
//            }
//
//        } catch (SQLException e) {
//            // SQL 쿼리 실행 오류 처리
//            System.err.println("SQL execution error.");
//            e.printStackTrace();
//        }
//    }
//}
//
//// DB 설정을 별도의 클래스로 분리하여 관리
//// DBConfig 클래스는 데이터베이스 연결에 필요한 URL, 사용자명, 비밀번호, 드라이버를 상수로 정의
//class DBConfig {
//    public static final String URL = "jdbc:oracle:thin:@192.168.219.104:1521:xe"; // 오라클 데이터베이스 URL
//    public static final String USER = "C##SCOTT"; // 데이터베이스 사용자 이름
//    public static final String PASSWORD = "TIGER"; // 데이터베이스 비밀번호
//    public static final String DRIVER = "oracle.jdbc.driver.OracleDriver"; // 오라클 JDBC 드라이버 클래스명
//}
