package fi.haaga_helia.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fi.haaga_helia.entity.Feedback;
import fi.haaga_helia.entity.Query;
import fi.haaga_helia.repository.FeedbackRepository;
import fi.haaga_helia.repository.QueryRepository;

@CrossOrigin
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
		feedback.setRadioList(list);
		String [] list2 = {"Anna arvosana kurssin sisällölle."};
		feedback.setQuestions(list2);
		return feedback;
	}
	
	//Feedback metodit
	
	@RequestMapping(value = "/returnFeedback", method = RequestMethod.GET)
	public List<Feedback> returnFeedback() {
		List<Feedback> feedbacks= (List<Feedback>) repository.findAll();
		return feedbacks;
}
	
	@RequestMapping(value = "/saveFeedback", method = RequestMethod.POST, headers="Accept=application/json")
	public void saveFeedback(@RequestBody Feedback feedback) {
		repository.save(feedback);
	}
	
	//Query metodit
	
	@RequestMapping(value = "/returnQueryById/{queryId}", method = RequestMethod.GET)
	public List<Query> returnQueryById(@PathVariable("queryId") int queryId) {
		List<Query> query= (List<Query>) qrepository.findByQueryId(queryId);
		return query;
	}
	
	@RequestMapping(value = "/returnQueries", method = RequestMethod.GET)
	public List<Query> returnQueries() {
		List<Query> queries= (List<Query>) qrepository.findAll();
		return queries;
	}
	
	@RequestMapping(value = "/saveQuery", method = RequestMethod.POST, headers="Accept=application/json")
	public void saveQuery(@RequestBody Query query) {
		qrepository.save(query);
	}
	
	@RequestMapping(value = "/updateQuery", method = RequestMethod.POST)
	public void updateQuery(@RequestBody Query query) {
		qrepository.save(query);
	}
	
	@RequestMapping(value = "/deleteQuery/{queryId}", method = RequestMethod.GET)
    public void deleteQuery(@PathVariable("queryId") int queryId) {
    	qrepository.delete(qrepository.findByQueryId(queryId));
    }    
}