package fi.haaga_helia.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
int qId;
	@Column (name = "question")
String question;
String [] radio;

public Question() {
	super();
}

public Question(int qId, String question, String[] radio) {
	super();
	this.qId = qId;
	this.question = question;
	this.radio = radio;
}

public String[] getRadio() {
	return radio;
}

public void setRadio(String[] radio) {
	this.radio = radio;
}

public int getQId() {
	return qId;
}

public void setQId(int QId) {
	this.qId = QId;
}

public String getQuestion() {
	return question;
}

public void setQuestion(String question) {
	this.question = question;
}

@Override
public String toString() {
	return "Question [qId=" + qId + ", question=" + question + ", radio=" + Arrays.toString(radio) + "]";
}
}