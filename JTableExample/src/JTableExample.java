import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class JTableExample extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JButton btnRegistrar;
	static JTable table;
	static JScrollPane scrollPane;
	static Container c;
	static JTableExample v;
//	
public JTableExample(){
		
		super("Example Table");
		c= getContentPane();
		setLayout(new FlowLayout());
		
		btnRegistrar = new JButton("See Table");
		btnRegistrar.addActionListener(this);
		
		//table
		String[] columnas = {"Name", "Nickname","Age"};
		Object[][] datos= {
				
				 {"Daniel G. Machado","Dan","33"},
				 {"jorge2","giraldo2","21"},
				 {"jorge3","giraldo3","22"},
				 {"Bárbara Gomes Machado","Bah","23"}
		 };
		
		table = new JTable(datos,columnas);
		scrollPane = new JScrollPane(table);
		scrollPane.setVisible(false);
		table.setPreferredScrollableViewportSize(new Dimension(300,150));
		// table
		
		c.add(btnRegistrar);
		c.add(scrollPane);
		
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}//constructor

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		v = new JTableExample();
		v.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource().equals(btnRegistrar)){
			
			scrollPane.setVisible(true);
			v.validate();
			
			
		}
		
	}

}
