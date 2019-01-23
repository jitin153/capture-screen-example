package com.jitin.capturemyscreen;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.jitin.capturemyscreen.util.UniqueFileNameGenerator;

public class App2 {
	private static final String STORAGE_LOCATION = "D:/SS/";

	public static void main(String[] args) throws Exception {
		int i = 1;
		/*
		 * This code will gonna 30 screenshots.
		 */
		while (i <= 30) {
			Robot robot = new Robot();
			BufferedImage bufferedImage = robot
					.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			String filename = STORAGE_LOCATION + UniqueFileNameGenerator.generateFileName() + "_" + i + ".jpg";
			ImageIO.write(bufferedImage, "JPG", new File(filename));
			System.out.println(filename);
			Thread.sleep(1);
			i++;
		}
	}
}
