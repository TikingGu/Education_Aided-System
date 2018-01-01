package com.eas.service.after_class_communication_system;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eas.dao.after_class_communication_system.PostDAO;
import com.eas.dao.after_class_communication_system.RepliesDAO;
import com.eas.model.Posting;
import com.eas.model.Replies;
import com.eas.model.Student;
@Service("postService")
public class PostServiceImpl implements PostService {

	@Autowired
	private PostDAO postdao;
	@Autowired
	private RepliesDAO repliesdao;
	
	public void setPostdao(PostDAO p){
		this.postdao=p;
	}
	public PostDAO getPostdao(){
		return postdao;
	}
	
	@Override
	public List<Posting> get_postlist(String classid) {
		// TODO Auto-generated method stub
		return postdao.get_postlist(classid);
	}

	@Override
	public List<Replies> get_replieslist(Integer postid) {
		// TODO Auto-generated method stub
		return repliesdao.get_replieslist(postid);
	}

	@Override
	public Posting find_post(int poId){
		// TODO Auto-generated method stub
		return postdao.find_post(poId);
	}
	
	@Override
	public String find_name(String id) {
		// TODO Auto-generated method stub
		if(String.valueOf(id.charAt(0)).equals("s")){
			return postdao.find_studentName(id);
		}else if(String.valueOf(id.charAt(0)).equals("s")){
			return postdao.find_teacherName(id);
		}
		return null;
	}

	@Override
	public void insert_a_reply(int postid, String id, String content) {
		// TODO Auto-generated method stub
		Replies replies=new Replies();
		Posting p=postdao.find_post(postid);
		replies.setPosting(p);
		replies.setReStudent(id);
		replies.setContent(content);
		replies.setReDate(new Date());
		repliesdao.save(replies);
	}

	@Override
	public void agree_a_post() {
		// TODO Auto-generated method stub

	}

	@Override
	public void disagree_a_post() {
		// TODO Auto-generated method stub

	}

	@Override
	public void agree_a_reply() {
		// TODO Auto-generated method stub

	}

	@Override
	public void disagree_a_reply() {
		// TODO Auto-generated method stub

	}

	@Override
	public void add_a_post(String id, String title, String content,
			String classid) {
		// TODO Auto-generated method stub
		Student student=postdao .find_student(id);
		postdao.add_a_post(student, title, content,classid);
	}

	@Override
	public List<Posting> get_my_postlist(String sid) {
		// TODO Auto-generated method stub
		return postdao.find_my_postlist(sid);
	}

	@Override
	public void delete_a_post(int postid) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Replies> get_my_replylist(String sid) {
		// TODO Auto-generated method stub
		return null;
	}

}
