package com.test.fiftyFive;

import com.joestelmach.natty.*;
import java.util.*;
import java.util.logging.Logger;

/**
 * com.test.fiftyFive.Main class
 * @author Mohamed AJAITE
 */
public class Main {
    static Logger log = Logger.getLogger(Main.class.getName());
    public static final String value="Marvin Lee Minsky at the Mathematics Genealogy Project; 20 May 2014\n" +
            "\n" +
            "Marvin Lee Minsky at the AI Genealogy Project. {reprint 18 September 2011)\n" +
            "\n" +
            "\"Personal page for Marvin Minsky\". web.media.mit.edu. Retrieved 23 June 2016.\n" +
            "\n" +
            "Admin (January 27, 2016). \"Official Alcor Statement Concerning Marvin Minsky\". \n" +
            "\n" +
            "\tAlcor Life Extension Foundation. Retrieved 2016-04-07.\n" +
            "\n" +
            "\"IEEE Computer Society Magazine Honors Artificial Intelligence Leaders\". \n" +
            "\n" +
            "\tDigitalJournal.com. August 24, 2011. Retrieved September 18, 2011. \n" +
            "\n" +
            "\tPress release source: PRWeb (Vocus).\n" +
            "\n" +
            "\"Dan David prize 2014 winners\". May 15, 2014. Retrieved May 20, 2014.";


    public static void main(String[] args) {
        List<OurDate> ourDates=constructOurDate();
        printOurDate(ourDates);
    }

    /**
     * this method return a list of date form an input string
     * using an API called NATTY
     *
     * @see <a href="http://natty.joestelmach.com/">NATTY</a> for more information about this API.
     * @return {@link List< OurDate >}
     */
    public static List<OurDate> constructOurDate(){
        ArrayList<OurDate> ourDates=new ArrayList<OurDate>();
        Parser parser = new Parser();
        List<DateGroup> groups = parser.parse(value);
        for(DateGroup group:groups) {
            Date date =  group.getDates().get(0);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int month;
            int day;
            int year;
            month=cal.get(Calendar.MONTH)+1;
            day=cal.get(Calendar.DAY_OF_MONTH);
            year=cal.get(Calendar.YEAR);;
            OurDate ourDate=new OurDate(month+"",day+"",year+"");
            if (!isExist(ourDates,ourDate))
                ourDates.add(ourDate);
        }
        return ourDates;
    }

    /**
     * this method check if an instance of {@link OurDate} is exist in
     * a given {@link List< OurDate >}
     *
     * @param ourDates
     * @param ourDate
     * @return boolean
     */
    public static boolean isExist(ArrayList<OurDate>ourDates, OurDate ourDate){
        for (OurDate o:ourDates){
            if (o.equals(ourDate)) {
                o.setNbr(o.getNbr()+1);
                return true;
            }
        }
        return false;
    }

    /**
     * This method print a list of dates
     *
     * @param ourDates
     */
    public static void printOurDate(List<OurDate> ourDates){
        for (OurDate o:
                ourDates) {
            System.out.println(o.getYear()+":\n\t\t-"+o.getMonth()+"\n\t\t\t-"+o.getDay()+" ("+o.getNbr()+")");
        }
    }
}
