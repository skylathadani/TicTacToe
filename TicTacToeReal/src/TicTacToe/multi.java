/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author skylathadani
 */
public class multi extends javax.swing.JFrame {
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    static String [][] board = new String [3][3];
    private boolean win = false;
    
    
    /**
     * Creates new form TicTacToe_s
     */
    public multi() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
private void gameScore(){
    playX.setText(String.valueOf(xCount));
    playY.setText(String.valueOf(oCount));
    
}

private void choose_a_Player(){
    if(startGame.equalsIgnoreCase("X")){
        startGame="O";
    }else{
        startGame="X";
    }
}

private void winningGame(){
   
    String b1 = jButton1.getText();
    String b2 = jButton2.getText();
    String b3 = jButton3.getText();
    
    String b4 = jButton4.getText();
    String b5 = jButton5.getText();
    String b6 = jButton6.getText();
    
    String b7 = jButton7.getText();
    String b8 = jButton8.getText();
    String b9 = jButton9.getText();
    
    board[0][0] = b1;
    board[0][1] = b2;
    board[0][2] = b3;
    board[1][0] = b4;
    board[1][1] = b5;
    board[1][2] = b6;
    board[2][0] = b7;
    board[2][1] = b8;
    board[2][2] = b9;
    
    
    if(win == false && board[0][0] == ("X") && board[0][1] == ("X") && board[0][2] == ("X")){
   JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   xCount++;
   gameScore();
   jButton1.setBackground(Color.yellow);
   jButton2.setBackground(Color.yellow);
   jButton3.setBackground(Color.yellow);
   win = true;
    }
        
    
    
    if(win == false &&board[1][0] == ("X") && board[1][1] == ("X") && board[1][2] == ("X")){
   JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   xCount++;
   gameScore();
   jButton4.setBackground(Color.yellow);
   jButton5.setBackground(Color.yellow);
   jButton6.setBackground(Color.yellow);
   win = true;
    }
    if(win == false &&board[2][0] == ("X") && board[2][1] == ("X") && board[2][2] == ("X")){
   JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   xCount++;
   gameScore();
   jButton7.setBackground(Color.yellow);
   jButton8.setBackground(Color.yellow);
   jButton9.setBackground(Color.yellow);
   win = true;
    }
    if(win == false &&board[0][0] == ("X") && board[1][0] == ("X") && board[2][0] == ("X")){
   JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   xCount++;
   gameScore();
   jButton1.setBackground(Color.yellow);
   jButton4.setBackground(Color.yellow);
   jButton7.setBackground(Color.yellow);
   win = true;
    }
    if(win == false &&board[0][1] == ("X") && board[1][1] == ("X") && board[2][1] == ("X")){
   JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   xCount++;
   gameScore();
   jButton2.setBackground(Color.yellow);
   jButton5.setBackground(Color.yellow);
   jButton8.setBackground(Color.yellow);
   win = true;
    }
    if(win == false &&board[0][2] == ("X") && board[1][2] == ("X") && board[2][2] == ("X")){
   JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   xCount++;
   gameScore();
   jButton3.setBackground(Color.yellow);
   jButton6.setBackground(Color.yellow);
   jButton9.setBackground(Color.yellow);
  win = true;
    }
    
    if(win == false &&board[2][0] == ("X") && board[1][1] == ("X") && board[0][2] == ("X")){
   JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   xCount++;
   gameScore();
   jButton7.setBackground(Color.yellow);
   jButton5.setBackground(Color.yellow);
   jButton3.setBackground(Color.yellow);
   win = true;
    }
    if(win == false &&board[0][0] == ("X") && board[1][1] == ("X") && board[2][2] == ("X")){
   JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   xCount++;
   gameScore();
   jButton1.setBackground(Color.yellow);
   jButton5.setBackground(Color.yellow);
   jButton9.setBackground(Color.yellow);
 win = true;
    }
    
    //O wins
    if(win == false &&board[0][0] == ("O") && board[0][1] == ("O") && board[0][2] == ("O")){
   JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   oCount++;
   gameScore();
   jButton1.setBackground(Color.yellow);
   jButton2.setBackground(Color.yellow);
   jButton3.setBackground(Color.yellow);
   win = true;
    }
    
    if(win == false &&board[1][0] == ("O") && board[1][1] == ("O") && board[1][2] == ("O")){
   JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   oCount++;
   gameScore();
   jButton4.setBackground(Color.yellow);
   jButton5.setBackground(Color.yellow);
   jButton6.setBackground(Color.yellow);
 win = true;
    }
    if(win == false &&board[2][0] == ("O") && board[2][1] == ("O") && board[2][2] == ("O")){
   JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   oCount++;
   gameScore();
   jButton7.setBackground(Color.yellow);
   jButton8.setBackground(Color.yellow);
   jButton9.setBackground(Color.yellow);
   win = true;
    }
    if(win == false &&board[0][0] == ("O") && board[1][0] == ("O") && board[2][0] == ("O")){
   JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   oCount++;
   gameScore();
   jButton1.setBackground(Color.yellow);
   jButton4.setBackground(Color.yellow);
   jButton7.setBackground(Color.yellow);
   win = true;
    }
    if(win == false &&board[0][1] == ("O") && board[1][1] == ("O") && board[2][1] == ("O")){
   JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   oCount++;
   gameScore();
   jButton2.setBackground(Color.yellow);
   jButton5.setBackground(Color.yellow);
   jButton8.setBackground(Color.yellow);
   win = true;
    }
    if(win == false &&board[0][2] == ("O") && board[1][2] == ("O") && board[2][2] == ("O")){
   JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   oCount++;
   gameScore();
   jButton3.setBackground(Color.yellow);
   jButton6.setBackground(Color.yellow);
   jButton9.setBackground(Color.yellow);
   win = true;
    }
    
    if(win == false &&board[2][0] == ("O") && board[1][1] == ("O") && board[0][2] == ("O")){
   JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   oCount++;
   gameScore();
   jButton7.setBackground(Color.yellow);
   jButton5.setBackground(Color.yellow);
   jButton3.setBackground(Color.yellow);
  win = true;
    }
    if(win == false &&board[0][0] == ("O") && board[1][1] == ("O") && board[2][2] == ("O")){
   JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   oCount++;
   gameScore();
   jButton1.setBackground(Color.yellow);
   jButton5.setBackground(Color.yellow);
   jButton9.setBackground(Color.yellow);
   
  win = true;
    }

}

private void tieGame(){
    String string1 = jButton1.getText();
    String string2 = jButton2.getText();
    String string3 = jButton3.getText();
    String string4 = jButton4.getText();
    String string5 = jButton5.getText();
    String string6 = jButton6.getText();
    String string7 = jButton7.getText();
    String string8 = jButton8.getText();
    String string9 = jButton9.getText();
    
    if(win == false && string1 != "" && string2 != "" && string3 != "" && string4 != "" && string5 !="" && string6 != "" && string7 != "" && string8 != "" && string9 !="" ){
        JOptionPane.showMessageDialog(this,"The game is a Tie", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        win = true;
    }
        
    
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        playerX = new javax.swing.JLabel();
        PlayerO = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        singlePlayer = new javax.swing.JButton();
        playX = new javax.swing.JLabel();
        playY = new javax.swing.JLabel();

        jPanel13.setBackground(new java.awt.Color(102, 102, 102));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(102, 102, 102));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(102, 102, 102));
        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(102, 102, 102));
        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(102, 102, 102));
        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(102, 102, 102));
        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel19.setBackground(new java.awt.Color(102, 102, 102));
        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel20.setBackground(new java.awt.Color(102, 102, 102));
        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel21.setBackground(new java.awt.Color(102, 102, 102));
        jPanel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel1.setText("Player X Score");

        jLabel2.setText("Player O Score");

        btnExit.setText("Exit");
        btnExit.setToolTipText("");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        jLabel3.setText("Multiplayer TicTacToe");

        singlePlayer.setText("Switch to Single Player");
        singlePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singlePlayerActionPerformed(evt);
            }
        });

        playX.setText("0");

        playY.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(6, 6, 6)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(12, 12, 12)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(6, 6, 6)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(playerX)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(2, 2, 2))
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PlayerO)
                                            .addComponent(playX)
                                            .addComponent(playY))
                                        .addGap(56, 56, 56))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(singlePlayer)
                                .addContainerGap(29, Short.MAX_VALUE))))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(playerX)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(PlayerO))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(playX))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(playY)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(singlePlayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnReset))
                .addGap(187, 187, 187))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       frame =  new JFrame ("Exit");
       
       if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tic Tac Toe", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
       {
           System.exit(0);
       }
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jButton1.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X")){
        jButton1.setForeground(Color.GREEN);
        
    }else{
        jButton1.setForeground(Color.BLUE);
    }
        choose_a_Player();
        winningGame();
        tieGame();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X")){
        jButton2.setForeground(Color.GREEN);
        
    }else{
        jButton2.setForeground(Color.BLUE);
    }
        choose_a_Player();
        winningGame();
        tieGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     jButton3.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X")){
        jButton3.setForeground(Color.GREEN);
        
    }else{
        jButton3.setForeground(Color.BLUE);
    }
        choose_a_Player();
        winningGame();
        tieGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X")){
        jButton4.setForeground(Color.GREEN);
        
    }else{
        jButton4.setForeground(Color.BLUE);
    }
        choose_a_Player();
        winningGame();
        tieGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X")){
        jButton5.setForeground(Color.GREEN);
        
    }else{
        jButton5.setForeground(Color.BLUE);
    }
        choose_a_Player();
         winningGame();
         tieGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       jButton6.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X")){
        jButton6.setForeground(Color.GREEN);
        
    }else{
        jButton6.setForeground(Color.BLUE);
    }
        choose_a_Player();
        winningGame();
        tieGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       jButton7.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X")){
        jButton7.setForeground(Color.GREEN);
        
    }else{
        jButton7.setForeground(Color.BLUE);
    }
        choose_a_Player();
        winningGame();
        tieGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X")){
        jButton8.setForeground(Color.GREEN);
        
    }else{
        jButton8.setForeground(Color.BLUE);
    }
        choose_a_Player();
        winningGame();
        tieGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       jButton9.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X")){
        jButton9.setForeground(Color.GREEN);
        
    }else{
        jButton9.setForeground(Color.BLUE);
    }
        choose_a_Player();
        winningGame();
        tieGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        jButton1.setText("");
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setText("");
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setText("");
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setText("");
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setText("");
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setText("");
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setText("");
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setText("");
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setText("");
        jButton9.setBackground(Color.LIGHT_GRAY);
        
        win = false;
        
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void singlePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singlePlayerActionPerformed
      this.dispose();
      new single().setVisible(true);
    }//GEN-LAST:event_singlePlayerActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(multi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(multi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(multi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(multi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new multi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PlayerO;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel playX;
    private javax.swing.JLabel playY;
    private javax.swing.JLabel playerX;
    private javax.swing.JButton singlePlayer;
    // End of variables declaration//GEN-END:variables
}
