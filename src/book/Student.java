package book;

import java.util.Date;
public class Student
{
    private int ID;
    private String name;
    private String contact;
    private String course;
    private String admission;
    private static int GENERAL_ID = 0;

    public Student(String name, String course)
    {
        setID();
        this.name = name;
        this.course = course;
        Date date = new Date();
        admission = getAdmission(date);
        contact = setContact(ID, name);


    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getCourse() {
        return course;
    }

    public String getAdmission() {
        return admission;
    }

    public int getID() {
        return ID;
    }

    public void setID()
    {
        GENERAL_ID++;
        this.ID = GENERAL_ID;
    }

    public String setContact(int ID, String name)
    {
        name.trim();
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("_").append(ID).append("@email.com");
        return sb.toString();
    }

    private String getAdmission(Date date)
    {
        StringBuilder sb  = new StringBuilder();
        sb.append(date.getDay() + 22).append("/").append(date.getMonth() + 1).append("/").append(date.getYear() + 1900);
        return sb.toString();
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(", ").append(course).append(", ").append(getID()).append(", ").append(admission).append(", ").append(contact);
        return sb.toString();
    }





}

