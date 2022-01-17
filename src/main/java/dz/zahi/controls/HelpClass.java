package dz.zahi.controls;

import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Rectangle;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;

/**
 *
 */
/**
 * @author acer
 *
 */
public class HelpClass extends JDialog {

    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;
    private JPanel jPanel = null;
    private JScrollPane jScrollPane = null;
    private JTable jTable = null;
    private JLabel jLabel = null;

    /**
     * @param owner
     */
    public HelpClass(Frame owner) {
        super(owner);
        initialize();
    }

    /**
     * This method initializes this
     *
     * @return void
     */
    private void initialize() {
        this.setSize(317, 393);
        this.setTitle("Help");
        this.setContentPane(getJContentPane());
    }

    /**
     * This method initializes jContentPane
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jLabel = new JLabel();
            jLabel.setBounds(new Rectangle(51, 6, 189, 36));
            jLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
            jLabel.setText("Liste de Wilayas d'Algérie");
            jContentPane = new JPanel();
            jContentPane.setLayout(null);
            jContentPane.add(getJPanel(), null);
            jContentPane.add(jLabel, null);
        }
        return jContentPane;
    }

    /**
     * This method initializes jPanel
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJPanel() {
        if (jPanel == null) {
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.fill = GridBagConstraints.BOTH;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.gridx = 0;
            jPanel = new JPanel();
            jPanel.setLayout(new GridBagLayout());
            jPanel.setBounds(new Rectangle(25, 49, 251, 275));
            jPanel.add(getJScrollPane(), gridBagConstraints);
        }
        return jPanel;
    }

    /**
     * This method initializes jScrollPane
     *
     * @return javax.swing.JScrollPane
     */
    private JScrollPane getJScrollPane() {
        if (jScrollPane == null) {
            jScrollPane = new JScrollPane();
            jScrollPane.setViewportView(getJTable());
        }
        return jScrollPane;
    }

    /**
     * This method initializes jTable
     *
     * @return javax.swing.JTable
     */
    private JTable getJTable() {
        if (jTable == null) {
            String[] tab1 = {"code de la wilaya", "wilaya"};

            String[][] tab2 = {{"01", "Adrar"}, {"02", "Chlef"}, {"03", "Laghouat"}, {"04", "Oum El Bouaghi"}, {"05", "Batna"}, {"06", "Béjaia"}, {"07", "Biskra"}, {"08", "Béchar"},
            {"09", "Blida"}, {"10", "Bouira"}, {"11", "Tamanrasset"}, {"12", "Tébessa"}, {"13", "Tlemcen"}, {"14", "Tiaret"}, {"15", "Tizi Ouzou"}, {"16", "Alger"},
            {"17", "Djelfa"}, {"18", "Jijel"}, {"19", "Sétif"}, {"20", "Saida"}, {"21", "Skikda"}, {"22", "Sidi Bel Abbès"}, {"23", "Annaba"}, {"24", "Guelma"},
            {"25", "Constantine"}, {"26", "Média"}, {"27", "Mostaganem"}, {"28", "MSila"}, {"29", "Mascara"}, {"30", "Ouargla"}, {"31", "Oran"}, {"32", "El Bayadh"},
            {"33", "Illizi"}, {"34", "Bordj Bou Arreridj"}, {"35", "Boumerdès"}, {"36", "El Tarf"}, {"37", "Tindouf"}, {"38", "Tissemsilt"},
            {"39", "El Oued"}, {"40", "Khenchela"}, {"41", "Souk Ahras"}, {"42", "Tipaza"}, {"43", "Mila"}, {"44", "Ain Defla"}, {"45", "Naama"}, {"46", "Ain Témouchent"},
            {"47", "Ghardaia"}, {"48", "Relizane"}};
            jTable = new JTable(tab2, tab1);
            jTable.setRowHeight(20);
        }
        return jTable;
    }

}
