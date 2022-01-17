package dz.zahi.controls;

import dz.zahi.utils.Fichier;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author acer
 *
 */
public class FenImages extends JPanel {

    private static final long serialVersionUID = 1L;
    private JButton jButton = null;
    private JButton jButton1 = null;
    private Vector<String> tab = Fichier.listeRepertoire(new File(getClass().getResource("/Images/ImagesWilayas/"
            + Integer.parseInt(FenPrincipale.getCodeText().getText())).getPath()), ".jpg");  //  @jve:decl-index=0:
    private int i = 0;
    private JLabel jLabel = null;
    private JLabel jLabel1 = null;
    private Panel panel = null;
    private Panel panel1 = null;

    /**
     * This is the default constructor
     *
     * @throws IOException
     * @throws NumberFormatException
     */
    public FenImages() throws NumberFormatException, IOException {
        super();
        initialize();
    }

    /**
     * This method initializes this
     *
     * @return void
     * @throws IOException
     * @throws NumberFormatException
     */
    private void initialize() throws NumberFormatException, IOException {

        jLabel1 = new JLabel();
        jLabel1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jLabel1.setForeground(new Color(0, 51, 51));
        jLabel1.setBounds(new Rectangle(165, 29, 400, 48));

        jLabel1.setText("Des images de la wilaya de:" + Fichier.getInformation("/informations/Noms_Wil.txt", Integer.parseInt(FenPrincipale.getCodeText().getText())));
        jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon(tab.elementAt(i)));
        this.setSize(750, 552);
        this.setLayout(null);
        this.add(getJButton(), null);
        this.add(getJButton1(), null);
        this.add(jLabel1, null);
        this.setBackground(Color.white);
        this.setForeground(new Color(0, 102, 0));
        this.add(getPanel1(), null);
    }

    /**
     * This method initializes jButton
     *
     * @return javax.swing.JButton
     */
    private JButton getJButton() {
        if (jButton == null) {
            jButton = new JButton();
            jButton.setIcon(new ImageIcon(getClass().getResource("/Images/previous.png")));
            jButton.setBounds(new Rectangle(226, 351, 86, 50));
            jButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    // TODO Auto-generated Event stub actionPerformed()
                    if (i > 0) {
                        i--;
                    } else {
                        i = tab.size() - 1;
                    }
                    updateLabel();

                }
            });
        }
        return jButton;
    }

    /**
     * This method initializes jButton1
     *
     * @return javax.swing.JButton
     */
    private JButton getJButton1() {
        if (jButton1 == null) {
            jButton1 = new JButton();
            jButton1.setBounds(new Rectangle(320, 351, 86, 50));
            jButton1.setIcon(new ImageIcon(getClass().getResource("/Images/next.png")));
            jButton1.addActionListener((java.awt.event.ActionEvent e) -> {
                
                if (i < tab.size() - 1) {
                    i++;
                } else {
                    i = 0;
                }
                
                updateLabel();
            });

        }
        return jButton1;
    }

    //Renders the selected image
    protected void updateLabel() {
        ImageIcon icon = new ImageIcon(tab.elementAt(i));
        jLabel.setIcon(icon);
        if (icon != null) {
            jLabel.setText(null);
        }
    }

    /**
     * This method initializes panel
     *
     * @return java.awt.Panel
     */
    private Panel getPanel() {
        if (panel == null) {
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            panel = new Panel();
            panel.setLayout(new GridBagLayout());
            panel.setBounds(new Rectangle(12, 16, 326, 219));
            panel.add(jLabel, gridBagConstraints);
        }
        return panel;
    }

    /**
     * This method initializes panel1
     *
     * @return java.awt.Panel
     */
    private Panel getPanel1() {
        if (panel1 == null) {
            panel1 = new Panel();
            panel1.setLayout(null);
            panel1.setBounds(new Rectangle(150, 96, 352, 248));
            panel1.setForeground(Color.white);
            panel1.add(getPanel(), null);
            panel1.setBackground(Color.white);
            panel1.setForeground(new Color(0, 102, 0));
        }
        return panel1;
    }

}  
