package nl.captcha.util;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

public class ImageUtil {
	public static final void applyFilter(BufferedImage img, BufferedImageOp filter) {
		BufferedImage destImage = filter.createCompatibleDestImage(img, img.getColorModel());
		filter.filter(img, destImage);
		Graphics2D g = img.createGraphics();
		g.drawImage(destImage, 0, 0, null, null);
		g.dispose();
	}
}
