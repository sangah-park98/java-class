package com.tjoeun.interfaceTest2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class UserInfoClient {

	public static void main(String[] args) {

		String dbType = "";
		
//		FileInputStream 클래스는 파일에 바이트 단위로 데이터를 읽어온다.
		FileInputStream fis = null;
		
		String filepath = "./src/com/tjoeun/interfaceTest2/db.properties";
//		FileInputStream 클래스 생성자의 인수로 읽을 파일의 경로와 이름을 넘겨주면 파일을 읽어온다.
//		FileInputStream 클래스 생성자의 인수로 읽을 파일의 이름만 넘겨주면 프로젝트 이름의 폴더(k20230424)에서
//		파일을 읽어온다.
//		String filepath = "db.properties";
		
//		read() 메소드는 FileInputStream 클래스 객체에서 1바이트의 데이터를 읽어온다.
//		read() 메소드는 코드값(A=65, a=97)으로 읽어오기 때문에 문자로 출력하려면 형변환이 필요하다.(char)
//		System.out.println((char)fis.read));
//		read() 메소드는 읽어들인 데이터가 있으면 읽어들인 데이터를 코드값으로 리턴하고 읽어들인 
//		데이터가 없으면(끝까지 다 읽었으면) -1이 리턴된다.
		
		try {
			fis = new FileInputStream(filepath);
//			int ch;
//			String prop = "";
//			while((ch = fis.read()) != -1) {
//				System.out.print((char)ch);
//				prop += (char)ch;
//			}
//			System.out.println("\n" + prop);
//			System.out.println(Arrays.toString(prop.split("=")));
////			System.out.println("디스크에 파일이 존재합니다.");
//		Properties 클래스는 FileInputStream 객체로 읽어들인 propertires 파일의 데이터를 읽어온다.
		Properties properties = new Properties();
//		load() 메소드는 FileInputStream 객체로 읽어들인 properties 파일을 읽어온다.
		properties.load(fis);
//		getProperty() 메소드로 인수로 지정된 properties 파일의 key("=" 왼쪽 부분)에 해당되는
//		value("=" 오른쪽 부분)을 얻어온다.
//		getProperty() 메소드의 2번째 인수로 properties 파일에 key가 존재하지 않을 경우 사용할 기본값을
//		지정할 수 있다.
//		System.out.println(properties.getProperty("DBTYPE1", "없음"));
		
//		(properties 파일을 읽어들이는 전용 클래스가 있고 거기서 getProperties를 이용해서 load()로 properties라는
//		객체에 넣어놓고 거기서 getProperties 메서드로 key를 지정해서 value를 꺼내서 지정하는 것)
		dbType = properties.getProperty("DBTYPE", "없음");
		System.out.println("DBTYPE: " + dbType);
		} catch (FileNotFoundException e) {
			System.out.println("디스크에 파일이 존재하지 않습니다.");
//			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		여기까지는 properties 파일을 읽어서 SQL을 쓸건지 ORACLE을 쓸건지 지정한 것을 프로그램으로 읽어들인 것 
		
//		데이터를 넣는다.
		UserInfoVO vo = new UserInfoVO();
		vo.setUserID("qwert"); // 권한을 private으로 했기 때문에 set으로 얻어온다.
		vo.setUserName("홍길동");
		vo.setUserPassword("12345");
//		System.out.println(vo); // 데이터가 잘 들어갔는지 확인하는 습관
		
		UserInfoDAO dao = null; // 일단 선언만 한 이유는 ORACLE인지 SQL인지에 따라 값이 달라지기 때문이다.
		if(dbType.equals("MYSQL")) { // 문자열 비교
			dao = new UserInfoMySqlDAO();
		} else if (dbType.equals("ORACLE")){
			dao = new UserInfoOracleDAO();
		} else {
			System.out.println(dbType + "은(는) 지원되지 않는 데이터베이스 입니다.");
			return; // else 밑에 있는 문장들은 실행할 필요가 없는 문장이기 때문에 프로그램을 끝내기 위해 return을 사용함
//			return 뒤에 아무것도 넣지 않는다 (main이 void이기 때문)
		}
//		다형성 구현(dao 객체에 어떤 메소드가 들어왔는지에 따라 실행하는 메소드가 달라짐)
		dao.insertUserInfo(vo);
		dao.updateUserInfo(vo);
		dao.deleteUserInfo(vo);
	}

}
