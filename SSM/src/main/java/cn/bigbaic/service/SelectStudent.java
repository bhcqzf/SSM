package cn.bigbaic.service;

import cn.bigbaic.dao.StudentDao;
import cn.bigbaic.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectStudent {
    @Autowired
    private StudentDao studentDao;

    public List<Student> select(){
        List<Student> students = studentDao.selectStudent();
        return  students;
    }
}
