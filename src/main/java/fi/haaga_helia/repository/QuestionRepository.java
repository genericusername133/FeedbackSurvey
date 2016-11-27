package fi.haaga_helia.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fi.haaga_helia.entity.Question;

	public interface QuestionRepository extends CrudRepository<Question, Long>{
		List<Question> findByQuestionId(int qId);
	}
