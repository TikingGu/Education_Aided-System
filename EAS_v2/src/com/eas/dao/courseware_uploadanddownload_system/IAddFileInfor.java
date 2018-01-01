package com.eas.dao.courseware_uploadanddownload_system;

import com.eas.model.*;

public interface IAddFileInfor {
	public boolean InforInput(Uploadfile file);
	public boolean IsHaveFile(String FileName);
}
