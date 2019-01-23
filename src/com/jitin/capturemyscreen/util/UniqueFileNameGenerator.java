package com.jitin.capturemyscreen.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UniqueFileNameGenerator {
	private UniqueFileNameGenerator() {

	}

	public static String generateFileName() {
		StringBuilder fileName = new StringBuilder("ScreenShot_");
		return fileName.append(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())).toString();
	}

	public static String generateFileName(String prefix) {
		StringBuilder fileName = new StringBuilder(prefix);
		return fileName.append(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())).toString();
	}
}
