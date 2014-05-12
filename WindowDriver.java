//Robert Payne
//L02
//6-20-2012

import javax.swing.*;
import java.awt.*;

public class WindowDriver{
	public static void main(String[] args){
		UNCCWeatherWindow window = new UNCCWeatherWindow();
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class UNCCWeatherWindow extends JFrame{

	public UNCCWeatherWindow(){
	
		super("UNCC Weather");
		setSize(360,275);
		setVisible(true);
		}
	}