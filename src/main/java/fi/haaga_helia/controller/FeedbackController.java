package fi.haaga_helia.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fi.haaga_helia.entity.Feedback;
import fi.haaga_helia.entity.Query;
import fi.haaga_helia.repository.FeedbackRepository;
import fi.haaga_helia.repository.QueryRepository;

@RestController // shorthand for @Controller and @ResponseBody rolled together
public class FeedbackController {
	@Autowired
    private FeedbackRepository repository;
	@Autowired
    private QueryRepository qrepository;
	

	

	@RequestMapping(value = "/returnQuestion", method = RequestMethod.GET)
	public Query returnForm() {
		Query feedback = new Query();
		String [] list = {"Erinomainen", "Kiitettävä", "Hyvä", "Tyydyttävä", "Heikko"};
		feedback.setRadio(list);
		feedback.setQuestion("Anna arvosana kurssin sisällölle.");
		return feedback;
	}
	
	@RequestMapping(value = "/returnFeedback", method = RequestMethod.GET)
	public List<Feedback> returnFeedback() {
		List<Feedback> feedbacks= (List<Feedback>) repository.findAll();
		return feedbacks;
}
	
	@RequestMapping(value = "/saveFeedback", method = RequestMethod.POST)
	public void saveFeedback(@RequestBody Feedback feedback) {
		repository.save(feedback);
	}
	
	@RequestMapping(value = "/returnQueries", method = RequestMethod.GET)
	public List<Query> returnQueries() {
		List<Query> queries= (List<Query>) qrepository.findAll();
		return queries;
	}
	@RequestMapping(value = "/saveQuery", method = RequestMethod.POST)
	public void saveQuery(@RequestBody Query query) {
		qrepository.save(query);
	}
	@RequestMapping(value = "/updateQuery", method = RequestMethod.PUT)
	public void updateQuery(@RequestBody Query query) {
	}
	@RequestMapping(value = "/deleteQuery/{queryId}", method = RequestMethod.GET)
    public void deleteStudent(@PathVariable("queryId") Long queryId) {
    	repository.delete(queryId);
    }    
}