package fi.haaga_helia.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fi.haaga_helia.entity.Feedback;
import fi.haaga_helia.entity.Question;
import fi.haaga_helia.repository.FeedbackRepository;

@RestController
public class FeedbackController {
	@Autowired
    private FeedbackRepository repository; 

	

	@RequestMapping(value = "/returnFormJson", method = RequestMethod.GET)
	public Question returnForm() {
		Question feedback = new Question();
		String [] list = {"Erinomainen", "Kiitettävä", "Hyvä", "Tyydyttävä", "Heikko"};
		feedback.setRadio(list);
		feedback.setQuestion("Anna arvosana kurssin sisällölle.");
		return feedback;
	}
	
	@RequestMapping(value = "/returnFeedbackJson", method = RequestMethod.GET)
	public List<Feedback> returnFeedback() {
		List<Feedback> feedbacks= (List<Feedback>) repository.findAll();
		return feedbacks;
}
	
	@RequestMapping(value = "/saveJson", method = RequestMethod.POST)
	public void saveJson(@RequestBody Feedback feedback) {
		repository.save(feedback);
	}
}