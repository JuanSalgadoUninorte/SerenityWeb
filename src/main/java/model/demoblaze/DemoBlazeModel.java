package model.demoblaze;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.PageObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DemoBlazeModel {

    private String userName;
    private String password;
    private String name;
    private String country;
    private String city;
    private String creditCard;
    private String month;
    private String year;
    private String message;
    private String message2;
    private String contactName;
    private String contactEmail;
    private String messageSuccessful;
    private String messageUnsuccessful;
    private String confirmation;
    private String confirmation2;

    public String getMessage2() {
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public String getConfirmation2() {
        return confirmation2;
    }

    public void setConfirmation2(String confirmation2) {
        this.confirmation2 = confirmation2;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    public String getMessageUnsuccessful() {
        return messageUnsuccessful;
    }

    public void setMessageUnsuccessful(String messageUnsuccessful) {
        this.messageUnsuccessful = messageUnsuccessful;
    }

    public String getMessageSuccessful() {
        return messageSuccessful;
    }

    public void setMessageSuccessful(String messageSuccessful) {
        this.messageSuccessful = messageSuccessful;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static List<DemoBlazeModel> setData(DataTable dataTable) {
        List<DemoBlazeModel> data = new ArrayList<>();
        List<Map<String, String>> mapIfo = dataTable.asMaps();
        for (Map<String, String> map : mapIfo) {
            data.add(new ObjectMapper().convertValue(map, DemoBlazeModel.class));
        }
        return data;
    }

}
