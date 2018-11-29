package Kavana_project;
public class CheckError { // เช็ค Error ของ User
    boolean check ;
    boolean ch_TextNone(String x){
        if(x.equals("")){
            this.check = true;
        }else{
            this.check = false;
        }
        return this.check;
    }
    boolean ch_CBB(int text){
        if(text == 0){
            this.check=true;
        }else{
            this.check=false;
        }
        return this.check;
    }
    boolean ch_Cons(String text){
        int n = text.length();
        int i;
        for(i=0;i<n;i++){
            if(text.charAt(i)=='1' || text.charAt(i)=='2' || text.charAt(i)=='3' ||
                    text.charAt(i)=='4' || text.charAt(i)=='5' || text.charAt(i)=='6' 
                    || text.charAt(i)=='7' || text.charAt(i)=='8' || text.charAt(i)=='9' 
                    || text.charAt(i)=='0'){
                this.check = true;
            }else if(text.charAt(0)=='่'|| text.charAt(0)=='้'|| text.charAt(0)=='็'
                    || text.charAt(0)=='๋'|| text.charAt(0)=='ิ'|| text.charAt(0)=='ื'|| text.charAt(0)=='ั'
                    || text.charAt(0)=='ะ'|| text.charAt(0)=='า'|| text.charAt(0)=='ำ'|| text.charAt(0)=='ู'
                    || text.charAt(0)=='ๆ'|| text.charAt(0)=='ึ'|| text.charAt(0)=='ุ'|| text.charAt(0)=='?'
                    || text.charAt(0)=='์'){
                this.check =true;
                
            }else{
                this.check = false;
            }
        }
        return this.check;
    }
}
