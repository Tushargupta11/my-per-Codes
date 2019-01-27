package swing;



import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class imagebut extends JFrame {

	public imagebut() {
		// TODO Auto-generated constructor stub
		setLayout(null); // :-)
		PicPanel mainPanel = new PicPanel("Img/picturepuzzle.jpg");
		mainPanel.setBounds(0,0,500,500);
		add(mainPanel);
	}
	public static void main(String args[]) {
		imagebut w = new imagebut();
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setSize(300,300);
		w.setVisible(true);
	}
}
	class PicPanel extends JPanel{

		private BufferedImage image;
		private int w,h;
		public PicPanel(String fname){

		    //reads the image
		    try {
		        image = ImageIO.read(getClass().getResource(fname));
		        w = image.getWidth();
		        h = image.getHeight();

		    } catch (IOException ioe) {
		        System.out.println("Could not read in the pic");
		        //System.exit(0);
		    }

		}

		public Dimension getPreferredSize() {
		    return new Dimension(w,h);
		}
		//this will draw the image
		public void paintComponent(Graphics g){
		    super.paintComponent(g);
		    g.drawImage(image,0,0,this);
		}
		}

		

