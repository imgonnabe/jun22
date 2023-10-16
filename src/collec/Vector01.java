package collec;

import java.util.Vector;

// DTO 파일 전송 객체(Data Transfer Object)
class BoardDTO {
	int bNo;
	String bTitle;
	String bWriter;
	int bRead;
	String bDate;

	public BoardDTO(int bNo, String bTitle, String bWriter, int bRead, String bDate) {
		this.bNo = bNo;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bRead = bRead;
		this.bDate = bDate;
	}
}

public class Vector01 {
	public static void main(String[] args) {
		Vector<BoardDTO> board = new Vector<BoardDTO>();
		board.add(new BoardDTO(10, "10번째 글", "홍길동", 80, "2023-06-22"));
		board.add(new BoardDTO(9, "9번째 글", "김길동", 8, "2023-06-21"));
		board.add(new BoardDTO(8, "8번째 글", "박길동", 7, "2023-06-20"));
		board.add(new BoardDTO(7, "7번째 글", "강길동", 10, "2023-06-17"));
		board.add(new BoardDTO(6, "6번째 글", "정길동", 70, "2023-06-15"));
		board.add(new BoardDTO(5, "5번째 글", "곽길동", 60, "2023-06-11"));
		board.add(new BoardDTO(4, "4번째 글", "차길동", 50, "2023-06-15"));
		board.add(new BoardDTO(3, "3번째 글", "이길동", 40, "2023-06-16"));
		board.add(new BoardDTO(2, "2번째 글", "황길동", 30, "2023-06-10"));
		board.add(new BoardDTO(1, "1번째 글", "도길동", 20, "2023-06-12"));
		
		System.out.println("번호\t제목\t글쓴이\t조회수\t날짜");
		System.out.println("------------------------------------------");
		for (int i = 0; i < board.size(); i++) {
			BoardDTO ele = board.get(i);
			System.out.printf("%d\t%s\t%s\t%d\t%s\n", ele.bNo, ele.bTitle, ele.bWriter, ele.bRead, ele.bDate);
		}
	}
}
