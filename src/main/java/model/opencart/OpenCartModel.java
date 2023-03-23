package model.opencart;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OpenCartModel {

    private String successMessage2;
    private String successMessage3;
    private String deviceName1;
    private String deviceName2;
    private String address1;
    private String city;
    private String postCode;
    private String country;
    private String regionState;
    private String comment;
    private String firstName;
    private String successMessage;
    private String errorMessage;
    private String lastName;
    private String email;
    private String phone;
    private String password;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getSuccessMessage3() {
        return successMessage3;
    }

    public void setSuccessMessage3(String successMessage3) {
        this.successMessage3 = successMessage3;
    }

    public String getSuccessMessage2() {
        return successMessage2;
    }

    public void setSuccessMessage2(String successMessage2) {
        this.successMessage2 = successMessage2;
    }

    public String getDeviceName1() {
        return deviceName1;
    }

    public void setDeviceName1(String deviceName1) {
        this.deviceName1 = deviceName1;
    }

    public String getDeviceName2() {
        return deviceName2;
    }

    public void setDeviceName2(String deviceName2) {
        this.deviceName2 = deviceName2;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegionState() {
        return regionState;
    }

    public void setRegionState(String regionState) {
        this.regionState = regionState;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        this.successMessage = successMessage;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static List<OpenCartModel> setData(DataTable dataTable) {
        List<OpenCartModel> data = new ArrayList<>();
        List<Map<String, String>> mapIfo = dataTable.asMaps();
        for (Map<String, String> map : mapIfo) {
            data.add(new ObjectMapper().convertValue(map, OpenCartModel.class));
        }
        return data;
    }

}
