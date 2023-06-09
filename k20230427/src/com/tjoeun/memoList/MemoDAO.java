package com.tjoeun.memoList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//   MemoService 클래스에서 전처리 작업이 완료돼서 넘어온 데이터로 sql 명령을 실행하는 클래스
public class MemoDAO {
//   테이블에 저장할 데이터가 저장된 MemoVO클래스 객체를 넘겨받아 테이블에 데이터를 저장하는 메소드
   public static boolean insert(MemoVO vo) {

      boolean result = true;

//      데이터베이스 작업에 사용할 객체를 선언한다.
      Connection conn = null;
      PreparedStatement pstmt = null;

      try {
//      MySQL에 연결한다.
         conn = DBUtil.getMySQLConnection();
//      sql 명령을 만든다.
         String sql = "insert into memo(name, password, memo) values (?, ?, ?)";
//      sql 명령을 임시로 실행한다.
         pstmt = conn.prepareStatement(sql);
//         "?"에 데이터를 넣어준다.
         pstmt.setString(1, vo.getName()); // MemoService에서 vo안에 데이터를 저장해뒀기 때문에 vo.getName()으로 한다.
         pstmt.setString(2, vo.getPassword());
         pstmt.setString(3, vo.getMemo());
//         "?"가 채워진 sql명령을 최종적으로 실행한다.
         pstmt.executeUpdate();
//         System.out.println(vo.getName()+ "님의 글 저장완료");
         
      } catch (SQLException e) {
//         e.printStackTrace();
//         System.out.println("sql명령이 올바르게 실행되지 않았습니다.");
         result = false;
      } finally {
         DBUtil.close(conn);
      }
      return result;
   }

//   테이블에 저장된 메모 목록을 최신글 순으로 얻어오는 메소드
   public static ArrayList<MemoVO> select() {

//   데이터베이스 작업에 사용할 객체를 선언한다.
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null; // 데이터를 저장하고 난 후 목록을 보여줘야 하니까 insert와 달리 집어넣음
//   메모 목록을 저장해서 리턴시킬 ArrayList를 선언한다.
      ArrayList<MemoVO> list = null;
      try {
//   MySQL에 연결한다.
         conn = DBUtil.getMySQLConnection();
//   sql 명령을 만든다.
         String sql = "select * from memo order by idx desc";
//   sql 명령을 임시로 실행한다.
         pstmt = conn.prepareStatement(sql);
//   select sql 명령의 실행 결과를 ResultSet 객체에 저장한다.
         rs = pstmt.executeQuery(); 
//   데이터를 꺼내오기만 하니까 executeUpdate가 아니라 executeQuery를 실행해야 함
//   그리고 데이터를 꺼내오기만 하면 안되고 저장값에 저장을 해야 데이터가 보여지니까 'rs ='해서 데이터 넣어주기
//   테이블에서 성공적으로 데이터를 얻어왔으므로 결과를 저장해서 리턴시킬 어레이리스트 객체를 만든다.
         list = new ArrayList<>();
//    ResultSet에 데이터가 있는 동안 반복하며 ResultSet객체에 저장된 데이터를
//    MemoVo 클래스 객체로 만들어서 list에 저장한다.
//	  next() 메소드는 ResultSet 객체에 저장된 다음 데이터로 접근한다.
//    next() 메소드는 다음 데이터가 있으면 true, 없으면 false를 리턴한다.
//    has.next()와의 차이는 
//    next() -> 다음 데이터 있니? + 다음 꺼 읽어올게!가 같이 되어 있고,
//    has.next() -> 다음 데이터 있니? 따로, 읽어오는 메소드 따로
         while (rs.next()) { // 다음 데이터가 있으면 읽어오는 동안
//       ResultSet 객체의 데이터를 읽어서 MemoVO 클래스 객체에 저장한다.
            MemoVO vo = new MemoVO();
            vo.setIdx(rs.getInt("idx"));
            vo.setName(rs.getString("name"));
            vo.setPassword(rs.getString("password"));
            vo.setMemo(rs.getString("memo"));
            vo.setWriteDate(rs.getTimestamp("writeDate")); //getDate: 날짜만, getTime: 시간만
//            System.out.println(vo);
//            MemoVO 클래스 객체를 list에 저장한다.
            list.add(vo);
         }
         
      } catch (SQLException e) {
         System.out.println("sql 명령이 올바르게 실행되지 않았습니다.");
      } finally {
         DBUtil.close(conn);
      }

      return list;
   }

//   테이블에서 글 1건을 얻어오는 메소드
   public static MemoVO selectByIdx(int idx) {
	   Connection conn = null;
	   PreparedStatement pstmt = null;
	   ResultSet rs = null;
//	   메모 1건을 저장해서 리턴시킬 MemoVO 클래스 객체를 선언한다.
	   MemoVO vo = null;
	   
	   try {
//	   MySQL에 연결한다.
       conn = DBUtil.getMySQLConnection();
//     sql 명령을 만든다.
       String sql = "select * from memo where idx = ?";
//     sql 명령을 임시로 실행한다.
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idx);
		rs = pstmt.executeQuery();
		
		
//      ResultSet 객체의 데이터를 MemoVO 클래스 객체에 저장한다.
		  if (rs.next()) { // resultSet객체에 다음 데이터 있니?, 1건만 가져올거라 if로 설정
			  vo = new MemoVO(); 
//		    밖에서 선언하면 계속 새로운 객체 생성으로 인해 null이 나올 수 없게 되므로 안으로 넣어준다.
            vo.setIdx(rs.getInt("idx"));
            vo.setName(rs.getString("name"));
            vo.setPassword(rs.getString("password"));
            vo.setMemo(rs.getString("memo"));
            vo.setWriteDate(rs.getTimestamp("writeDate")); //getDate: 날짜만, getTime: 시간만
//            System.out.println(vo);
         }
	
	} catch (SQLException e) {
//		e.printStackTrace();
        System.out.println("sql 명령이 올바르게 실행되지 않았습니다.");

	} finally {
        DBUtil.close(conn);
    }

	return vo;
	
}

//   테이블에서 저장된 메모 1건을 삭제하는 메소드
    public static void delete(int idx) {
    	
//   데이터베이스 작업에 사용할 객체를 선언한다.
    Connection conn = null;
  	PreparedStatement pstmt = null;

    	
    try {
// 		 MySQL에 연결한다.
    	conn = DBUtil.getMySQLConnection();
    	String sql = "delete from memo where idx = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idx);
//      "?"가 채워진 sql명령을 최종적으로 실행한다.
		pstmt.executeUpdate();
		
           

        
	} catch (SQLException e) {
//		e.printStackTrace();
        System.out.println("sql 명령이 올바르게 실행되지 않았습니다.");
	}finally {
        DBUtil.close(conn);
    }
	
}
    
    
//    테이블에 저장된 메모 한 건을 수정하는 메소드
	public static void update(int idx, String name, String memo) {
		Connection conn = null;
	  	PreparedStatement pstmt = null;
	  	 try {
//	 		 MySQL에 연결한다.
	    	conn = DBUtil.getMySQLConnection();
	    	String sql = "update memo set name = ?, memo = ? where idx = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, memo);
			pstmt.setInt(3, idx);
//	      "?"가 채워진 sql명령을 최종적으로 실행한다.
			pstmt.executeUpdate();
		
	        
		} catch (SQLException e) {
//			e.printStackTrace();
	        System.out.println("sql 명령이 올바르게 실행되지 않았습니다.");
		}finally {
	        DBUtil.close(conn);
	    }
		
	}
	  	
}
