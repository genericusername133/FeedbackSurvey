package fi.haaga_helia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Feedback")
public class Feedback{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
private int feedbackId;
private int queryId;
private String radio;

public Feedback() {
	super();
}



public Feedback(int feedbackId, int queryId, String radio) {
	super();
	this.feedbackId = feedbackId;
	this.queryId = queryId;
	this.radio = radio;
}



public int getFeedbackId() {
	return feedbackId;
}


public String getRadio() {
	return radio;
}

public void setRadio(String radio) {
	this.radio = radio;

}

public int getQueryId() {
	return queryId;
}



public void setQueryId(int queryId) {
	this.queryId = queryId;
}



@Override
public String toString() {
	return "Feedback [feedbackId=" + feedbackId + ", queryId=" + queryId + ", radio=" + radio + "]";
}

}