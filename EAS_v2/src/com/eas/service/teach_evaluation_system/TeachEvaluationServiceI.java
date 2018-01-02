package com.eas.service.teach_evaluation_system;

import javax.jws.WebMethod;
import javax.jws.WebService;
import com.eas.model.Classinfo;
import com.eas.model.Student;

public interface TeachEvaluationServiceI {
    void add(Object object);
    public Student find_student(String sid);
    public Classinfo find_classinfo(String classid);
}
