package fi.haaga_helia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
private int fId;
    
    @Column(name = "radio")
private String radio;

public Feedback() {
	super();
}

public Feedback(int fId, String radio, int scale, String[] multipleChoice, String openText) {
	super();
	this.fId = fId;
	this.radio = radio;
}

public int getFId() {
	return fId;
}

public void setFId(int fId) {
	this.fId = fId;
}

public String getRadio() {
	return radio;
}

public void setRadio(String radio) {
	this.radio = radio;
}
@Override
public String toString() {
	return "Feedback [fId=" + fId + ", radio=" + radio + "]";
}

}