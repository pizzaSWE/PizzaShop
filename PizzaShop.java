import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

	public class PizzaShop extends JFrame{
	  
	   JPanel mainPanel;
	   JPanel acctinfo;
	   JPanel checkout;
	   JPanel topLevelMenu;
	   // JPanel paymentMethodPage = new ...
	   // JPanel ....
	   // ....

	   public PizzaShop()
	   {
	       setTitle("Mom and Pop Pizza Shop");
	       setSize(800, 600);

			// setup cards
			mainPanel = new JPanel(new CardLayout());
			topLevelMenu = new TopLevelMenu((CardLayout) mainPanel.getLayout());
			acctinfo = new AccountInfo((CardLayout) mainPanel.getLayout());
			checkout = new PaymentMethodsAndCheckoutMenu((CardLayout) mainPanel.getLayout());

			mainPanel.add(acctinfo, "AccountInfo");
			mainPanel.add(checkout, "Checkout");
			mainPanel.add(topLevelMenu, "TopLevelMenu");

			((CardLayout)mainPanel.getLayout()).show(mainPanel, "TopLevelMenu");
			//((CardLayout)mainPanel.getLayout()).show(mainPanel, "AccountInfo");
			//((CardLayout)mainPanel.getLayout()).show(mainPanel, "Checkout");
			

			this.add(mainPanel);


	       setVisible(true);
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }

	   

	   public static void main(String[] args)
	   {
	       new PizzaShop();
	   }
}
