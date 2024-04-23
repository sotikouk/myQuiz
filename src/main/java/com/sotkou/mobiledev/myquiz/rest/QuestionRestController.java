package com.sotkou.mobiledev.myquiz.rest;

import com.sotkou.mobiledev.myquiz.DAO.QuestionDAO;
import com.sotkou.mobiledev.myquiz.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QuestionRestController {

    private QuestionDAO questionDAO;

    @Autowired
    public QuestionRestController(QuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
    }

    @GetMapping("/quiz")
    public List<Question> findAll() {
        return questionDAO.findAll();
    }

}
