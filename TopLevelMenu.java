import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
public class TopLevelMenu extends javax.swing.JPanel {

	JPanel mainPanel;
    JPanel topLevelPanel;
    Checkout cart;
	/**
     * Creates new form TopLevelMenuFrame
     */
    public TopLevelMenu(JPanel mainPanel, Checkout cart) {
        this.mainPanel = mainPanel;
        this.cart = cart;
        topLevelPanel = new JPanel(mainPanel.getLayout());
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        createOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        openCart = new javax.swing.JButton();
        openAccountInfo = new javax.swing.JButton();



        createOrder.setText("Create Order");
        createOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOrderActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu");

        openCart.setText("Cart");
        openCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openCartActionPerformed(evt);
            }
        });

        openAccountInfo.setText("Account Info");
        openAccountInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openAccountInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(createOrder)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(openCart)
                        .addGap(42, 42, 42)
                        .addComponent(openAccountInfo))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createOrder)
                    .addComponent(openCart)
                    .addComponent(openAccountInfo))
                .addContainerGap(223, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void createOrderActionPerformed(java.awt.event.ActionEvent evt) {                                            
        ((CardLayout)mainPanel.getLayout()).show(mainPanel, "Checkout");
    }                                           

    private void openCartActionPerformed(java.awt.event.ActionEvent evt) {  
        this.cart.populateTextbox();                                       
        ((CardLayout)mainPanel.getLayout()).show(mainPanel, "Cart");
    }                                        

    private void openAccountInfoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        //new AccountInfo(cardLayout).setVisible(true);
        ((CardLayout)mainPanel.getLayout()).show(mainPanel, "AccountInfo");
    }                                               


    // Variables declaration - do not modify                     
    private javax.swing.JButton createOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton openAccountInfo;
    private javax.swing.JButton openCart;
    // End of variables declaration
}