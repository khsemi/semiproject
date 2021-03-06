package semi.KHC.pointDao;

import java.util.List;

import semi.KHC.pointDto.PointDto;

public interface PointDao {
	String POINT_NAMESPACE = "kh_point.";

	public List<PointDto> selectAll(int user_seq);
	public int select(int user_seq, String point_state);
	public int pointInsert(int user_seq, int point_balance, String point_state);
}
