package model.demoqa;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DemoQAModel {

    private String userName;
    private String password;
    private String bookOne ;
    private String bookTwo;
    private String fullName;
    private String permanentAddress;
    private String personOne;
    private String personTwo;
    private String personThree;
    private String age;
    private String salary;
    private String department;
    private String secondDepartment;
    private String colorOne;
    private String colorTwo;
    private String singleColor;
    private String hour;
    private String lastMessage;
    private String slider;
    private String selectValue;
    private String selectOne;
    private String oldMenu;
    private String multiColorOne;
    private String multiColorTwo;
    private String standard;
    private String month;
    private String year;
    private String confirmation;
    private String message;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String subject;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String day;
    private String confirmationMessage;
    private String promptMessage;
    private String finished;

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

    public String getBookOne() {
        return bookOne;
    }

    public void setBookOne(String bookOne) {
        this.bookOne = bookOne;
    }

    public String getBookTwo() {
        return bookTwo;
    }

    public void setBookTwo(String bookTwo) {
        this.bookTwo = bookTwo;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAdress) {
        this.permanentAddress = permanentAdress;
    }

    public String getPersonOne() {
        return personOne;
    }

    public void setPersonOne(String personOne) {
        this.personOne = personOne;
    }

    public String getPersonTwo() {
        return personTwo;
    }

    public void setPersonTwo(String personTwo) {
        this.personTwo = personTwo;
    }

    public String getPersonThree() {
        return personThree;
    }

    public void setPersonThree(String personThree) {
        this.personThree = personThree;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSecondDepartment() {
        return secondDepartment;
    }

    public void setSecondDepartment(String secondDepartment) {
        this.secondDepartment = secondDepartment;
    }

    public String getFinished() {
        return finished;
    }

    public void setFinished(String finished) {
        this.finished = finished;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public String getConfirmationMessage() {
        return confirmationMessage;
    }

    public void setConfirmationMessage(String confirmationMessage) {
        this.confirmationMessage = confirmationMessage;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getColorOne() {
        return colorOne;
    }

    public void setColorOne(String colorOne) {
        this.colorOne = colorOne;
    }

    public String getColorTwo() {
        return colorTwo;
    }

    public void setColorTwo(String colorTwo) {
        this.colorTwo = colorTwo;
    }

    public String getSingleColor() {
        return singleColor;
    }

    public void setSingleColor(String singleColor) {
        this.singleColor = singleColor;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getSlider() {
        return slider;
    }

    public void setSlider(String slider) {
        this.slider = slider;
    }

    public String getSelectValue() {
        return selectValue;
    }

    public void setSelectValue(String selectValue) {
        this.selectValue = selectValue;
    }

    public String getSelectOne() {
        return selectOne;
    }

    public void setSelectOne(String selectOne) {
        this.selectOne = selectOne;
    }

    public String getOldMenu() {
        return oldMenu;
    }

    public void setOldMenu(String oldMenu) {
        this.oldMenu = oldMenu;
    }

    public String getMultiColorOne() {
        return multiColorOne;
    }

    public void setMultiColorOne(String multiColorOne) {
        this.multiColorOne = multiColorOne;
    }

    public String getMultiColorTwo() {
        return multiColorTwo;
    }

    public void setMultiColorTwo(String multiColorTwo) {
        this.multiColorTwo = multiColorTwo;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
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

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static List<DemoQAModel> setData(DataTable dataTable) {
        List<DemoQAModel> data = new ArrayList<>();
        List<Map<String, String>> mapIfo = dataTable.asMaps();
        for (Map<String, String> map : mapIfo) {
            data.add(new ObjectMapper().convertValue(map, DemoQAModel.class));
        }
        return data;
    }

}
