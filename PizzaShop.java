import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

	public class PizzaShop extends JFrame{
	  
	   JPanel mainPanel;
	   JPanel acctinfo;
	   JPanel checkout;
	   JPanel topLevelMenu;
	   JPanel cart;
	   // JPanel paymentMethodPage = new ...
	   // JPanel ....
	   // ....

	   public PizzaShop()
	   {
	       setTitle("Mom and Pop Pizza Shop");
	       setSize(800, 600);

			// setup cards
			mainPanel = new JPanel(new CardLayout());
			cart = new Checkout(mainPanel);
			topLevelMenu = new TopLevelMenu(mainPanel, (Checkout)cart);
			acctinfo = new AccountInfo(mainPanel);
			checkout = new PaymentMethodsAndCheckoutMenu(mainPanel);

			mainPanel.add(acctinfo, "AccountInfo");
			mainPanel.add(checkout, "Checkout");
			mainPanel.add(topLevelMenu, "TopLevelMenu");
			mainPanel.add(cart, "Cart");

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
