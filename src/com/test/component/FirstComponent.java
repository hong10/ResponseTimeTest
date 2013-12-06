package com.test.component;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.test.util.ShellCommand;

public class FirstComponent {

	public static String IP;
	public static JTextField jtf;

	public static Container getBox_one() {
		// ������һ����
		Container box_one = Box.createHorizontalBox();
		box_one.setPreferredSize(new Dimension(200, 2));// ���õ�һ���ֵĴ�С
		// �����ı������
		jtf = new JTextField();

		// ��ǩ���
		JLabel jl = new JLabel("TV IP��ַ:");
		// ��ť���
		JButton jb = new JButton("����");
		// ƴװ��һ�������
		box_one.add(jl);
		box_one.add(Box.createHorizontalStrut(10));
		box_one.add(jtf);
		box_one.add(Box.createHorizontalStrut(7));
		box_one.add(jb);
		// ע���¼�������
		jb.addActionListener(new ActionListener() {
			// �����ӡ���ť���¼�
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// ��ȡ����IP
				IP = jtf.getText();
				// ����android�豸
				ShellCommand.connectDevice(IP);
				// ������ʾ��
				// TODO ������Ҫ�ж�
				JOptionPane.showMessageDialog(null, "���ӳɹ���", "��ʾ",
						JOptionPane.INFORMATION_MESSAGE);

			}
		});
		return box_one;
	}

}
