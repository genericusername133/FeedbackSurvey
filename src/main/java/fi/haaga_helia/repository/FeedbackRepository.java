package fi.haaga_helia.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fi.haaga_helia.entity.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback, Long>{
	List<Feedback> findByFeedbackId(int feedbackId);
}
