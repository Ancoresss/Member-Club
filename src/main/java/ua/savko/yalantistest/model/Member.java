package ua.savko.yalantistest.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Member {
    private String name;
    private String email;
    private Date registrationDate;

    public Member(String name, String email, Date registrationDate) {
        this.name = name;
        this.email = email;
        this.registrationDate = registrationDate;
    }

    public Member() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistrationDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String normalDay = sdf.format(this.registrationDate);
        return normalDay;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
