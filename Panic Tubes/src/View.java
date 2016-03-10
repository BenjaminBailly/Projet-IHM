import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class View 
{
	private Controler controler;
	private Model model; 
	
	private ArrayList<JButton> grid_buttons = new ArrayList <JButton>();
    private JPanel grid_panel = new JPanel();
    private GridLayout grid_layout ;
    JFrame window = new JFrame();

	
	View()
	{
		
	}
	
	public void link_view(Controler controler, Model model)
	{
		this.controler = controler;
		this.model = model;
	}
	
	public void set_grid_parameters(int length, int width)
	{
		grid_layout = new GridLayout (length, width);
		this.grid_panel.setLayout(grid_layout);	
		
		creation_of_buttons(length*width);
		add_buttons_to_grid(length*width);
		
		controler.prepare_grid(length,width);
		
	}
	
	 public void creation_of_buttons(int number_of_buttons)
	    {
	    	for (int i = 0 ; i < number_of_buttons;i++)
	    	{
	    		JButton bouton = new JButton("");
	    		bouton.setBackground(Color.WHITE);
	    		bouton.setPreferredSize(new Dimension(50,50));
	    		//bouton.addActionListener(window);
	    		this.grid_buttons.add(bouton);
	    	}
	    }
	 
	 public void add_buttons_to_grid(int number_of_buttons)
	    {
	    	for (int i = 0; i <number_of_buttons; i++)
	    	{
	    		grid_panel.add(grid_buttons.get(i));
	    	}
	    }
	
	public void set_frame_parameter()
	{
		this.window.add(grid_panel);
		this.window.pack();
		this.window.setVisible(true);
	}
	
	public void enabled_button(int button_number)
	{
		grid_buttons.get(button_number).setEnabled(false);
		grid_buttons.get(button_number).setBackground(Color.BLACK);
	}
	
    public static void main(String[] args) 
    {
       	View view = new View();
    	Controler controler = new Controler();
    	Model model = new Model();
    	
    	view.link_view(controler, model);
    	controler.link_controler(view, model);
    	model.link_model(view, controler);
    	
    	view.set_grid_parameters(10,20);
    	view.set_frame_parameter();
    	
    }
}
