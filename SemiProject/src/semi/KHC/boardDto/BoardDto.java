package semi.KHC.boardDto;

import java.util.Date;

public class BoardDto {
//	CREATE TABLE KH_BOARD
//	(
//	    BOARD_SEQ_ID      NUMBER      NOT NULL, 
//	    BOARD_TITLE       VARCHAR2(4000)    NOT NULL, 
//	    BOARD_CONTENT     CLOB        NOT NULL, 
//	    BOARD_REGDATE     DATE        NOT NULL, 
//	    VIEW_COUNT        NUMBER      NOT NULL, 
//	    USER_SEQ          NUMBER      NOT NULL, 
//	    USER_SEQ    VARCHAR2(4000)    NOT NULL, 
//	    MAPS_ID           NUMBER      NULL, 
//	    CONSTRAINT KH_BOARD_PK PRIMARY KEY (BOARD_SEQ_ID)
//	);
//	create table kh_board
//	(
//	    board_seq_id      number      not null, 
//	    board_title       varchar2(4000)    not null, 
//	    board_content     clob        not null, 
//	    board_regdate     date        not null, 
//	    view_count        number      not null, 
//	    user_seq          number      not null, 
//	    board_category    varchar2(4000)    not null, 
//	    maps_id           number      null, 
//	    constraint kh_board_pk primary key (board_seq_id)
//	);
	private int board_seq_id;
	private String user_nickname;
	private String board_title;
	private String board_content;
	private Date board_regdate;
	private int comment_count;
	private int favorite_count;
	private int view_count;
	private int user_seq;
	private String board_category;
	private int maps_id;

	
	//insert
	public BoardDto(String board_category, String board_title, String board_content, int user_seq) {
		this.board_category = board_category;
		this.board_title = board_title;
		this.board_content = board_content;
		this.user_seq = user_seq;
	}
	//insert_map
		public BoardDto(String board_category, String board_title, String board_content, int user_seq, int maps_id) {
			this.board_category = board_category;
			this.board_title = board_title;
			this.board_content = board_content;
			this.user_seq = user_seq;
			this.maps_id = maps_id;
	}
	//update
	public BoardDto(int board_seq_id, String board_title, String board_content) {
		this.board_seq_id = board_seq_id;
		this.board_title = board_title;
		this.board_content = board_content;
	}
	//update_map
	public BoardDto(int board_seq_id, String board_title, String board_content, int maps_id) {
		this.board_seq_id = board_seq_id;
		this.board_title = board_title;
		this.board_content = board_content;
		this.maps_id = maps_id;
	}
	
	


	public BoardDto() {
	}


	public BoardDto(int board_seq_id, String user_nickname, String board_title, String board_content, Date board_regdate, int comment_count, int favorite_count ,int view_count,
			int user_seq, String board_category, int maps_id) {
		this.board_seq_id = board_seq_id;
		this.user_nickname = user_nickname;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_regdate = board_regdate;
		this.comment_count = comment_count;
		this.favorite_count = favorite_count;
		this.view_count = view_count;
		this.user_seq = user_seq;
		this.board_category = board_category;
		this.maps_id = maps_id;
	}


	public int getBoard_seq_id() {
		return board_seq_id;
	}


	public void setBoard_seq_id(int board_seq_id) {
		this.board_seq_id = board_seq_id;
	}
	
	public String getUser_nickname() {
		return user_nickname;
	}
	
	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}


	public String getBoard_title() {
		return board_title;
	}


	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}


	public String getBoard_content() {
		return board_content;
	}


	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}


	public Date getBoard_regdate() {
		return board_regdate;
	}


	public void setBoard_regdate(Date board_regdate) {
		this.board_regdate = board_regdate;
	}
	
	public int getComment_count() {
		return comment_count;
	}
	
	public void setComment_count(int comment_count) {
		this.comment_count = comment_count;
	}
	
	public int getFavorite_count() {
		return favorite_count;
	}
	
	public void setFavorite_count(int favorite_count) {
		this.favorite_count = favorite_count;
	}

	public int getView_count() {
		return view_count;
	}


	public void setView_count(int view_count) {
		this.view_count = view_count;
	}


	public int getUser_seq() {
		return user_seq;
	}


	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}


	public String getBoard_category() {
		return board_category;
	}


	public void setBoard_category(String board_category) {
		this.board_category = board_category;
	}


	public int getMaps_id() {
		return maps_id;
	}


	public void setMaps_id(int maps_id) {
		this.maps_id = maps_id;
	}
	

}
