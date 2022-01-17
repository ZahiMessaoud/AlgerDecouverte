package dz.zahi.controls;

import dz.zahi.utils.Distance;
import dz.zahi.utils.Fichier;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 */
/**
 * @author acer
 *
 */
public class FenDistance extends JPanel {

    private static final long serialVersionUID = 1L;
    private JScrollPane jScrollPane = null;
    private JTable jTable1 = null;
    private JLabel jLabel = null;

    /**
     * This is the default constructor
     *
     * @throws IOException
     * @throws NumberFormatException
     */
    public FenDistance() throws NumberFormatException, IOException {
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
        jLabel = new JLabel();
        jLabel.setText("La distance entre la wilaya de " + Fichier.getInformation("/informations/Noms_Wil.txt", Integer.parseInt(FenPrincipale.getCodeText().getText()))
                + " et les autres wilayas:");
        jLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jLabel.setForeground(new Color(0, 51, 51));
        jLabel.setBounds(new Rectangle(100, 30, 596, 48));
        this.setSize(750, 552);
        this.setLayout(null);
        //this.add(getJTable(), null);
        this.add(getJScrollPane(), null);
        this.setBackground(Color.white);
        this.setForeground(new Color(0, 102, 0));
        this.add(jLabel, null);

    }

    /**
     * This method initializes jScrollPane
     *
     * @return javax.swing.JScrollPane
     */
    private JScrollPane getJScrollPane() {
        if (jScrollPane == null) {
            jScrollPane = new JScrollPane();
            jScrollPane.setBounds(new Rectangle(100, 96, 498, 350));
            jScrollPane.setBackground(Color.white);
            jScrollPane.setViewportView(getJTable1());
            jScrollPane.setForeground(new Color(0, 102, 0));

        }
        return jScrollPane;
    }

    /**
     * This method initializes jTable1
     *
     * @return javax.swing.JTable
     */
    private JTable getJTable1() {
        if (jTable1 == null) {
            String[] tab = {"Wilaya", "Distance"};
            jTable1 = new JTable(Distance.getDistance(Integer.parseInt(FenPrincipale.getCodeText().getText())), tab);
            jTable1.setRowHeight(35);
            jTable1.setFont(new Font("Times New Roman", Font.BOLD, 14));
            jTable1.setRowSelectionAllowed(true);
            jTable1.setSelectionForeground(Color.white);
            jTable1.setForeground(Color.black);
            jTable1.setEnabled(true);
            jTable1.setSelectionBackground(SystemColor.activeCaption);
            jTable1.setGridColor(Color.white);
        }
        return jTable1;
    }

}  //  @jve:decl-index=0:visual-constraint="10,10"
