package model;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Member { // DB의 레코드와 매핑되는 객체
	private StringProperty email; // DB의 필드와 매핑
	private StringProperty pw;
	private StringProperty name;
	private StringProperty birth;
	private StringProperty age;
	private StringProperty address;
	private StringProperty contact;

	
	/*
    private final IntegerProperty zipcode;
    private ObjectProperty<LocalDate> birthday;
	*/
	public Member() {
		this(null, null, null, null,null,null,null);
	}
	
	public Member(String email, String pw, String name, String birth,
			String age, String address, String contact) {
		this.email = new SimpleStringProperty(email);
		this.pw = new SimpleStringProperty(pw);
		this.name = new SimpleStringProperty(name);
		this.birth = new SimpleStringProperty(birth);
		this.age = new SimpleStringProperty(age);
		this.address = new SimpleStringProperty(address);
		this.contact = new SimpleStringProperty(contact);
	}

	
	public String getEmail() {
		return this.email.get();
	}
	
	public void setEmail(String email) {
		this.email.set(email);
	}
    public StringProperty emailProperty() {
        return email;
    }
    
    public String getPw() {
		return this.pw.get();
	}
	
	public void setPw(String pw) {
		this.pw.set(pw);
	}
    public StringProperty pwProperty() {
        return pw;
    }
    
    public String getName() {
		return this.name.get();
	}	
	public void setName(String name) {
		this.name.set(name);
	}
    public StringProperty nameProperty() {
        return name;
    }
    
    public String getBirth() {
		return this.birth.get();
	}	
	public void setBirth(String birth) {
		this.birth.set(birth);
	}
    public StringProperty birthProperty() {
        return birth;
    }
    
    public String getAge() {
		return this.age.get();
	}	
	public void setAge(String age) {
		this.age.set(age);
	}
    public StringProperty ageProperty() {
        return age;
    }
    
    public String getAddress() {
		return this.address.get();
	}	
	public void setAddress(String address) {
		this.address.set(address);
	}
    public StringProperty addressProperty() {
        return address;
    }
    
    public String getContact() {
		return this.contact.get();
	}	
	public void setContact(String contact) {
		this.contact.set(contact);
	}
    public StringProperty contactProperty() {
        return contact;
    }
}
