import datastructures.hashmapss;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;

public class ApplestoreFrame implements ActionListener {

	private JFrame frame;
	private JPanel panel;
	private JButton button1;
	private JLabel introlabel;
	private JFrame frame2;
	private JPanel panel2;
	private JLabel promptlabel;
	private JButton iphoneb;
	private JButton Macb;
	private JButton Accessoriesb;
	private JFrame frameiphone;
	private JPanel iphonepanel;
	private JFrame macframe;
	private JPanel macpanel;
	private JLabel maclabel;
	private JTextField iphonesearchf;
	private JTextField macsearch;
	private JLabel iphonecost;
	private JLabel inventory;
	private JLabel maccost;
	private JLabel macinventory;
	private JFrame accessoriesframe;
	private JPanel accessoriespanel;
	private JLabel accessorieslabel;
	private JTextField accessoriessearch;
	private JLabel accessoriescost;
	private JLabel inventoryA;

	hashmapss accessmaps = new hashmapss(); // creating object to access HashMaps
	HashMap<String, Integer> iphonemap = accessmaps.getiphonehash();// accessing HashMap in other class and setting it
																	// to a new HashMap to be used in this class
	HashMap<String, Integer> macmap = accessmaps.getmachashmap();
	HashMap<String, Integer> accessoriesmap = accessmaps.getaccesoriesmap();

	public void Framee() {

		updatearraylength(iphonemap.size());// pass value into iPhone array method to set its size
		updatemacarray(macmap.size());// pass value into Mac array method to set its size

		frame = new JFrame("Apple Store");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setResizable(false);

		introlabel = new JLabel("Welcome to the online AppleStore");
		introlabel.setBounds(60, 50, 300, 50);
		introlabel.setFont(new Font("Arial", Font.BOLD, 18));
		introlabel.setForeground(Color.RED);

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);

		button1 = new JButton("Click here to enter the store.");
		button1.setBounds(100, 150, 200, 50);
		button1.addActionListener(new eventt());
		button1.setForeground(Color.BLUE);

		panel.add(button1);
		panel.add(introlabel);

		frame.add(panel);
		frame.setLocationRelativeTo(null);
		// new jframe:

		frame2 = new JFrame();
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(400, 400);
		frame2.setResizable(false);
		frame2.setLocationRelativeTo(null);
		frame2.setTitle("Apple Store");

		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.BLACK);

		promptlabel = new JLabel("What are you shopping for today?");
		promptlabel.setBounds(65, 50, 260, 50);
		promptlabel.setFont(new Font("Arial", Font.BOLD, 16));
		promptlabel.setForeground(Color.red);

		iphoneb = new JButton("Shop iPhone");
		iphoneb.setBounds(50, 200, 90, 20);
		iphoneb.setForeground(Color.BLUE);
		iphoneb.addActionListener(new eventt());

		Macb = new JButton("Shop Mac");
		Macb.setBounds(150, 200, 90, 20);
		Macb.setForeground(Color.BLUE);
		Macb.addActionListener(new eventt());
		Accessoriesb = new JButton("Shop Accessories");
		Accessoriesb.setBounds(250, 200, 120, 20);
		Accessoriesb.setForeground(Color.BLUE);
		Accessoriesb.addActionListener(new eventt());

		panel2.add(iphoneb);
		panel2.add(Macb);
		panel2.add(Accessoriesb);

		panel2.add(promptlabel);
		frame2.add(panel2);

		// iphone frame:
		frameiphone = new JFrame();
		frameiphone.setSize(400, 400);
		frameiphone.setResizable(false);
		frameiphone.setLocationRelativeTo(null);
		frameiphone.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameiphone.setTitle("Shop iPhone");

		iphonepanel = new JPanel();
		iphonepanel.setLayout(null);
		iphonepanel.setBackground(Color.BLACK);

		JLabel shopiphonelabel = new JLabel(
				"<html>Please enter the iPhone you want to buy below." + "<br/> Example search: 'iPhone 8'</html> ");
		shopiphonelabel.setBounds(50, 100, 350, 40);
		shopiphonelabel.setForeground(Color.red);
		shopiphonelabel.setFont(new Font("Arial", Font.BOLD, 15));

		iphonesearchf = new JTextField("Search iPhone");
		iphonesearchf.setBounds(120, 150, 150, 40);
		iphonesearchf.addActionListener(this);

		iphonepanel.add(iphonesearchf);
		iphonepanel.add(shopiphonelabel);
		frameiphone.add(iphonepanel);

		macframe = new JFrame();
		macframe.setSize(400, 400);
		macframe.setTitle("Shop Mac");
		macframe.setLocationRelativeTo(null);
		macframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		macframe.setResizable(false);

		macpanel = new JPanel();
		macpanel.setLayout(null);
		macpanel.setBackground(Color.BLACK);

		maclabel = new JLabel(
				"<html>Please enter the Mac you want to buy below." + "<br/>Example search: 'iMac' or 'MacBook'");
		maclabel.setForeground(Color.red);
		maclabel.setBounds(50, 100, 350, 40);
		maclabel.setFont(new Font("Arial", Font.BOLD, 15));

		macsearch = new JTextField("Search Mac");
		macsearch.setBounds(150, 150, 100, 40);
		macsearch.addActionListener(this);

		macpanel.add(macsearch);
		macpanel.add(maclabel);
		macframe.add(macpanel);

		iphonecost = new JLabel();
		iphonecost.setBounds(90, 200, 300, 70);
		iphonecost.setFont(new Font("Arial", Font.BOLD, 15));
		iphonecost.setForeground(Color.RED);
		iphonepanel.add(iphonecost);

		inventory = new JLabel();
		inventory.setFont(new Font("Arial", Font.BOLD, 8));
		inventory.setForeground(Color.red);
		inventory.setBounds(5, 200, 400, 70);
		iphonepanel.add(inventory);

		maccost = new JLabel();
		maccost.setBounds(100, 200, 250, 100);
		maccost.setForeground(Color.red);
		maccost.setFont(new Font("Arial", Font.BOLD, 15));
		macpanel.add(maccost);

		macinventory = new JLabel();
		macinventory.setBounds(10, 200, 400, 20);
		macinventory.setFont(new Font("Arial", Font.BOLD, 15));
		macinventory.setForeground(Color.red);
		macpanel.add(macinventory);

		accessoriesframe = new JFrame("Shop Accessories");
		accessoriesframe.setSize(400, 400);
		accessoriesframe.setLocationRelativeTo(null);
		accessoriesframe.setResizable(false);
		accessoriesframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		accessoriespanel = new JPanel();
		accessoriespanel.setLayout(null);
		accessoriespanel.setBackground(Color.BLACK);

		accessorieslabel = new JLabel("<html>Please search for the desired accessory below.<br/> "
				+ " Example Search: 'Earpods' or 'USB-C Charging cable'</html>");
		accessorieslabel.setFont(new Font("Arial", Font.BOLD, 15));
		accessorieslabel.setForeground(Color.RED);
		accessorieslabel.setBounds(70, 50, 300, 100);

		accessoriessearch = new JTextField("Search Accessories");
		accessoriessearch.setBounds(100, 150, 150, 40);
		accessoriessearch.addActionListener(this);

		accessoriescost = new JLabel();
		accessoriescost.setFont(new Font("Arial", Font.BOLD, 15));
		accessoriescost.setForeground(Color.red);
		accessoriescost.setBounds(100, 200, 250, 100);

		inventoryA = new JLabel();
		inventoryA.setFont(new Font("Arial", Font.BOLD, 12));
		inventoryA.setBounds(10, 200, 400, 40);
		inventoryA.setForeground(Color.red);

		accessoriespanel.add(inventoryA);
		accessoriespanel.add(accessoriescost);
		accessoriespanel.add(accessoriessearch);
		accessoriespanel.add(accessorieslabel);
		accessoriesframe.add(accessoriespanel);
		updateaccessoriesarray(accessoriesmap.size());

	}

	String[] wholemap; // creating an array to store all string keys from hashmap for iphones

	public void updatearraylength(int w) {
		wholemap = new String[w];
	}

	String[] wholemacmap;// creating an array to store all string keys from hashmap for macs

	public void updatemacarray(int q) {
		wholemacmap = new String[q];
	}

	String[] wholeaccessoriesmap;

	public void updateaccessoriesarray(int r) {
		wholeaccessoriesmap = new String[r];
	}

	private class eventt implements ActionListener { // type this in and and add action listner method below
														// automatically (access by addActionListener(new eventt))
		@Override
		public void actionPerformed(ActionEvent e) {

			Object source = e.getSource();

			if (source == button1) {
				frame2.setVisible(true);
				frame.dispose();

			} else if (source == iphoneb) {
				frameiphone.setVisible(true);
				frame2.dispose();

			} else if (source == Macb) {
				macframe.setVisible(true);
				frame2.dispose();

			} else if (source == Accessoriesb) {
				accessoriesframe.setVisible(true);
				frame2.dispose();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) { // adds this method when u write implements action listener on class
													// name(access by addActionListener(this))

		Object source = e.getSource();

		if (source == iphonesearchf) {
			String useriphonesearch = iphonesearchf.getText();

			int counter = 0;
			String inventorytext = null;
			String finalinventorytext = null;
			for (String i : iphonemap.keySet()) { // make wholemaparray for iphone store all keys then make it a string
				wholemap[counter] = i;
				inventorytext = Arrays.toString(wholemap);
				String r1 = inventorytext.replace("[", "");
				finalinventorytext = r1.replace("]", "");
				counter++;
			}
			if (useriphonesearch.equals("inventory")) {// set inventory label text if user types inventory using string
														// from above
				inventory.setText(finalinventorytext);
				iphonecost.setText("");
			}
			if (iphonemap.containsKey(useriphonesearch)) {// if usersearch is in hashmap then set label iphonecost to
															// display price
				iphonecost.setText("An " + useriphonesearch + " costs $" + iphonemap.get(useriphonesearch));
				inventory.setText("");
			} else if (!useriphonesearch.equals("inventory")) {
				iphonecost.setText("<html>Sorry we do not have an " + useriphonesearch + ". If you would like to see"
						+ " our inventory of iPhones,<br/> Search 'inventory'</html>");
				inventory.setText("");
			}
		} else if (source == macsearch) {

			String usermacsearch = macsearch.getText();
			int counter2 = 0;
			String macmapstring = null;
			for (String i : macmap.keySet()) {// make wholemaparray for mac store all keys then make it a string
				wholemacmap[counter2] = i;
				counter2++;
				macmapstring = Arrays.toString(wholemacmap).replace("[", "").replace("]", "");
			}
			if (usermacsearch.equals("Mac inventory")) {// set macinventory label text if user types inventory using
														// string from above
				macinventory.setText(macmapstring);
				maccost.setText("");
			}
			if (macmap.containsKey(usermacsearch)) {// if usersearch is in hashmap then set label maccost to display
													// price
				maccost.setText("A " + usermacsearch + " costs $" + macmap.get(usermacsearch));
				macinventory.setText("");
			} else if (!usermacsearch.equals("Mac inventory")) {
				maccost.setText(
						"<html>Sorry we do not have a " + usermacsearch + ".<br/> If you would like to see our Mac "
								+ "inventory please search: 'Mac inventory'</html>");
				macinventory.setText("");
			}
		} else if (source == accessoriessearch) {
			String usersearchaccessories = accessoriessearch.getText();
			int counter3 = 0;
			String accessoriesmapstring = null;
			for (String i : accessoriesmap.keySet()) {
				wholeaccessoriesmap[counter3] = i;
				counter3++;
				accessoriesmapstring = Arrays.toString(wholeaccessoriesmap).replace("[", "").replace("]", "");
			}

			if (accessoriesmap.containsKey(usersearchaccessories)) {
				accessoriescost.setText(usersearchaccessories + " costs $" + accessoriesmap.get(usersearchaccessories));
				inventoryA.setText("");
			} else if (!usersearchaccessories.equals("Accessories inventory")) {
				accessoriescost.setText("<html>Sorry we do not have " + usersearchaccessories + ".</br> "
						+ "If your would like to see the accessories inventory, please search 'Accessories inventory'</html>");
				inventoryA.setText("");
			} else if (usersearchaccessories.equals("Accessories inventory")) {
				inventoryA.setText(accessoriesmapstring);
				accessoriescost.setText("");
			}
		}
	}
}