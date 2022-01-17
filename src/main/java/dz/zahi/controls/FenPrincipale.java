package dz.zahi.controls;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 */
/**
 * @author acer
 *
 */
public class FenPrincipale extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;
    private JLabel imageLabel = null;
    private JLabel codeLabel = null;
    private static JTextField codeText = null;
    private JButton codeButton = null;
    private JButton helpButton = null;

    /**
     * This is the default constructor
     */
    public FenPrincipale() {
        super();
        initialize();
    }

    /**
     * This method initializes this
     *
     * @return void
     */
    private void initialize() {
        this.setSize(527, 307);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/iconAlger.png")));
        this.setLocationRelativeTo(null);
        this.setContentPane(getJContentPane());
        this.setResizable(false);
        this.setTitle("Algerie Decouverte");

    }

    /**
     * This method initializes jContentPane
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJContentPane() {
        if (jContentPane == null) {
            codeLabel = new JLabel();
            codeLabel.setBounds(new Rectangle(60, 234, 127, 32));
            codeLabel.setText("code de la wilaya:");
            imageLabel = new JLabel(new ImageIcon(getClass().getResource("/Images/algerie-decouverte.jpg")));
            imageLabel.setBounds(new Rectangle(2, 1, 515, 222));
            jContentPane = new JPanel();
            jContentPane.setLayout(null);
            jContentPane.add(imageLabel, null);
            jContentPane.add(codeLabel, null);
            jContentPane.add(getCodeText(), null);
            jContentPane.add(getCodeButton(), null);
            jContentPane.add(getHelpButton(), null);
        }
        return jContentPane;
    }

    /**
     * This method initializes codeText
     *
     * @return javax.swing.JTextField
     */
    public static JTextField getCodeText() {
        if (codeText == null) {
            codeText = new JTextField();
            codeText.setBounds(new Rectangle(206, 236, 93, 29));

        }
        return codeText;
    }

    /**
     * This method initializes codeButton
     *
     * @return javax.swing.JButton
     */
    private JButton getCodeButton() {
        if (codeButton == null) {
            codeButton = new JButton();
            codeButton.setBounds(new Rectangle(330, 233, 99, 32));
            codeButton.setText("Ok");
            codeButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent e) {
                    // TODO Auto-generated Event stub mousePressed()

                    try {

                        if ((Integer.parseInt(getCodeText().getText()) > 48) || (Integer.parseInt(getCodeText().getText()) < 1)) {
                            JOptionPane.showMessageDialog(null, "Le Code de Wilaya Doit être cmpris entre 1 et 48", null, JOptionPane.ERROR_MESSAGE);
                        } else {
                            MenuPrincipale m;
                            m = new MenuPrincipale();
                            m.setVisible(true);
                            dispose();
                        }

                    } catch (HeadlessException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    } catch (NumberFormatException e1) {
                        JOptionPane.showMessageDialog(null, "Le champ de code est vide", null, JOptionPane.ERROR_MESSAGE);
                    } catch (IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }

                }
            });
            codeButton.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent e) {
                    // TODO Auto-generated Event stub keyPressed()

                    try {

                        if ((Integer.parseInt(getCodeText().getText()) > 48) || (Integer.parseInt(getCodeText().getText()) < 1)) {
                            JOptionPane.showMessageDialog(null, "Le Code de Wilaya Doit être cmpris entre 1 et 48", null, JOptionPane.ERROR_MESSAGE);
                        } else {
                            MenuPrincipale m;
                            m = new MenuPrincipale();
                            m.setVisible(true);
                            dispose();
                        }

                    } catch (HeadlessException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    } catch (NumberFormatException e1) {
                        JOptionPane.showMessageDialog(null, "Le champ de code est vide", null, JOptionPane.ERROR_MESSAGE);
                    } catch (IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }

                }
            });
        }
        return codeButton;

    }

    /**
     * This method initializes helpButton
     *
     * @return javax.swing.JButton
     */
    private JButton getHelpButton() {
        if (helpButton == null) {
            helpButton = new JButton(new ImageIcon(getClass().getResource("/Images/Help2.png")));
            helpButton.setBounds(new Rectangle(300, 240, 18, 17));
            helpButton.addActionListener((java.awt.event.ActionEvent e) -> {
                HelpClass h = new HelpClass(null);
                h.setVisible(true);
            });
        }
        return helpButton;
    }

    public static void main(String[] args) throws IOException {
        FenPrincipale f = new FenPrincipale();
        f.setVisible(true);
    }

}  //  @jve:decl-index=0:visual-constraint="10,10"
