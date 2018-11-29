# Kavana Hotel.
### Kavana Hotel  เป็นโปรแกรมจองโรงแรม

> ##วัตถุประสงค์ 
- เพื่อให้ผู้ใช้งานคิดคำนวณวันเวลา ราคา จำนวนห้อง การจองได้รวดเร็วขึ้น
- เพื่อให้ผู้พัฒนาโปรแกรม ได้ฝึกทักษะการเขียนโปรแกรมด้วย GUI.
> ## โปรแกรม Kavana Hotel ##

## ลักษณะโปรแกรม

หน้าแรก
![capture](https://user-images.githubusercontent.com/45454455/49234150-1866e380-f42a-11e8-8e4c-931181e62b22.PNG)
* ไว้สำหรับกรอกข้อมูลลูกค้า *

หน้าสอง
![capture2](https://user-images.githubusercontent.com/45454455/49234662-105b7380-f42b-11e8-975a-4cdcbbba95b7.PNG)
* เก็บข้อมูลลูกค้า *

** รายละเอียดโปรแกรม **
หน้าแรก
![1](https://user-images.githubusercontent.com/45454455/49235389-9c21cf80-f42c-11e8-9617-13a9dd15394e.jpg)

1 ส่วนสำหรับการกรอกข้อมูลลูกค้า


2 ส่วนสำหรับสรุปข้อมูลลูกค้า
```
Code ที่สำคัญคือ
jTA_c.setText("ประเภทห้อง : "+this.Re+"\n"+"คุณ "+this.name+" "+this.lastname+"\n"
                    +"เข้าพักตั้งแต่ : "+checkIn+" ถึง "+checkOut+"\n"+"เป็นเวลา : "+this.num+" วัน"+
                            "\n"+"จำนวน "+this.n+" ห้อง"+"\n"+"ราคา : "+price+" บาท");
 เมื่อกดปุ่มยืนยัน ก็จะทำการสรุปข้อมูลของลูกค้าให้
```
3 ส่วนนี้จะเปลี่ยนไปตามประเภทห้องที่เราเลือก
```
จุดสำคัญคือ ช่องเลือกประเภทห้อง รูปจะเปลี่ยนไปตามประเภทห้องที่ผู้ใช้งานเลือก
Code ที่สำคัญคือ
image.setIcon(new javax.swing.ImageIcon(sm.Selec_Image(str)));
เพื่อทำการเปลี่ยนรูป
```
4 ส่วนบันทึกข้อมูลลูกค้า
```
Code ที่สำคัญคือ
String[] o = {this.NDay,this.Re,this.n,this.name,this.lastname,this.DayIn,this.DayOut,this.num,this.price};
setRow(o);
เพื่อทำการเช็ดค่าข้อมูลของลูกค้า
DataUser.setVisible(true);
this.setVisible(false);
เพื่อเปิดแสดงหน้าข้อมูลลูกค้า
```
หน้าสอง
![2](https://user-images.githubusercontent.com/45454455/49236362-82818780-f42e-11e8-8666-ab21cb38d96b.jpg)
1 ส่วนที่เก็บข้อมูลลูกค้า


2 ส่วนกลับไปยังหน้าแรก
```
Code ที่สำคัญคือ
DataUser.setVisible(false);
this.setVisible(true);
เพื่อทำการกลับไปหน้าแรก
```

##ผู้พัฒนาโปรแกรม 
```
นายธนกฤต กันสุรีย์ 60020671
นางสาวอัฉฎาภรณ์ สงวนทอง 60023179
```
