package com.test.component;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;

public class ThirdComponent {
	
	/**
	 * ���ܣ�������ʼ��������ͣ����ť
	 * 
	 * ����ʼ����ť���ã�
	 * 1����ȡ��ѡ�����Ϣ��ѡ������ĸ�ִ����Ŀ��
	 * 2�����ƽ�����(����һ����ʱ�Ĳ���)��ͬʱ��ϴ�����ͣ����ť
	 * 
	 * ����ͣ����ť
	 * 1���������������;��ͣ��Ȼ������ʼ���ּ���ִ��
	 * 
	 * @return
	 */
	public static Container getThirdComponent(){
		Container box_third = Box.createHorizontalBox();
		JButton jb_start = new JButton("��ʼ");
		JButton jb_pause = new JButton("��ͣ");
		
		jb_start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//��ʱ��������ִ����Ӧʱ��Ĳ���
				
				
			}
		});
		
		
		
		
		box_third.add(jb_start);
		box_third.add(Box.createHorizontalStrut(60));
		box_third.add(jb_pause);
		
		return box_third;
		
	}

}
