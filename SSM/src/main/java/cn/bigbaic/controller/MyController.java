package cn.bigbaic.controller;

import cn.bigbaic.dao.StudentDao;
import cn.bigbaic.domain.Student;
import cn.bigbaic.service.SayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <h3>spirngmvc-study</h3>
 * <p></p>
 *
 * @author : baibaibai
 * @date : 2021-07-30 11:20
 **/

@Controller
@RequestMapping(value="/student")
public class MyController {
    @Autowired
    private SayHello sayHello;

    @Autowired
    private StudentDao studentDao;

    @ResponseBody
    @RequestMapping(value="/hello",method = {RequestMethod.GET})
    public String niHao(){
        sayHello.sayHello();
        String res = "{hello:nihaoya}";
        return res;
    }

    @ResponseBody
    @RequestMapping(value="/select",method = {RequestMethod.GET})
    public void selectStudent(){
        List<Student> students = studentDao.selectStudent();
        for (Student student:
             students) {
            System.out.println(student);
        }

    }


}
