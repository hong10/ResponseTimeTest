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
		// 构建第一部分
		Container box_one = Box.createHorizontalBox();
		box_one.setPreferredSize(new Dimension(200, 2));// 设置第一部分的大小
		// 单行文本输入框
		jtf = new JTextField();

		// 标签组件
		JLabel jl = new JLabel("TV IP地址:");
		// 按钮组件
		JButton jb = new JButton("连接");
		// 拼装第一部分组件
		box_one.add(jl);
		box_one.add(Box.createHorizontalStrut(10));
		box_one.add(jtf);
		box_one.add(Box.createHorizontalStrut(7));
		box_one.add(jb);
		// 注册事件监听器
		jb.addActionListener(new ActionListener() {
			// “连接”按钮的事件
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 获取输入IP
				IP = jtf.getText();
				// 连接android设备
				ShellCommand.connectDevice(IP);
				// 弹出提示框
				// TODO 后续需要判断
				JOptionPane.showMessageDialog(null, "连接成功！", "提示",
						JOptionPane.INFORMATION_MESSAGE);

			}
		});
		return box_one;
	}

}
