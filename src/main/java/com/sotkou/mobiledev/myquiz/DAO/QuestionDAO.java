package com.sotkou.mobiledev.myquiz.DAO;

import com.sotkou.mobiledev.myquiz.entity.Question;

import java.util.List;

public interface QuestionDAO {

    List<Question> findAll();
}
