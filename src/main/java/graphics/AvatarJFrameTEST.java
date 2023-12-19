package graphics;


import java.awt.AWTException;
import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import student.ugal.ro.avatar22.*;

public class AvatarJFrameTEST extends javax.swing.JFrame {
    
    
    //declaration zone of object array and its components
    //to do -> modify for reading from files perchance.
    // <editor-fold desc="palarieList declarare">
    Palarie[] palarieList =
    {
        new Palarie(0, "alb", 1, 350, 1000),
        new Palarie(0, "albastru", 2, 333, 1050),
        new Palarie(0, "galben", 3, 350, 1000),
        new Palarie(0, "maro", 4, 365, 1100),
        new Palarie(0, "mov", 5, 300, 1051),
        new Palarie(0, "negru", 6, 333, 1050),
        new Palarie(0, "portocaliu", 8, 335, 480),
        new Palarie(0, "rosu", 9, 333, 1050),
        new Palarie(0, "roz", 10, 300, 1051),
        new Palarie(0, "verde", 11, 333, 1050),
        new Palarie(1, "alb", 12, 300, 1051),
        new Palarie(1, "albastru", 13, 400, 1000),
        new Palarie(1, "galben", 14, 335, 480),
        new Palarie(1, "maro", 15, 333, 1050),
        new Palarie(1, "mov", 16, 400, 1000),
        new Palarie(1, "negru", 17, 335, 480),
        new Palarie(1, "portocaliu", 18, 365, 1100),
        new Palarie(1, "rosu", 19, 300, 1051),
        new Palarie(1, "roz", 20, 333, 1050),
        new Palarie(1, "verde", 21, 300, 1051),
        new Palarie(2, "alb", 22, 400, 1000),
        new Palarie(2, "albastru", 23, 335, 480),
        new Palarie(2, "galben", 24, 300, 1051),
        new Palarie(2, "maro", 25, 335, 480),
        new Palarie(2, "mov", 26, 365, 1100),
        new Palarie(2, "negru", 27, 400, 1000),
        new Palarie(2, "portocaliu", 28, 365, 1100),
        new Palarie(2, "rosu", 29, 300, 1051),
        new Palarie(2, "roz", 30, 400, 1000),
        new Palarie(2, "verde", 31, 345, 1008)
    };
    //</editor-fold>

    // <editor-fold desc="parList declarare">
    Par[] parList =
    {
        new Par(0, "alb", 1, 350, 1000),
        new Par(0, "albastru", 2, 333, 1050),
        new Par(0, "galben", 3, 350, 1000),
        new Par(0, "maro", 4, 365, 1100),
        new Par(0, "mov", 5, 300, 1051),
        new Par(0, "negru", 6, 333, 1050),
        new Par(0, "portocaliu", 8, 335, 480),
        new Par(0, "rosu", 9, 333, 1050),
        new Par(0, "roz", 10, 300, 1051),
        new Par(0, "verde", 11, 333, 1050),
        new Par(1, "alb", 12, 300, 1051),
        new Par(1, "albastru", 13, 400, 1000),
        new Par(1, "galben", 14, 335, 480),
        new Par(1, "maro", 15, 333, 1050),
        new Par(1, "mov", 16, 400, 1000),
        new Par(1, "negru", 17, 335, 480),
        new Par(1, "portocaliu", 18, 365, 1100),
        new Par(1, "rosu", 19, 300, 1051),
        new Par(1, "roz", 20, 333, 1050),
        new Par(1, "verde", 21, 300, 1051),
        new Par(2, "alb", 22, 400, 1000),
        new Par(2, "albastru", 23, 335, 480),
        new Par(2, "galben", 24, 300, 1051),
        new Par(2, "maro", 25, 335, 480),
        new Par(2, "mov", 26, 365, 1100),
        new Par(2, "negru", 27, 400, 1000),
        new Par(2, "portocaliu", 28, 365, 1100),
        new Par(2, "rosu", 29, 300, 1051),
        new Par(2, "roz", 30, 400, 1000),
        new Par(2, "verde", 31, 345, 1008)
    };
    //</editor-fold>

    // <editor-fold desc="fataList declarare">
    Fata[] fataList =
    {
        new Fata(0, "alb", 1, 350, 950),
        new Fata(1, "alb", 1, 350, 950),
        new Fata(2, "alb", 1, 350, 950),
        new Fata(0, "albastru", 1, 350, 950),
        new Fata(1, "albastru", 1, 350, 950),
        new Fata(2, "albastru", 1, 350, 950),
        new Fata(0, "galben", 1, 350, 950),
        new Fata(1, "galben", 1, 350, 950),
        new Fata(2, "galben", 1, 350, 950),
        new Fata(0, "maro", 1, 350, 950),
        new Fata(1, "maro", 1, 350, 950),
        new Fata(2, "maro", 1, 350, 950),
        new Fata(0, "mov", 1, 350, 950),
        new Fata(1, "mov", 1, 350, 950),
        new Fata(2, "mov", 1, 350, 950),
        new Fata(0, "negru", 1, 350, 950),
        new Fata(1, "negru", 1, 350, 950),
        new Fata(2, "negru", 1, 350, 950),
        new Fata(0, "portocaliu", 1, 350, 950),
        new Fata(1, "portocaliu", 1, 350, 950),
        new Fata(2, "portocaliu", 1, 350, 950),
        new Fata(0, "rosu", 1, 350, 950),
        new Fata(1, "rosu", 1, 350, 950),
        new Fata(2, "rosu", 1, 350, 950),
        new Fata(0, "roz", 1, 350, 950),
        new Fata(1, "roz", 1, 350, 950),
        new Fata(2, "roz", 1, 350, 950),
        new Fata(0, "verde", 1, 350, 950),
        new Fata(1, "verde", 1, 350, 950),
        new Fata(2, "verde", 1, 350, 950)
    };
    //</editor-fold>

    // <editor-fold desc="accesoriList declarare">
    Accesori[] accesoriList =
    {
        new Accesori(true, false, 0, "alb", 1, 305, 240),
        new Accesori(true, false, 1, "alb", 1, 305, 240),
        new Accesori(true, true, 2, "alb", 1, 305, 240),
        new Accesori(true, true, 0, "albastru", 1, 305, 240),
        new Accesori(true, true, 1, "albastru", 1, 305, 240),
        new Accesori(true, false, 2, "albastru", 1, 305, 240),
        new Accesori(true, false, 0, "galben", 1, 305, 240),
        new Accesori(true, true, 1, "galben", 1, 305, 240),
        new Accesori(true, true, 2, "galben", 1, 305, 240),
        new Accesori(true, true, 0, "maro", 1, 305, 240),
        new Accesori(true, true, 1, "maro", 1, 305, 240),
        new Accesori(true, false, 2, "maro", 1, 305, 240),
        new Accesori(true, false, 0, "mov", 1, 305, 240),
        new Accesori(true, false, 1, "mov", 1, 305, 240),
        new Accesori(true, true, 2, "mov", 1, 305, 240),
        new Accesori(false, false, 0, "negru", 1, 305, 240),
        new Accesori(false, true, 1, "negru", 1, 305, 240),
        new Accesori(false, false, 2, "negru", 1, 305, 240),
        new Accesori(false, true, 0, "portocaliu", 1, 305, 240),
        new Accesori(false, true, 1, "portocaliu", 1, 305, 240),
        new Accesori(false, false, 2, "portocaliu", 1, 305, 240),
        new Accesori(false, false, 0, "rosu", 1, 305, 240),
        new Accesori(false, true, 1, "rosu", 1, 305, 240),
        new Accesori(false, true, 2, "rosu", 1, 305, 240),
        new Accesori(false, true, 0, "roz", 1, 305, 240),
        new Accesori(false, false, 1, "roz", 1, 305, 240),
        new Accesori(false, true, 2, "roz", 1, 305, 240),
        new Accesori(false, false, 0, "verde", 1, 305, 240),
        new Accesori(false, true, 1, "verde", 1, 305, 240),
        new Accesori(false, true, 2, "verde", 1, 305, 240)
    };
    //</editor-fold>

    // <editor-fold desc="bluzaList declarare">
    Bluza[] bluzaList =
    {
        new Bluza(false, 0, "alb", 2, 300, 650),
        new Bluza(false, 1, "alb", 2, 300, 650),
        new Bluza(true, 2, "alb", 2, 300, 650),
        new Bluza(true, 0, "albastru", 2, 300, 650),
        new Bluza(true, 1, "albastru", 2, 300, 650),
        new Bluza(false, 2, "albastru", 2, 300, 650),
        new Bluza(false, 0, "galben", 2, 300, 650),
        new Bluza(true, 1, "galben", 2, 300, 650),
        new Bluza(true, 2, "galben", 2, 300, 650),
        new Bluza(true, 0, "maro", 2, 300, 650),
        new Bluza(true, 1, "maro", 2, 300, 650),
        new Bluza(false, 2, "maro", 2, 300, 650),
        new Bluza(false, 0, "mov", 2, 300, 650),
        new Bluza(false, 1, "mov", 2, 300, 650),
        new Bluza(true, 2, "mov", 2, 300, 650),
        new Bluza(false, 0, "negru", 2, 300, 650),
        new Bluza(true, 1, "negru", 2, 300, 650),
        new Bluza(false, 2, "negru", 2, 300, 650),
        new Bluza(true, 0, "portocaliu", 2, 300, 650),
        new Bluza(true, 1, "portocaliu", 2, 300, 650),
        new Bluza(false, 2, "portocaliu", 2, 300, 650),
        new Bluza(false, 0, "rosu", 2, 300, 650),
        new Bluza(true, 1, "rosu", 2, 300, 650),
        new Bluza(true, 2, "rosu", 2, 300, 650),
        new Bluza(true, 0, "roz", 2, 300, 650),
        new Bluza(false, 1, "roz", 2, 300, 650),
        new Bluza(true, 2, "roz", 2, 300, 650),
        new Bluza(false, 0, "verde", 2, 300, 650),
        new Bluza(true, 1, "verde", 2, 300, 650),
        new Bluza(true, 2, "verde", 2, 300, 650)
    };
    //</editor-fold>

    // <editor-fold desc="fustaList declarare">
    Fusta[] fustaList =
    {
        new Fusta(0, "alb", 2, 300, 650),
        new Fusta(1, "alb", 2, 300, 650),
        new Fusta(2, "alb", 2, 300, 650),
        new Fusta(0, "albastru", 2, 300, 650),
        new Fusta(1, "albastru", 2, 300, 650),
        new Fusta(2, "albastru", 2, 300, 650),
        new Fusta(0, "galben", 2, 300, 650),
        new Fusta(1, "galben", 2, 300, 650),
        new Fusta(2, "galben", 2, 300, 650),
        new Fusta(0, "maro", 2, 300, 650),
        new Fusta(1, "maro", 2, 300, 650),
        new Fusta(2, "maro", 2, 300, 650),
        new Fusta(0, "mov", 2, 300, 650),
        new Fusta(1, "mov", 2, 300, 650),
        new Fusta(2, "mov", 2, 300, 650),
        new Fusta(0, "negru", 2, 300, 650),
        new Fusta(1, "negru", 2, 300, 650),
        new Fusta(2, "negru", 2, 300, 650),
        new Fusta(0, "portocaliu", 2, 300, 650),
        new Fusta(1, "portocaliu", 2, 300, 650),
        new Fusta(2, "portocaliu", 2, 300, 650),
        new Fusta(0, "rosu", 2, 300, 650),
        new Fusta(1, "rosu", 2, 300, 650),
        new Fusta(2, "rosu", 2, 300, 650),
        new Fusta(0, "roz", 2, 300, 650),
        new Fusta(1, "roz", 2, 300, 650),
        new Fusta(2, "roz", 2, 300, 650),
        new Fusta(0, "verde", 2, 300, 650),
        new Fusta(1, "verde", 2, 300, 650),
        new Fusta(2, "verde", 2, 300, 650)
    };
    //</editor-fold>

    // <editor-fold desc="pantaloniList declarare">
    Pantaloni[] pantaloniList =
    {
        new Pantaloni(false, 0, "alb", 3, 350, 1200),
        new Pantaloni(false, 1, "alb", 3, 350, 1200),
        new Pantaloni(true, 2, "alb", 3, 350, 1200),
        new Pantaloni(true, 0, "albastru", 3, 350, 1200),
        new Pantaloni(true, 1, "albastru", 3, 350, 1200),
        new Pantaloni(false, 2, "albastru", 3, 350, 1200),
        new Pantaloni(false, 0, "galben", 3, 350, 1200),
        new Pantaloni(true, 1, "galben", 3, 350, 1200),
        new Pantaloni(true, 2, "galben", 3, 350, 1200),
        new Pantaloni(true, 0, "maro", 3, 350, 1200),
        new Pantaloni(true, 1, "maro", 3, 350, 1200),
        new Pantaloni(false, 2, "maro", 3, 350, 1200),
        new Pantaloni(false, 0, "mov", 3, 350, 1200),
        new Pantaloni(false, 1, "mov", 3, 350, 1200),
        new Pantaloni(true, 2, "mov", 3, 350, 1200),
        new Pantaloni(false, 0, "negru", 3, 350, 1200),
        new Pantaloni(true, 1, "negru", 3, 350, 1200),
        new Pantaloni(false, 2, "negru", 3, 350, 1200),
        new Pantaloni(true, 0, "portocaliu", 3, 350, 1200),
        new Pantaloni(true, 1, "portocaliu", 3, 350, 1200),
        new Pantaloni(false, 2, "portocaliu", 3, 350, 1200),
        new Pantaloni(false, 0, "rosu", 3, 350, 1200),
        new Pantaloni(true, 1, "rosu", 3, 350, 1200),
        new Pantaloni(true, 2, "rosu", 3, 350, 1200),
        new Pantaloni(true, 0, "roz", 3, 350, 1200),
        new Pantaloni(false, 1, "roz", 3, 350, 1200),
        new Pantaloni(true, 2, "roz", 3, 350, 1200),
        new Pantaloni(false, 0, "verde", 3, 350, 1200),
        new Pantaloni(true, 1, "verde", 3, 350, 1200),
        new Pantaloni(true, 2, "verde", 3, 350, 1200)
    };
    //</editor-fold>

    // <editor-fold desc="pantofiList declarare">
    Pantofi[] pantofiList =
    {
        new Pantofi(false, 0, "alb", 4, 350, 1300),
        new Pantofi(false, 1, "alb", 4, 350, 1300),
        new Pantofi(true, 2, "alb", 4, 350, 1300),
        new Pantofi(true, 0, "albastru", 4, 350, 1300),
        new Pantofi(true, 1, "albastru", 4, 350, 1300),
        new Pantofi(false, 2, "albastru", 4, 350, 1300),
        new Pantofi(false, 0, "galben", 4, 350, 1300),
        new Pantofi(true, 1, "galben", 4, 350, 1300),
        new Pantofi(true, 2, "galben", 4, 350, 1300),
        new Pantofi(true, 0, "maro", 4, 350, 1300),
        new Pantofi(true, 1, "maro", 4, 350, 1300),
        new Pantofi(false, 2, "maro", 4, 350, 1300),
        new Pantofi(false, 0, "mov", 4, 350, 1300),
        new Pantofi(false, 1, "mov", 4, 350, 1300),
        new Pantofi(true, 2, "mov", 4, 350, 1300),
        new Pantofi(false, 0, "negru", 4, 350, 1300),
        new Pantofi(true, 1, "negru", 4, 350, 1300),
        new Pantofi(false, 2, "negru", 4, 350, 1300),
        new Pantofi(true, 0, "portocaliu", 4, 350, 1300),
        new Pantofi(true, 1, "portocaliu", 4, 350, 1300),
        new Pantofi(false, 2, "portocaliu", 4, 350, 1300),
        new Pantofi(false, 0, "rosu", 4, 350, 1300),
        new Pantofi(true, 1, "rosu", 4, 350, 1300),
        new Pantofi(true, 2, "rosu", 4, 350, 1300),
        new Pantofi(true, 0, "roz", 4, 350, 1300),
        new Pantofi(false, 1, "roz", 4, 350, 1300),
        new Pantofi(true, 2, "roz", 4, 350, 1300),
        new Pantofi(false, 0, "verde", 4, 350, 1300),
        new Pantofi(true, 1, "verde", 4, 350, 1300),
        new Pantofi(true, 2, "verde", 4, 350, 1300)
    };
    //</editor-fold>

    public AvatarJFrameTEST()
    {
        initComponents(); 
       for (Component comp : layeredPane.getComponents())
       {
           if (comp instanceof JLabel)
           {
               comp.setVisible(true);
           }
       }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        leftPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaCuloare = new javax.swing.JList<>();
        alegereButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaIndex = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaClasa = new javax.swing.JList<>();
        labelMesaj = new javax.swing.JLabel();
        resetAvatarButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        layeredPane = new javax.swing.JLayeredPane();
        backgroundBodyLabel = new javax.swing.JLabel();
        parLabel = new javax.swing.JLabel();
        fataLabel = new javax.swing.JLabel();
        accesoriLabel = new javax.swing.JLabel();
        bluzaLabel = new javax.swing.JLabel();
        fustaLabel = new javax.swing.JLabel();
        pantaloniLabel = new javax.swing.JLabel();
        pantofiLabel = new javax.swing.JLabel();
        palarieLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Obiectul nr.", "Index", "Culoare", "Nume fisier"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tabel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabel.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);
        if (tabel.getColumnModel().getColumnCount() > 0)
        {
            tabel.getColumnModel().getColumn(0).setResizable(false);
            tabel.getColumnModel().getColumn(1).setResizable(false);
            tabel.getColumnModel().getColumn(2).setResizable(false);
            tabel.getColumnModel().getColumn(3).setResizable(false);
        }

        listaCuloare.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "alb", "albastru", "galben", "maro", "mov", "negru", "portocaliu", "rosu", "roz", "verde" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaCuloare);

        alegereButton.setText("Selecteaza");
        alegereButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                alegereButtonActionPerformed(evt);
            }
        });

        listaIndex.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "0", "1", "2", "all" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaIndex.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(listaIndex);

        listaClasa.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Palarie", "Par", "Fata", "Accesori", "Bluza", "Fusta", "Pantaloni", "Pantofi" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaClasa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(listaClasa);

        labelMesaj.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labelMesaj.setText("Selectati din fiecare lista cate un item");

        resetAvatarButton.setText("Reseteaza");
        resetAvatarButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                resetAvatarButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Salveaza avatarul");
        saveButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saveButton)
                    .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(leftPanelLayout.createSequentialGroup()
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                            .addComponent(alegereButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetAvatarButton))
                        .addComponent(jScrollPane1)
                        .addComponent(labelMesaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(labelMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alegereButton)
                    .addComponent(resetAvatarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(68, 68, 68))
        );

        layeredPane.setBackground(new java.awt.Color(255, 255, 255));
        layeredPane.setLayout(new java.awt.CardLayout());

        backgroundBodyLabel.setName("backgroundBodyLabel"); // NOI18N
        layeredPane.add(backgroundBodyLabel, "card2");
        ImageIcon backgroundBodyLabelImage=new ImageIcon("Resources\\Corp.png");
        backgroundBodyLabel.setIcon(backgroundBodyLabelImage);

        parLabel.setPreferredSize(new java.awt.Dimension(565, 800));
        layeredPane.setLayer(parLabel, 2);
        layeredPane.add(parLabel, "card5");

        fataLabel.setPreferredSize(new java.awt.Dimension(565, 800));
        layeredPane.setLayer(fataLabel, 1);
        layeredPane.add(fataLabel, "card6");

        accesoriLabel.setPreferredSize(new java.awt.Dimension(565, 800));
        layeredPane.setLayer(accesoriLabel, 8);
        layeredPane.add(accesoriLabel, "card8");

        bluzaLabel.setVisible(true);
        bluzaLabel.setPreferredSize(new java.awt.Dimension(565, 800));
        layeredPane.setLayer(bluzaLabel, 7);
        layeredPane.add(bluzaLabel, "card3");

        fustaLabel.setPreferredSize(new java.awt.Dimension(565, 800));
        layeredPane.setLayer(fustaLabel, 6);
        layeredPane.add(fustaLabel, "card4");

        pantaloniLabel.setPreferredSize(new java.awt.Dimension(565, 800));
        layeredPane.setLayer(pantaloniLabel, 5);
        layeredPane.add(pantaloniLabel, "card9");

        pantofiLabel.setPreferredSize(new java.awt.Dimension(565, 800));
        layeredPane.setLayer(pantofiLabel, 4);
        layeredPane.add(pantofiLabel, "card10");

        palarieLabel.setPreferredSize(new java.awt.Dimension(565, 800));
        layeredPane.setLayer(palarieLabel, 3);
        layeredPane.add(palarieLabel, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(layeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layeredPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

String obiectAles;
int j=0;
    private void alegereButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alegereButtonActionPerformed
  
        for (int k = 0; k <= j; k++)//reinitializarea tabelului (golirea)
        {
            tabel.setValueAt(null, k, 0);
            tabel.setValueAt(null, k, 1);
            tabel.setValueAt(null, k, 2);
            tabel.setValueAt(null, k, 3);
        }
        j = 0;
// sfarsit golire tabel == true

        if (listaClasa.isSelectionEmpty() || listaCuloare.isSelectionEmpty() || listaIndex.isSelectionEmpty())
        {
            labelMesaj.setText("Toate itemurile trebuie selectate");
        } else
        {
            obiectAles = listaClasa.getSelectedValue();

            switch (obiectAles)
            {
                case "Accesori":

                    if (listaIndex.getSelectedIndex() == 3)
                    {
                        for (int i = 0; i <= 29; i++)
                        {

                            if (accesoriList[i].getColor().equals(listaCuloare.getSelectedValue()))
                            {
                                tabel.setValueAt(j + 1, j, 0);
                                tabel.setValueAt(accesoriList[i].getIndex(), j, 1);
                                tabel.setValueAt(accesoriList[i].getColor(), j, 2);
                                tabel.setValueAt(accesoriList[i].getNumePng(), j, 3);
                                j++;
                            }
                        }
                    } else
                    {
                        for (int i = 0; i <= 29; i++)
                        {
                            if (accesoriList[i].getColor().equals(listaCuloare.getSelectedValue()) && accesoriList[i].getIndex() == listaIndex.getSelectedIndex())
                            {
                                tabel.setValueAt(j + 1, j, 0);
                                tabel.setValueAt(accesoriList[i].getIndex(), j, 1);
                                tabel.setValueAt(accesoriList[i].getColor(), j, 2);
                                tabel.setValueAt(accesoriList[i].getNumePng(), j, 3);
                                j++;
                            }
                        }
                    }


                    break;//**
                case "Fata":
                    if (listaIndex.getSelectedIndex() == 3)
                    {
                        for (int i = 0; i <= 29; i++)
                        {

                            if (fataList[i].getEyeColor().equals(listaCuloare.getSelectedValue()))
                            {
                                tabel.setValueAt(j + 1, j, 0);
                                tabel.setValueAt(fataList[i].getIndex(), j, 1);
                                tabel.setValueAt(fataList[i].getEyeColor(), j, 2);
                                tabel.setValueAt(fataList[i].getNumePng(), j, 3);
                                j++;
                            }
                        }
                    } else
                    {
                        for (int i = 0; i <= 29; i++)
                        {
                            if (fataList[i].getEyeColor().equals(listaCuloare.getSelectedValue()) && fataList[i].getIndex() == listaIndex.getSelectedIndex())
                            {
                                tabel.setValueAt(j + 1, j, 0);
                                tabel.setValueAt(fataList[i].getIndex(), j, 1);
                                tabel.setValueAt(fataList[i].getEyeColor(), j, 2);
                                tabel.setValueAt(fataList[i].getNumePng(), j, 3);
                                j++;
                            }
                        }
                    }

                    break;
                case "Par":
if (listaIndex.getSelectedIndex() == 3)
                    {
                        for (int i = 0; i <= 29; i++)
                        {

                            if (parList[i].getCuloarePar().equals(listaCuloare.getSelectedValue()))
                            {
                                tabel.setValueAt(j + 1, j, 0);
                                tabel.setValueAt(parList[i].getIndex(), j, 1);
                                tabel.setValueAt(parList[i].getCuloarePar(), j, 2);
                                tabel.setValueAt(parList[i].getNumePng(), j, 3);
                                j++;
                            }
                        }
                    } else
                    {
                        for (int i = 0; i <= 29; i++)
                        {
                            if (parList[i].getCuloarePar().equals(listaCuloare.getSelectedValue()) && parList[i].getIndex() == listaIndex.getSelectedIndex())
                            {
                                tabel.setValueAt(j + 1, j, 0);
                                tabel.setValueAt(parList[i].getIndex(), j, 1);
                                tabel.setValueAt(parList[i].getCuloarePar(), j, 2);
                                tabel.setValueAt(parList[i].getNumePng(), j, 3);
                                j++;
                            }
                        }
                    }

                    break;//**
                case "Palarie":
if (listaIndex.getSelectedIndex() == 3)
                    {
                        for (int i = 0; i <= 29; i++)
                        {

                            if (palarieList[i].getCuloarePalarie().equals(listaCuloare.getSelectedValue()))
                            {
                                tabel.setValueAt(j + 1, j, 0);
                                tabel.setValueAt(palarieList[i].getIndex(), j, 1);
                                tabel.setValueAt(palarieList[i].getCuloarePalarie(), j, 2);
                                tabel.setValueAt(palarieList[i].getNumePng(), j, 3);
                                j++;
                            }
                        }
                    } else
                    {
                        for (int i = 0; i <= 29; i++)
                        {
                            if (palarieList[i].getCuloarePalarie().equals(listaCuloare.getSelectedValue()) && palarieList[i].getIndex() == listaIndex.getSelectedIndex())
                            {
                                tabel.setValueAt(j + 1, j, 0);
                                tabel.setValueAt(palarieList[i].getIndex(), j, 1);
                                tabel.setValueAt(palarieList[i].getCuloarePalarie(), j, 2);
                                tabel.setValueAt(palarieList[i].getNumePng(), j, 3);
                                j++;
                            }
                        }
                    }

                    break;//**
                case "Bluza":
if (listaIndex.getSelectedIndex() == 3)
                    {
                        for (int i = 0; i <= 29; i++)
                        {

                            if (bluzaList[i].getColor().equals(listaCuloare.getSelectedValue()))
                            {
                                tabel.setValueAt(j + 1, j, 0);
                                tabel.setValueAt(bluzaList[i].getIndex(), j, 1);
                                tabel.setValueAt(bluzaList[i].getColor(), j, 2);
                                tabel.setValueAt(bluzaList[i].getNumePng(), j, 3);
                                j++;
                            }
                        }
                    } else
                    {
                        for (int i = 0; i <= 29; i++)
                        {
                            if (bluzaList[i].getColor().equals(listaCuloare.getSelectedValue()) && bluzaList[i].getIndex() == listaIndex.getSelectedIndex())
                            {
                                tabel.setValueAt(j + 1, j, 0);
                                tabel.setValueAt(bluzaList[i].getIndex(), j, 1);
                                tabel.setValueAt(bluzaList[i].getColor(), j, 2);
                                tabel.setValueAt(bluzaList[i].getNumePng(), j, 3);
                                j++;
                            }
                        }
                    }
                    break;//**
                 case "Pantaloni":
                    if (listaIndex.getSelectedIndex() == 3)
                    {
                        for (int i = 0; i <= 29; i++)
                        {

                            if (pantaloniList[i].getColor().equals(listaCuloare.getSelectedValue()))
                            {
                                tabel.setValueAt(j + 1, j, 0);
                                tabel.setValueAt(pantaloniList[i].getIndex(), j, 1);
                                tabel.setValueAt(pantaloniList[i].getColor(), j, 2);
                                tabel.setValueAt(pantaloniList[i].getNumePng(), j, 3);
                                j++;
                            }
                        }
                    } else
                    {
                        for (int i = 0; i <= 29; i++)
                        {
                            if (pantaloniList[i].getColor().equals(listaCuloare.getSelectedValue()) && pantaloniList[i].getIndex() == listaIndex.getSelectedIndex())
                            {
                                tabel.setValueAt(j + 1, j, 0);
                                tabel.setValueAt(pantaloniList[i].getIndex(), j, 1);
                                tabel.setValueAt(pantaloniList[i].getColor(), j, 2);
                                tabel.setValueAt(pantaloniList[i].getNumePng(), j, 3);
                                j++;
                            }
                        }
                    }

                    break;

 case "Pantofi":
                    if (listaIndex.getSelectedIndex() == 3)
                    {
                        for (int i = 0; i <= 29; i++)
                        {

                            if (pantofiList[i].getColor().equals(listaCuloare.getSelectedValue()))
                            {
                                tabel.setValueAt(j + 1, j, 0);
                                tabel.setValueAt(pantofiList[i].getIndex(), j, 1);
                                tabel.setValueAt(pantofiList[i].getColor(), j, 2);
                                tabel.setValueAt(pantofiList[i].getNumePng(), j, 3);
                                j++;
                            }
                        }
                    } else
                    {
                        for (int i = 0; i <= 29; i++)
                        {
                            if (pantofiList[i].getColor().equals(listaCuloare.getSelectedValue()) && pantofiList[i].getIndex() == listaIndex.getSelectedIndex())
                            {
                                tabel.setValueAt(j + 1, j, 0);
                                tabel.setValueAt(pantofiList[i].getIndex(), j, 1);
                                tabel.setValueAt(pantofiList[i].getColor(), j, 2);
                                tabel.setValueAt(pantofiList[i].getNumePng(), j, 3);
                                j++;
                            }
                        }
                    }

                    break;

 case "Fusta":
                    if (listaIndex.getSelectedIndex() == 3)
                    {
                        for (int i = 0; i <= 29; i++)
                        {

                            if (fustaList[i].getColor().equals(listaCuloare.getSelectedValue()))
                            {
                                tabel.setValueAt(j + 1, j, 0);
                                tabel.setValueAt(fustaList[i].getIndex(), j, 1);
                                tabel.setValueAt(fustaList[i].getColor(), j, 2);
                                tabel.setValueAt(fustaList[i].getNumePng(), j, 3);
                                j++;
                            }
                        }
                    } else
                    {
                        for (int i = 0; i <= 29; i++)
                        {
                            if (fustaList[i].getColor().equals(listaCuloare.getSelectedValue()) && fustaList[i].getIndex() == listaIndex.getSelectedIndex())
                            {
                                tabel.setValueAt(j + 1, j, 0);
                                tabel.setValueAt(fustaList[i].getIndex(), j, 1);
                                tabel.setValueAt(fustaList[i].getColor(), j, 2);
                                tabel.setValueAt(fustaList[i].getNumePng(), j, 3);
                                j++;
                            }
                        }
                    }

                    break;
            }

        }
    }//GEN-LAST:event_alegereButtonActionPerformed
int r;
    private void tabelMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tabelMouseClicked
    {//GEN-HEADEREND:event_tabelMouseClicked

        r=tabel.getSelectedRow();
        try{
                switch (obiectAles)
            {
                case "Accesori":
					ImageIcon accesoriImageIcon=new ImageIcon("Resources\\accesorii\\"+tabel.getValueAt(r, 3));
                    accesoriLabel.setIcon(accesoriImageIcon);
                    break;//
                case "Fata":
                    
                    ImageIcon fataImageIcon=new ImageIcon("Resources\\fata\\"+tabel.getValueAt(r, 3));
                    fataLabel.setIcon(fataImageIcon);

                    break;
                case "Par":
				
                    ImageIcon parImageIcon=new ImageIcon("Resources\\par\\"+tabel.getValueAt(r, 3));
                    parLabel.setIcon(parImageIcon);
					
                    break;//
                case "Palarie":
				
                    ImageIcon palarieImageIcon=new ImageIcon("Resources\\palarie\\"+tabel.getValueAt(r, 3));
                    palarieLabel.setIcon(palarieImageIcon);
	
                    break;//
								
                case "Bluza":
								
                    ImageIcon bluzaImageIcon=new ImageIcon("Resources\\bluza\\"+tabel.getValueAt(r, 3));
                    bluzaLabel.setIcon(bluzaImageIcon);
	
                    break;//
                case "Fusta":
								
                    ImageIcon fustaImageIcon=new ImageIcon("Resources\\fusta\\"+tabel.getValueAt(r, 3));
                    fustaLabel.setIcon(fustaImageIcon);
	
                    break;//
                case "Pantaloni":
								
                    ImageIcon pantaloniImageIcon=new ImageIcon("Resources\\pantaloni\\"+tabel.getValueAt(r, 3));
                    pantaloniLabel.setIcon(pantaloniImageIcon);
	
                    break;//
                case "Pantofi":
								
                    ImageIcon pantofiImageIcon=new ImageIcon("Resources\\pantofi\\"+tabel.getValueAt(r, 3));
                    pantofiLabel.setIcon(pantofiImageIcon);
	
                    break;//**
            }
        }
        catch (NullPointerException N)
        {
            fataLabel.setIcon(null);
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void resetAvatarButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_resetAvatarButtonActionPerformed
    {//GEN-HEADEREND:event_resetAvatarButtonActionPerformed
        for(Component comp : layeredPane.getComponents())
        {
            if(comp instanceof JLabel)
            {
                JLabel label=(JLabel) comp;
                if(label.getName()==null||label.getName().equals("backgroundBodyLabel")==false)
                {
                label.setIcon(null);
                }
            }
        }
    }//GEN-LAST:event_resetAvatarButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveButtonActionPerformed
    {//GEN-HEADEREND:event_saveButtonActionPerformed
               int x = 0;
        int y = 0;
        int width = backgroundBodyLabel.getWidth();
        int height = backgroundBodyLabel.getHeight();

        try {
            Point labelLocation = backgroundBodyLabel.getLocationOnScreen();
            x = labelLocation.x;
            y = labelLocation.y;

            Robot robot = new Robot();
            Rectangle captureRect = new Rectangle(x, y, width, height);
            BufferedImage screenshot = robot.createScreenCapture(captureRect);

            JFileChooser fileChooser = new JFileChooser();

            // Filtru pentru png momentan
            FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG Images", "png");
            fileChooser.setFileFilter(filter);

            int userSelection = fileChooser.showSaveDialog(this);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();

                // Verifica daca are png, probabil obsolete
                if (!fileToSave.getAbsolutePath().toLowerCase().endsWith(".png")) {
                    fileToSave = new File(fileToSave.getAbsolutePath() + ".png");
                }

                ImageIO.write(screenshot, "png", fileToSave);

                JOptionPane.showMessageDialog(this, "Salvat");
            }
        } catch (AWTException | IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "A luat foc laptopul!!!");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

//    public static ImageIcon scaleImage(String imagePath, int maxWidth, int maxHeight)
//    {
//        ImageReader imageReader = new ImageReader(imagePath);
//        BufferedImage image = imageReader.getImage();
//
//        double scale = Math.min((double) maxWidth / image.getWidth(), (double) maxHeight / image.getHeight());
//        int scaledWidth = (int) (image.getWidth() * scale);
//        int scaledHeight = (int) (image.getHeight() * scale);
//
//        Image scaledImage = image.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
//        return new ImageIcon(scaledImage);
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("FlatLaf Light".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(AvatarJFrameTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AvatarJFrameTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AvatarJFrameTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AvatarJFrameTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new AvatarJFrameTEST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accesoriLabel;
    private javax.swing.JButton alegereButton;
    private javax.swing.JLabel backgroundBodyLabel;
    private javax.swing.JLabel bluzaLabel;
    private javax.swing.JLabel fataLabel;
    private javax.swing.JLabel fustaLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelMesaj;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JList<String> listaClasa;
    private javax.swing.JList<String> listaCuloare;
    private javax.swing.JList<String> listaIndex;
    private javax.swing.JLabel palarieLabel;
    private javax.swing.JLabel pantaloniLabel;
    private javax.swing.JLabel pantofiLabel;
    private javax.swing.JLabel parLabel;
    private javax.swing.JButton resetAvatarButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
