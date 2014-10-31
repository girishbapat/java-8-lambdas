/**
 *
 */
package com.core.java8.lambdas.chapter2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Girish Bapat
 *
 */
public class BasicExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("== 1. Runnable tests ==");
		//Annonymous way
		Runnable annonymousway=new Runnable() {
			public void run() {
				System.out.println("Hello world by old annonymous way!");

			}
		};

		Runnable lambdaWay=()-> System.out.println("Hello world by Lambda!");

		annonymousway.run();
		lambdaWay.run();

		System.out.println("== 2. Swings button ==");

		JButton testButton = new JButton("Click me");

		testButton.addActionListener(new ActionListener(){
			@Override public void actionPerformed(ActionEvent ae){
				System.out.println("Button Click by Annonymous class");
			}
		});
		ActionListener withLambdaListenerInstance=event-> System.out.println("Button Click by LambdaListener as an argument");
		testButton.addActionListener(withLambdaListenerInstance);
		testButton.addActionListener(actionEvent -> System.out.println("Button Click by Lambda"));

		String name="Girish";
		//cannot reassign it will fail, it should be final or effectively final.
		//name="xyz";
		testButton.addActionListener(actionEvent -> System.out.println("Hi ..."+name));

		// Swing stuff
		JFrame frame = new JFrame("Dummy Listener");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(testButton, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);

	}
}
