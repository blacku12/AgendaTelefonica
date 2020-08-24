package pachetAgenda;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AgendaUI extends javax.swing.JFrame {

    private Persoana pTemp;
    private static final String USER = "admin";
    private static final String COD = "@6r@c@d@6r@nt";
    private static Agenda agenda;
    private static DefaultListModel<Persoana> model = new DefaultListModel<>();
    private static DefaultListModel<Persoana> model1 = new DefaultListModel<>();
    private DefaultComboBoxModel<CriteriuOrdonare> modelOrdonare = new DefaultComboBoxModel<>();
    private DefaultComboBoxModel<CriteriuFiltrare> modelFiltrare = new DefaultComboBoxModel<>();
    private static List<File> listaPoze = new ArrayList<>();
    private static File dir = new File(".\\resurse\\banners");
    private File[] bannere = dir.listFiles();
    private int bannerIndex = 0;
    private boolean stare = true;
    private File salvareListacontacte = new File(".\\listaContacte.txt");
    private boolean isDB;

    public AgendaUI() throws InterruptedException, SQLException, ParseException, IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        listaPoze = Arrays.asList(bannere);
        JMeniuItemDeschidere.setEnabled(false);
        JMeniuItemSalvare.setEnabled(false);
        afiseazaBannere();
        start(); //pornire GUI cu DB
        //startFile(); //pornire GUI cu fisier

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JFrameAdauga = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jTextNume = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextPrenume = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextNrFix = new javax.swing.JTextField();
        jTextNrMobil = new javax.swing.JTextField();
        jBtnOk = new javax.swing.JButton();
        jBtnCancel = new javax.swing.JButton();
        jTextDataNastere = new javax.swing.JFormattedTextField();
        jFrameInregistrare = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JtxtUtilizator = new javax.swing.JTextField();
        jBtnOkInregistrare = new javax.swing.JButton();
        jBtnCancelInregistrare = new javax.swing.JButton();
        jTxtParola = new javax.swing.JPasswordField();
        jDiagPersoaneNascuteAzi = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListContacteZi = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jDialogDespre = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextDespre = new javax.swing.JTextArea();
        jfChooser = new javax.swing.JFileChooser();
        jDesktopPanel = new javax.swing.JDesktopPane();
        jlblFiltrare = new javax.swing.JLabel();
        jBoxFiltrare = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tfFiltru = new javax.swing.JTextField();
        btnFIltreaza = new javax.swing.JButton();
        lblOrdonare = new javax.swing.JLabel();
        jBoxOrdonare = new javax.swing.JComboBox<>();
        btnOrdoneaza = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListAgenda = new javax.swing.JList<>();
        btnAdaugaContact = new javax.swing.JButton();
        btnStergeContact = new javax.swing.JButton();
        btnEditeazaContact = new javax.swing.JButton();
        jLblBanner = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        JMeniuFisiere = new javax.swing.JMenu();
        JMeniuItemDeschidere = new javax.swing.JMenuItem();
        JMeniuItemSalvare = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        JMeniuItemExit = new javax.swing.JMenuItem();
        JMeniuAjutor = new javax.swing.JMenu();
        JMeniuItemInregistrare = new javax.swing.JMenuItem();
        JMeniuItemDespre = new javax.swing.JMenuItem();

        jLabel2.setText("Nume: ");

        jLabel3.setText("Prenume:");

        jLabel5.setText("Data nasterii:");

        jLabel6.setText("Numar fix: ");

        jLabel7.setText("Numar mobil: ");

        jBtnOk.setText("OK");
        jBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOkActionPerformed(evt);
            }
        });

        jBtnCancel.setText("Cancel");
        jBtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelActionPerformed(evt);
            }
        });

        try {
            jTextDataNastere.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout JFrameAdaugaLayout = new javax.swing.GroupLayout(JFrameAdauga.getContentPane());
        JFrameAdauga.getContentPane().setLayout(JFrameAdaugaLayout);
        JFrameAdaugaLayout.setHorizontalGroup(
            JFrameAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JFrameAdaugaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JFrameAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JFrameAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jBtnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(JFrameAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextNume, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextPrenume, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jTextNrFix, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextNrMobil, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDataNastere))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JFrameAdaugaLayout.setVerticalGroup(
            JFrameAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JFrameAdaugaLayout.createSequentialGroup()
                .addGroup(JFrameAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JFrameAdaugaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JFrameAdaugaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextNume, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JFrameAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JFrameAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JFrameAdaugaLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextDataNastere, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JFrameAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNrFix, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JFrameAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JFrameAdaugaLayout.createSequentialGroup()
                        .addComponent(jTextNrMobil, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGroup(JFrameAdaugaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnOk)
                    .addComponent(jBtnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Utilizator:");

        jLabel8.setText("cod:");

        JtxtUtilizator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtUtilizatorActionPerformed(evt);
            }
        });

        jBtnOkInregistrare.setText("OK");
        jBtnOkInregistrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOkInregistrareActionPerformed(evt);
            }
        });

        jBtnCancelInregistrare.setText("Cancel");
        jBtnCancelInregistrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelInregistrareActionPerformed(evt);
            }
        });

        jTxtParola.setText("jPasswordField1");

        javax.swing.GroupLayout jFrameInregistrareLayout = new javax.swing.GroupLayout(jFrameInregistrare.getContentPane());
        jFrameInregistrare.getContentPane().setLayout(jFrameInregistrareLayout);
        jFrameInregistrareLayout.setHorizontalGroup(
            jFrameInregistrareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameInregistrareLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrameInregistrareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jFrameInregistrareLayout.createSequentialGroup()
                        .addComponent(jBtnOkInregistrare, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnCancelInregistrare, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrameInregistrareLayout.createSequentialGroup()
                        .addGroup(jFrameInregistrareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jFrameInregistrareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JtxtUtilizator)
                            .addComponent(jTxtParola, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jFrameInregistrareLayout.setVerticalGroup(
            jFrameInregistrareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameInregistrareLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrameInregistrareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JtxtUtilizator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrameInregistrareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jFrameInregistrareLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jTxtParola)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrameInregistrareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnOkInregistrare)
                    .addComponent(jBtnCancelInregistrare))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jDiagPersoaneNascuteAzi.setAlwaysOnTop(true);
        jDiagPersoaneNascuteAzi.setBackground(new java.awt.Color(0, 102, 204));
        jDiagPersoaneNascuteAzi.setType(java.awt.Window.Type.POPUP);

        jLabel10.setText("Lista cu persoane nascute astazi:");

        jListContacteZi.setBackground(new java.awt.Color(0, 0, 0));
        jListContacteZi.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jListContacteZi);

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDiagPersoaneNascuteAziLayout = new javax.swing.GroupLayout(jDiagPersoaneNascuteAzi.getContentPane());
        jDiagPersoaneNascuteAzi.getContentPane().setLayout(jDiagPersoaneNascuteAziLayout);
        jDiagPersoaneNascuteAziLayout.setHorizontalGroup(
            jDiagPersoaneNascuteAziLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDiagPersoaneNascuteAziLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDiagPersoaneNascuteAziLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jDiagPersoaneNascuteAziLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 106, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDiagPersoaneNascuteAziLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        jDiagPersoaneNascuteAziLayout.setVerticalGroup(
            jDiagPersoaneNascuteAziLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDiagPersoaneNascuteAziLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextDespre.setBackground(new java.awt.Color(0, 0, 0));
        jTextDespre.setColumns(20);
        jTextDespre.setForeground(new java.awt.Color(255, 255, 255));
        jTextDespre.setRows(5);
        jTextDespre.setText("Agenda de contacte are la baza tema examenului final al cursului de Java, predat cu \nsucces si daruire de catre Vasile. \n\n\n\n\nVersiunea de produs: Agenda de contacte 1.0 (Build: in nenumarate seri)\nActualizari: La cererea insistenta a profesorului de curs sau la schimb cu doua beri\nSystem: Windows 7 versiunea 6.1 (piratata)\n");
        jScrollPane2.setViewportView(jTextDespre);

        javax.swing.GroupLayout jDialogDespreLayout = new javax.swing.GroupLayout(jDialogDespre.getContentPane());
        jDialogDespre.getContentPane().setLayout(jDialogDespreLayout);
        jDialogDespreLayout.setHorizontalGroup(
            jDialogDespreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogDespreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialogDespreLayout.setVerticalGroup(
            jDialogDespreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogDespreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblFiltrare.setText("Filtrare:");

        jBoxFiltrare.setBackground(new java.awt.Color(0, 0, 0));
        jBoxFiltrare.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Filtru: ");

        tfFiltru.setBackground(new java.awt.Color(0, 0, 0));
        tfFiltru.setForeground(new java.awt.Color(255, 255, 255));

        btnFIltreaza.setBackground(new java.awt.Color(0, 0, 0));
        btnFIltreaza.setForeground(new java.awt.Color(255, 255, 255));
        btnFIltreaza.setText("Filtreaza");
        btnFIltreaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFIltreazaActionPerformed(evt);
            }
        });

        lblOrdonare.setText("Ordonare: ");

        jBoxOrdonare.setBackground(new java.awt.Color(0, 0, 0));
        jBoxOrdonare.setForeground(new java.awt.Color(255, 255, 255));

        btnOrdoneaza.setBackground(new java.awt.Color(0, 0, 0));
        btnOrdoneaza.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdoneaza.setText("Ordoneaza");
        btnOrdoneaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdoneazaActionPerformed(evt);
            }
        });

        jListAgenda.setBackground(new java.awt.Color(0, 0, 0));
        jListAgenda.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jListAgenda.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jListAgenda);

        btnAdaugaContact.setBackground(new java.awt.Color(0, 0, 0));
        btnAdaugaContact.setForeground(new java.awt.Color(255, 255, 255));
        btnAdaugaContact.setText("Adauga contact");
        btnAdaugaContact.setMaximumSize(new java.awt.Dimension(173, 32));
        btnAdaugaContact.setMinimumSize(new java.awt.Dimension(173, 32));
        btnAdaugaContact.setPreferredSize(new java.awt.Dimension(173, 32));
        btnAdaugaContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdaugaContactActionPerformed(evt);
            }
        });

        btnStergeContact.setBackground(new java.awt.Color(0, 0, 0));
        btnStergeContact.setForeground(new java.awt.Color(255, 255, 255));
        btnStergeContact.setText("Sterge contact selectat");
        btnStergeContact.setMaximumSize(new java.awt.Dimension(173, 32));
        btnStergeContact.setMinimumSize(new java.awt.Dimension(173, 32));
        btnStergeContact.setPreferredSize(new java.awt.Dimension(173, 32));
        btnStergeContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStergeContactActionPerformed(evt);
            }
        });

        btnEditeazaContact.setBackground(new java.awt.Color(0, 0, 0));
        btnEditeazaContact.setForeground(new java.awt.Color(255, 255, 255));
        btnEditeazaContact.setText("Editeaza contact selectat");
        btnEditeazaContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditeazaContactActionPerformed(evt);
            }
        });

        jDesktopPanel.setLayer(jlblFiltrare, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanel.setLayer(jBoxFiltrare, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanel.setLayer(tfFiltru, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanel.setLayer(btnFIltreaza, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanel.setLayer(lblOrdonare, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanel.setLayer(jBoxOrdonare, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanel.setLayer(btnOrdoneaza, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanel.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanel.setLayer(btnAdaugaContact, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanel.setLayer(btnStergeContact, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanel.setLayer(btnEditeazaContact, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPanel.setLayer(jLblBanner, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanelLayout.createSequentialGroup()
                .addGroup(jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPanelLayout.createSequentialGroup()
                        .addComponent(btnAdaugaContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStergeContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnEditeazaContact))
                    .addGroup(jDesktopPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblFiltrare)
                            .addComponent(lblOrdonare))
                        .addGap(35, 35, 35)
                        .addGroup(jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPanelLayout.createSequentialGroup()
                                .addComponent(jBoxFiltrare, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfFiltru, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBoxOrdonare, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFIltreaza, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrdoneaza))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLblBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblFiltrare)
                    .addComponent(jBoxFiltrare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tfFiltru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFIltreaza))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrdonare)
                    .addComponent(jBoxOrdonare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdoneaza))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdaugaContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStergeContact, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditeazaContact, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblBanner, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuBar.setBackground(new java.awt.Color(0, 0, 0));
        MenuBar.setForeground(new java.awt.Color(255, 255, 255));

        JMeniuFisiere.setText("Fisiere");

        JMeniuItemDeschidere.setText("Deschidere");
        JMeniuItemDeschidere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMeniuItemDeschidereActionPerformed(evt);
            }
        });
        JMeniuFisiere.add(JMeniuItemDeschidere);

        JMeniuItemSalvare.setText("Salvare");
        JMeniuItemSalvare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMeniuItemSalvareActionPerformed(evt);
            }
        });
        JMeniuFisiere.add(JMeniuItemSalvare);
        JMeniuFisiere.add(jSeparator1);

        JMeniuItemExit.setText("Exit");
        JMeniuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMeniuItemExitActionPerformed(evt);
            }
        });
        JMeniuFisiere.add(JMeniuItemExit);

        MenuBar.add(JMeniuFisiere);

        JMeniuAjutor.setText("Ajutor");

        JMeniuItemInregistrare.setText("Inregistare");
        JMeniuItemInregistrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMeniuItemInregistrareActionPerformed(evt);
            }
        });
        JMeniuAjutor.add(JMeniuItemInregistrare);

        JMeniuItemDespre.setText("Despre");
        JMeniuItemDespre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMeniuItemDespreActionPerformed(evt);
            }
        });
        JMeniuAjutor.add(JMeniuItemDespre);

        MenuBar.add(JMeniuAjutor);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdaugaContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdaugaContactActionPerformed
        stare = true;
        JFrameAdauga.setVisible(true);
        JFrameAdauga.pack();
        jDesktopPanel.setVisible(false);
        MenuBar.setVisible(false);
    }//GEN-LAST:event_btnAdaugaContactActionPerformed

    private void JMeniuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMeniuItemExitActionPerformed
        int raspuns = JOptionPane.showConfirmDialog(this, "Doresti sa inchizi agenda?");
        if (raspuns == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_JMeniuItemExitActionPerformed

    private void JMeniuItemDeschidereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMeniuItemDeschidereActionPerformed
        if (isDB) {
            try {
                start();
            } catch (SQLException ex) {
                Logger.getLogger(AgendaUI.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Fisierul nu exista");
                return;
            }
        } else {
            deschidereCuFisier();
        }
    }//GEN-LAST:event_JMeniuItemDeschidereActionPerformed

    private void deschidereCuFisier() throws HeadlessException {
        jfChooser.setCurrentDirectory(new File(".\\"));
        if (jfChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

            File file = jfChooser.getSelectedFile();
            if (!file.isFile()) {
                JOptionPane.showMessageDialog(this, "Nu ati ales un fisier");
            } else if (!file.canRead() || !file.canExecute()) {
                JOptionPane.showMessageDialog(this, "Nu aveti permisiuni pe fisierul respectiv!");
            } else {
                try {
                    agenda.incarca(file.toPath());
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(AgendaUI.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            }
        }
    }

    private void jBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkActionPerformed
        if (adaugarePersoana() == true) {
            if (stare == false) {
                try {
                    agenda.stergeContact(pTemp);
                } catch (SQLException ex) {
                    Logger.getLogger(AgendaUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            JFrameAdauga.setVisible(false);
            jDesktopPanel.setVisible(true);
            MenuBar.setVisible(true);
            stergeFormular();
            populeaza();
        }
    }//GEN-LAST:event_jBtnOkActionPerformed

    private void jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelActionPerformed
        JFrameAdauga.setVisible(false);
        stergeFormular();
        jDesktopPanel.setVisible(true);
        MenuBar.setVisible(true);
    }//GEN-LAST:event_jBtnCancelActionPerformed

    private void btnOrdoneazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdoneazaActionPerformed
        CriteriuOrdonare crit = (CriteriuOrdonare) jBoxOrdonare.getSelectedItem();
        agenda.ordoneaza(crit);
        agenda.contacte();
        populeaza();
    }//GEN-LAST:event_btnOrdoneazaActionPerformed

    private void btnFIltreazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFIltreazaActionPerformed
        if (jBoxFiltrare.getSelectedItem().equals(CriteriuFiltrare.NR_FIX)) {
            agenda.filtreazaNrFix();
        }
        if (jBoxFiltrare.getSelectedItem().equals(CriteriuFiltrare.NR_MOBIL)) {
            agenda.filtreazaNrMobil();
        }
        if (jBoxFiltrare.getSelectedItem().equals(CriteriuFiltrare.NASCUT_ASTAZI)) {
            agenda.filtreazaNascutiAstazi();
        }
        if (jBoxFiltrare.getSelectedItem().equals(CriteriuFiltrare.NASCUT_LUNA_CURENTA)) {
            agenda.filtreazaNascutiLunaCurenta();
        }
        if (jBoxFiltrare.getSelectedItem().equals(CriteriuFiltrare.FARA)) {
            agenda.resetareFiltru();
        }
        if (jBoxFiltrare.getSelectedItem().equals(CriteriuFiltrare.PERSONALIZAT)) {
            agenda.filtreazaPersonalizat(tfFiltru.getText());
        }
        agenda.contacte();
        populeaza();
    }//GEN-LAST:event_btnFIltreazaActionPerformed

    private void btnStergeContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStergeContactActionPerformed
        Persoana p = null;
        if (!jListAgenda.isSelectionEmpty()) {
            int index = jListAgenda.getSelectedIndex();
            try {
                p = agenda.getListaContacte().get(index);
                int raspuns = JOptionPane.showConfirmDialog(this, "Esti sigur ca stergi contactul?" + p.getNume());
                if (raspuns == 0) {
                    agenda.stergeContact(p);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AgendaUI.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, ex.getMessage());
                return;
            }

            populeaza();
        } else {
            JOptionPane.showMessageDialog(this, "Selecteaza un contact!");
            return;
        }
    }//GEN-LAST:event_btnStergeContactActionPerformed

    private void btnEditeazaContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditeazaContactActionPerformed
        stare = false;
        if (!jListAgenda.isSelectionEmpty()) {
            int index = jListAgenda.getSelectedIndex();
            pTemp = agenda.getListaContacte().get(index);
            jTextNume.setText(pTemp.getNume());
            jTextPrenume.setText(pTemp.getPrenume());
            jTextDataNastere.setText(pTemp.getData().toString());
            jTextNrFix.setText(pTemp.getNrFix().getNrTel());
            jTextNrMobil.setText(pTemp.getNrMobil().getNrTel());
            JFrameAdauga.setVisible(true);
            JFrameAdauga.pack();
            jDesktopPanel.setVisible(false);
            MenuBar.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(this, "Selecteaza un contact!");
            return;
        }
    }//GEN-LAST:event_btnEditeazaContactActionPerformed

    private void JMeniuItemSalvareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMeniuItemSalvareActionPerformed
        try {
            jfChooser.setCurrentDirectory(new File(".\\"));
            if (jfChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                salvareListacontacte = jfChooser.getSelectedFile();
                try {
                    agenda.salveaza(salvareListacontacte.toPath());
                } catch (IOException ex) {
                    Logger.getLogger(AgendaUI.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "Nu ai permisiunea sa salvezi");
                }
            }
            salvare();
        } catch (InterruptedException ex) {
            Logger.getLogger(AgendaUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_JMeniuItemSalvareActionPerformed

    private void JMeniuItemInregistrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMeniuItemInregistrareActionPerformed
        jFrameInregistrare.setVisible(true);
        jFrameInregistrare.pack();
        jDesktopPanel.setVisible(false);
        MenuBar.setVisible(false);
    }//GEN-LAST:event_JMeniuItemInregistrareActionPerformed

    private void JtxtUtilizatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtUtilizatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtUtilizatorActionPerformed

    private void jBtnOkInregistrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkInregistrareActionPerformed
        if (JtxtUtilizator.getText().equals(USER) && new String(jTxtParola.getPassword()).equals(COD)) {
            task.cancel();
            jFrameInregistrare.setVisible(false);
            JOptionPane.showMessageDialog(this, "Produsul s-a inregistrat cu succes");
            MenuBar.setEnabled(true);
            jDesktopPanel.setVisible(true);
            JMeniuFisiere.setEnabled(true);
            JMeniuAjutor.setEnabled(true);
            jLblBanner.setVisible(false);
            JMeniuItemDeschidere.setEnabled(true);
            JMeniuItemSalvare.setEnabled(true);
            MenuBar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Utiliztorul sau codul nu sunt corecte");
            return;
        }
    }//GEN-LAST:event_jBtnOkInregistrareActionPerformed

    private void jBtnCancelInregistrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelInregistrareActionPerformed
        jFrameInregistrare.setVisible(false);
        jDesktopPanel.setVisible(true);
        MenuBar.setVisible(true);
    }//GEN-LAST:event_jBtnCancelInregistrareActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDiagPersoaneNascuteAzi.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JMeniuItemDespreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMeniuItemDespreActionPerformed
        jDialogDespre.setVisible(true);
        jTextDespre.setEditable(false);
        jDialogDespre.pack();
    }//GEN-LAST:event_JMeniuItemDespreActionPerformed

    public static void main(String args[]) throws InterruptedException {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgendaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        JFrameSplash splash = new JFrameSplash();
        splash.setLocation(100, 60);
        splash.setVisible(true);
        Thread.sleep(1_000);
        splash.setVisible(false);

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AgendaUI x = new AgendaUI();
                    x.setVisible(true);

                } catch (InterruptedException ex) {
                    Logger.getLogger(AgendaUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(AgendaUI.class.getName()).log(Level.SEVERE, null, ex);
                    ex.getMessage();
                } catch (ParseException ex) {
                    Logger.getLogger(AgendaUI.class.getName()).log(Level.SEVERE, null, ex);
                    ex.getMessage();
                } catch (IOException ex) {
                    Logger.getLogger(AgendaUI.class.getName()).log(Level.SEVERE, null, ex);
                    ex.getMessage();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AgendaUI.class.getName()).log(Level.SEVERE, null, ex);
                    ex.getMessage();
                }
            }
        });
    }

    private void populeaza() {
        try {
            if (agenda.getListaFiltrata() != null && !agenda.getListaFiltrata().isEmpty()) {
                model.clear();
                for (Persoana p : agenda.getListaFiltrata()) {
                    model.addElement(p);
                }
            } else {
                model.clear();
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Agenda este goala");
        }
    }

    private void populeazaListaContacteAzi() {
        try {
            if (agenda.getListaContacteNascuteAzi() != null && !agenda.getListaContacteNascuteAzi().isEmpty()) {
                model1.clear();
                for (Persoana p : agenda.getListaContacteNascuteAzi()) {
                    model1.addElement(p);
                }
            } else {
                model1.clear();
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Nici un contact din agenda nu este nascut astazi");
        }
    }

    private void populeazaCriteriiOrdonare() {
        for (CriteriuOrdonare criteriu : CriteriuOrdonare.values()) {
            modelOrdonare.addElement(criteriu);
        }
    }

    private void populeazaFiltre() {
        for (CriteriuFiltrare criteriu : CriteriuFiltrare.values()) {
            modelFiltrare.addElement(criteriu);
        }
    }

    private void stergeFormular() {
        jTextNume.setText("");
        jTextPrenume.setText("");
        jTextDataNastere.setText("");
        jTextNrFix.setText("");
        jTextNrMobil.setText("");
    }

    private void start() throws SQLException {
        isDB = true;
        jListAgenda.setModel(model);
        agenda = new Agenda();
        agenda.populeazaDb();
        populeaza();
        agenda.populeazaListaNascutiAzi();
        jListContacteZi.setModel(model1);
        populeazaListaContacteAzi();
        populeazaCriteriiOrdonare();
        populeazaFiltre();
        jBoxOrdonare.setModel(modelOrdonare);
        jBoxFiltrare.setModel(modelFiltrare);
        jDiagPersoaneNascuteAzi.setVisible(true);
        jDiagPersoaneNascuteAzi.pack();
        jDiagPersoaneNascuteAzi.setLocation(120, 120);
        jDiagPersoaneNascuteAzi.setAlwaysOnTop(true);
    }

    private void startFile() throws IOException, FileNotFoundException, ClassNotFoundException {
        isDB = false;
        jListAgenda.setModel(model);
        agenda = new Agenda(salvareListacontacte.toPath());
        populeaza();
        agenda.populeazaListaNascutiAzi();
        jListContacteZi.setModel(model1);
        populeazaListaContacteAzi();
        populeazaCriteriiOrdonare();
        populeazaFiltre();
        jBoxOrdonare.setModel(modelOrdonare);
        jBoxFiltrare.setModel(modelFiltrare);
        jDiagPersoaneNascuteAzi.setVisible(true);
        jDiagPersoaneNascuteAzi.pack();
        jDiagPersoaneNascuteAzi.setLocation(120, 120);
        jDiagPersoaneNascuteAzi.setAlwaysOnTop(true);
    }

    private TimerTask task = new TimerTask() {
        @Override
        public void run() {
            ImageIcon poza = new ImageIcon(bannere[bannerIndex].getAbsolutePath());
            jLblBanner.setIcon(poza);
            bannerIndex++;
            if (bannerIndex == listaPoze.size()) {
                bannerIndex = 0;
            }
        }
    };

    private TimerTask taskSalveaza = new TimerTask() {
        @Override
        public void run() {
            try {
                agenda.salveaza(salvareListacontacte.toPath());
            } catch (IOException ex) {
                Logger.getLogger(AgendaUI.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Nu poti salva in fisierul ales");
            }
        }
    };

    private void afiseazaBannere() throws InterruptedException {
        Timer t = new Timer();
        t.schedule(task, 0, 2_000);
    }

    private void salvare() throws InterruptedException {
        Timer t1 = new Timer();
        t1.schedule(taskSalveaza, 2_000, 2_000);
    }

    private boolean adaugarePersoana() {
        if (jTextNume.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Trebuie sa introduci numele");
            return false;
        }
        if (jTextPrenume.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Trebuie sa introduci prenumele");
            return false;
        }
        if (jTextDataNastere.getText().equals("    -  -  ")) {
            System.out.println(jTextDataNastere.getText());
            JOptionPane.showMessageDialog(this, "Trebuie sa introduci data nasterii");
            return false;
        }
        if (jTextNrFix.getText().isEmpty() && jTextNrMobil.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Trebuie sa introduci un numar de telefon");
            return false;
        }
        LocalDate data;
        NrFix nf = null;
        NrMobil nm = null;
        try {
            data = Util.transformaDataStandard(jTextDataNastere.getText());
        } catch (DateTimeException e) {
            JOptionPane.showMessageDialog(this, "Data este incorecta");
            return false;
        }
        try {
            nf = new NrFix(jTextNrFix.getText());
            nm = new NrMobil(jTextNrMobil.getText());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            return false;
        }
        Persoana p1;
        if (jTextNrFix.getText().isEmpty()) {
            try {
                p1 = new Persoana(jTextNume.getText(), jTextPrenume.getText(), data, nm);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
                return false;
            }
        } else if (jTextNrMobil.getText().isEmpty()) {
            try {
                p1 = new Persoana(jTextNume.getText(), jTextPrenume.getText(), data, nf);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
                return false;
            }
        } else {
            try {
                p1 = new Persoana(jTextNume.getText(), jTextPrenume.getText(), data, nf, nm);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
                return false;
            }
        }
        try {
            agenda.adaugaContact(p1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            return false;
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            return false;
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            return false;
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame JFrameAdauga;
    private javax.swing.JMenu JMeniuAjutor;
    private javax.swing.JMenu JMeniuFisiere;
    private javax.swing.JMenuItem JMeniuItemDeschidere;
    private javax.swing.JMenuItem JMeniuItemDespre;
    private javax.swing.JMenuItem JMeniuItemExit;
    private javax.swing.JMenuItem JMeniuItemInregistrare;
    private javax.swing.JMenuItem JMeniuItemSalvare;
    private javax.swing.JTextField JtxtUtilizator;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton btnAdaugaContact;
    private javax.swing.JButton btnEditeazaContact;
    private javax.swing.JButton btnFIltreaza;
    private javax.swing.JButton btnOrdoneaza;
    private javax.swing.JButton btnStergeContact;
    private javax.swing.JComboBox<CriteriuFiltrare> jBoxFiltrare;
    private javax.swing.JComboBox<CriteriuOrdonare> jBoxOrdonare;
    private javax.swing.JButton jBtnCancel;
    private javax.swing.JButton jBtnCancelInregistrare;
    private javax.swing.JButton jBtnOk;
    private javax.swing.JButton jBtnOkInregistrare;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPanel;
    private javax.swing.JDialog jDiagPersoaneNascuteAzi;
    private javax.swing.JDialog jDialogDespre;
    private javax.swing.JFrame jFrameInregistrare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLblBanner;
    private javax.swing.JList<Persoana> jListAgenda;
    private javax.swing.JList<Persoana> jListContacteZi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JFormattedTextField jTextDataNastere;
    private javax.swing.JTextArea jTextDespre;
    private javax.swing.JTextField jTextNrFix;
    private javax.swing.JTextField jTextNrMobil;
    private javax.swing.JTextField jTextNume;
    private javax.swing.JTextField jTextPrenume;
    private javax.swing.JPasswordField jTxtParola;
    private javax.swing.JFileChooser jfChooser;
    private javax.swing.JLabel jlblFiltrare;
    private javax.swing.JLabel lblOrdonare;
    private javax.swing.JTextField tfFiltru;
    // End of variables declaration//GEN-END:variables
}
