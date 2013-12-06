package com.test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class TestJProgressBar {
	JFrame frame = new JFrame("���Խ�����");
	// ����һ����ֱ������
	JProgressBar bar = new JProgressBar(JProgressBar.VERTICAL);
	JCheckBox indeterminate = new JCheckBox("��ȷ������");
	JCheckBox noBorder = new JCheckBox("�����Ʊ߿�");

	public void init() {
		Box box = new Box(BoxLayout.Y_AXIS);
		box.add(indeterminate);
		box.add(noBorder);
		frame.setLayout(new FlowLayout());
		frame.add(box);
		// �ѽ�������ӵ�JFrame������
		frame.add(bar);

		// �����ڽ������л�����ɰٷֱ�
		bar.setStringPainted(true);
		noBorder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// ���ݸ�ѡ�������Ƿ���ƽ������ı߿�
				bar.setBorderPainted(!noBorder.isSelected());
			}
		});
		final SimulatedTarget target = new SimulatedTarget(1000);
		// ������һ���̵߳ķ�ʽ��ִ��һ����ʱ������
		new Thread(target).start();
		// ���ý����������ֵ����Сֵ,
		bar.setMinimum(0);
		// ������������Ϊ�����������ֵ
		bar.setMaximum(target.getAmount());
		Timer timer = new Timer(300, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ������ĵ�ǰ��������ý�������value
				bar.setValue(target.getCurrent());
			}
		});
		timer.start();
		indeterminate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// ���øý������Ľ����Ƿ�ȷ��
				bar.setIndeterminate(indeterminate.isSelected());
				bar.setStringPainted(!indeterminate.isSelected());
			}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new TestJProgressBar().init();
	}
}

// ģ��һ����ʱ������
class SimulatedTarget implements Runnable {
	// ����ĵ�ǰ�����
	private volatile int current;
	// ��������
	private int amount;

	public SimulatedTarget(int amount) {
		current = 0;
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public int getCurrent() {
		return current;
	}

	// run�����������������Ĺ���
	public void run() {

		while (current < amount) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {

			}
			current++;
		}
	}
}