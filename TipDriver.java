//Robert Payne
//L02
//6-20-2012

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TipDriver{

	public static void main(String[] args)
	{
		//creates an instance of the window
		TipWindow window = new TipWindow();
		//exits the program when the window is closed
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class TipWindow extends JFrame
{
	
	//for input into the gui
	private JTextField tipField, priceField;
	//for output onto the gui
	private JLabel tipLabel, priceLabel, outLabel;
	//Button for calculating the tip
	private JButton button;
		
	//Panel for holding tipField, priceField, tipLabel, ...
	private JPanel panel;
	//A reference to the content pane
	private Container container;
	
	//constructor for the window and the fields, labels, and button
	public TipWindow()
	{
	 	//constructor for the window
		super("Tip Calculator");
		//sets the size to 220 x 275
		setSize(220,275);
		
		//sets the container
		container = getContentPane();
		//sets the panel
		panel = new JPanel();
		//sets the tipfield to 10
		tipField = new JTextField(10);
		//sets the pricefield to 10
		priceField = new JTextField(10);
		//sets the outlabel to tip total
		outLabel = new JLabel("Tip Total: ");
		//sets the tiplabel to tip amount
		tipLabel = new JLabel("Tip Amount: ");
		//sets price label to price amount
		priceLabel = new JLabel("Price Amount: ");
		
		//creates the button and labels it calculate
		button = new JButton("Calculate");
		
		//Add active listener for the button
	  	button.addActionListener(new TipListener());
		//displayed in the order that they are added to the panel
		panel.add(tipLabel);
		panel.add(tipField);
		panel.add(priceLabel);
		panel.add(priceField);
		panel.add(button);
		panel.add(outLabel);
	
		//adds the panel to the container
		container.add(panel);
		//makes the window visible
		setVisible(true);
		
		}//end of constructor
		
		
		//listens for the button press, executes this class
		//when the button is pressed
		private class TipListener implements ActionListener
		{
			
			public void actionPerformed(ActionEvent event)
			{
				//doubles for doing calculations
				double tip, out, price;
				//try for exception in case of invalid input
				try{
					
					tip = Double.parseDouble(tipField.getText());
					price = Double.parseDouble(priceField.getText());
					out = (tip/100)*price;
					
					outLabel.setText("Tip Total : $" + out);
					
				}
				//outputs invalid input if there was a problem in the try block
				catch(Exception e)
				{
						outLabel.setText("Input invalid");
				}		
			}
		} 
}