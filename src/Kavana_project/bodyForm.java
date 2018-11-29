package Kavana_project;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class bodyForm extends javax.swing.JFrame implements KeyListener  {
    private String name,lastname,num,Re,n,DayIn,DayOut,price,NDay,checkJTA;
    private int re;
    private int Nr=0;
    DefaultTableModel model;
    public bodyForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DataUser = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jBtn_back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLb_hotelname = new javax.swing.JLabel();
        jLb_name = new javax.swing.JLabel();
        jTextF_name = new javax.swing.JTextField();
        jTextF_lastname = new javax.swing.JTextField();
        jLb_lastname = new javax.swing.JLabel();
        jLb_check_in = new javax.swing.JLabel();
        jLb_check_out = new javax.swing.JLabel();
        jLb_re = new javax.swing.JLabel();
        jComBox_re = new javax.swing.JComboBox();
        jLb_n = new javax.swing.JLabel();
        jComBox_n = new javax.swing.JComboBox();
        jTF_num_day = new javax.swing.JTextField();
        jBtn_num = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTA_c = new javax.swing.JTextArea();
        jTF_price = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDate_check_out = new com.toedter.calendar.JDateChooser();
        jDate_check_in = new com.toedter.calendar.JDateChooser();
        jBtn_Clear1 = new javax.swing.JButton();
        jBtn_Save = new javax.swing.JButton();
        jBtn_getData = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        DataUser.setTitle("ข้อมูลลูกค้า");
        DataUser.setResizable(false);
        DataUser.setSize(new java.awt.Dimension(880, 540));
        DataUser.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ลำดับ", "ประเภทห้อง", "จำนวนห้อง", "ชื่อ", "นามสกุล", "วันที่เข้าพัก", "วันที่คืนห้อง", "จำนวน (วัน)", "ราคา"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableData.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableDataAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableData);
        if (tableData.getColumnModel().getColumnCount() > 0) {
            tableData.getColumnModel().getColumn(0).setResizable(false);
            tableData.getColumnModel().getColumn(2).setResizable(false);
            tableData.getColumnModel().getColumn(3).setResizable(false);
            tableData.getColumnModel().getColumn(4).setResizable(false);
            tableData.getColumnModel().getColumn(5).setResizable(false);
            tableData.getColumnModel().getColumn(6).setResizable(false);
            tableData.getColumnModel().getColumn(7).setResizable(false);
            tableData.getColumnModel().getColumn(8).setResizable(false);
        }

        DataUser.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 850, 430));

        jBtn_back.setText("กลับ");
        jBtn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_backActionPerformed(evt);
            }
        });
        DataUser.getContentPane().add(jBtn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 130, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Dropbox\\Project_oop\\Kavana_project\\src\\Kavana_project\\image\\123.jpg")); // NOI18N
        DataUser.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        DataUser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kavana Hotel");
        setBackground(new java.awt.Color(51, 0, 255));
        setFont(new java.awt.Font("UnTaza", 1, 24)); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(880, 510));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLb_hotelname.setFont(new java.awt.Font("Harlow Solid Italic", 1, 36)); // NOI18N
        jLb_hotelname.setText("Kavana Hotel ");
        getContentPane().add(jLb_hotelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 35));

        jLb_name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLb_name.setText("ชื่อ");
        getContentPane().add(jLb_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 90, -1, -1));

        jTextF_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextF_name.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextF_nameAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTextF_name.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTextF_nameComponentShown(evt);
            }
        });
        jTextF_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextF_nameActionPerformed(evt);
            }
        });
        jTextF_name.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextF_namePropertyChange(evt);
            }
        });
        jTextF_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextF_nameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextF_nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextF_nameKeyTyped(evt);
            }
        });
        jTextF_name.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTextF_nameVetoableChange(evt);
            }
        });
        getContentPane().add(jTextF_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 82, 170, -1));

        jTextF_lastname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextF_lastname.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextF_lastnameAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTextF_lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextF_lastnameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextF_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 82, 170, -1));

        jLb_lastname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLb_lastname.setText("นามสกุล");
        getContentPane().add(jLb_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLb_check_in.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLb_check_in.setText("วันที่เข้าพัก");
        getContentPane().add(jLb_check_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 74, -1));
        jLb_check_in.getAccessibleContext().setAccessibleName("วันที่เข้าพัก  ");

        jLb_check_out.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLb_check_out.setText("วันที่คืนห้อง");
        getContentPane().add(jLb_check_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLb_re.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLb_re.setText("ประเภทห้อง");
        getContentPane().add(jLb_re, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 45, -1, -1));

        jComBox_re.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--- เลือก ---", "Standard - 550", "Superior - 900", "Deluxe Room - 2000" }));
        jComBox_re.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComBox_reAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jComBox_re.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComBox_reMousePressed(evt);
            }
        });
        jComBox_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComBox_reActionPerformed(evt);
            }
        });
        getContentPane().add(jComBox_re, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 42, -1, -1));

        jLb_n.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLb_n.setText("จำนวนห้องพัก");
        getContentPane().add(jLb_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jComBox_n.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "3", "4" }));
        jComBox_n.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComBox_nAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jComBox_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComBox_nActionPerformed(evt);
            }
        });
        getContentPane().add(jComBox_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 42, -1, -1));

        jTF_num_day.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTF_num_day.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTF_num_dayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTF_num_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_num_dayActionPerformed(evt);
            }
        });
        getContentPane().add(jTF_num_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 212, 33, -1));

        jBtn_num.setText("ยืนยัน");
        jBtn_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_numActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 95, 32));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("จำนวน");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("วัน");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 220, -1, -1));

        image.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Dropbox\\Project_oop\\Kavana_project\\src\\Kavana_project\\image\\Kavana-1.jpg")); // NOI18N
        image.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                imageAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 317, 406));

        jPanel1.setBackground(new java.awt.Color(197, 197, 53));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTA_c.setColumns(20);
        jTA_c.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jTA_c.setRows(5);
        jTA_c.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTA_cAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTA_c);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 380, 180));

        jTF_price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTF_price.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTF_priceAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTF_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_priceActionPerformed(evt);
            }
        });
        getContentPane().add(jTF_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 212, 103, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("ราคา");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("บาท");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 220, -1, -1));

        jDate_check_out.setMinSelectableDate(new Date());
        jDate_check_out.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jDate_check_outAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jDate_check_out.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDate_check_outPropertyChange(evt);
            }
        });
        getContentPane().add(jDate_check_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 220, -1));

        jDate_check_in.setMinSelectableDate(new Date());
        jDate_check_in.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jDate_check_inAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jDate_check_in.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDate_check_inPropertyChange(evt);
            }
        });
        getContentPane().add(jDate_check_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 220, -1));

        jBtn_Clear1.setText("ยกเลิก");
        jBtn_Clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Clear1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn_Clear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 461, 95, 32));

        jBtn_Save.setText("บันทึก");
        jBtn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SaveActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 95, 32));

        jBtn_getData.setText("แสดงข้อมูล");
        jBtn_getData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_getDataActionPerformed(evt);
            }
        });
        getContentPane().add(jBtn_getData, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 460, 95, 32));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Dropbox\\Project_oop\\Kavana_project\\src\\Kavana_project\\image\\123.jpg")); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextF_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextF_lastnameActionPerformed
        
    }//GEN-LAST:event_jTextF_lastnameActionPerformed

    private void jTextF_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextF_nameActionPerformed
        
    }//GEN-LAST:event_jTextF_nameActionPerformed

    private void jDate_check_inAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jDate_check_inAncestorAdded
        jDate_check_in.setDate(new Date());
    }//GEN-LAST:event_jDate_check_inAncestorAdded

    private void jDate_check_outAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jDate_check_outAncestorAdded
        jDate_check_out.setDate(null);
    }//GEN-LAST:event_jDate_check_outAncestorAdded

    private void jTF_num_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_num_dayActionPerformed
        jTF_num_day.setText("");
    }//GEN-LAST:event_jTF_num_dayActionPerformed

    private void jBtn_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_numActionPerformed
        this.checkJTA = "yes";
        checkinout t = new checkinout();
        CheckError CE= new CheckError();
        this.name = (String)jTextF_name.getText();
        this.lastname = (String)jTextF_lastname.getText();
        this.num=(String) jTF_num_day.getText();
        this.Re = (String) jComBox_re.getSelectedItem();
        this.n = (String) jComBox_n.getSelectedItem();
        int index1 = jComBox_re.getSelectedIndex();
        int index2 = jComBox_n.getSelectedIndex();
        this.DayIn = t.DateTime(jDate_check_in);
        String checkIn = t.DateTime(jDate_check_in);
        String price = (String) jTF_price.getText();
        
        if(CE.ch_CBB(index1)){
            JOptionPane.showMessageDialog(this,"กรุณาเลือกห้อง","error",JOptionPane.ERROR_MESSAGE);
        }else if(CE.ch_CBB(index2)){
            JOptionPane.showMessageDialog(this,"กรุณาเลือกจำนวนห้อง","error",JOptionPane.ERROR_MESSAGE);
        }else if(CE.ch_TextNone(this.name)){
            JOptionPane.showMessageDialog(this,"กรุณาใส่ชื่อ","error",JOptionPane.ERROR_MESSAGE);
        }else if(CE.ch_Cons(this.name)){
            JOptionPane.showMessageDialog(this,"ห้ามใส่อักขระพิเศษหรือตัวเลข ในชื่อ","error",JOptionPane.ERROR_MESSAGE);
            jTextF_name.setText("");
        }else if(CE.ch_Cons(this.lastname)){
            JOptionPane.showMessageDialog(this,"ห้ามใส่อักขระพิเศษหรือตัวเลข ในนามสกุล","error",JOptionPane.ERROR_MESSAGE);
            jTextF_lastname.setText("");
        }else if(CE.ch_TextNone(this.lastname)){
            JOptionPane.showMessageDialog(this,"กรุณาใส่นามสกุล","error",JOptionPane.ERROR_MESSAGE);
        }else if(CE.ch_TextNone(this.num)){
            JOptionPane.showMessageDialog(this,"กรุณาเลือกวัน","error",JOptionPane.ERROR_MESSAGE);
        }else if(CE.ch_TextNone(price)){
            JOptionPane.showMessageDialog(this,"ก","error",JOptionPane.ERROR_MESSAGE);
        }else{
            this.DayOut=t.DateTime(jDate_check_out);
            String checkOut=t.DateTime(jDate_check_out);
            jTA_c.setText("ประเภทห้อง : "+this.Re+"\n"+"คุณ "+this.name+" "+this.lastname+"\n"
                    +"เข้าพักตั้งแต่ : "+checkIn+" ถึง "+checkOut+"\n"+"เป็นเวลา : "+this.num+" วัน"+
                            "\n"+"จำนวน "+this.n+" ห้อง"+"\n"+"ราคา : "+price+" บาท");
        }
    }//GEN-LAST:event_jBtn_numActionPerformed

    private void jComBox_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComBox_reActionPerformed
        Selec_Image sm = new Selec_Image(); //class เปลี่ยนรูป
        priceRoom rp= new priceRoom();
        checkinout c = new checkinout();
        int str = jComBox_re.getSelectedIndex();
        int Npri,result;
        image.setIcon(new javax.swing.ImageIcon(sm.Selec_Image(str)));
        // ------ เช็คว่าเลือกห้องอยู่รึป่าว -------
        jTF_price.setText(rp.priceR(jComBox_re.getSelectedIndex()));       
        if(jComBox_n.getSelectedIndex()==0){  //แสดงราคาก่อนเลือกจำนวนห้อง
            jTF_price.setText(rp.priceR(jComBox_re.getSelectedIndex()));
            if(jDate_check_out.getDate()!=null){
                //System.out.println("ผ่านน");
                String pri =c.result(jDate_check_in, jDate_check_out);
                Npri = Integer.parseInt(pri);
                String pri1 = rp.priceR(jComBox_re.getSelectedIndex());
                int price = Integer.parseInt(pri1);
                int sum = Npri * price;
                jTF_price.setText(Integer.toString(sum));
            }
        }
        else if(jDate_check_out.getDate()!=null && jComBox_n.getSelectedIndex()!=0){ //เช็ดว่ามีข้อมูลในวันที่ และ เลือกจำนวนห้อง
                String pri =c.result(jDate_check_in, jDate_check_out);
                Npri = Integer.parseInt(pri);
                String pri1 = rp.priceR(jComBox_re.getSelectedIndex());
                int price = Integer.parseInt(pri1);
                int sum = price * rp.priceN(jComBox_n.getSelectedIndex());
                result = Npri*sum;
                jTF_price.setText(Integer.toString(result));
        }
        else if(jComBox_n.getSelectedIndex()!=0){ //เช็ดว่ามีข้อมูล จำนวนห้องรึป่าว
           // System.out.println("asdad");
            int price= Integer.parseInt(rp.priceR(jComBox_re.getSelectedIndex()));
            int sum = price * rp.priceN(jComBox_n.getSelectedIndex());
            String str2 = Integer.toString(sum);
            jTF_price.setText(str2);
        }else if(jComBox_re.getSelectedIndex()==0){
            jTF_price.setText("");
        }
    }//GEN-LAST:event_jComBox_reActionPerformed

    private void jComBox_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComBox_nActionPerformed
        priceRoom rp= new priceRoom();
        checkinout c = new checkinout();
        int Npri,result;
        if(jComBox_re.getSelectedIndex()!=0){
            String pri = rp.priceR(jComBox_re.getSelectedIndex());
            int price = Integer.parseInt(pri);
            this.re= price * rp.priceN(jComBox_n.getSelectedIndex());
            String str = Integer.toString(this.re);
            jTF_price.setText(str);
        }
        else if(jComBox_n.getSelectedIndex()!=0 && jDate_check_out.getDate()!=null && jComBox_re.getSelectedIndex()!=0){
                String pri =c.result(jDate_check_in, jDate_check_out);
                Npri = Integer.parseInt(pri);
                String pri1 = rp.priceR(jComBox_re.getSelectedIndex());
                int price = Integer.parseInt(pri1);
                int sum = price * rp.priceN(jComBox_n.getSelectedIndex());
                result = Npri*sum;
                jTF_price.setText(Integer.toString(result));     
        }else{
            jTF_price.setText("");
        }

    }//GEN-LAST:event_jComBox_nActionPerformed

    private void jTextF_nameAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextF_nameAncestorAdded
        jTextF_name.setText("");
    }//GEN-LAST:event_jTextF_nameAncestorAdded

    private void jTextF_lastnameAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextF_lastnameAncestorAdded
        jTextF_lastname.setText("");
    }//GEN-LAST:event_jTextF_lastnameAncestorAdded

    private void jTF_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_priceActionPerformed

    private void jDate_check_inMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDate_check_inMouseClicked
        
    }//GEN-LAST:event_jDate_check_inMouseClicked

    private void jDate_check_outMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDate_check_outMouseClicked


    }//GEN-LAST:event_jDate_check_outMouseClicked

    private void jDate_check_outMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDate_check_outMouseDragged
       
    }//GEN-LAST:event_jDate_check_outMouseDragged

    private void jDate_check_outMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDate_check_outMousePressed
        
    }//GEN-LAST:event_jDate_check_outMousePressed

    private void jComBox_reMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComBox_reMousePressed
        
    }//GEN-LAST:event_jComBox_reMousePressed

    private void jDate_check_outComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDate_check_outComponentShown

    }//GEN-LAST:event_jDate_check_outComponentShown

    private void jDate_check_outMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDate_check_outMouseReleased

    }//GEN-LAST:event_jDate_check_outMouseReleased

    private void jDate_check_outMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDate_check_outMouseMoved

    }//GEN-LAST:event_jDate_check_outMouseMoved

    private void jDate_check_outPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDate_check_outPropertyChange
        int Npri,result;
        checkinout c =new checkinout(); // class เช็คจำนวนวันที่จะเช่า
        priceRoom rp= new priceRoom();
        
        if(c.checkDay(jDate_check_in, jDate_check_out)){
            if(jDate_check_out.getDate()!=null){ //เช็ควันที่คืนห้องมีข้อมูลรึป่าว
                if(jComBox_re.getSelectedIndex()!=0){ //เช็ค เลือกประเภทรึยัง
                    if(jComBox_n.getSelectedIndex()!=0){
                        jTF_num_day.setText(c.result(jDate_check_in, jDate_check_out));
                        String pri =c.result(jDate_check_in, jDate_check_out);
                        Npri = Integer.parseInt(pri);
                        String pri1 = rp.priceR(jComBox_re.getSelectedIndex());
                        int price = Integer.parseInt(pri1);
                        int sum = price * rp.priceN(jComBox_n.getSelectedIndex());
                        result = Npri*sum;
                        jTF_price.setText(Integer.toString(result));
                        //System.out.println(Integer.toString(result));
                    }else{
                        String pri =c.result(jDate_check_in, jDate_check_out);
                        String pri1 = rp.priceR(jComBox_re.getSelectedIndex());
                        int price = Integer.parseInt(pri1);
                        int nDay = Integer.parseInt(pri);
                        result = price*nDay;
                        jTF_num_day.setText(c.result(jDate_check_in, jDate_check_out));
                        jTF_price.setText(Integer.toString(result));
                    }
                }else{
                    jTF_num_day.setText(c.result(jDate_check_in, jDate_check_out));
                }
            }else{
                jTF_num_day.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(this,"ใส่วันคืนห้องผิด","error",JOptionPane.ERROR_MESSAGE);
            jDate_check_out.setDate(null);
        }
    }//GEN-LAST:event_jDate_check_outPropertyChange

    private void jTA_cAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTA_cAncestorAdded
        jTA_c.setEditable(false);
        jTA_c.setText("");
    }//GEN-LAST:event_jTA_cAncestorAdded

    private void jTF_priceAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTF_priceAncestorAdded
        jTF_price.setText(null);
        jTF_price.setEditable(false);
    }//GEN-LAST:event_jTF_priceAncestorAdded

    private void jComBox_reAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComBox_reAncestorAdded
        jComBox_re.setSelectedIndex(0);
    }//GEN-LAST:event_jComBox_reAncestorAdded

    private void jComBox_nAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComBox_nAncestorAdded
        jComBox_n.setSelectedIndex(0);
    }//GEN-LAST:event_jComBox_nAncestorAdded

    private void jTF_num_dayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTF_num_dayAncestorAdded
        jTF_num_day.setText("");
        jTF_num_day.setEditable(false);
    }//GEN-LAST:event_jTF_num_dayAncestorAdded

    private void jBtn_Clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Clear1ActionPerformed
        jTA_c.setText("");
        jTF_price.setText("");
        jTF_num_day.setText("");
        jDate_check_in.setDate(new Date());
        jDate_check_out.setDate(null);
        jComBox_n.setSelectedIndex(0);
        jComBox_re.setSelectedIndex(0);
        jTextF_name.setText("");
        jTextF_lastname.setText("");
    }//GEN-LAST:event_jBtn_Clear1ActionPerformed

    private void imageAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_imageAncestorAdded

    }//GEN-LAST:event_imageAncestorAdded

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
 
    }//GEN-LAST:event_formComponentAdded

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        
    }//GEN-LAST:event_formPropertyChange

    private void jDate_check_inPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDate_check_inPropertyChange
        int result,Npri;
        checkinout c =new checkinout(); // class เช็คจำนวนวันที่จะเช่า
        priceRoom rp= new priceRoom();
        if(jDate_check_out.getDate()!=null){
            jTF_num_day.setText(c.result(jDate_check_in, jDate_check_out));
            if(jDate_check_out.getDate()!=null){ //เช็ควันที่คืนห้องมีข้อมูลรึป่าว
                if(jComBox_re.getSelectedIndex()!=0){ //เช็ค เลือกประเภทรึยัง
                    if(jComBox_n.getSelectedIndex()!=0){
                        jTF_num_day.setText(c.result(jDate_check_in, jDate_check_out));
                        String pri =c.result(jDate_check_in, jDate_check_out);
                        Npri = Integer.parseInt(pri);
                        String pri1 = rp.priceR(jComBox_re.getSelectedIndex());
                        int price = Integer.parseInt(pri1);
                        int sum = price * rp.priceN(jComBox_n.getSelectedIndex());
                        result = Npri*sum;
                        jTF_price.setText(Integer.toString(result));
                    }else{
                        String pri =c.result(jDate_check_in, jDate_check_out);
                        String pri1 = rp.priceR(jComBox_re.getSelectedIndex());
                        int price = Integer.parseInt(pri1);
                        int nDay = Integer.parseInt(pri);
                        result = price*nDay;
                        jTF_num_day.setText(c.result(jDate_check_in, jDate_check_out));
                        jTF_price.setText(Integer.toString(result));
                    }
                }else{
                    jTF_num_day.setText(c.result(jDate_check_in, jDate_check_out));
                }
            }else{
                jTF_num_day.setText("");
            }
        }
    }//GEN-LAST:event_jDate_check_inPropertyChange

    private void jTextF_namePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextF_namePropertyChange

    }//GEN-LAST:event_jTextF_namePropertyChange

    private void jTextF_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_nameKeyPressed

    }//GEN-LAST:event_jTextF_nameKeyPressed

    private void jTextF_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_nameKeyReleased

    }//GEN-LAST:event_jTextF_nameKeyReleased

    private void jTextF_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextF_nameKeyTyped

    }//GEN-LAST:event_jTextF_nameKeyTyped

    private void jTextF_nameVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTextF_nameVetoableChange

    }//GEN-LAST:event_jTextF_nameVetoableChange

    private void jTextF_nameComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTextF_nameComponentShown

    }//GEN-LAST:event_jTextF_nameComponentShown

    private void jBtn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SaveActionPerformed
        if(this.checkJTA=="yes"){
            this.price = (String)jTF_price.getText();
            this.Nr +=1;
            this.NDay = Integer.toString(this.Nr);
            String[] o = {this.NDay,this.Re,this.n,this.name,this.lastname,this.DayIn,this.DayOut,this.num,this.price};
            setRow(o);
            JOptionPane.showMessageDialog(this,"ข้อมูลถูกบันทึกแล้ว","บันทึก",JOptionPane.INFORMATION_MESSAGE);
            jTA_c.setText("");
            jTF_price.setText("");
            jTF_num_day.setText("");
            jDate_check_in.setDate(new Date());
            jDate_check_out.setDate(null);
            jComBox_n.setSelectedIndex(0);
            jComBox_re.setSelectedIndex(0);
            jTextF_name.setText("");
            jTextF_lastname.setText("");
            this.checkJTA ="no";
        }else{
            JOptionPane.showMessageDialog(this,"กรุณากดยืนยัน","error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtn_SaveActionPerformed

    private void jBtn_getDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_getDataActionPerformed
        DataUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtn_getDataActionPerformed

    private void tableDataAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableDataAncestorAdded
        tableData.setEditingRow(0);
    }//GEN-LAST:event_tableDataAncestorAdded

    private void jBtn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_backActionPerformed
        DataUser.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jBtn_backActionPerformed

    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked


    }//GEN-LAST:event_tableDataMouseClicked
    public void setRow(String[] x){ //นำข้อมูลเข้าในตาราง 
        String[] row;
        row = new String[9];
        for(int i=0;i<x.length;i++){
            row[i]=x[i];
        }
        model = (DefaultTableModel) tableData.getModel();
        model.addRow(row);
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bodyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bodyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bodyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bodyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new bodyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame DataUser;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel image;
    private javax.swing.JButton jBtn_Clear1;
    private javax.swing.JButton jBtn_Save;
    private javax.swing.JButton jBtn_back;
    private javax.swing.JButton jBtn_getData;
    private javax.swing.JButton jBtn_num;
    private javax.swing.JComboBox jComBox_n;
    private javax.swing.JComboBox jComBox_re;
    private com.toedter.calendar.JDateChooser jDate_check_in;
    private com.toedter.calendar.JDateChooser jDate_check_out;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLb_check_in;
    private javax.swing.JLabel jLb_check_out;
    private javax.swing.JLabel jLb_hotelname;
    private javax.swing.JLabel jLb_lastname;
    private javax.swing.JLabel jLb_n;
    private javax.swing.JLabel jLb_name;
    private javax.swing.JLabel jLb_re;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTA_c;
    private javax.swing.JTextField jTF_num_day;
    private javax.swing.JTextField jTF_price;
    private javax.swing.JTextField jTextF_lastname;
    private javax.swing.JTextField jTextF_name;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
