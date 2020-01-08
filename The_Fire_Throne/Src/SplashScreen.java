import java.awt.*;
import javax.swing.*;
 
public class SplashScreen extends JWindow {

	
	private int time;
     
    public SplashScreen(int time) {
        this.time = time;
    }
     
    //Generate Splash Screen
    public void generateSplashScreen() {
         
        // Set width and height of screen 
        int width = 550;
        int height = 350;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-width)/2;
        int y = (screen.height-height)/2;
        setBounds(x,y,width,height);
        
        JPanel content = (JPanel)getContentPane();
        content.setBackground(Color.red);
         
        //Construction of splash screen
        JLabel label = new JLabel(new ImageIcon("java-tip.gif"));
        JLabel copyrt = new JLabel("The Fire Throne", JLabel.CENTER);
        
        content.add(label, BorderLayout.CENTER);
        content.add(copyrt, BorderLayout.CENTER);
        
        copyrt.setFont(new Font("Purisa", Font.BOLD, 42));
        
        Color black = new Color(0, 0, 0);
        content.setBorder(BorderFactory.createLineBorder(black, 10)); 
        //show splash screen
        setVisible(true);
        //Duration of Splash Screen
        try { Thread.sleep(time); } catch (Exception e) {}
         
        setVisible(false);
         
    }
     
}