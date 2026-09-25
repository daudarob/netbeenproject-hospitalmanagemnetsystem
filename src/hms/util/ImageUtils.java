package hms.util;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;

/**
 * Helper for loading and scaling images used across the UI
 * (patient photos, doctor photos, the app logo, etc).
 */
public final class ImageUtils {

    private ImageUtils() {
    }

    /**
     * Loads an image from disk and scales it to the given size.
     * If the path is missing or invalid, a neutral placeholder icon
     * is generated instead so the UI never breaks.
     */
    public static ImageIcon loadScaledImage(String path, int width, int height) {
        try {
            if (path != null && !path.isBlank() && new File(path).exists()) {
                ImageIcon icon = new ImageIcon(path);
                Image scaled = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
                return new ImageIcon(scaled);
            }
        } catch (Exception ex) {
            // fall through to placeholder
        }
        return placeholder(width, height);
    }

    /**
     * Generates a simple grey silhouette placeholder so a photo box
     * is never left blank when no image has been chosen yet.
     */
    public static ImageIcon placeholder(int width, int height) {
        java.awt.image.BufferedImage img =
                new java.awt.image.BufferedImage(width, height, java.awt.image.BufferedImage.TYPE_INT_ARGB);
        java.awt.Graphics2D g = img.createGraphics();
        g.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(new java.awt.Color(224, 228, 232));
        g.fillRoundRect(0, 0, width, height, 12, 12);
        g.setColor(new java.awt.Color(150, 160, 170));
        int headSize = width / 3;
        g.fillOval((width - headSize) / 2, height / 6, headSize, headSize);
        g.fillOval(width / 6, (int) (height * 0.55), (int) (width * 0.66), (int) (height * 0.5));
        g.setClip(new java.awt.Rectangle(0, 0, width, height));
        g.dispose();
        return new ImageIcon(img);
    }
}
