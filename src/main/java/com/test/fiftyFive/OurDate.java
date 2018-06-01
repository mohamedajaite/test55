package com.test.fiftyFive;

import java.util.Objects;

/**
 * @author AJAITE Mohamed
 */
public class OurDate {
    private String year;
    private String month;
    private String day;
    private int nbr=1;

    public OurDate(String month, String day, String year) {
        this.month=month;
        this.day=day;
        this.year=year;
    }
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {

        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getNbr() {

        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OurDate ourDate = (OurDate) o;
        return Objects.equals(getYear(), ourDate.getYear()) &&
                Objects.equals(getMonth(), ourDate.getMonth()) &&
                Objects.equals(getDay(), ourDate.getDay());
    }
}
