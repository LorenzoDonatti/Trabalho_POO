package TrabalhoFinal;

import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Principal extends javax.swing.JFrame {
    List<Treinador> Treinadorlist;
    TreeSet<Treinador> Treinadortree;
    Comparator<Treinador> comparaT;
    List<Jogador> Jogadorlist;
    Comparator<Jogador> comparaJ;
    TreeSet<Jogador> Jogadortree;
    
    String modoFunc;
      
    public void LoadTableJog(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Idade","Nome", "Posição", "Títulos"},0);
        Iterator<Jogador> jog = Jogadortree.iterator();
        while (jog.hasNext()) {
            Jogador next = jog.next();
            Object linha[] = new Object[]{next.getIdade(),
                                          next.getNome(),
                                          next.getPosic(),
                                          next.getTitulos()};
                modelo.addRow(linha);
          }
        tbl_jog.setModel(modelo);
        tbl_jog.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbl_jog.getColumnModel().getColumn(1).setPreferredWidth(100);
        tbl_jog.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbl_jog.getColumnModel().getColumn(3).setPreferredWidth(100);
    }
     
            
    public void LoadTableTrein(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Idade","Nome", "Jogo", "Títulos"},0);
        Iterator<Treinador> trein = Treinadortree.iterator();
	while (trein.hasNext()) {
            Treinador next = trein.next();
            Object linha[] = new Object[]{next.getIdade(),
                                          next.getNome(),
                                          next.getEstiloJogo(),
                                          next.getTitulos()};
            modelo.addRow(linha);
	}   
        
        tbl_trein.setModel(modelo);
        tbl_trein.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbl_trein.getColumnModel().getColumn(1).setPreferredWidth(100);
        tbl_trein.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbl_trein.getColumnModel().getColumn(3).setPreferredWidth(100);
    }
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        Treinadorlist = new ArrayList<Treinador>();
        comparaT = Comparator.comparing(Treinador::Avalia);
        Treinadortree = new TreeSet<>(comparaT);
        Jogadorlist = new ArrayList<Jogador>();
        comparaJ = Comparator.comparing(Jogador::Avalia);
        Jogadortree = new TreeSet<>(comparaJ);
        modoFunc = "Navegar";
        ManipulaInterfaceFunc();
    }
    
    
    public void ManipulaInterfaceFunc(){
        switch(modoFunc){
            case "Navegar":
                btn_func_salvar.setEnabled(true);
                btn_func_cancelar.setEnabled(false);
                btn_func_novo.setEnabled(true);
                btn_func_buscar.setEnabled(true);
                btn_func_excluir.setEnabled(true);
                c_func_idade.setEnabled(false);
                c_func_nome.setEnabled(false);
                c_func_tit.setEnabled(false);
                Rb_Treinador.setEnabled(false);
                Rb_Treinador1.setEnabled(false);
                c_func_ejog.setEnabled(false);
                Rb_Jogador.setEnabled(false);
                Rb_Jogador1.setEnabled(false);
                c_func_gol.setEnabled(false);
                c_func_sgol.setEnabled(false);
                c_func_pos.setEnabled(false);
                c_func_nome1.setEnabled(false);
                btn_func_buscar1.setEnabled(false);
                btn_func_excluir1.setEnabled(false);
                c_func_gest.setEnabled(false);
                c_func_exp.setEnabled(false);
                break;
            
            case "Novo":
                btn_func_salvar.setEnabled(true);
                btn_func_cancelar.setEnabled(true);
                c_func_idade.setEnabled(true);
                c_func_nome.setEnabled(true);
                c_func_tit.setEnabled(true);
                btn_func_novo.setEnabled(false);
                btn_func_buscar.setEnabled(false);
                btn_func_excluir.setEnabled(false);
                Rb_Treinador.setEnabled(true);
                Rb_Jogador.setEnabled(true);
                c_func_gol.setEnabled(true);
                c_func_sgol.setEnabled(true);
                c_func_pos.setEnabled(true);
                c_func_gest.setEnabled(true);
                c_func_exp.setEnabled(true);
                c_func_ejog.setEnabled(true);
                Rb_Treinador1.setEnabled(false);
                Rb_Jogador1.setEnabled(false);
                c_func_nome1.setEnabled(false);
                btn_func_buscar1.setEnabled(false);
                btn_func_excluir1.setEnabled(false);
                break;
                
            case "Buscar":
                btn_func_salvar.setEnabled(false);
                btn_func_cancelar.setEnabled(false);
                c_func_idade.setEnabled(false);
                c_func_nome.setEnabled(false);
                c_func_tit.setEnabled(false);
                btn_func_novo.setEnabled(false);
                btn_func_buscar.setEnabled(false);
                btn_func_excluir.setEnabled(false);
                Rb_Treinador.setEnabled(false);
                c_func_ejog.setEnabled(false);
                Rb_Jogador.setEnabled(false);
                c_func_gol.setEnabled(false);
                c_func_sgol.setEnabled(false);
                c_func_pos.setEnabled(false);
                c_func_gest.setEnabled(false);
                c_func_exp.setEnabled(false);
                c_func_nome1.setEnabled(false);
                Rb_Treinador1.setEnabled(true);
                Rb_Jogador1.setEnabled(true);
                btn_func_excluir1.setEnabled(false);
                btn_func_buscar1.setEnabled(true);
                break;
                
            case "Excluir":
                btn_func_salvar.setEnabled(false);
                btn_func_cancelar.setEnabled(false);
                c_func_idade.setEnabled(false);
                c_func_nome.setEnabled(false);
                c_func_tit.setEnabled(false);
                btn_func_novo.setEnabled(false);
                btn_func_buscar.setEnabled(false);
                btn_func_excluir.setEnabled(false);
                Rb_Treinador.setEnabled(false);
                c_func_ejog.setEnabled(false);
                c_func_pos.setEnabled(false);
                Rb_Jogador.setEnabled(false);
                c_func_gol.setEnabled(false);
                c_func_sgol.setEnabled(false);
                c_func_pos.setEnabled(false);
                btn_func_buscar1.setEnabled(false);
                btn_func_excluir1.setEnabled(true);
                Rb_Jogador1.setEnabled(true);
                Rb_Treinador1.setEnabled(true);
                c_func_nome1.setEnabled(true);
                break;
                
            case "RbTreinador":
                btn_func_salvar.setEnabled(true);
                btn_func_cancelar.setEnabled(true);
                c_func_idade.setEnabled(true);
                c_func_nome.setEnabled(true);
                c_func_tit.setEnabled(true);
                btn_func_novo.setEnabled(false);
                btn_func_buscar.setEnabled(false);
                btn_func_excluir.setEnabled(false);
                Rb_Treinador.setEnabled(true);
                Rb_Jogador.setEnabled(true);
                c_func_gol.setEnabled(false);
                c_func_sgol.setEnabled(false);
                c_func_pos.setEnabled(false);
                c_func_gest.setEnabled(true);
                c_func_exp.setEnabled(true);
                c_func_ejog.setEnabled(true);
                Rb_Treinador1.setEnabled(false);
                Rb_Jogador1.setEnabled(false);
                c_func_nome1.setEnabled(false);
                btn_func_buscar1.setEnabled(false);
                btn_func_excluir1.setEnabled(false);
                break;
                
            case "RbJogador":
                btn_func_salvar.setEnabled(true);
                btn_func_cancelar.setEnabled(true);
                c_func_idade.setEnabled(true);
                c_func_nome.setEnabled(true);
                c_func_tit.setEnabled(true);
                btn_func_novo.setEnabled(false);
                btn_func_buscar.setEnabled(false);
                btn_func_excluir.setEnabled(false);
                Rb_Treinador.setEnabled(true);
                Rb_Jogador.setEnabled(true);
                c_func_gol.setEnabled(true);
                c_func_sgol.setEnabled(true);
                c_func_pos.setEnabled(true);
                c_func_gest.setEnabled(false);
                c_func_exp.setEnabled(false);
                c_func_ejog.setEnabled(false);
                Rb_Treinador1.setEnabled(false);
                Rb_Jogador1.setEnabled(false);
                c_func_nome1.setEnabled(false);
                btn_func_buscar1.setEnabled(false);
                btn_func_excluir1.setEnabled(false);
                break; 
            default: System.out.println("Modo inválido");
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Seleciona = new javax.swing.ButtonGroup();
        Seleciona2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btn_func_buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_jog = new javax.swing.JTable();
        btn_func_excluir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        c_func_ejog = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c_func_nome = new javax.swing.JTextField();
        btn_func_salvar = new javax.swing.JButton();
        btn_func_cancelar = new javax.swing.JButton();
        c_func_tit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        c_func_idade = new javax.swing.JTextField();
        c_func_exp = new javax.swing.JTextField();
        c_func_gest = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        c_func_sgol = new javax.swing.JTextField();
        c_func_pos = new javax.swing.JTextField();
        c_func_gol = new javax.swing.JTextField();
        Rb_Treinador = new javax.swing.JRadioButton();
        Rb_Jogador = new javax.swing.JRadioButton();
        btn_func_novo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        c_func_nome1 = new javax.swing.JTextField();
        btn_func_buscar1 = new javax.swing.JButton();
        btn_func_excluir1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Rb_Treinador1 = new javax.swing.JRadioButton();
        Rb_Jogador1 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_trein = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_func_buscar.setText("Buscar");
        btn_func_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_buscarActionPerformed(evt);
            }
        });

        tbl_jog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Idade", "Nome", "Posição", "Títulos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_jog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_jogMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_jog);
        if (tbl_jog.getColumnModel().getColumnCount() > 0) {
            tbl_jog.getColumnModel().getColumn(0).setResizable(false);
            tbl_jog.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_jog.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbl_jog.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        btn_func_excluir.setText("Excluir");
        btn_func_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_excluirActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Novo"));

        jLabel3.setText("Idade:");

        jLabel4.setText("Nome:");

        btn_func_salvar.setText("Salvar");
        btn_func_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_salvarActionPerformed(evt);
            }
        });

        btn_func_cancelar.setText("Cancelar");
        btn_func_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_cancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Titulos:");

        jLabel2.setText("Função:");

        jLabel5.setText("Estilo de Jogo:");

        jLabel12.setText("Experiência:");

        jLabel13.setText("Gestão de Elenco:");

        jLabel14.setText("Gols:");

        jLabel15.setText("S/Sofrer Gols:");

        jLabel16.setText("Posição:");

        Seleciona.add(Rb_Treinador);
        Rb_Treinador.setText("Treinador");
        Rb_Treinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb_TreinadorActionPerformed(evt);
            }
        });

        Seleciona.add(Rb_Jogador);
        Rb_Jogador.setText("Jogador");
        Rb_Jogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb_JogadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(35, 35, 35))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(c_func_nome)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_func_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_func_cancelar)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(c_func_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c_func_tit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c_func_ejog, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c_func_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c_func_gest, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Rb_Jogador)
                                                .addComponent(Rb_Treinador)))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel14)
                                            .addGap(57, 57, 57)
                                            .addComponent(c_func_gol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel15)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(c_func_pos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(c_func_sgol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(69, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_func_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_func_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rb_Treinador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(c_func_tit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rb_Jogador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(c_func_ejog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(c_func_gol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(c_func_exp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(c_func_sgol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_func_gest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16)
                    .addComponent(c_func_pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_func_salvar)
                    .addComponent(btn_func_cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_func_novo.setText("Novo");
        btn_func_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_novoActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar/Excluir"));

        jLabel7.setText("Nome:");

        btn_func_buscar1.setText("Buscar");
        btn_func_buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_buscar1ActionPerformed(evt);
            }
        });

        btn_func_excluir1.setText("Excluir");
        btn_func_excluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_func_excluir1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Função:");

        Seleciona2.add(Rb_Treinador1);
        Rb_Treinador1.setText("Treinador");
        Rb_Treinador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb_Treinador1ActionPerformed(evt);
            }
        });

        Seleciona2.add(Rb_Jogador1);
        Rb_Jogador1.setText("Jogador");
        Rb_Jogador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb_Jogador1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rb_Treinador1)
                        .addGap(18, 18, 18)
                        .addComponent(Rb_Jogador1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addComponent(c_func_nome1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btn_func_buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(btn_func_excluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(c_func_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Rb_Treinador1)
                        .addComponent(Rb_Jogador1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_func_buscar1)
                    .addComponent(btn_func_excluir1))
                .addGap(26, 26, 26))
        );

        tbl_trein.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Idade", "Nome", "Estilo", "Títulos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_trein.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_treinMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_trein);
        if (tbl_trein.getColumnModel().getColumnCount() > 0) {
            tbl_trein.getColumnModel().getColumn(0).setResizable(false);
            tbl_trein.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_trein.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbl_trein.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_func_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btn_func_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_func_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_func_novo)
                    .addComponent(btn_func_buscar)
                    .addComponent(btn_func_excluir))
                .addGap(8, 8, 8)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(603, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Equipe Técnica", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpa_campos(){
        c_func_nome.setText("");
        c_func_idade.setText("");
        c_func_tit.setText("");
        c_func_ejog.setText("");
        c_func_exp.setText("");
        c_func_gest.setText("");
        c_func_gol.setText("");
        c_func_sgol.setText("");
        c_func_pos.setText("");
        c_func_nome1.setText("");
    }
    private void btn_func_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_novoActionPerformed
        modoFunc = "Novo";
        ManipulaInterfaceFunc();
    }//GEN-LAST:event_btn_func_novoActionPerformed

    private void btn_func_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_excluirActionPerformed
        modoFunc = "Excluir";
        ManipulaInterfaceFunc();
    }//GEN-LAST:event_btn_func_excluirActionPerformed

    private void tbl_jogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_jogMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_jogMouseClicked

    private void btn_func_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_buscarActionPerformed
        modoFunc = "Buscar";
        ManipulaInterfaceFunc();
    }//GEN-LAST:event_btn_func_buscarActionPerformed

    private void btn_func_buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_buscar1ActionPerformed
        // TODO add your handling code here:
        Iterator<Jogador> jog = Jogadortree.iterator();
        Iterator<Treinador> trein = Treinadortree.iterator();
        if(Rb_Jogador1.isSelected()){
            if(!jog.hasNext()){
                JOptionPane.showMessageDialog(rootPane, "Não há jogadores listados");
            }
            while (jog.hasNext()) {
                Jogador next = jog.next();
                JOptionPane.showMessageDialog(rootPane, "Jogador: " + next.getNome()+ " com Avaliacao: "+next.Avalia());
            }
            
       }else if(Rb_Treinador1.isSelected()){ 
           if(!trein.hasNext()){
                JOptionPane.showMessageDialog(rootPane, "Não há treinadores listados");
            }
           while (trein.hasNext()) {
		Treinador next = trein.next();
                JOptionPane.showMessageDialog(rootPane, "treinador: "+ next.getNome()+ " com Avaliacao: "+next.Avalia());
            }
        }
        modoFunc = "Navegar";
        ManipulaInterfaceFunc();
        limpa_campos();
    }//GEN-LAST:event_btn_func_buscar1ActionPerformed

    private void btn_func_excluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_excluir1ActionPerformed
        // TODO add your handling code here:
        int a1=0,a2=0, b1=0, b2=0;
        if(Rb_Jogador1.isSelected()){
            Iterator<Jogador> jog = Jogadortree.iterator();
            if(!jog.hasNext()){
                JOptionPane.showMessageDialog(rootPane, "Não há jogadores listados");
            }
            while (jog.hasNext()) {
                Jogador next = jog.next();
		if (!next.getNome().equals(c_func_nome1.getText())) {       
                    a1 = 1;
                }else {
                    a2=1;
                    jog.remove();
                    LoadTableJog();
                    JOptionPane.showMessageDialog(rootPane, "Jogador removido");
                }
            }
            if(a1==1&&a2==0){
                JOptionPane.showMessageDialog(rootPane, "Nada encontrado");
            }
       }else if(Rb_Treinador1.isSelected()){ 
            Iterator<Treinador> trein = Treinadortree.iterator();
            if(!trein.hasNext()){
                JOptionPane.showMessageDialog(rootPane, "Não há treinadores listados");
            }
            while (trein.hasNext()) {
                Treinador next = trein.next();
                if (!next.getNome().equals(c_func_nome1.getText())) {
                    b1=1;
                }else {
                    b2=1;
                    trein.remove();
                    LoadTableTrein();
                }
            }
            if(b1==1&&b2==0){
                JOptionPane.showMessageDialog(rootPane, "Nada encontrado");
            }
        }
        modoFunc = "Navegar";
        ManipulaInterfaceFunc(); 
        limpa_campos();
    }//GEN-LAST:event_btn_func_excluir1ActionPerformed

    private void btn_func_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_cancelarActionPerformed
        limpa_campos();
        modoFunc = "Navegar";
        ManipulaInterfaceFunc();
    }//GEN-LAST:event_btn_func_cancelarActionPerformed

    private void btn_func_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_func_salvarActionPerformed
        if(Rb_Jogador.isSelected()){
            if(c_func_pos.getText().equalsIgnoreCase("def")){
            Jogadorlist.add(new Jogador(c_func_nome.getText(), Integer.parseInt(c_func_idade.getText()), Integer.parseInt(c_func_tit.getText()), Integer.parseInt(c_func_gol.getText()), Integer.parseInt(c_func_sgol.getText()), c_func_pos.getText()));
            Jogadortree.add(Jogadorlist.get(0));
            Jogadorlist.clear(); 
            LoadTableJog();
            }
            else if(c_func_pos.getText().equalsIgnoreCase("mei")){
            Jogadorlist.add(new Jogador(c_func_nome.getText(), Integer.parseInt(c_func_idade.getText()), Integer.parseInt(c_func_tit.getText()), Integer.parseInt(c_func_gol.getText()), Integer.parseInt(c_func_sgol.getText()), c_func_pos.getText()));
            Jogadortree.add(Jogadorlist.get(0));
            Jogadorlist.clear(); 
            LoadTableJog();
            }
            else if(c_func_pos.getText().equalsIgnoreCase("ata")){
            Jogadorlist.add(new Jogador(c_func_nome.getText(), Integer.parseInt(c_func_idade.getText()), Integer.parseInt(c_func_tit.getText()), Integer.parseInt(c_func_gol.getText()), Integer.parseInt(c_func_sgol.getText()), c_func_pos.getText()));
            Jogadortree.add(Jogadorlist.get(0));
            Jogadorlist.clear(); 
            LoadTableJog();
            }
            else{
            JOptionPane.showMessageDialog(rootPane, "Posição invalida");
            Jogadorlist.clear();
            }
        }else if(Rb_Treinador.isSelected()){
            int a = Integer.parseInt(c_func_exp.getText());
            int b = Integer.parseInt(c_func_gest.getText());
            if((a < 4) && a >0 && b>0 && b < 4){
                Treinadorlist.add(new Treinador(c_func_nome.getText(), Integer.parseInt(c_func_idade.getText()), Integer.parseInt(c_func_tit.getText()), c_func_ejog.getText(),  Integer.parseInt(c_func_exp.getText()),  Integer.parseInt(c_func_gest.getText())));
                Treinadortree.add(Treinadorlist.get(0));
                Treinadorlist.clear();
                LoadTableTrein();}
            else{
                JOptionPane.showMessageDialog(rootPane, "Atributos inválidos");}
                Treinadorlist.clear();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Selecione entre Jogador e Treinador");
        }
        //LoadTableFunc();
        modoFunc = "Navegar";
        ManipulaInterfaceFunc();
        limpa_campos();
    }//GEN-LAST:event_btn_func_salvarActionPerformed

    private void Rb_JogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb_JogadorActionPerformed
        // TODO add your handling code here:
        modoFunc = "RbJogador";
        ManipulaInterfaceFunc();
    }//GEN-LAST:event_Rb_JogadorActionPerformed

    private void Rb_TreinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb_TreinadorActionPerformed
        // TODO add your handling code here:
        modoFunc = "RbTreinador";
        ManipulaInterfaceFunc();
    }//GEN-LAST:event_Rb_TreinadorActionPerformed

    private void Rb_Treinador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb_Treinador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rb_Treinador1ActionPerformed

    private void Rb_Jogador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb_Jogador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rb_Jogador1ActionPerformed

    private void tbl_treinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_treinMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_treinMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Rb_Jogador;
    private javax.swing.JRadioButton Rb_Jogador1;
    private javax.swing.JRadioButton Rb_Treinador;
    private javax.swing.JRadioButton Rb_Treinador1;
    private javax.swing.ButtonGroup Seleciona;
    private javax.swing.ButtonGroup Seleciona2;
    private javax.swing.JButton btn_func_buscar;
    private javax.swing.JButton btn_func_buscar1;
    private javax.swing.JButton btn_func_cancelar;
    private javax.swing.JButton btn_func_excluir;
    private javax.swing.JButton btn_func_excluir1;
    private javax.swing.JButton btn_func_novo;
    private javax.swing.JButton btn_func_salvar;
    private javax.swing.JTextField c_func_ejog;
    private javax.swing.JTextField c_func_exp;
    private javax.swing.JTextField c_func_gest;
    private javax.swing.JTextField c_func_gol;
    private javax.swing.JTextField c_func_idade;
    private javax.swing.JTextField c_func_nome;
    private javax.swing.JTextField c_func_nome1;
    private javax.swing.JTextField c_func_pos;
    private javax.swing.JTextField c_func_sgol;
    private javax.swing.JTextField c_func_tit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_jog;
    private javax.swing.JTable tbl_trein;
    // End of variables declaration//GEN-END:variables
}



