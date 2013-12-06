package com.test.component;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;

public class ThirdComponent {
	
	/**
	 * 功能：处理“开始”、“暂停”按钮
	 * 
	 * “开始”按钮作用：
	 * 1、获取单选框的信息（选择的是哪个执行条目）
	 * 2、控制进度条(开启一个耗时的操作)、同时配合处理“暂停”按钮
	 * 
	 * “暂停”按钮
	 * 1、处理进度条的中途暂停，然后点击开始后，又继续执行
	 * 
	 * @return
	 */
	public static Container getThirdComponent(){
		Container box_third = Box.createHorizontalBox();
		JButton jb_start = new JButton("开始");
		JButton jb_pause = new JButton("暂停");
		
		jb_start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//耗时操作——执行响应时间的测试
				
				
			}
		});
		
		
		
		
		box_third.add(jb_start);
		box_third.add(Box.createHorizontalStrut(60));
		box_third.add(jb_pause);
		
		return box_third;
		
	}

}
