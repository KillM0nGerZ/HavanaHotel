package Kavana_project;

import com.toedter.calendar.JDateChooser;
import java.text.*;

public class checkinout {
    String DateTime(JDateChooser x){
        DateFormat d1 = new SimpleDateFormat("dd-MM-yyyy");
        return d1.format(x.getDate());
    }
    String result(JDateChooser jDate_check_in, JDateChooser jDate_check_out) {
        String num = null;
        DateFormat d1 = new SimpleDateFormat("MM");
        DateFormat d2 = new SimpleDateFormat("MM");
        int inM = Integer.parseInt(d1.format(jDate_check_in.getDate()));
        int outM = Integer.parseInt(d2.format(jDate_check_out.getDate()));
        DateFormat df1 = new SimpleDateFormat("dd");
        DateFormat df2 = new SimpleDateFormat("dd");
        int in = Integer.parseInt(df1.format(jDate_check_in.getDate()));
        int out = Integer.parseInt(df2.format(jDate_check_out.getDate()));
        if(outM==inM){
            int result = out-in;
            num = Integer.toString(result);
        }else if(inM == 1 || inM == 3 || inM ==5|| inM ==7|| inM==8|| inM ==10|| inM ==12){
            int month = outM-inM;
            int M = (31*month)-in;
            int result = M+out;
            num = Integer.toString(result);
        }else if(inM==4 || inM==6 || inM==9 || inM==11){
            int month = outM-inM;
            int M = (30*month)-in;
            int result = M+out;
            num=Integer.toString(result);
        }
        return num;
    }
    boolean checkDay(JDateChooser jDate_check_in, JDateChooser jDate_check_out){
        boolean check ;
        if(jDate_check_out.getDate() != null){
            DateFormat df1 = new SimpleDateFormat("dd");
            DateFormat df2 = new SimpleDateFormat("dd");
            int in = Integer.parseInt(df1.format(jDate_check_in.getDate()));
            int out = Integer.parseInt(df2.format(jDate_check_out.getDate()));
            DateFormat d1 = new SimpleDateFormat("MM");
            DateFormat d2 = new SimpleDateFormat("MM");
            int inM = Integer.parseInt(d1.format(jDate_check_in.getDate()));
            int outM = Integer.parseInt(d2.format(jDate_check_out.getDate()));
            if(in >= out || outM < inM){
                check=false;
            }else{
                check=true;
            }
        }else{
            check=true;
        }
        return check;
    }
}
