package com.Silentpeople.exam1;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class asd extends JFrame implements ActionListener{
 static final int ROCK = 0;
 static final int PAPER = 1;
 static final int SCISSOR = 2;
 
 private JPanel panel;
 private JTextField output,information;
 private JButton rock,paper,scissor;
 
 public asd(){
  setTitle("����,����,��");
  setSize(400,300);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  
  panel = new JPanel();
  panel.setLayout(new GridLayout(0, 3));
  
  information = new JTextField("�Ʒ��� ��ư�߿��� �ϳ��� Ŭ���Ͻÿ�");
  output=new JTextField(20);
  
  rock = new JButton("ROCK");
  paper = new JButton("PAPER");
  scissor = new JButton("SCISSOR");
  rock.addActionListener(this);
  paper.addActionListener(this);
  scissor.addActionListener(this);
  
  panel.add(rock);
  panel.add(paper);
  panel.add(scissor);
  
  add(information, BorderLayout.NORTH);
  add(panel, BorderLayout.CENTER);
  add(output, BorderLayout.SOUTH);
  setVisible(true);
 }
 public static void main(String[] args){
  asd s = new asd();
 }
 
 @Override
 public void actionPerformed(ActionEvent e) {
  int num = (int)(Math.random()*3+1);
  String[] arg = new String[]{"rock","scissor","paper"};
  
  String computer = arg[num];
  
     if (computer == e.getSource())
     output.setText("�����");
  else if (computer == "rock" && e.getSource() == "scissor" || computer == "scissor" || e.getSource() == "paper" && computer == "paper" || e.getSource() == "rock")
     output.setText("����ڰ� �̰���");
  else
   output.setText("����ڰ� ����");
  
 }

}