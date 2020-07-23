/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diab
 */
import java.awt.CardLayout;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
public class PaymentMethodsAndCheckoutMenu extends javax.swing.JPanel{

    /**
     * Creates new form PaymentMethodsAndCheckoutMenu
     */
    public PaymentMethodsAndCheckoutMenu(CardLayout cards) {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pizzaSizeBG = new javax.swing.ButtonGroup();
        crustOptionsBG = new javax.swing.ButtonGroup();
        beverageSizeBG = new javax.swing.ButtonGroup();
        paymentMethodBG = new javax.swing.ButtonGroup();
        beverageTypeBG = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mediumJRB = new javax.swing.JRadioButton();
        largeJRB = new javax.swing.JRadioButton();
        pepperoniJCB = new javax.swing.JCheckBox();
        sausageJCB = new javax.swing.JCheckBox();
        onionJCB = new javax.swing.JCheckBox();
        mushroomJCB = new javax.swing.JCheckBox();
        pineappleJCB = new javax.swing.JCheckBox();
        olivesJCB = new javax.swing.JCheckBox();
        beefJCB = new javax.swing.JCheckBox();
        extraLargeJRB = new javax.swing.JRadioButton();
        handTossedJRB = new javax.swing.JRadioButton();
        thinCrustJRB = new javax.swing.JRadioButton();
        deepDishJRB = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        smallBevJRB = new javax.swing.JRadioButton();
        mediumBevJRB = new javax.swing.JRadioButton();
        largeBevJRB = new javax.swing.JRadioButton();
        checkoutJB = new javax.swing.JButton();
        hamJCB = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        smallJRB = new javax.swing.JRadioButton();
        cokeJRB = new javax.swing.JRadioButton();
        dietCokeJRB = new javax.swing.JRadioButton();
        orangeJuiceJRB = new javax.swing.JRadioButton();
        spriteJRB = new javax.swing.JRadioButton();
        icedTeaJRB = new javax.swing.JRadioButton();

        jLabel1.setText("Pizza Sizes:");

        jLabel2.setText("Toppings");

        jLabel3.setText("Beverages");

        jLabel4.setText("Crust Options");

        pizzaSizeBG.add(mediumJRB);
        mediumJRB.setText("Medium");
        mediumJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumJRBActionPerformed(evt);
            }
        });

        pizzaSizeBG.add(largeJRB);
        largeJRB.setText("Large");
        largeJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largeJRBActionPerformed(evt);
            }
        });

        pepperoniJCB.setText("Pepperoni");
        pepperoniJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepperoniJCBActionPerformed(evt);
            }
        });

        sausageJCB.setText("Sausage");
        sausageJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sausageJCBActionPerformed(evt);
            }
        });

        onionJCB.setText("Onion");
        onionJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onionJCBActionPerformed(evt);
            }
        });

        mushroomJCB.setText("Mushroom");
        mushroomJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mushroomJCBActionPerformed(evt);
            }
        });

        pineappleJCB.setText("Pineapple");
        pineappleJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pineappleJCBActionPerformed(evt);
            }
        });

        olivesJCB.setText("Olives");
        olivesJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olivesJCBActionPerformed(evt);
            }
        });

        beefJCB.setText("Beef");
        beefJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beefJCBActionPerformed(evt);
            }
        });

        pizzaSizeBG.add(extraLargeJRB);
        extraLargeJRB.setText("Extra Large");
        extraLargeJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraLargeJRBActionPerformed(evt);
            }
        });

        crustOptionsBG.add(handTossedJRB);
        handTossedJRB.setText("Hand Tossed");
        handTossedJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handTossedJRBActionPerformed(evt);
            }
        });

        crustOptionsBG.add(thinCrustJRB);
        thinCrustJRB.setText("Thin Crust");
        thinCrustJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thinCrustJRBActionPerformed(evt);
            }
        });

        crustOptionsBG.add(deepDishJRB);
        deepDishJRB.setText("Deep Dish");
        deepDishJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deepDishJRBActionPerformed(evt);
            }
        });

        jLabel5.setText("Beverage Sizes");

        beverageSizeBG.add(smallBevJRB);
        smallBevJRB.setText("Small");
        smallBevJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallBevJRBActionPerformed(evt);
            }
        });

        beverageSizeBG.add(mediumBevJRB);
        mediumBevJRB.setText("Medium");
        mediumBevJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumBevJRBActionPerformed(evt);
            }
        });

        beverageSizeBG.add(largeBevJRB);
        largeBevJRB.setText("Large");
        largeBevJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largeBevJRBActionPerformed(evt);
            }
        });

        checkoutJB.setText("Add Items");
        checkoutJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutJBActionPerformed(evt);
            }
        });

        hamJCB.setText("Ham");
        hamJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hamJCBActionPerformed(evt);
            }
        });

        jButton1.setText("Back To Menu");

        pizzaSizeBG.add(smallJRB);
        smallJRB.setText("small");
        smallJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallJRBActionPerformed(evt);
            }
        });

        beverageTypeBG.add(cokeJRB);
        cokeJRB.setText("Coke");
        cokeJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeJRBActionPerformed(evt);
            }
        });

        beverageTypeBG.add(dietCokeJRB);
        dietCokeJRB.setText("Diet Coke");
        dietCokeJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietCokeJRBActionPerformed(evt);
            }
        });

        beverageTypeBG.add(orangeJuiceJRB);
        orangeJuiceJRB.setText("Orange Juice");
        orangeJuiceJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeJuiceJRBActionPerformed(evt);
            }
        });

        beverageTypeBG.add(spriteJRB);
        spriteJRB.setText("Sprite");
        spriteJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spriteJRBActionPerformed(evt);
            }
        });

        beverageTypeBG.add(icedTeaJRB);
        icedTeaJRB.setText("Iced Tea");
        icedTeaJRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icedTeaJRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pepperoniJCB)
                                    .addComponent(pineappleJCB))
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(smallJRB)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sausageJCB)
                            .addComponent(hamJCB)
                            .addComponent(mediumJRB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(olivesJCB)
                                .addGap(18, 18, 18)
                                .addComponent(beefJCB))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(onionJCB)
                                .addGap(18, 18, 18)
                                .addComponent(mushroomJCB))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(largeJRB)
                                .addGap(18, 18, 18)
                                .addComponent(extraLargeJRB))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(smallBevJRB)
                        .addGap(18, 18, 18)
                        .addComponent(mediumBevJRB)
                        .addGap(18, 18, 18)
                        .addComponent(largeBevJRB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkoutJB)
                                .addGap(141, 141, 141)
                                .addComponent(jButton1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(handTossedJRB)
                                        .addGap(18, 18, 18)
                                        .addComponent(thinCrustJRB)
                                        .addGap(32, 32, 32)
                                        .addComponent(deepDishJRB))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(103, 103, 103)))
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cokeJRB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dietCokeJRB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spriteJRB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(orangeJuiceJRB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(icedTeaJRB))))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mediumJRB)
                    .addComponent(largeJRB)
                    .addComponent(extraLargeJRB)
                    .addComponent(smallJRB))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pepperoniJCB)
                    .addComponent(sausageJCB)
                    .addComponent(onionJCB)
                    .addComponent(mushroomJCB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(olivesJCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pineappleJCB)
                        .addComponent(hamJCB)
                        .addComponent(beefJCB)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(handTossedJRB)
                    .addComponent(thinCrustJRB)
                    .addComponent(deepDishJRB))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cokeJRB)
                    .addComponent(dietCokeJRB)
                    .addComponent(orangeJuiceJRB)
                    .addComponent(spriteJRB)
                    .addComponent(icedTeaJRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(smallBevJRB)
                    .addComponent(mediumBevJRB)
                    .addComponent(largeBevJRB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkoutJB)
                    .addComponent(jButton1))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutJBActionPerformed

        Drink drinks = new Drink();
        drinks.size = beverageSize;
        drinks.type = beverageType;
        
        Pizza pizza = new Pizza();
        pizza.size = pizzaSize;
        pizza.crust = crustOption;
        pizza.toppings = toppings;
        
        OrderXML.initialize();
        OrderXML.readXML();
        
        OrderXML.items.pizzas.add(pizza);
        OrderXML.items.drinks.add(drinks);
        
        

        OrderXML.saveXML();
    }//GEN-LAST:event_checkoutJBActionPerformed

    private void pepperoniJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepperoniJCBActionPerformed
        if (pepperoniJCB.isSelected())
        {
        toppings.add(pepperoniJCB.getText());
        }
    }//GEN-LAST:event_pepperoniJCBActionPerformed

    private void sausageJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sausageJCBActionPerformed
        if (sausageJCB.isSelected())
        {
        toppings.add(sausageJCB.getText());
        }
    }//GEN-LAST:event_sausageJCBActionPerformed

    private void onionJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onionJCBActionPerformed
        if (onionJCB.isSelected())
        {
        toppings.add(onionJCB.getText());
        }
    }//GEN-LAST:event_onionJCBActionPerformed

    private void mushroomJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mushroomJCBActionPerformed
        if (mushroomJCB.isSelected())
        {
        toppings.add(mushroomJCB.getText());
        }
    }//GEN-LAST:event_mushroomJCBActionPerformed

    private void pineappleJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pineappleJCBActionPerformed
        if (pineappleJCB.isSelected())
        {
        toppings.add(pineappleJCB.getText());
        }
    }//GEN-LAST:event_pineappleJCBActionPerformed

    private void hamJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hamJCBActionPerformed
        if (hamJCB.isSelected())
        {
        toppings.add(hamJCB.getText());
        }
    }//GEN-LAST:event_hamJCBActionPerformed

    private void olivesJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olivesJCBActionPerformed
        if (olivesJCB.isSelected())
        {
        toppings.add(olivesJCB.getText());
        }
    }//GEN-LAST:event_olivesJCBActionPerformed

    private void beefJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beefJCBActionPerformed
        if (beefJCB.isSelected())
        {
        toppings.add(beefJCB.getText());
        }
    }//GEN-LAST:event_beefJCBActionPerformed

    private void smallJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallJRBActionPerformed
        if (smallJRB.isSelected())
        pizzaSize = "Small";
    }//GEN-LAST:event_smallJRBActionPerformed

    private void mediumJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumJRBActionPerformed
        if (mediumJRB.isSelected())
        pizzaSize = "Medium";
    }//GEN-LAST:event_mediumJRBActionPerformed

    private void largeJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largeJRBActionPerformed
        if (largeJRB.isSelected())
        pizzaSize = "Large";
    }//GEN-LAST:event_largeJRBActionPerformed

    private void extraLargeJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraLargeJRBActionPerformed
        if (extraLargeJRB.isSelected())
        pizzaSize = "Extra Large";
    }//GEN-LAST:event_extraLargeJRBActionPerformed

    private void handTossedJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handTossedJRBActionPerformed
        if (handTossedJRB.isSelected())
            crustOption = "Hand Tossed";
    }//GEN-LAST:event_handTossedJRBActionPerformed

    private void thinCrustJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thinCrustJRBActionPerformed
        if (thinCrustJRB.isSelected())
            crustOption = "Thin Crust";
    }//GEN-LAST:event_thinCrustJRBActionPerformed

    private void deepDishJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deepDishJRBActionPerformed
        if (deepDishJRB.isSelected())
            crustOption = "Deep Dish";
    }//GEN-LAST:event_deepDishJRBActionPerformed

    private void cokeJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeJRBActionPerformed
        if (cokeJRB.isSelected())
            beverageType = "Coke";
    }//GEN-LAST:event_cokeJRBActionPerformed

    private void dietCokeJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietCokeJRBActionPerformed
        if (dietCokeJRB.isSelected())
            beverageType = "Diet Coke";
    }//GEN-LAST:event_dietCokeJRBActionPerformed

    private void spriteJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spriteJRBActionPerformed
        if (spriteJRB.isSelected())
            beverageType = "Sprite";
    }//GEN-LAST:event_spriteJRBActionPerformed

    private void orangeJuiceJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeJuiceJRBActionPerformed
        if (orangeJuiceJRB.isSelected())
            beverageType = "Orange Juice";
    }//GEN-LAST:event_orangeJuiceJRBActionPerformed

    private void icedTeaJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icedTeaJRBActionPerformed
        if (icedTeaJRB.isSelected())
            beverageType = "Iced Tea";
    }//GEN-LAST:event_icedTeaJRBActionPerformed

    private void smallBevJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallBevJRBActionPerformed
        if (smallBevJRB.isSelected())
            beverageSize = "Small";
    }//GEN-LAST:event_smallBevJRBActionPerformed

    private void mediumBevJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumBevJRBActionPerformed
        if (mediumBevJRB.isSelected())
            beverageSize = "Medium";
    }//GEN-LAST:event_mediumBevJRBActionPerformed

    private void largeBevJRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largeBevJRBActionPerformed
        if (largeBevJRB.isSelected())
            beverageSize = "Large";
    }//GEN-LAST:event_largeBevJRBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox beefJCB;
    private javax.swing.ButtonGroup beverageSizeBG;
    private javax.swing.ButtonGroup beverageTypeBG;
    private javax.swing.JButton checkoutJB;
    private javax.swing.JRadioButton cokeJRB;
    private javax.swing.ButtonGroup crustOptionsBG;
    private javax.swing.JRadioButton deepDishJRB;
    private javax.swing.JRadioButton dietCokeJRB;
    private javax.swing.JRadioButton extraLargeJRB;
    private javax.swing.JCheckBox hamJCB;
    private javax.swing.JRadioButton handTossedJRB;
    private javax.swing.JRadioButton icedTeaJRB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton largeBevJRB;
    private javax.swing.JRadioButton largeJRB;
    private javax.swing.JRadioButton mediumBevJRB;
    private javax.swing.JRadioButton mediumJRB;
    private javax.swing.JCheckBox mushroomJCB;
    private javax.swing.JCheckBox olivesJCB;
    private javax.swing.JCheckBox onionJCB;
    private javax.swing.JRadioButton orangeJuiceJRB;
    private javax.swing.ButtonGroup paymentMethodBG;
    private javax.swing.JCheckBox pepperoniJCB;
    private javax.swing.JCheckBox pineappleJCB;
    private javax.swing.ButtonGroup pizzaSizeBG;
    private javax.swing.JCheckBox sausageJCB;
    private javax.swing.JRadioButton smallBevJRB;
    private javax.swing.JRadioButton smallJRB;
    private javax.swing.JRadioButton spriteJRB;
    private javax.swing.JRadioButton thinCrustJRB;
    // End of variables declaration//GEN-END:variables
    private String pizzaSize;
    private String crustOption;
    private String beverageSize;
    private String beverageType;
    private ArrayList<String> toppings = new ArrayList<String>();
}