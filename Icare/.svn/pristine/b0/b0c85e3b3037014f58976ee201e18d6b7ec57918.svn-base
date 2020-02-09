package icare.memberManage.teacher.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import icare.commons.Criteria;
import icare.dto.TeacherVO;

public class TeacherManageDAOImpl implements TeacherManageDAO {
	
	@Autowired
	private SqlSession session;
	public void setSqlSession (SqlSession session) {
		this.session=session;
	}
	
	@Override
	public List<TeacherVO> selectSearchTeacherList(Criteria cri) throws SQLException {
		int offset = cri.getPageStartRowNum();
		int limit = cri.getPerPageNum();
		RowBounds rowBounds = new RowBounds(offset, limit);
		
		List<TeacherVO> teacherList = null;
		
		teacherList = session.selectList("Teacher-Mapper.selectSearchTeacherList",cri,rowBounds);
		
		return teacherList;
	}

	@Override
	public int selectSearchTeacherListCount(Criteria cri) throws SQLException {
		int count = 0;
		count = session.selectOne("Teacher-Mapper.selectSearchTeacherListCount", cri);
		return count;
	}

	@Override
	public TeacherVO selectSearchTeacherById(String tid) throws SQLException {
		TeacherVO teacher = session.selectOne("Teacher-Mapper.selectSearchTeacherById",tid);
		
		return teacher;
	}

	@Override
	public void insertTeacher(TeacherVO teacher) throws SQLException {
		session.update("Teacher-Mapper.insertTeacher", teacher);
	}

	@Override
	public void updateTeacher(TeacherVO teacher) throws SQLException {
		session.update("Teacher-Mapper.updateTeacher",teacher);
	}

	@Override
	public void disableTeacher(String tid) throws SQLException {
		session.update("Teacher-Mapper.disableTeacher",tid);
	}

}
