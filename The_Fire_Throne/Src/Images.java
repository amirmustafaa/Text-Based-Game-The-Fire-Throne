import javax.swing.ImageIcon;
import javax.swing.JLabel; 
import javax.swing.JFrame;  
  
public class Images {  
	
	public void generateRiver() {
		JLabel image = new JLabel(new ImageIcon(new ImageIcon("imgs/River.jpg").getImage().getScaledInstance(700, 700, 0)));
		//Create JFrame
        JFrame f=new JFrame();  
        f.add(image);  
        f.pack();  
        f.setLocationRelativeTo(null);
        //Show image
        f.setVisible(true); 
        //Dispose of image after 4 seconds
        try
    	{
    		Thread.sleep(4000);
    		f.dispose();
    	}
    	catch(InterruptedException ex)
    	{
    		Thread.currentThread().interrupt();
    	}   
		
	}
	
	public void generateMountain() {
		JLabel image = new JLabel(new ImageIcon(new ImageIcon("imgs/Mountain.jpg").getImage().getScaledInstance(700, 700, 0)));
        JFrame f=new JFrame();  
        f.add(image);  
        f.pack();  
        f.setLocationRelativeTo(null);
        f.setVisible(true); 
        try
    	{
    		Thread.sleep(4000);
    		f.dispose();
    	}
    	catch(InterruptedException ex)
    	{
    		Thread.currentThread().interrupt();
    	}   
		
	}
	
	public void generateEntrance() {
		JLabel image = new JLabel(new ImageIcon(new ImageIcon("imgs/Entrance.jpg").getImage().getScaledInstance(700, 700, 0)));
        JFrame f=new JFrame();  
        f.add(image);  
        f.pack();  
        f.setLocationRelativeTo(null);
        f.setVisible(true); 
        try
    	{
    		Thread.sleep(4000);
    		f.dispose();
    	}
    	catch(InterruptedException ex)
    	{
    		Thread.currentThread().interrupt();
    	}   
		
	}
	
	public void generateThrone() {
		JLabel image = new JLabel(new ImageIcon(new ImageIcon("imgs/Throne.jpg").getImage().getScaledInstance(700, 700, 0)));
        JFrame f=new JFrame();  
        f.add(image);  
        f.pack();  
        f.setLocationRelativeTo(null);
        f.setVisible(true); 
        try
    	{
    		Thread.sleep(4000);
    		f.dispose();
    	}
    	catch(InterruptedException ex)
    	{
    		Thread.currentThread().interrupt();
    	}   
		
	}
	
	
       
	public static void main(String[] args) {  
		Images image = new Images();
		image.generateRiver();
		image.generateMountain();
		image.generateEntrance();
		image.generateThrone();
        
    }  
  
}  

