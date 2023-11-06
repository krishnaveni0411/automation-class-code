package org.system.week5.assignment1;

public class Desktop extends Computer {
public void desktopSize()
{
	System.out.println("Desktop Size: Large");
}
public static void main(String[] args) {
	Desktop desk=new Desktop();
	desk.computerModel();
	desk.desktopSize();
}
}
