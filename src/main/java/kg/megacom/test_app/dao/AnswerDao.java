package kg.megacom.test_app.dao;

import kg.megacom.test_app.models.entities.Answer;
import kg.megacom.test_app.models.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerDao extends JpaRepository<Answer, Long> {

    List<Answer> findAllByQuestionAndIsActive(Question question, boolean isActive);
}
