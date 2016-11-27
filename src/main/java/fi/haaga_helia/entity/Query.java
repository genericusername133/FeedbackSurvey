package fi.haaga_helia.entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Query {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
int queryId;
String question;
String [] radio;

public Query() {
	super();
}

public Query(int queryId, String question, String[] radio) {
	super();
	this.queryId = queryId;
	this.question = question;
	this.radio = radio;
}

public String[] getRadio() {
	return radio;
}

public void setRadio(String[] radio) {
	this.radio = radio;
}

public int getQueryId() {
	return queryId;
}

public String getQuestion() {
	return question;
}

public void setQuestion(String question) {
	this.question = question;
}

@Override
public String toString() {
	return "Question [queryId=" + queryId + ", question=" + question + ", radio=" + Arrays.toString(radio) + "]";
}
}