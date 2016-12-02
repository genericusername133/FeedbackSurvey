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
private String radio;

public Feedback() {
	super();
}

public Feedback(int feedbackId, String radio, int scale, String[] multipleChoice, String openText) {
	super();
	this.feedbackId = feedbackId;
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
@Override
public String toString() {
	return "Feedback [feedbackId=" + feedbackId + ", radio=" + radio + "]";
}

}