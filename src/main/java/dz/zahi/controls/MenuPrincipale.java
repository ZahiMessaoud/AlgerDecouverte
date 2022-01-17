package dz.zahi.controls;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.DefaultSingleSelectionModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.plaf.metal.MetalTabbedPaneUI;

/**
 *
 */
/**
 * @author acer
 *
 */
public class MenuPrincipale extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;
    private JMenuBar jJMenuBar = null;
    private JMenu jMenu = null;
    private JMenu jMenu1 = null;
    private JLabel jLabel = null;
    private JTabbedPane onglet = null;
    private JMenuItem jMenuItem = null;
    private JMenuItem jMenuItem1 = null;

    /**
     * This is the default constructor
     *
     * @throws IOException
     * @throws NumberFormatException
     * @throws HeadlessException
     */
    public MenuPrincipale() throws HeadlessException, NumberFormatException, IOException {
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
        this.setSize(900, 725);
        this.setJMenuBar(getJJMenuBar());
        this.setLocationRelativeTo(null);
        this.setContentPane(getJContentPane());
        this.setTitle("AlgerieDecouverte");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/iconAlger.png")));
        this.setResizable(false);
    }

    /**
     * This method initializes jContentPane
     *
     * @return javax.swing.JPanel
     * @throws IOException
     * @throws NumberFormatException
     * @throws HeadlessException
     */
    private JPanel getJContentPane() throws HeadlessException, NumberFormatException, IOException {
        if (jContentPane == null) {
            jLabel = new JLabel(new ImageIcon(getClass().getResource("/Images/imageFond1.jpg")));
            jLabel.setBounds(new Rectangle(2, 2, 882, 177));
            jLabel.setText("");
            jContentPane = new JPanel();
            jContentPane.setLayout(null);
            jContentPane.add(jLabel, null);
            jContentPane.add(getOnglet(), null);
        }
        return jContentPane;
    }

    /**
     * This method initializes jJMenuBar
     *
     * @return javax.swing.JMenuBar
     */
    private JMenuBar getJJMenuBar() {
        if (jJMenuBar == null) {
            jJMenuBar = new JMenuBar();
            jJMenuBar.add(getJMenu());
            jJMenuBar.add(getJMenu1());
        }
        return jJMenuBar;
    }

    /**
     * This method initializes jMenu
     *
     * @return javax.swing.JMenu
     */
    private JMenu getJMenu() {
        if (jMenu == null) {
            jMenu = new JMenu();
            jMenu.setText("Fichier");
            jMenu.add(getJMenuItem());
            jMenu.add(getJMenuItem1());
        }
        return jMenu;
    }

    /**
     * This method initializes jMenu1
     *
     * @return javax.swing.JMenu
     */
    private JMenu getJMenu1() {
        if (jMenu1 == null) {
            jMenu1 = new JMenu();
            jMenu1.setIcon(new ImageIcon(getClass().getResource("/Images/Help.png")));
            jMenu1.setText("Aide");

        }
        return jMenu1;
    }

    /**
     * This method initializes onglet
     *
     * @return javax.swing.JTabbedPane
     * @throws IOException
     * @throws NumberFormatException
     * @throws HeadlessException
     */
    private JTabbedPane getOnglet() throws HeadlessException, NumberFormatException, IOException {
        if (onglet == null) {
            onglet = new JTabbedPane();
            onglet.setBounds(new Rectangle(4, 175, 880, 552));
            onglet.setOpaque(false);
            onglet.setBackground(Color.white);
            onglet.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
            onglet.setModel(new DefaultSingleSelectionModel());
            onglet.setUI(new MetalTabbedPaneUI());
            onglet.setFont(new Font("Times New Roman", Font.BOLD, 14));
            onglet.setComponentOrientation(ComponentOrientation.UNKNOWN);
            onglet.setForeground(new Color(0, 51, 102));
            onglet.setTabPlacement(JTabbedPane.LEFT);

            ImageIcon icones[] = new ImageIcon[4];

            icones[0] = new ImageIcon(getClass().getResource("/Images/fichierdescreptive.png"));
            icones[1] = new ImageIcon(getClass().getResource("/Images/Distance.png"));
            icones[2] = new ImageIcon(getClass().getResource("/Images/CommunesWilaya.png"));
            icones[3] = new ImageIcon(getClass().getResource("/Images/Photo.png"));

            onglet.addTab("Fichier descriptif", icones[0], new FenInformations(), null);
            onglet.addTab("           Distance", icones[1], new FenDistance(), null);
            onglet.addTab("           Communes", icones[2], new FenCommune(), null);
            onglet.addTab("             Images", icones[3], new FenImages(), null);

        }
        return onglet;
    }

    /**
     * This method initializes jMenuItem
     *
     * @return javax.swing.JMenuItem
     */
    private JMenuItem getJMenuItem() {
        if (jMenuItem == null) {
            jMenuItem = new JMenuItem("Quitter");
            jMenuItem.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    dispose();
                }
            }
            );
        }

        return jMenuItem;
    }

    /**
     * This method initializes jMenuItem1
     *
     * @return javax.swing.JMenuItem
     */
    private JMenuItem getJMenuItem1() {
        if (jMenuItem1 == null) {
            jMenuItem1 = new JMenuItem("Deconnecter");
            jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    // TODO Auto-generated Event stub actionPerformed()
                    dispose();
                    FenPrincipale f = new FenPrincipale();
                    f.setVisible(true);
                }
            });
        }
        return jMenuItem1;
    }

}  //  @jve:decl-index=0:visual-constraint="10,10"
