package semi.KHC.sevice;

import java.util.List;
import java.util.Map;
//Controller 에서는 Dao를 직접 호출하지않고 Service만 호출한다.

import semi.KHC.boardDto.BoardDto;
import semi.KHC.foodticketDto.FoodticketDto;
import semi.KHC.mapDto.MapDto;
import semi.KHC.noteDto.NoteDto;
import semi.KHC.pointDto.PointDto;
import semi.KHC.userDto.UserDto;
public interface Service {
	//일반 게시판을 보여주기위해 category와 page를 이용하여 Dao의 totalCount와 boardList를 구한다.
	public Map<String, Object> board(String category, int page, String sortType);
	//조건 선택 검색 
	public List<BoardDto> boardAll();
	//public Map<String, Object> board_search(String category, int page, String searchType, String keyword);
	//모든 조건 검색
	public Map<String, Object> board_search(String category, int page, String keyword, String sortType);
	
	//내가 작성한 게시글 보기
	public Map<String, Object> board(int user_seq, int page);
	
	// board_detail
	public Map<String, Object> board_detail(int board_seq_id);
	//favorite
	// public boolean favorite_check(int board_seq_id, int user_seq);
	public boolean favorite_up(int board_seq_id, int user_seq);
	public boolean favorite_down(int board_seq_id, int user_seq);
	public int favorite_select(int board_seq_id, int user_seq);
	public boolean favorite_delete(int board_seq_id, int user_seq);
	
	public boolean comment_insert(int board_seq_id, int user_seq, String comment_content);
	public boolean comment_delete(int comment_seq_id);
	
	//board_update
	public BoardDto board_selectOne(int board_seq_id);
		
	// board_insert
	public int board_insert(String board_category, String board_title, String board_content, int user_seq);
	public int board_insert_map(String board_category, String board_title, String board_content, int user_seq, int maps_id);
	// board_update
	public int board_update(int board_seq_id, String board_title, String board_content);
	public int board_update_map(int board_seq_id, String board_title, String board_content, int maps_id);
	// board_delete
	public boolean board_delete(int board_seq_id);

	// 로그인
	public UserDto user_login(String user_id, String user_pw);
	
	//아이디찾기
	public String find_id(String user_email);
	
	// 비밀번호 이메일 찾기
	public boolean find_email(String user_email);

	// 비밀번호 변경 성공
	public boolean user_updatePw(String user_email, String user_pw);
	
	// 유저 정보 수정
	public int user_update(UserDto update_userdto);
	
	// 회원 탈퇴
	public int user_delete(int user_seq);
	
	//회원가입
	public boolean user_join(String user_id, String user_pw, String user_name, String user_nickname, String user_address, String user_email, String user_phone);
	
	//회원가입 email 보내기
	public boolean user_sendEmail(String user_id);
	
	public boolean user_sendEmail_pw(String user_email);
	
	//email 인증 완료 
	public boolean user_setEmailCheck(String user_id, String code);
	
	public boolean user_checkEmail_pw(String user_email, String code);
	
	// 포인트 충전 내역
	public List<PointDto> point_selectAll(int user_seq);
	public int point(int user_seq, String point_state);
	
	//포인트 충전
	public boolean point_insert(int user_seq, int point_val, String point_state);
	
	//식권 조회
	public List<FoodticketDto> foodticket_selectAll(int user_seq);
	
	public Map<String, Object> foodticket_insert(int user_seq, String foodticket_name, int foodticket_pay);
	
	public boolean foodticket_update(int foodticket_seq_id, String qrcode);
	
	public List<NoteDto> note_selectAll(String user_id);
	
	public List<UserDto> userList();
	public List<UserDto> userSearchList(String keyword);
	
	public NoteDto noteDetail(int note_seq_id);
	
	public int noteInsert(NoteDto notedto);
	
	//map 출력 : map_detail
	public MapDto map_detail(int map_seq_id);

	// map 좌표값 삽입 : map_insert
	public int maps_insert(String maps_name, String maps_x, String maps_y);

	// map_update
	public int maps_update(int maps_seq_id, String maps_name, String maps_x, String maps_y);

	// maps_delete
	public boolean maps_delete(int maps_seq_id);
}
