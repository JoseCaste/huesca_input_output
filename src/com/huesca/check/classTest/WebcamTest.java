package com.huesca.check.classTest;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamUtils;
import com.github.sarxos.webcam.util.ImageUtils;

public class WebcamTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Webcam webcam = Webcam.getDefault();
		webcam.open();

		BufferedImage image = webcam.getImage();

		ImageIO.write(image, ImageUtils.FORMAT_JPG, new File("selfie.jpg"));
		//WebcamUtils.capture(webcam, "selfie.jpg");
	}

}
