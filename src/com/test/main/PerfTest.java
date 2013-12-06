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
				//定义基础面板（画布）
				JPanel jp = new JPanel();	
				//画板和画布相绑定
				setContentPane(jp);
				
				//整体父布局
				Container box_parent = Box.createVerticalBox();
				box_parent.setPreferredSize(new Dimension(400,400));
				
				
				//第一部分：创建第一个子布局		
				
				//第二部分：创建第二个子布局		
				//三个单选按钮
				Container box_second = Box.createHorizontalBox();
				Container box_second_one = Box.createVerticalBox();
				
				JRadioButton jrb1 = new JRadioButton("响应时间测试");
				JRadioButton jrb2 = new JRadioButton("网络流量测试");
				box_second_one.add(jrb1);
				box_second_one.add(jrb2);
				box_second.add(box_second_one);
				box_second.add(Box.createHorizontalStrut(300));
				
				//第三部分：添加两个按钮“开始”、“取消”
				
				
				//第四部分：进度条
				

				//第五部分：多行文本区
				JTextArea jtt = new JTextArea("结果显示", 10, 10);
						
				//将子布局添加到父布局
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
				
				setBounds(200, 200, 200, 200);// 设置窗口大小
				setResizable(false);//设置窗体不能改变大小
				pack();// 根据组件自适应窗体大小
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setTitle("测试");// 设置窗口标题
				setVisible(true);
	}
	
	
	//处理单选按钮事件
	
	//处理开始按钮事件
	
	//处理暂停按钮事件
	
	//处理进度条、右边应用文字的显示
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PerfTest();
	}

}
