package com.eas.service.courseware_uploadanddownload_system;
import com.eas.model.*;
public interface IUpload {
	public boolean AddFile(Uploadfile _file);
	public boolean IsHaveFile(String FileName);
}
