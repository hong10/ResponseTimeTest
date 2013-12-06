package com.test.main;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

import com.test.component.FirstComponent;
import com.test.component.FourthComponent;
import com.test.component.ThirdComponent;
import com.test.util.ShellCommand;


public class PerfTest extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public static JProgressBar bar;
	
	
	public PerfTest(){
				//���������壨������
				JPanel jp = new JPanel();	
				//����ͻ������
				setContentPane(jp);
				
				//���常����
				Container box_parent = Box.createVerticalBox();
				box_parent.setPreferredSize(new Dimension(400,400));
				
				
				//��һ���֣�������һ���Ӳ���		
				
				//�ڶ����֣������ڶ����Ӳ���		
				//������ѡ��ť
				Container box_second = Box.createHorizontalBox();
				Container box_second_one = Box.createVerticalBox();
				
				JRadioButton jrb1 = new JRadioButton("��Ӧʱ�����");
				JRadioButton jrb2 = new JRadioButton("������������");
				box_second_one.add(jrb1);
				box_second_one.add(jrb2);
				box_second.add(box_second_one);
				box_second.add(Box.createHorizontalStrut(300));
				
				//�������֣����������ť����ʼ������ȡ����
				
				
				//���Ĳ��֣�������
				

				//���岿�֣������ı���
				JTextArea jtt = new JTextArea("�����ʾ", 10, 10);
						
				//���Ӳ�����ӵ�������
				box_parent.add(FirstComponent.getBox_one());
				box_parent.add(Box.createVerticalStrut(10));
				box_parent.add(box_second);
				box_parent.add(Box.createVerticalStrut(20));
				box_parent.add(ThirdComponent.getThirdComponent());
				box_parent.add(Box.createVerticalStrut(20));
				box_parent.add(FourthComponent.getFourthComponent());
				box_parent.add(Box.createVerticalStrut(20));
				box_parent.add(jtt);

				jp.add(box_parent);
				
				setBounds(200, 200, 200, 200);// ���ô��ڴ�С
				setResizable(false);//���ô��岻�ܸı��С
				pack();// �����������Ӧ�����С
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setTitle("����");// ���ô��ڱ���
				setVisible(true);
	}
	
	
	//����ѡ��ť�¼�
	
	//����ʼ��ť�¼�
	
	//������ͣ��ť�¼�
	
	//������������ұ�Ӧ�����ֵ���ʾ
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PerfTest();
	}

}
