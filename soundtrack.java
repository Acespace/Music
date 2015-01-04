import sun.audio.*;
import javax.swing.*;
import awt.event.*;
import java.io.*;


public class soundtrack {

	public static void main(String[] args)
	{

	JFrame frame = new JFrame();
	frame.setSize(200,200);
	JButton button = new JButton("Play Music");
	frame.add(button);
	button.addActionListener(new AL());
	frame.show(true);

	}
	public static class AL implements ActionListener{
	  public final void actionPerformed (ActionEvent e) {
		music();
	}}

	public static void music()
	{
		AudioPlayer MGP = AudioPlayer.player;
		AudioStream BGM;
		AudioData MD;
	 ContinousAudioDataStream loop = null;

	 try{	
	 BGM =  new AudioStream(new FileInputStream("intro engineering Music.wav"));
	 MD = BGM.getData();
	 loop = new ContinousAudioDataSteam(MD);
	 }catch(IOException error){}
        
	 }
	
        	 MGP.start.loop;
    
        }

















