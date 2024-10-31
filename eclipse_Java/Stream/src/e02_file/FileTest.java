package e02_file;

import java.io.File;

public class FileTest {
	
	public static void main(String[] args) {
		// 파일 클래스 생성자에는 파일 전체 경로 또는 해당 폴더 경로를 문자열로 초기화
		// File 클래스의 인스턴스를 만들 때, 파일의 경로를 인자로 넣어준다.
		// 아래 두 줄은 같은 경로를 표현하지만, File.separator를 사용하여 운영체제에 따라 파일 경로 구분자를 맞추어 사용한다.
		// "C:\\test\\img.jpg"는 Windows에서만 맞는 표현이고, File.separator를 사용하면 OS에 상관없이 경로를 지정할 수 있다.
		
		// File.separator는 운영체제에 맞는 파일 구분자(Windows에서는 \\ 또는 /, Unix 계열에서는 /)를 자동으로 사용함.
		File file = new File("C:" + File.separator + "test" + File.separator + "img.jpg");
//		File file = new File("C:\\test\\img.jpg");// File클래스 만들때 파일의 경로를 넣어준다.
		// 경로를 정할때 폴더간 경로 \\는 두번 입력하거나, File.separator로 연결하면된다
		
		// 파일의 경로를 출력 (이때, 파일 객체에 저장된 경로를 문자열로 출력)
		System.out.println(file);
		
		// 절대 경로를 출력 (파일의 실제 위치를 나타내는 전체 경로)
		// getAbsolutePath()는 파일의 전체 경로를 반환한다.
		System.out.println(file.getAbsolutePath());
		
		// 부모 디렉터리 경로를 출력 (이 파일이 속해 있는 상위 디렉터리의 경로)
		// getParent()는 파일이 속해있는 디렉토리 경로를 문자열로 반환
		System.out.println(file.getParent());
		
		// 현재 파일이 파일인지 여부를 확인 (파일이면 true, 폴더면 false)
		// isFile()은 File 객체가 파일인지 확인한다.
		System.out.println(file.isFile());
		
		// 현재 파일의 상위 경로가 파일인지 여부를 확인
		// getParentFile()은 상위 디렉토리를 File 객체로 반환하고, 그 객체가 파일인지 확인
		System.out.println(file.getParentFile().isFile());
		
		// 현재 파일이 디렉터리(폴더)인지 여부를 확인 (폴더이면 true, 파일이면 false)
		// isDirectory()는 File 객체가 디렉터리인지 확인한다.
		System.out.println(file.isDirectory());
		
		// 부모 폴더가 디렉터리인지 여부를 확인
		// getParentFile()로 부모 디렉터리를 가져와서, 그 디렉터리가 실제 폴더인지 확인
		System.out.println(file.getParentFile().isDirectory());
		
		// 파일의 크기를 바이트 단위로 출력 (파일의 크기를 바이트 단위로 리턴)
		// length()는 파일의 크기를 바이트 단위로 반환한다.
		System.out.println(file.length());
		
		// 파일이 위치한 상위 폴더(디렉토리)의 전체 용량을 출력 (바이트 단위)
		// getTotalSpace()는 파일 시스템의 전체 용량을 반환한다.
		System.out.println(file.getTotalSpace());
		
		// 파일 시스템의 전체 용량을 GB 단위로 변환해서 출력 (바이트 -> GB)
		// (1024 * 1024 * 1024) = 1GB
		System.out.println((file.getTotalSpace()) / (1024 * 1024 * 1024));
		
		// 파일이 위치한 상위 폴더(디렉토리)에서 현재 사용 가능한 공간을 출력 (바이트 단위)
		// getUsableSpace()는 사용 가능한 공간을 반환 (현재 사용자가 쓸 수 있는 공간만을 의미함)
		System.out.println(file.getUsableSpace());
		
		// 파일 시스템의 사용 가능한 공간을 GB 단위로 변환해서 출력 (바이트 -> GB)
		System.out.println((file.getUsableSpace()) / (1024 * 1024 * 1024));
		
		// 해당 경로나 파일이 실제로 존재하는지 체크하는 메서드 ( 파일 업로드 관련 메서드로 자주 사용)
		System.out.println(file.exists());
		
		// 파일명 리턴
		System.out.println(file.getName());
		
		System.out.println("------");
		
		//현재 파일의 부모 폴더 경로를 파일 객체로 뽑음
		File parentPath = file.getParentFile().getParentFile();
		
		System.out.println(parentPath.getAbsolutePath());
		
		String[] arr = parentPath.list();
		for(String str : arr) {
			System.out.println(str);
		}
		
	} // main

} // class
