package com.dao;

import com.models.SubjectEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class SubjectDAO {

    EntityManager entityManager = Persistence.createEntityManagerFactory("NewPersistenceUnit").createEntityManager();

    public void addSubject(SubjectEntity subjectEntity) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(subjectEntity);
        transaction.commit();
    }

    public List<SubjectEntity> getAllSubjectList() {
        return entityManager.createQuery("SELECT subject_alias FROM StudentEntity subject_alias").getResultList();
    }
}
