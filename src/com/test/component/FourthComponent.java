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
		//第四部分：进度条
		Container box_fourth = Box.createHorizontalBox();
		JLabel jl_progress1 = new JLabel("正在执行:");
		bar = new JProgressBar(JProgressBar.HORIZONTAL);
		JLabel jl_progress2 = new JLabel("帐号……");
		//对进度条进行处理
		//设置在进度条中绘制完成百分比
		bar.setStringPainted(true);
		//设置进度条的最小值
		bar.setMinimum(0);
		//TODO 设置进度条的最大值(打开应用的次数)
		bar.setMaximum(100);
		//设置进度条的变化
		Timer timer = new Timer(300, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 当前应用打开第几次了（需要创建一个类返回需要的值）
				bar.setValue(7);
			}
		});
		//组装第四部分各个控件
		box_fourth.add(jl_progress1);
		box_fourth.add(Box.createHorizontalStrut(10));
		box_fourth.add(bar);
		box_fourth.add(Box.createHorizontalStrut(10));
		box_fourth.add(jl_progress2);
		return box_fourth;
	}

}
