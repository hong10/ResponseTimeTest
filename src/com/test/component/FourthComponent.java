package com.test.component;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class FourthComponent {
	
	public static JProgressBar bar;
	
	public static Container getFourthComponent(){
		//���Ĳ��֣�������
		Container box_fourth = Box.createHorizontalBox();
		JLabel jl_progress1 = new JLabel("����ִ��:");
		bar = new JProgressBar(JProgressBar.HORIZONTAL);
		JLabel jl_progress2 = new JLabel("�ʺš���");
		//�Խ��������д���
		//�����ڽ������л�����ɰٷֱ�
		bar.setStringPainted(true);
		//���ý���������Сֵ
		bar.setMinimum(0);
		//TODO ���ý����������ֵ(��Ӧ�õĴ���)
		bar.setMaximum(100);
		//���ý������ı仯
		Timer timer = new Timer(300, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO ��ǰӦ�ô򿪵ڼ����ˣ���Ҫ����һ���෵����Ҫ��ֵ��
				bar.setValue(7);
			}
		});
		//��װ���Ĳ��ָ����ؼ�
		box_fourth.add(jl_progress1);
		box_fourth.add(Box.createHorizontalStrut(10));
		box_fourth.add(bar);
		box_fourth.add(Box.createHorizontalStrut(10));
		box_fourth.add(jl_progress2);
		return box_fourth;
	}

}
