package com.sotkou.mobiledev.myquiz.DAO;

import com.sotkou.mobiledev.myquiz.entity.Question;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionDAOJpaImpl implements QuestionDAO{

    private EntityManager entityManager;

    public QuestionDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Question> findAll() {
        TypedQuery<Question> theQuery = entityManager.createQuery("from Question", Question.class);

        List<Question> questions = theQuery.getResultList();

        return questions;
    }
}
