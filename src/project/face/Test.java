package project.face;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import project.face.FaceOperations;

public class Test {

	  public static void main(String[] args) throws Exception {
		  BufferedImage img = ImageIO.read(new File("1.jpg"));
		  ImageIO.write(FaceOperations.markFaces(img, FaceOperations.getFacesCoords(img)),
				 "jpg", new File("out.jpg"));
	  }
}