package com.jitin.capturemyscreen;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.jitin.capturemyscreen.util.UniqueFileNameGenerator;

public class App{

	private static final long serialVersionUID = -6029346263086618574L;
	private static final String STORAGE_LOCATION = "D:/SS/";

	public static void main(String[] args) {
		try {
			/*
			 * Program will wait for 5 seconds so that you can open the window whose
			 * screenshot has to be taken.
			 */
			Thread.sleep(5000);
			Robot robot = new Robot();
			BufferedImage bufferedImage = robot
					.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			String filename = STORAGE_LOCATION + UniqueFileNameGenerator.generateFileName() + ".jpg";
			ImageIO.write(bufferedImage, "jpg", new File(filename));
			System.out.println("Screenshot saved!!");
		} catch (AWTException | IOException | InterruptedException ex) {
			System.err.println(ex);
		}
	}

}
