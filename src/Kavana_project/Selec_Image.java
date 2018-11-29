package Kavana_project;
public class Selec_Image {
    String link;
    public String Selec_Image(int str){
        switch (str) {
            case 1:
                this.link="C:\\Users\\Admin\\Dropbox\\Project_oop\\Kavana_project\\src\\Kavana_project\\image\\standardroom-1.jpg";
                break;
            case 2:
                this.link="C:\\Users\\Admin\\Dropbox\\Project_oop\\Kavana_project\\src\\Kavana_project\\image\\superiorroom-1.jpg";
                break;
            case 3:
                this.link="C:\\Users\\Admin\\Dropbox\\Project_oop\\Kavana_project\\src\\Kavana_project\\image\\deluxeroom-1.jpg";
                break;
            default:
                this.link="C:\\Users\\Admin\\Dropbox\\Project_oop\\Kavana_project\\src\\Kavana_project\\image\\Kavana-1.jpg";
                break;
        }
        return this.link;
    }
}
