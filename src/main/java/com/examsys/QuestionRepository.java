package com.examsys;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;

public interface QuestionRepository extends CrudRepository<Questions, Integer> {
    List<Questions> findAllQuestionsById(int id);
}
