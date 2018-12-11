package com.maven.calculator.calculator_Tong;


	import java.awt.Color;
	import java.awt.EventQueue;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.GroupLayout;
	import javax.swing.GroupLayout.Alignment;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JTextField;


	import java.awt.EventQueue;

	public class Main {
		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						MyCalculatorGui window = new MyCalculatorGui();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

	}



