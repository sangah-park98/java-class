package com.tjoeun.bookshop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class BookList {
	//	도서 정보 기억할 arraylist
	private ArrayList<BookVO> bookList = new ArrayList<>();
	
	public BookList() {
	}

	public ArrayList<BookVO> getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList<BookVO> bookList) {
		this.bookList = bookList;
	}


	@Override
	public String toString() {

		String str ="";
		str +="================================================\n";
		str += "도서명 저자 출판사 출판일 가격\n";
		str +="================================================\n";

		double sum=0;

//		for (int i=0; i<bookList.size(); i++) {
//			str += bookList.get(i)+"\n";
//			sum += bookList.get(i).getPrice();
//		}
		
		for(BookVO vo : bookList) {
			str += vo+"\n";
			sum += vo.getPrice();
			
		}

		DecimalFormat df = new DecimalFormat("#,##0.00원");

		str +="================================================\n";
		str +="합계 금액: "+df.format(sum)+"\n" ;
		str +="================================================\n";
		return str;
	}

	public void addBook(BookVO book) {
			bookList.add(book);
	}
}
