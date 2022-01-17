package dz.zahi.controls;

import dz.zahi.utils.Fichier;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Point;
import java.awt.Dimension;

/**
 *
 */
/**
 * @author acer
 *
 */
public class FenCommune extends JPanel {

    private static final long serialVersionUID = 1L;
    private JLabel jLabel = null;
    private JList jList = null;
    private JScrollPane jScrollPane = null;

    /**
     * This is the default constructor
     *
     * @throws IOException
     * @throws NumberFormatException
     */
    public FenCommune() throws NumberFormatException, IOException {
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
        jLabel.setBackground(Color.white);
        jLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jLabel.setForeground(new Color(0, 51, 51));
        jLabel.setBounds(new Rectangle(150, 29, 475, 48));

        jLabel.setText("Les communes de la wilaya de :" + Fichier.getInformation("/informations/Noms_Wil.txt", Integer.parseInt(FenPrincipale.getCodeText().getText())));
        this.setSize(750, 552);
        this.setLayout(null);
        this.add(jLabel, null);
        this.add(getJScrollPane(), null);
        this.setBackground(Color.white);
        this.setForeground(new Color(0, 102, 0));
    }

    /**
     * This method initializes jList
     *
     * @return javax.swing.JList
     */
    private JList getJList() {
        if (jList == null) {

            try {
                Vector<String> tab = new Vector<String>();
                tab = Fichier.getInformations("/communes/" + Integer.parseInt(FenPrincipale.getCodeText().getText()) + ".txt");
                jList = new JList(tab);
                jList.setFont(new Font("Times New Roman", Font.BOLD, 14));

            } catch (NumberFormatException | IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return jList;
    }

    /**
     * This method initializes jScrollPane
     *
     * @return javax.swing.JScrollPane
     */
    private JScrollPane getJScrollPane() {
        if (jScrollPane == null) {
            jScrollPane = new JScrollPane();
            jScrollPane.setBackground(Color.white);
            jScrollPane.setForeground(new Color(0, 102, 0));
            jScrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            jScrollPane.setLocation(new Point(100, 80));
            jScrollPane.setSize(new Dimension(432, 345));
            jScrollPane.setBorder(null);
            jScrollPane.setViewportView(getJList());
        }
        return jScrollPane;
    }

    /**
     * This method initializes jTable
     *
     * @return javax.swing.JTable
     */
}  //  @jve:decl-index=0:visual-constraint="10,10"
