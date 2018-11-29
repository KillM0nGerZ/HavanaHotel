package Kavana_project;
public class priceRoom {
    String price;
    int p;
    String priceR(int x){
        if(x ==1){
            this.price="550";
        }else if(x==2){
            this.price="900";
        }else if(x==3){
            this.price="2000";
        }else if(x==4){
            this.price="4000";
        }
        return this.price;
    }
    int priceN(int x){
        switch (x) {
            case 1:
                this.p=1;
                break;
            case 2:
                this.p=2;
                break;
            case 3:
                this.p=3;
                break;
            case 4:
                this.p=4;
                break;
            default:
                break;
        }
        return this.p;
    }
}
