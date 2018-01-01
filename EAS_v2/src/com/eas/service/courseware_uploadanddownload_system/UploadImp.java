package com.eas.service.courseware_uploadanddownload_system;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.eas.model.*;
import com.eas.dao.courseware_uploadanddownload_system.*;
import com.eas.service.courseware_uploadanddownload_system.*;
@Service("uploadFile")
public class UploadImp implements IUpload {
	
	private AddFileInfor fileInfor;
	public AddFileInfor getFileInfor(){
		return fileInfor;
	}
	@Resource(name="fileInforInput")
	public void setFileInfor(AddFileInfor fileInfor){
		this.fileInfor=fileInfor;
	}
	
	public boolean AddFile(Uploadfile file){
		return fileInfor.InforInput(file);
	}
	public boolean IsHaveFile(String FileName){
		return fileInfor.IsHaveFile(FileName);
	}
}
