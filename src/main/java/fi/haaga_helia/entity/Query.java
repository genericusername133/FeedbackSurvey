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
private int queryId;
private String [] questions;
private String [] radioList;
private String [] checkboxList;
private String textBox;


public Query() {
	super();
}

public Query(int queryId, String[] questions, String[] radioList,
		String[] checkboxList, String textBox) {
	super();
	this.queryId = queryId;
	this.questions = questions;
	this.radioList = radioList;
	this.checkboxList = checkboxList;
	this.textBox = textBox;
}

public int getQueryId() {
	return queryId;
}

public String[] getQuestions() {
	return questions;
}


public void setQuestions(String[] questions) {
	this.questions = questions;
}


public String[] getRadioList() {
	return radioList;
}


public void setRadioList(String[] radioList) {
	this.radioList = radioList;
}


public String[] getCheckboxList() {
	return checkboxList;
}


public void setCheckboxList(String[] checkboxList) {
	this.checkboxList = checkboxList;
}


public String getTextBox() {
	return textBox;
}


public void setTextBox(String textBox) {
	this.textBox = textBox;
}


@Override
public String toString() {
	return "Query [queryId=" + queryId + ", questions="
			+ Arrays.toString(questions) + ", radioList="
			+ Arrays.toString(radioList) + ", checkboxList="
			+ Arrays.toString(checkboxList) + ", textBox=" + textBox + "]";
}
}
