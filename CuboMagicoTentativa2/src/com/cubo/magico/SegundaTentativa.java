/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cubo.magico;

import java.awt.Color;

/**
 *
 * @author winky
 */
public class SegundaTentativa extends javax.swing.JFrame {

    static int m1[][]= new int[3][3];
    static int m2[][]= new int[3][3];
    static int m3[][]= new int[3][3];
    static int m4[][]= new int[3][3];
    static int m5[][]= new int[3][3];
    static int m6[][]= new int[3][3];
    static int mg[][]= new int[3][3];
    
    
    void start(){
        for(int c=0; c<3; c++){
            for(int cc=0; cc<3; cc++){
                m1[c][cc] = 1;
                m2[c][cc] = 2;
                m3[c][cc] = 3;
                m4[c][cc] = 4;
                m5[c][cc] = 5;
                m6[c][cc] = 6;
            }
        }
        lbl1.setOpaque(rootPaneCheckingEnabled);
        lbl2.setOpaque(rootPaneCheckingEnabled);
        lbl3.setOpaque(rootPaneCheckingEnabled);
        lbl4.setOpaque(rootPaneCheckingEnabled);
        lbl5.setOpaque(rootPaneCheckingEnabled);
        lbl6.setOpaque(rootPaneCheckingEnabled);
        lbl7.setOpaque(rootPaneCheckingEnabled);
        lbl8.setOpaque(rootPaneCheckingEnabled);
        lbl9.setOpaque(rootPaneCheckingEnabled);
    }
    void cores(){
        if(m1[0][0]==1){
            lbl1.setBackground(Color.red);
        } else if(m1[0][0]==2){
            lbl1.setBackground(Color.yellow);
        } else if(m1[0][0]==3){
            lbl1.setBackground(Color.green);
        } else if(m1[0][0]==4){
            lbl1.setBackground(Color.blue);
        } else if(m1[0][0]==5){
            lbl1.setBackground(Color.black);
        } else{
            lbl1.setBackground(Color.white);
        }
        
        if(m1[0][1]==1){
            lbl2.setBackground(Color.red);
        } else if(m1[0][1]==2){
            lbl2.setBackground(Color.yellow);
        } else if(m1[0][1]==3){
            lbl2.setBackground(Color.green);
        } else if(m1[0][1]==4){
            lbl2.setBackground(Color.blue);
        } else if(m1[0][1]==5){
            lbl2.setBackground(Color.black);
        } else{
            lbl2.setBackground(Color.white);
        }
        
        if(m1[0][2]==1){
            lbl3.setBackground(Color.red);
        } else if(m1[0][2]==2){
            lbl3.setBackground(Color.yellow);
        } else if(m1[0][2]==3){
            lbl3.setBackground(Color.green);
        } else if(m1[0][2]==4){
            lbl3.setBackground(Color.blue);
        } else if(m1[0][2]==5){
            lbl3.setBackground(Color.black);
        } else{
            lbl3.setBackground(Color.white);
        }
        
        if(m1[1][0]==1){
            lbl4.setBackground(Color.red);
        } else if(m1[1][0]==2){
            lbl4.setBackground(Color.yellow);
        } else if(m1[1][0]==3){
            lbl4.setBackground(Color.green);
        } else if(m1[1][0]==4){
            lbl4.setBackground(Color.blue);
        } else if(m1[1][0]==5){
            lbl4.setBackground(Color.black);
        } else{
            lbl4.setBackground(Color.white);
        }
        
        if(m1[1][1]==1){
            lbl5.setBackground(Color.red);
        } else if(m1[1][1]==2){
            lbl5.setBackground(Color.yellow);
        } else if(m1[1][1]==3){
            lbl5.setBackground(Color.green);
        } else if(m1[1][1]==4){
            lbl5.setBackground(Color.blue);
        } else if(m1[1][1]==5){
            lbl5.setBackground(Color.black);
        } else{
            lbl5.setBackground(Color.white);
        }
        
        if(m1[1][2]==1){
            lbl6.setBackground(Color.red);
        } else if(m1[1][2]==2){
            lbl6.setBackground(Color.yellow);
        } else if(m1[1][2]==3){
            lbl6.setBackground(Color.green);
        } else if(m1[1][2]==4){
            lbl6.setBackground(Color.blue);
        } else if(m1[1][2]==5){
            lbl6.setBackground(Color.black);
        } else{
            lbl6.setBackground(Color.white);
        }
        
        if(m1[2][0]==1){
            lbl7.setBackground(Color.red);
        } else if(m1[2][0]==2){
            lbl7.setBackground(Color.yellow);
        } else if(m1[2][0]==3){
            lbl7.setBackground(Color.green);
        } else if(m1[2][0]==4){
            lbl7.setBackground(Color.blue);
        } else if(m1[2][0]==5){
            lbl7.setBackground(Color.black);
        } else{
            lbl7.setBackground(Color.white);
        }
        
        if(m1[2][1]==1){
            lbl8.setBackground(Color.red);
        } else if(m1[2][1]==2){
            lbl8.setBackground(Color.yellow);
        } else if(m1[2][1]==3){
            lbl8.setBackground(Color.green);
        } else if(m1[2][1]==4){
            lbl8.setBackground(Color.blue);
        } else if(m1[2][1]==5){
            lbl8.setBackground(Color.black);
        } else{
            lbl8.setBackground(Color.white);
        }
        
        if(m1[2][2]==1){
            lbl9.setBackground(Color.red);
        } else if(m1[2][2]==2){
            lbl9.setBackground(Color.yellow);
        } else if(m1[2][2]==3){
            lbl9.setBackground(Color.green);
        } else if(m1[2][2]==4){
            lbl9.setBackground(Color.blue);
        } else if(m1[2][2]==5){
            lbl9.setBackground(Color.black);
        } else{
            lbl9.setBackground(Color.white);
        }
    }
    void girobc1(){
        for(int c=0; c<3; c++){
            mg[c][0] = m1[c][0];
            m1[c][0] = m4[c][0];
            m4[c][0] = m3[c][0];
            m3[c][0] = m2[c][0];
            m2[c][0] = mg[c][0];
            
            int g = m5[0][0];
            int g2 = m5[0][1];
            m5[0][0] = m5[0][2];
            m5[0][1] = m5[1][2];
            m5[0][2] = m5[2][2];
            m5[1][2] = m5[2][1];
            m5[2][2] = m5[2][0];
            m5[2][1] = m5[1][0];
            m5[2][0] = g;
            m5[1][0] = g2;
        }
    }
    void girobc2(){
        for(int c=0; c<3; c++){
            mg[c][1] = m1[c][1];
            m1[c][1] = m4[c][1];
            m4[c][1] = m3[c][1];
            m3[c][1] = m2[c][1];              
            m2[c][1] = mg[c][1];
        }
    }
    void girobc3(){
        for(int c=0; c<3; c++){
            mg[c][2] = m1[c][2];
            m1[c][2] = m4[c][2];
            m4[c][2] = m3[c][2];
            m3[c][2] = m2[c][2];                
            m2[c][2] = mg[c][2];
            
            int g = m6[0][0];
            int g2 = m6[1][0];
            m6[0][0] = m6[2][0];
            m6[1][0] = m6[2][1];
            m6[2][0] = m6[2][2];
            m6[2][1] = m6[1][2];
            m6[2][2] = m6[0][2];
            m6[1][2] = m6[0][1];
            m6[0][2] = g;
            m6[0][1] = g2;
        }
    }
    void girocb1(){
        for(int c=0; c<3; c++){
            mg[c][0] = m1[c][0];
            m1[c][0] = m2[c][0];
            m2[c][0] = m3[c][0];
            m3[c][0] = m4[c][0];
            m4[c][0] = mg[c][0];
            
            int g = m5[0][0];
            int g2 = m5[1][0];
            m5[0][0] = m5[2][0];
            m5[1][0] = m5[2][1];
            m5[2][0] = m5[2][2];
            m5[2][1] = m5[1][2];
            m5[2][2] = m5[0][2];
            m5[1][2] = m5[0][1];
            m5[0][2] = g;
            m5[0][1] = g2;
        }
    }
    void girocb2(){
        for(int c=0; c<3; c++){
            mg[c][1] = m1[c][1];
            m1[c][1] = m2[c][1];
            m2[c][1] = m3[c][1];
            m3[c][1] = m4[c][1];
            m4[c][1] = mg[c][1];
        }
    }
    void girocb3(){
        for(int c=0; c<3; c++){
            mg[c][2] = m1[c][2];
            m1[c][2] = m2[c][2];
            m2[c][2] = m3[c][2];
            m3[c][2] = m4[c][2];
            m4[c][2] = mg[c][2];
            
            int g = m6[0][0];
            int g2 = m6[0][1];
            m6[0][0] = m6[0][2];
            m6[0][1] = m6[1][2];
            m6[0][2] = m6[2][2];
            m6[1][2] = m6[2][1];
            m6[2][2] = m6[2][0];
            m6[2][1] = m6[1][0];
            m6[2][0] = g;
            m6[1][0] = g2;
        }
    }
    void giroed1(){
        for(int c=0;c<3;c++){
            mg[0][c]=m1[0][c];
            m1[0][c]=m5[0][c];
            m5[0][c]=m3[0][c];
            m3[0][c]=m6[0][c];
            m6[0][c]=mg[0][c];
        }
        int g=m2[2][2];
        int g2=m2[2][1];
        m2[2][2]=m2[2][0];
        m2[2][1]=m2[1][0];
        m2[2][0]=m2[0][0];
        m2[1][0]=m2[0][1];
        m2[0][0]=m2[0][2];
        m2[0][1]=m2[1][2];
        m2[0][2]=g;
        m2[1][2]=g2;
    }
    void giroed2(){
        for(int c=0;c<3;c++){
            mg[1][c]=m1[1][c];
            m1[1][c]=m5[1][c];
            m5[1][c]=m3[1][c];
            m3[1][c]=m6[1][c];
            m6[1][c]=mg[1][c];
        }
    }
    void giroed3(){
        for(int c=0;c<3;c++){
            mg[2][c]=m1[2][c];
            m1[2][c]=m5[2][c];
            m5[2][c]=m3[2][c];
            m3[2][c]=m6[2][c];
            m6[2][c]=mg[2][c];
        }
        int g=m4[2][0];
        int g2=m4[2][1];
        m4[2][0]=m4[2][2];
        m4[2][1]=m4[1][2];
        m4[2][2]=m4[0][2];
        m4[1][2]=m4[0][1];
        m4[0][2]=m4[0][0];
        m4[0][1]=m4[1][0];
        m4[0][0]=g;
        m4[1][0]=g2;
    }
    void girode1(){
        for(int c=0;c<3;c++){
            mg[0][c]=m1[0][c];
            m1[0][c]=m6[0][c];
            m6[0][c]=m3[0][c];
            m3[0][c]=m5[0][c];
            m5[0][c]=mg[0][c];
        }
        int g=m2[2][0];
        int g2=m2[2][1];
        m2[2][0]=m2[2][2];
        m2[2][1]=m2[1][2];
        m2[2][2]=m2[0][2];
        m2[1][2]=m2[0][1];
        m2[0][2]=m2[0][0];
        m2[0][1]=m2[1][0];
        m2[0][0]=g;
        m2[1][0]=g2;
}
    void girode2(){
        for(int c=0;c<3;c++){
            mg[1][c]=m1[1][c];
            m1[1][c]=m6[1][c];
            m6[1][c]=m3[1][c];
            m3[1][c]=m5[1][c];
            m5[1][c]=mg[1][c];
        }
    }
    void girode3(){
        for(int c=0;c<3;c++){
            mg[2][c]=m1[2][c];
            m1[2][c]=m6[2][c];
            m6[2][c]=m3[2][c];
            m3[2][c]=m5[2][c];
            m5[2][c]=mg[2][c];
        }
        int g=m4[2][2];
        int g2=m4[2][1];
        m4[2][2]=m4[2][0];
        m4[2][1]=m4[1][0];
        m4[2][0]=m4[0][0];
        m4[1][0]=m4[0][1];
        m4[0][0]=m4[0][2];
        m4[0][1]=m4[1][2];
        m4[0][2]=g;
        m4[1][2]=g2;
    }
    public SegundaTentativa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        lbl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        lbl3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        lbl4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        lbl5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        lbl6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        lbl7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        lbl8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        lbl9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        btn0.setText("START");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn1.setText("---");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("---");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("---");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("---");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("---");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("---");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setText("---");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("---");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("---");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.setText("---");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setText("---");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setText("---");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btn0)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btn0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn12)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn11)
                                .addGap(26, 26, 26))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5)
                                .addGap(25, 25, 25)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btn6)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn8)
                            .addComponent(btn7)
                            .addComponent(btn9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btn10)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        start();
        cores();
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        girobc1();
        cores();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        girobc2();
        cores();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        girobc3();
        cores();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        giroed1();
        cores();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        giroed2();
        cores();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        giroed3();
        cores();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        girocb3();
        cores();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        girocb2();
        cores();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        girocb1();
        cores();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        girode3();
        cores();
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        girode2();
        cores();
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        girode1();
        cores();
    }//GEN-LAST:event_btn12ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SegundaTentativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SegundaTentativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SegundaTentativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SegundaTentativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SegundaTentativa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    // End of variables declaration//GEN-END:variables

}
