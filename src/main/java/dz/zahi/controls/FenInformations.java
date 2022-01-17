package dz.zahi.controls;

import dz.zahi.utils.Fichier;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.Rectangle;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 */
/**
 * @author acer
 *
 */
public class FenInformations extends JPanel {

    private static final long serialVersionUID = 1L;
    private JLabel jLabel = null;
    private JPanel jPanel = null;
    private Label codewilaya = null;
    private Label nomwilaya = null;
    private Label superficie = null;
    private Label distance_Alg = null;
    private Label Nbr_habitant = null;
    private Label Nbr_masculin = null;
    private Label Nbr_fiminin = null;
    private Label Nbr_daira = null;
    private Label Nbr_commune = null;
    private Label Nom_wali = null;
    private Label Indicatif_Tel = null;
    private Label label = null;
    private Label label1 = null;
    private Label label2 = null;
    private Label label3 = null;
    private Label label4 = null;
    private Label label5 = null;
    private Label label6 = null;
    private Label label7 = null;
    private Label label8 = null;
    private Label label9 = null;
    private Label label10 = null;
    private JPanel jPanel1 = null;
    private JPanel jPanel2 = null;

    /**
     * This is the default constructor
     *
     * @throws IOException
     * @throws NumberFormatException
     * @throws HeadlessException
     */
    public FenInformations() throws HeadlessException, NumberFormatException, IOException {
        super();
        initialize();
    }

    /**
     * This method initializes this
     *
     * @return void
     * @throws IOException
     * @throws NumberFormatException
     * @throws HeadlessException
     */
    private void initialize() throws HeadlessException, NumberFormatException, IOException {

        jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon(getClass().getResource("/Images/infoWilaya/" + Integer.parseInt(FenPrincipale.getCodeText().getText()) + ".jpg")));
        jLabel.setBounds(new Rectangle(380, 8, 305, 360));
        this.setSize(750, 552);
        this.setLayout(null);
        this.setBackground(Color.white);
        this.add(getJPanel(), null);
    }

    /**
     * This method initializes jPanel
     *
     * @return javax.swing.JPanel
     * @throws IOException
     * @throws NumberFormatException
     * @throws HeadlessException
     */
    private JPanel getJPanel() throws HeadlessException, NumberFormatException, IOException {
        if (jPanel == null) {
            label10 = new Label();
            label10.setText(Fichier.getInformation("/informations/Indicatif_Tel.txt", Integer.parseInt(FenPrincipale.getCodeText().getText())));
            label10.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            label10.setBackground(Color.white);
            label10.setForeground(new Color(0, 102, 0));

            label9 = new Label();
            label9.setText(Fichier.getInformation("/informations/Walis.txt", Integer.parseInt(FenPrincipale.getCodeText().getText())));
            label9.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            label9.setBackground(Color.white);
            label9.setForeground(new Color(0, 102, 0));

            label8 = new Label();
            label8.setText(Fichier.getInformation("/informations/Nb_commune.txt", Integer.parseInt(FenPrincipale.getCodeText().getText())));
            label8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            label8.setBackground(Color.white);
            label8.setForeground(new Color(0, 102, 0));

            label7 = new Label();
            label7.setText(Fichier.getInformation("/informations/Nb_Daira.txt", Integer.parseInt(FenPrincipale.getCodeText().getText())));
            label7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            label7.setBackground(Color.white);
            label7.setForeground(new Color(0, 102, 0));

            label6 = new Label();
            label6.setText(Fichier.getInformation("/informations/PopulationFeminin.txt", Integer.parseInt(FenPrincipale.getCodeText().getText())));
            label6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            label6.setBackground(Color.white);
            label6.setForeground(new Color(0, 102, 0));

            label5 = new Label();
            label5.setText(Fichier.getInformation("/informations/PopulationMasculin.txt", Integer.parseInt(FenPrincipale.getCodeText().getText())));
            label5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            label5.setBackground(Color.white);
            label5.setForeground(new Color(0, 102, 0));

            label4 = new Label();
            label4.setText(Fichier.getInformation("/informations/Nbr_Habitant.txt", Integer.parseInt(FenPrincipale.getCodeText().getText())));
            label4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            label4.setBackground(Color.white);
            label4.setForeground(new Color(0, 102, 0));

            label3 = new Label();
            label3.setText(Fichier.getInformation("/informations/Distance_Alg.txt", Integer.parseInt(FenPrincipale.getCodeText().getText())) + " Km");
            label3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            label3.setBackground(Color.white);
            label3.setForeground(new Color(0, 102, 0));

            label2 = new Label();
            label2.setText(Fichier.getInformation("/informations/Superficie.txt", Integer.parseInt(FenPrincipale.getCodeText().getText())) + " Km^2");
            label2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            label2.setBackground(Color.white);
            label2.setForeground(new Color(0, 102, 0));

            label1 = new Label();
            label1.setText(Fichier.getInformation("/informations/Noms_Wil.txt", Integer.parseInt(FenPrincipale.getCodeText().getText())));
            label1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            label1.setBackground(Color.white);
            label1.setForeground(new Color(0, 102, 0));

            label = new Label(FenPrincipale.getCodeText().getText());
            label.setForeground(new Color(0, 102, 0));
            label.setBackground(Color.white);
            label.setFont(new Font("Times New Roman", Font.PLAIN, 14));

            Indicatif_Tel = new Label();
            Indicatif_Tel.setFont(new Font("Times New Roman", Font.BOLD, 14));
            Indicatif_Tel.setForeground(new Color(0, 51, 102));
            Indicatif_Tel.setBackground(Color.white);
            Indicatif_Tel.setText("Indécatif de téléphone :");
            Nom_wali = new Label();
            Nom_wali.setFont(new Font("Times New Roman", Font.BOLD, 14));
            Nom_wali.setForeground(new Color(0, 51, 102));
            Nom_wali.setBackground(Color.white);
            Nom_wali.setText("Nom de wali :");
            Nbr_commune = new Label();
            Nbr_commune.setFont(new Font("Times New Roman", Font.BOLD, 14));
            Nbr_commune.setForeground(new Color(0, 51, 102));
            Nbr_commune.setBackground(Color.white);
            Nbr_commune.setText("Nombre de communes :");
            Nbr_daira = new Label();
            Nbr_daira.setFont(new Font("Times New Roman", Font.BOLD, 14));
            Nbr_daira.setForeground(new Color(0, 51, 102));
            Nbr_daira.setBackground(Color.white);
            Nbr_daira.setText("Nombre de dairas :");
            Nbr_fiminin = new Label();
            Nbr_fiminin.setFont(new Font("Times New Roman", Font.BOLD, 14));
            Nbr_fiminin.setForeground(new Color(0, 51, 102));
            Nbr_fiminin.setBackground(Color.white);
            Nbr_fiminin.setText("Nombre de féminins :");
            Nbr_masculin = new Label();
            Nbr_masculin.setFont(new Font("Times New Roman", Font.BOLD, 14));
            Nbr_masculin.setForeground(new Color(0, 51, 102));
            Nbr_masculin.setBackground(Color.white);
            Nbr_masculin.setText("Nombre de masculins :");
            Nbr_habitant = new Label();
            Nbr_habitant.setFont(new Font("Times New Roman", Font.BOLD, 14));
            Nbr_habitant.setForeground(new Color(0, 51, 102));
            Nbr_habitant.setBackground(Color.white);
            Nbr_habitant.setText("Nombre d'habitants :");
            distance_Alg = new Label();
            distance_Alg.setFont(new Font("Times New Roman", Font.BOLD, 14));
            distance_Alg.setForeground(new Color(0, 51, 102));
            distance_Alg.setBackground(Color.white);
            distance_Alg.setText("distance de la capital :");
            superficie = new Label();
            superficie.setFont(new Font("Times New Roman", Font.BOLD, 14));
            superficie.setForeground(new Color(0, 51, 102));
            superficie.setBackground(Color.white);
            superficie.setText("Superficie :");
            nomwilaya = new Label();
            nomwilaya.setFont(new Font("Times New Roman", Font.BOLD, 14));
            nomwilaya.setForeground(new Color(0, 51, 102));
            nomwilaya.setBackground(Color.white);
            nomwilaya.setText("Nom de la wilaya :");
            codewilaya = new Label();
            codewilaya.setFont(new Font("Times New Roman", Font.BOLD, 14));
            codewilaya.setForeground(new Color(0, 51, 102));
            codewilaya.setBackground(Color.white);
            codewilaya.setText("Code de la wilaya :");
            jPanel = new JPanel();
            jPanel.setLayout(null);
            jPanel.setBounds(new Rectangle(20, 18, 707, 511));
            jPanel.setBackground(Color.white);
            jPanel.add(jLabel, null);
            jPanel.add(getJPanel1(), null);
            jPanel.add(getJPanel2(), null);
        }
        return jPanel;
    }

    /**
     * This method initializes jPanel1
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJPanel1() {
        if (jPanel1 == null) {
            jPanel1 = new JPanel();
            jPanel1.setLayout(new BoxLayout(getJPanel1(), BoxLayout.Y_AXIS));
            jPanel1.setBounds(new Rectangle(166, 11, 202, 403));
            jPanel1.setBackground(Color.white);
            jPanel1.add(label, null);
            jPanel1.add(label1, null);
            jPanel1.add(label2, null);
            jPanel1.add(label3, null);
            jPanel1.add(label4, null);
            jPanel1.add(label5, null);
            jPanel1.add(label6, null);
            jPanel1.add(label7, null);
            jPanel1.add(label8, null);
            jPanel1.add(label9, null);
            jPanel1.add(label10, null);
        }
        return jPanel1;
    }

    /**
     * This method initializes jPanel2
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJPanel2() {
        if (jPanel2 == null) {
            jPanel2 = new JPanel();
            jPanel2.setLayout(new BoxLayout(getJPanel2(), BoxLayout.Y_AXIS));
            jPanel2.setBounds(new Rectangle(2, 11, 160, 400));
            jPanel2.setBackground(Color.white);
            jPanel2.add(codewilaya, null);
            jPanel2.add(nomwilaya, null);
            jPanel2.add(superficie, null);
            jPanel2.add(distance_Alg, null);
            jPanel2.add(Nbr_habitant, null);
            jPanel2.add(Nbr_masculin, null);
            jPanel2.add(Nbr_fiminin, null);
            jPanel2.add(Nbr_daira, null);
            jPanel2.add(Nbr_commune, null);
            jPanel2.add(Nom_wali, null);
            jPanel2.add(Indicatif_Tel, null);
        }
        return jPanel2;
    }

}  //  @jve:decl-index=0:visual-constraint="10,10"
