package com.eas.service.homework_evaluation_system;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eas.dao.after_class_communication_system.PostDAO;
import com.eas.dao.homework_evaluation_system.CommentDAO;
import com.eas.model.Comment;
import com.eas.model.Student;
@Service("commentService")
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentDAO commentdao;
	@Autowired
	private PostDAO postdao;
	@Override
	public List<Student> get_studentlist(String classId) {
		// TODO Auto-generated method stub
		return commentdao.get_studentlist(classId);
	}

	@Override
	public void add_a_comment(String classId, String content, String sid) {
		// TODO Auto-generated method stub
		Comment comment=new Comment();
		Student student=postdao.find_student(sid);
		comment.setStudent(student);
		comment.setTitle(classId);
		comment.setContent(content);
		comment.setCommentDate(new Date());
		commentdao.save(comment);
	}

	@Override
	public List<Comment> find_comments(String classId, String sid) {
		// TODO Auto-generated method stub
		return commentdao.find_comments(classId, sid);
	}

}
