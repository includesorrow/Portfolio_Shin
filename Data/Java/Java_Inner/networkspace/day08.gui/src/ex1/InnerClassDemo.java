/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package ex1;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//�͸���Ŭ������ ó���Ѵ�.

/**
 *
 * @author KOSTA
 * ���ݱ��� �н��� ���� Ŭ������ Ȱ���ϴ� ����� ���ؼ� �˾ƺ���
 */
public class InnerClassDemo extends JFrame {
    //JFrame�� ��ӹ޾Ƽ� GUI ȭ���� �����ϴ� Ŭ������ ����
    private JPanel p1,p2;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    //Alt + insert
    public InnerClassDemo(){
        //������ GUI��ü�� �ʱ�ȭ(����)
        p1 = new JPanel();
        p2 = new JPanel();
        b1 = new JButton("red");
        b2 = new JButton("green");
        b3 = new JButton("blue");
        
        
        b1.setBackground(Color.red);
        b2.setBackground(Color.green);
        b3.setBackground(Color.red);
        // p1, p2�� ������ ����
        p1.setBackground(Color.white);
        
        //p2�гο� ��ư�� ��ġ
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        
        
        //JFrame�� p1, p2 �г��� ��ġ
        add(p1);
        add(p2,BorderLayout.SOUTH);
        
        //ȭ�� Ȱ��ȭ �� ����ó��
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 450);
        setVisible(true);
        //��ư�� �̺�Ʈ�� �����ϵ��� ����
        //b1.addActionListener(ActionListener�������̽��� ������ ��ü�� �ּҰ�);
        //�ּҰ� InnerClassDemo�̴�.
//        b1.addActionListener(this);//���⼭ this�� �������̽��� ������ / actionlistner�� ������ �������̽�. 
//                                    //implements ActionListener << ������. �̰� ����־ ������ ��.
//        b2.addActionListener(this);
//        b3.addActionListener(this);
//�͸���Ŭ������ ������ ����
b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
    }
    public static void main(String[] args) {
        new InnerClassDemo();
    }
    //��ư�� green��ư, blue ���� �߰��ϰ� �ش� ������ p1�� ������ �����Ͻÿ�

    
    
//ActionListner �������̽��� �߻� �޼��带 �������Ѵ�.
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        // shift.del <-��������
//        //System.out.println("Click!");
//        JButton btn = (JButton) e.getSource();
//       p1.setBackground(btn.getBackground());
//        
//    }
}

    