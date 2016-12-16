package fi.haaga_helia;

import static org.junit.Assert.*;
import fi.haaga_helia.controller.*;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.*;

import fi.haaga_helia.controller.FeedbackController;
import fi.haaga_helia.entity.Query;
import fi.haaga_helia.repository.FeedbackRepository;
import fi.haaga_helia.repository.QueryRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {FeedbackApplication.class, FeedbackController.class })
public class FeedbackApplicationTests {
	
	private FeedbackRepository repository;
	private QueryRepository qrepository;
	 @Autowired
	    public void setFeedbackRepository(FeedbackRepository repository) {
	        this.repository = repository;
	    }
	 @Autowired
	    public void setQueryRepository(QueryRepository qrepository) {
	        this.qrepository = qrepository;
	    }
	 String[] arvot = {"1", "2"};
	 @Test
	 public void lisaakysmys() {
		 Query query = new Query("kyssäri", arvot);
		 
		 assertNotNull(query.getQueryId());
		qrepository.save(query);
		 assertNotNull(query.getQueryId());
	 }
	 
	@Test
	public void addQuestion(){
		FeedbackController tester = new FeedbackController();
		
		Query query = new Query("kyssäri", arvot);
		Query query2 = new Query("kyssäri2222", arvot);
    	qrepository.save(query);
    	assertNotNull(qrepository.findAll());
	}
	@Test
	public void testUpdate() {
		FeedbackController tester = new FeedbackController();
		String[] arvot = {"1", "2"};
		Query query = new Query("kyssäri", arvot);
		Query query2 = new Query("kyssäri2222", arvot);
		tester.saveQuery(query);
		tester.updateQuery(query2);
		
		assertEquals(query2,tester.returnQueryById(0));
	}
	/*
	@Test
	public void json(){
		FeedbackController tester = new FeedbackController();
		JSONObject data = tester.("/returnQueryById/0");
		String expected = "{friends:[{id:123,name:\"Corby Page\"},{id:456,name:\"Carter Page\"}]}";
		JSONAssert.assertEquals(expected, data, false);
	}
*/
}
