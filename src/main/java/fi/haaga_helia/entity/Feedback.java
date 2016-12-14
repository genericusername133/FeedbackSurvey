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
private String [] checkbox;
private String openText;

public Feedback() {
	super();
}

public Feedback(int feedbackId, int queryId, String radio, String[] checkbox,
		String openText) {
	super();
	this.feedbackId = feedbackId;
	this.queryId = queryId;
	this.radio = radio;
	this.checkbox = checkbox;
	this.openText = openText;
}

public int getFeedbackId() {
	return feedbackId;
}

public int getQueryId() {
	return queryId;
}

public void setQueryId(int queryId) {
	this.queryId = queryId;
}

public String getRadio() {
	return radio;
}

public void setRadio(String radio) {
	this.radio = radio;
}

public String[] getCheckbox() {
	return checkbox;
}

public void setCheckbox(String[] checkbox) {
	this.checkbox = checkbox;
}

public String getOpenText() {
	return openText;
}

public void setOpenText(String openText) {
	this.openText = openText;
}

@Override
public String toString() {
	return "Feedback [feedbackId=" + feedbackId + ", queryId=" + queryId + ", radio=" + radio + "]";
}

}