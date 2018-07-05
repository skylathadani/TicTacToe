/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import static TicTacToe.multi.board;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author skylathadani
 */
public class single extends javax.swing.JFrame {
static String [][] board = new String [3][3];
private int xCount = 0;
    private int oCount = 0;
    private int counter = 0;
    private boolean win = false;
    
    /**
     * Creates new form tictactoe_C
     */
    public single() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void computerMove(){
        boolean full = false;
        
        board[0][0] = jButton1.getText();
        board[0][1] = jButton2.getText();
        board[0][2] = jButton3.getText();
        board[1][0] = jButton4.getText();
        board[1][1] = jButton5.getText();
        board[1][2] = jButton6.getText();
        board[2][0] = jButton7.getText();
        board[2][1] = jButton8.getText();
        board[2][2] = jButton9.getText();
        
        
            for(int row =0;row < 3; row++){
                for(int col = 0; col < 3; col++){
                   if(board[row][col] == ""){
                       full = true; 
                    }
                }
            }
        
        
        
        
        while(full && win == false){
            int rand = (int) Math.ceil(Math.random()*9);
            if(rand == 1){
                if(board [0][0] != "X" && board[0][0] != "O"){
                    board[0][0] ="O";
                    jButton1.setForeground(Color.BLUE);
                    jButton1.setText(board[0][0]);
                    
                    break;
                }
            }
            if(rand == 2){
                if(board [0][1] != "X" && board[0][1] != "O"){
                    board[0][1] ="O";
                    jButton2.setForeground(Color.BLUE);
                    jButton2.setText(board[0][1]);
                    
                    break;
                }
            
        }
            if(rand == 3){
                if(board [0][2] != "X" && board[0][2] != "O"){
                    board[0][2] ="O";
                    jButton3.setForeground(Color.BLUE);
                    jButton3.setText(board[0][2]);
                    break;
                }
    }
            if(rand == 4){
                if(board [1][0] != "X" && board[1][0] != "O"){
                    board[1][0] ="O";
                    jButton4.setForeground(Color.BLUE);
                    jButton4.setText(board[1][0]);
                    break;
                }
            }
            if(rand == 5){
                if(board [1][1] != "X" && board[1][1] != "O"){
                    board[1][1] ="O";
                    jButton5.setForeground(Color.BLUE);
                    jButton5.setText(board[1][1]);
                    break;
                }
            }
            if(rand == 6){
                if(board [1][2] != "X" && board[1][2] != "O"){
                    board[1][2] ="O";
                    jButton6.setForeground(Color.BLUE);
                    jButton6.setText(board[1][2]);
                   break;
                }
            }
            if(rand == 7){
                if(board [2][0] != "X" && board[2][0] !="O"){
                    board[2][0] ="O";
                    jButton7.setForeground(Color.BLUE);
                    jButton7.setText(board[2][0]);
                   break;
                }
            }
            if(rand == 8){
                if(board [2][1] != "X" && board[2][1] != "O"){
                    board[2][1] ="O";
                    jButton8.setForeground(Color.BLUE);
                    jButton8.setText(board[2][1]);
                    break;
                }
            }
            if(rand == 9){
                if(board [2][2] != "X" && board [2][2] != "O"){
                    board[2][2] ="O";
                    jButton9.setForeground(Color.BLUE);
                    jButton9.setText(board[2][2]);
                    break;
                }
            }//break;
            
  }
    }
    private void gameScore(){
    playX.setText(String.valueOf(xCount));
    playY.setText(String.valueOf(oCount));
    
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
   win =true;
   
    }
        
    
    
    if(win == false && board[1][0] == ("X") && board[1][1] == ("X") && board[1][2] == ("X")){
   JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   xCount++;
   gameScore();
   jButton4.setBackground(Color.yellow);
   jButton5.setBackground(Color.yellow);
   jButton6.setBackground(Color.yellow);
   win =true;
   
    }
    if(win == false && board[2][0] == ("X") && board[2][1] == ("X") && board[2][2] == ("X")){
   JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   xCount++;
   gameScore();
   jButton7.setBackground(Color.yellow);
   jButton8.setBackground(Color.yellow);
   jButton9.setBackground(Color.yellow);
   win =true;
   
    }
    if(win == false && board[0][0] == ("X") && board[1][0] == ("X") && board[2][0] == ("X")){
   JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   xCount++;
   gameScore();
   jButton1.setBackground(Color.yellow);
   jButton4.setBackground(Color.yellow);
   jButton7.setBackground(Color.yellow);
   win =true;
    }
    if(win == false && board[0][1] == ("X") && board[1][1] == ("X") && board[2][1] == ("X")){
   JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   xCount++;
   gameScore();
   jButton2.setBackground(Color.yellow);
   jButton5.setBackground(Color.yellow);
   jButton8.setBackground(Color.yellow);
   win =true;
   
    }
    if(win == false && board[0][2] == ("X") && board[1][2] == ("X") && board[2][2] == ("X")){
   JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   xCount++;
   gameScore();
   jButton3.setBackground(Color.yellow);
   jButton6.setBackground(Color.yellow);
   jButton9.setBackground(Color.yellow);
  win =true;
    }
    
    if(win == false && board[2][0] == ("X") && board[1][1] == ("X") && board[0][2] == ("X")){
   JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   xCount++;
   gameScore();
   jButton7.setBackground(Color.yellow);
   jButton5.setBackground(Color.yellow);
   jButton3.setBackground(Color.yellow);
   win =true;
    }
    if(win == false && board[0][0] == ("X") && board[1][1] == ("X") && board[2][2] == ("X")){
   JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   xCount++;
   gameScore();
   jButton1.setBackground(Color.yellow);
   jButton5.setBackground(Color.yellow);
   jButton9.setBackground(Color.yellow);
 win =true;
    }
    
    //O wins
    if(win == false && board[0][0] == ("O") && board[0][1] == ("O") && board[0][2] == ("O")){
   JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   oCount++;
   gameScore();
   jButton1.setBackground(Color.yellow);
   jButton2.setBackground(Color.yellow);
   jButton3.setBackground(Color.yellow);
   win =true;
    }
    
    if(win == false && board[1][0] == ("O") && board[1][1] == ("O") && board[1][2] == ("O")){
   JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   oCount++;
   gameScore();
   jButton4.setBackground(Color.yellow);
   jButton5.setBackground(Color.yellow);
   jButton6.setBackground(Color.yellow);
 win =true;
    }
    if(win == false && board[2][0] == ("O") && board[2][1] == ("O") && board[2][2] == ("O")){
   JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   oCount++;
   gameScore();
   jButton7.setBackground(Color.yellow);
   jButton8.setBackground(Color.yellow);
   jButton9.setBackground(Color.yellow);
   win =true;
    }
    if(win == false && board[0][0] == ("O") && board[1][0] == ("O") && board[2][0] == ("O")){
   JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   oCount++;
   gameScore();
   jButton1.setBackground(Color.yellow);
   jButton4.setBackground(Color.yellow);
   jButton7.setBackground(Color.yellow);
   win =true;
    }
    if(board[0][1] == ("O") && board[1][1] == ("O") && board[2][1] == ("O")){
   JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   oCount++;
   gameScore();
   jButton2.setBackground(Color.yellow);
   jButton5.setBackground(Color.yellow);
   jButton8.setBackground(Color.yellow);
   win =true;
    }
    if(win == false && board[0][2] == ("O") && board[1][2] == ("O") && board[2][2] == ("O")){
   JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   oCount++;
   gameScore();
   jButton3.setBackground(Color.yellow);
   jButton6.setBackground(Color.yellow);
   jButton9.setBackground(Color.yellow);
   win =true;
    }
    
    if(win == false && board[2][0] == ("O") && board[1][1] == ("O") && board[0][2] == ("O")){
   JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   oCount++;
   gameScore();
   jButton7.setBackground(Color.yellow);
   jButton5.setBackground(Color.yellow);
   jButton3.setBackground(Color.yellow);
  win =true;
    }
    if(win == false && board[0][0] == ("O") && board[1][1] == ("O") && board[2][2] == ("O")){
   JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);   
   oCount++;
   gameScore();
   jButton1.setBackground(Color.yellow);
   jButton5.setBackground(Color.yellow);
   jButton9.setBackground(Color.yellow);
   win =true;
  
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
        win =true;
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        playerX = new javax.swing.JLabel();
        PlayerO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        singlePlayer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        playX = new javax.swing.JLabel();
        playY = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jButton5.setToolTipText("");
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
        jButton7.setToolTipText("");
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

        jLabel3.setText("Player X wins:");

        jLabel4.setText("Player O wins:");

        btnExit.setText("Exit");
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

        singlePlayer.setText("Switch to Multiplayer");
        singlePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singlePlayerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        jLabel1.setText("TicTacToe Single Player");

        playX.setText("0");

        playY.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(29, 29, 29)
                                .addComponent(jButton2)))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addComponent(jButton6)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(playX))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(playY, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(playerX)
                                    .addComponent(PlayerO)))
                            .addComponent(singlePlayer)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExit)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(playerX)
                                .addComponent(playX)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PlayerO)
                            .addComponent(jLabel4)
                            .addComponent(playY))
                        .addGap(18, 18, 18)
                        .addComponent(singlePlayer)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset)
                            .addComponent(btnExit))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9});

        pack();
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
        
        if(jButton1.getText() == ""){
            jButton1.setText("X");
            
        jButton1.setForeground(Color.GREEN);
        
    
        }
        
        
        
        computerMove();
        winningGame();
        tieGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(jButton2.getText() == ""){
            jButton2.setText("X");
            
        jButton2.setForeground(Color.GREEN);
        
    
        }
        //counter++;
         
         
        computerMove();
        winningGame();
        tieGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        if(jButton3.getText() == ""){
            jButton3.setText("X");
            
        jButton3.setForeground(Color.GREEN);
        
    
        }
       //counter++;
        
        
        computerMove();
        winningGame();
        tieGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        if(jButton4.getText() == ""){
            jButton4.setText("X");
            
        jButton4.setForeground(Color.GREEN);
        
    
        }
        //counter++;
         
         
        computerMove();
        winningGame();
        tieGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        if(jButton5.getText() == ""){
            jButton5.setText("X");
            
        jButton5.setForeground(Color.GREEN);
        
       }
        // counter++;
          
          
        computerMove();
        winningGame();
        tieGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      
        if(jButton6.getText() == ""){
            jButton6.setText("X");
            
        jButton6.setForeground(Color.GREEN);
        
    
        }
      //counter++;
       
       
        computerMove();
        winningGame();
        tieGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        if(jButton7.getText() == ""){
            jButton7.setText("X");
            
        jButton7.setForeground(Color.GREEN);
        
    
        }
         //counter++;
         
         winningGame();
        tieGame();
        computerMove();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
    if(jButton8.getText() == ""){
            jButton8.setText("X");
            jButton8.setForeground(Color.GREEN);
           
        }    
//counter++;
          
          
        computerMove();
        winningGame();
        tieGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        if(jButton9.getText() == ""){
            jButton9.setText("X");
            jButton9.setForeground(Color.GREEN);
        
    
        }
         //counter++;
         
         
        computerMove();
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
        new multi().setVisible(true);
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
            java.util.logging.Logger.getLogger(single.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(single.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(single.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(single.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new single().setVisible(true);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel playX;
    private javax.swing.JLabel playY;
    private javax.swing.JLabel playerX;
    private javax.swing.JButton singlePlayer;
    // End of variables declaration//GEN-END:variables
}
