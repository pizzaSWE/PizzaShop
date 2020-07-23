import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

	public class PizzaShop extends JFrame{
	  
	   JPanel mainPanel;
	   JPanel acctinfo;
	   JPanel checkout;
	   // JPanel paymentMethodPage = new ...
	   // JPanel ....
	   // ....

	   public PizzaShop()
	   {
	       setTitle("Mom and Pop");
	       setSize(800, 600);

			// setup cards
			mainPanel = new JPanel(new CardLayout());
			acctinfo = new AccountInfo((CardLayout) mainPanel.getLayout());
			checkout = new PaymentMethodsAndCheckoutMenu((CardLayout) mainPanel.getLayout());

			mainPanel.add(acctinfo, "AccountInfo");
			mainPanel.add(checkout, "Checkout");

			//((CardLayout)mainPanel.getLayout()).show(mainPanel, "AccountInfo");
			((CardLayout)mainPanel.getLayout()).show(mainPanel, "Checkout");

			this.add(mainPanel);


	       setVisible(true);
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }

	   

	   public static void main(String[] args)
	   {
	       new PizzaShop();
	   }
}
