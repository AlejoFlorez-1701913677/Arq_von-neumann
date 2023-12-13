/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.styles.main;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.text.DefaultCaret;
import javax.swing.SwingWorker;
import javax.swing.SwingUtilities;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author EquipoDinamita
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    int aux = 1;
    int ciclo = 0;
    String codop = "vacio";
    String inst1 = "instr 1";
    String inst2 = "instr 2";
    String numeroBinarioGenerado ="";
    ArrayList<String> Memorias = new ArrayList<>();


    public main() {

        initComponents();

        setSize(1366, 768);
        setResizable(false);
        jPanelGeneral.setSize(1366, 768);

        setTitle("Proyecto Arquitectura Computadores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnStepByStep.setVisible(false);
        jLabel10.setVisible(false);
        jPanelFondo.setBackground(new Color(52, 73, 85));
        jPanelGeneral.setBackground(new Color(52, 73, 85));
    }

         public static String generarNumeroBinario() {
        // Crear un objeto Random
         Random rand = new Random();

        // Generar un número aleatorio entre 0 y 63
        int numeroAleatorio = rand.nextInt(64);

        // Convertir el número a su representación binaria
        String numeroBinario = Integer.toBinaryString(numeroAleatorio);

        // Asegurarse de que el número binario tenga 6 dígitos (para cubrir el rango de 0 a 63)
        numeroBinario = String.format("%6s", numeroBinario).replace(' ', '0');

        return numeroBinario;
    }  

    
    
    public void captacion1(String dir, String dir2, int ciclo) throws InterruptedException {

        if (ciclo == 1) {
            jTFuc.setText(dir);
        }
        if (ciclo == 2) {
            jTFuc.setText(dir2);
        }
    }

    public void captacion2(String dir, String dir2, int ciclo) throws InterruptedException {

        if (ciclo == 1) {
            jTFuc.setText("");
            jTFpc.setText(dir);
        }
        if (ciclo == 2) {
            jTFuc.setText("");
            jTFpc.setText(dir2);
        }
    }

    public void captacion3(String dir, String dir2, int ciclo) throws InterruptedException {

        if (ciclo == 1) {
            jTFpc.setText("");
            jTFmar.setText(dir);
        }
        if (ciclo == 2) {
            jTFpc.setText("");
            jTFmar.setText(dir2);
        }
    }

    public void captacion4(String dir, String dir2, int ciclo) throws InterruptedException {

        if (ciclo == 1) {
            JTARegistros.append(dir + "\n");
            jTFmar.setText("");
            jTFbIntr.setText(dir);
        }
        if (ciclo == 2) {
            jTFac.setText(dir);
            JTARegistros.append(dir2 + "\n");
            jTFmar.setText("");
            jTFbIntr.setText(dir2);
        }
    }

    public void captacion5(String dir, String dir2, int ciclo) throws InterruptedException {

        if (ciclo == 1) {
            jTFbDatos.setText("");
            jTAalu.setText("Orden: \nmover dato de memoria a bus de datos \n" + dir);//move 
        }
        if (ciclo == 2) {
            jTFbDatos.setText("");
            jTAalu.setText("Orden: \nmover dato de memoria a bus de datos \n" + dir2);
        }

    }

    public void captacion6(String dir, String dir2, int ciclo) throws InterruptedException {

        if (ciclo == 1) {
            jTFuc.setText("");
            jTFbControl.setText(dir);
        }
        if (ciclo == 2) {
            jTFuc.setText("");
            jTFbControl.setText(dir2);
        }
    }

    public void captacion7(String dir, String dir2, int ciclo) throws InterruptedException {
        if (ciclo == 1) {
            jTFuc.setText("");
            jTFbControl.setText("");
            //mme > bdatos
            jTFmemoria.setText("");
            jTFbDatos.setText(dir);
        }
        if (ciclo == 2) {
            jTFuc.setText("");
            jTFbControl.setText("");
            //mme > bdatos
            jTFmemoria.setText("");
            jTFbDatos.setText(dir2);
        }

    }

    public void captacion8(String dir, String dir2, int ciclo) throws InterruptedException {

        if (ciclo == 1) {
            jTFbDatos.setText("");
            jTFmbr.setText(dir);
        }
        if (ciclo == 2) {
            jTFbDatos.setText("");
            jTFmbr.setText(dir2);
        }
    }

    public void captacion9(String dir, String dir2, int ciclo) {

        if (ciclo == 1) {
            jTFmbr.setText("");
            jTFir.setText(dir);
            jTFmemoria.setText(JTARegistros.getText() + "\n");
        }
        if (ciclo == 2) {
            jTFmbr.setText("");
            jTFmemoria.setText(JTARegistros.getText() + "\n");
            jTFir.setText(dir2);
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

        jPanelGeneral = new javax.swing.JPanel();
        jPanelFondo = new javax.swing.JPanel();
        listRegistros = new java.awt.List();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jTFintrucComp = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnExe = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnShowCodops = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        btnRestart = new javax.swing.JButton();
        btnStepByStep = new javax.swing.JButton();
        jPanelMemoria = new javax.swing.JPanel();
        listRegistros2 = new java.awt.List();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jTFbDatos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFbControl = new javax.swing.JTextField();
        jTFbIntr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTFmemoria = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelCPU = new javax.swing.JPanel();
        listRegistros1 = new java.awt.List();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel14 = new javax.swing.JLabel();
        jTFac = new javax.swing.JTextField();
        jTFmar = new javax.swing.JTextField();
        jTFmbr = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTARegistros = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFpc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAalu = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jTFir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFuc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanelGeneral.setBackground(new java.awt.Color(255, 255, 255));
        jPanelGeneral.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jPanelGeneral.setPreferredSize(new java.awt.Dimension(1366, 768));

        javax.swing.GroupLayout jPanelGeneralLayout = new javax.swing.GroupLayout(jPanelGeneral);
        jPanelGeneral.setLayout(jPanelGeneralLayout);
        jPanelGeneralLayout.setHorizontalGroup(
            jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 876, Short.MAX_VALUE)
        );
        jPanelGeneralLayout.setVerticalGroup(
            jPanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        jPanelFondo.setBackground(new java.awt.Color(52, 73, 85));
        jPanelFondo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanelFondo.setPreferredSize(new java.awt.Dimension(1300, 768));

        listRegistros.setVisible(false);

        jTFintrucComp.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Resultado");

        btnExe.setBackground(new java.awt.Color(13, 110, 253));
        btnExe.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnExe.setForeground(new java.awt.Color(255, 255, 255));
        btnExe.setText("Ejecutar");
        btnExe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Captación:");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnShowCodops.setBackground(new java.awt.Color(13, 110, 253));
        btnShowCodops.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnShowCodops.setForeground(new java.awt.Color(255, 255, 255));
        btnShowCodops.setText("Mostrar codops");
        btnShowCodops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowCodopsActionPerformed(evt);
            }
        });

        txtResult.setEditable(false);
        txtResult.setColumns(20);
        txtResult.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        txtResult.setRows(5);
        jScrollPane4.setViewportView(txtResult);

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ingrese la Instruccion a Ejecutar:");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnRestart.setBackground(new java.awt.Color(13, 110, 253));
        btnRestart.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnRestart.setForeground(new java.awt.Color(255, 255, 255));
        btnRestart.setText("Reiniciar");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        btnStepByStep.setBackground(new java.awt.Color(13, 110, 253));
        btnStepByStep.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnStepByStep.setForeground(new java.awt.Color(255, 255, 255));
        btnStepByStep.setText("Paso a Paso");
        btnStepByStep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStepByStepMouseClicked(evt);
            }
        });
        btnStepByStep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStepByStepActionPerformed(evt);
            }
        });

        jPanelMemoria.setBackground(new java.awt.Color(131, 221, 240));
        jPanelMemoria.setForeground(new java.awt.Color(255, 255, 255));

        listRegistros2.setVisible(false);

        jTFbDatos.setEditable(false);
        jTFbDatos.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTFbDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFbDatosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bus de Control");
        jLabel2.setAlignmentX(0.5F);

        jTFbControl.setEditable(false);
        jTFbControl.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N

        jTFbIntr.setEditable(false);
        jTFbIntr.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTFbIntr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFbIntrActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bus de Intrucción");
        jLabel3.setAlignmentX(0.5F);

        jTFmemoria.setEditable(false);
        jTFmemoria.setColumns(20);
        jTFmemoria.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTFmemoria.setRows(5);
        jScrollPane3.setViewportView(jTFmemoria);

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Memoria:");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bus de Datos");

        javax.swing.GroupLayout jPanelMemoriaLayout = new javax.swing.GroupLayout(jPanelMemoria);
        jPanelMemoria.setLayout(jPanelMemoriaLayout);
        jPanelMemoriaLayout.setHorizontalGroup(
            jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                .addGap(547, 547, 547)
                .addComponent(listRegistros2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                .addGroup(jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFbControl)
                            .addComponent(jTFbIntr)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTFbDatos)))
                    .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMemoriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );
        jPanelMemoriaLayout.setVerticalGroup(
            jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(listRegistros2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFbDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFbControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFbIntr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanelCPU.setBackground(new java.awt.Color(129, 199, 132));

        listRegistros1.setVisible(false);

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Acumulador");

        jTFac.setEditable(false);
        jTFac.setBackground(new java.awt.Color(223, 227, 232));
        jTFac.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTFac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFac.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(152, 159, 169), 2, true));
        jTFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFacActionPerformed(evt);
            }
        });

        jTFmar.setEditable(false);
        jTFmar.setBackground(new java.awt.Color(223, 227, 232));
        jTFmar.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTFmar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(152, 159, 169), 2, true));
        jTFmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFmarActionPerformed(evt);
            }
        });

        jTFmbr.setEditable(false);
        jTFmbr.setBackground(new java.awt.Color(223, 227, 232));
        jTFmbr.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTFmbr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(152, 159, 169), 2, true));
        jTFmbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFmbrActionPerformed(evt);
            }
        });

        JTARegistros.setEditable(false);
        JTARegistros.setBackground(new java.awt.Color(223, 227, 232));
        JTARegistros.setColumns(20);
        JTARegistros.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        JTARegistros.setRows(10);
        JTARegistros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(152, 159, 169), 2, true));
        JTARegistros.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(JTARegistros);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MBR");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MAR");

        jTFpc.setEditable(false);
        jTFpc.setBackground(new java.awt.Color(223, 227, 232));
        jTFpc.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTFpc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(152, 159, 169), 2, true));
        jTFpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFpcActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PC");

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Banco de registros");

        jTAalu.setEditable(false);
        jTAalu.setBackground(new java.awt.Color(223, 227, 232));
        jTAalu.setColumns(20);
        jTAalu.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTAalu.setRows(5);
        jTAalu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(152, 159, 169), 2, true));
        jScrollPane1.setViewportView(jTAalu);

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("UC");

        jTFir.setEditable(false);
        jTFir.setBackground(new java.awt.Color(223, 227, 232));
        jTFir.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTFir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(152, 159, 169), 2, true));
        jTFir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("IR");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ALU");

        jTFuc.setEditable(false);
        jTFuc.setBackground(new java.awt.Color(223, 227, 232));
        jTFuc.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jTFuc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(152, 159, 169), 2, true));
        jTFuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCPULayout = new javax.swing.GroupLayout(jPanelCPU);
        jPanelCPU.setLayout(jPanelCPULayout);
        jPanelCPULayout.setHorizontalGroup(
            jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCPULayout.createSequentialGroup()
                .addGap(1068, 1068, 1068)
                .addComponent(listRegistros1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(jPanelCPULayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCPULayout.createSequentialGroup()
                        .addGroup(jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFmbr)
                            .addComponent(jTFuc)
                            .addComponent(jTFac, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jTFmar)
                            .addGroup(jPanelCPULayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCPULayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel7))
                            .addGroup(jPanelCPULayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCPULayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCPULayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFpc, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCPULayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelCPULayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCPULayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCPULayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22))
                    .addGroup(jPanelCPULayout.createSequentialGroup()
                        .addGap(487, 487, 487)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCPULayout.setVerticalGroup(
            jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCPULayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCPULayout.createSequentialGroup()
                        .addComponent(listRegistros1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(390, 390, 390))
                    .addGroup(jPanelCPULayout.createSequentialGroup()
                        .addGroup(jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFpc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addGroup(jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCPULayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jTFmar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCPULayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFmbr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFuc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelCPULayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                                        .addComponent(jTFintrucComp, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(218, 218, 218)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41))
                                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                                        .addGap(362, 362, 362)
                                        .addComponent(listRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnExe, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(474, 474, 474)))
                                .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnShowCodops))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel15)
                                .addGap(361, 361, 361)
                                .addComponent(jLabel12))))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(btnStepByStep, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jPanelCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanelMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                                        .addComponent(listRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFintrucComp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(39, 39, 39))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(btnExe, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGap(6, 6, 6))
                    .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnShowCodops, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStepByStep, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(117, 117, 117))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jPanelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1309, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowCodopsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowCodopsActionPerformed
        
        modalShowCodops mdlShow = new modalShowCodops();
        mdlShow.setAlwaysOnTop(true);
        mdlShow.setVisible(true);
    }//GEN-LAST:event_btnShowCodopsActionPerformed
   
    private void btnExeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExeActionPerformed
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i < 18; i++) {
                    Thread.sleep(1000); // Introduce un retraso en el hilo de fondo
                    SwingUtilities.invokeLater(() -> btnStepByStep.doClick()); // Ejecuta el clic del botón en el hilo de despacho de eventos
                }
                return null;
            }

            @Override
            protected void done() {
                // Este código se ejecutará cuando la tarea de fondo esté completa
                int opcion = Integer.parseInt(codop);
                System.out.println("Aleo " + opcion);
                switch (opcion) {
                    case 0000: //move
                        txtResult.setText("la dirección " + inst1 + " se ha movido a la direción " + inst2);
                        jTFmemoria.setText("[" + inst2 + "]: " + inst1);
                        break;

                    case 0001: //clear
                        txtResult.setText("las direcciones " + inst1 + " y " + inst2 + " se han reemplazado por palabras 0 ");
                        String clear = "";
                        clear += "[" + inst1 + "]: 000000\n";

                        clear += "[" + inst2 + "]: 000000\n";

                        jTFmemoria.setText(clear);
                        break;

                    case 10: //set
                        txtResult.setText("las direcciones " + inst1 + " y " + inst2 + " se han reemplazado por palabras 1 ");
                        String set = "";
                        set += "[" + inst1 + "]: 111111\n" + "";
                        set += "[" + inst2 + "]: 111111\n";
                        jTFmemoria.setText(set);
                        break;

                    case 11: //store
                        txtResult.setText("las direcciones " + inst1 + " y " + inst2 + " se ha movido a la memoria ");
                       
                        Memorias.add("[" + inst2 + "]: " + inst1 );
                
                        jTFmemoria.setText(String.join(", ",Memorias));
                        break;

                    case 100: //add

                        String input0 = inst1;
                        String input1 = inst2;

                        int number0 = Integer.parseInt(input0, 2);
                        int number1 = Integer.parseInt(input1, 2);

                        int sum = number0 + number1;
                        String resultado = Integer.toBinaryString(sum);
                        txtResult.setText(String.valueOf(resultado));
                        
                        numeroBinarioGenerado = generarNumeroBinario();
                
                        Memorias.add("[" + numeroBinarioGenerado + "]: " + String.format("%6s", txtResult.getText()).replace(' ', '0'));
                
                        jTFmemoria.setText(String.join(", ",Memorias));
                        break;

                    case 101: //sub

                        String nst = "",
                         max = "";
                        char b = '0';
                        boolean tf = (inst1.length() >= inst2.length());
                        int l1 = inst1.length(),
                         l2 = inst2.length();
                        if (l1 < l2) {
                            for (int a = 1; a <= l2 - l1; a++) {
                                inst1 = '0' + inst1;
                            }
                        } else if (l2 < l1) {
                            for (int a = 1; a <= l1 - l2; a++) {
                                inst2 = "0" + inst2;
                            }
                        }
                        if (!tf) {
                            for (int a = l1 - 1; a >= 0; a--) {
                                if (inst1.charAt(a) != inst2.charAt(a)) {
                                    if (inst2.charAt(a) == '1') {
                                        max = inst2;
                                        inst2 = inst1;
                                        inst1 = max;
                                        break;
                                    }
                                }
                            }
                        }

                        for (int a = inst1.length() - 1; a >= 0; a--) {
                            if (inst1.charAt(a) == '1' && inst2.charAt(a) == '0') {
                                if (b == '1') {
                                    nst = '0' + nst;
                                    b = '0';
                                } else {
                                    nst = '1' + nst;
                                }
                            } else if (inst1.charAt(a) == inst2.charAt(a) && inst2.charAt(a) == '1') {
                                if (b == '1') {
                                    nst = '1' + nst;
                                    b = '1';
                                } else {
                                    nst = '0' + nst;
                                }
                            } else if (inst1.charAt(a) == '0' && inst2.charAt(a) == '1') {
                                if (b == '1') {
                                    nst = '0' + nst;
                                } else {
                                    nst = '1' + nst;
                                    b = '1';
                                }
                            } else {
                                if (b == '1') {
                                    nst = '1' + nst;
                                } else {
                                    nst = '0' + nst;
                                }
                            }
                        }
                        txtResult.setText(nst);
                        
                        
                        numeroBinarioGenerado = generarNumeroBinario();
                
                        Memorias.add("[" + numeroBinarioGenerado + "]: " + String.format("%6s", txtResult.getText()).replace(' ', '0'));
                
                        jTFmemoria.setText(String.join(", ",Memorias));

                        break;

                    case 110: //mpy
                        int prim = Integer.parseInt(inst1, 2);
                        int sec = Integer.parseInt(inst2, 2);

                        int r = prim * sec;

                        String rBin = Integer.toBinaryString(r);
                        txtResult.setText(rBin);
                        
                        numeroBinarioGenerado = generarNumeroBinario();
                
                        Memorias.add("[" + numeroBinarioGenerado + "]: " + String.format("%6s", txtResult.getText()).replace(' ', '0'));
                
                        jTFmemoria.setText(String.join("\n",Memorias));
                        break;

                    case 111:// div
                        int primero = Integer.parseInt(inst1, 2);
                        int segundo = Integer.parseInt(inst2, 2);

                        int div = primero / segundo;

                        String division = Integer.toBinaryString(div);
                        txtResult.setText(division);
                        
                        
                        numeroBinarioGenerado = generarNumeroBinario();
                
                        Memorias.add("[" + numeroBinarioGenerado + "]: " + String.format("%6s", txtResult.getText()).replace(' ', '0'));
                
                        jTFmemoria.setText(String.join(", ",Memorias));
                        break;

                    case 1000: //negate
                        String negate = "";

                        for (int i = 0; i < inst1.length(); i++) {
                            char n = inst1.charAt(i);
                            if (String.valueOf(n).equals("1")) {
                                negate += "0";
                            }
                            if (String.valueOf(n).equals("0")) {
                                negate += "1";
                            }
                        }
                        negate += "-";
                        for (int i = 0; i < inst2.length(); i++) {
                            char nn = inst2.charAt(i);
                            if (String.valueOf(nn).equals("1")) {
                                negate += "0";
                            }
                            if (String.valueOf(nn).equals("0")) {
                                negate += "1";
                            }
                        }
                        txtResult.setText(negate);

                        break;

                    case 1001: //and
                        String and = "";
                        for (int i = 0; i < inst1.length(); i++) {
                            for (int j = 0; j < inst2.length(); j++) {
                                char ii = inst1.charAt(i);
                                char jj = inst2.charAt(j);
                                if (Character.valueOf(ii).equals(Character.valueOf(jj))) {
                                    and += 1;
                                } else {
                                    and += 0;
                                }

                            }
                        }
                        txtResult.setText(and);

                        break;

                    case 1010: //Or
                        String or = "";
                        for (int i = 0; i < inst1.length(); i++) {
                            for (int j = 0; j < inst2.length(); j++) {
                                char ii = inst1.charAt(i);
                                char jj = inst2.charAt(j);
                                if (Character.valueOf(ii).equals("1") | Character.valueOf(jj).equals("1")) {
                                    or += 1;
                                } else {
                                    or += 0;
                                }

                            }
                        }
                        txtResult.setText(or);
                        break;

                    case 1011: //not
                        String not = "";

                        for (int i = 0; i < inst1.length(); i++) {
                            char n = inst1.charAt(i);
                            if (String.valueOf(n).equals("1")) {
                                not += "0";
                            }
                            if (String.valueOf(n).equals("0")) {
                                not += "1";
                            }
                        }
                        not += "-";
                        for (int i = 0; i < inst2.length(); i++) {
                            char nn = inst2.charAt(i);
                            if (String.valueOf(nn).equals("1")) {
                                not += "0";
                            }
                            if (String.valueOf(nn).equals("0")) {
                                not += "1";
                            }
                        }

                        txtResult.setText(not);

                        break;

                    case 1100: //compare
                        String compare = "";

                        if (inst1 == inst2) {
                            compare = "número igual";
                        }
                        txtResult.setText(compare);
                        break;

                    default:
                        System.out.println("switch default case");

                }
            }
        };

        worker.execute(); // Inicia la tarea de fondo
    }//GEN-LAST:event_btnExeActionPerformed

    private void jTFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFacActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTFacActionPerformed

    private void jTFirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFirActionPerformed

    private void jTFmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFmarActionPerformed

    private void jTFmbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFmbrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFmbrActionPerformed

    private void jTFpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFpcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFpcActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        // TODO add your handling code here:
        String dir = "";
        jTFuc.setText("");
        jTFmemoria.setText("");
        jTFbDatos.setText("");
        jTFbControl.setText("");
        jTFbIntr.setText("");
        txtResult.setText("");
        jTFir.setText("");
        jTFpc.setText("");
        jTAalu.setText("");
        jTFac.setText("");
        jTFmar.setText("");
        jTFmbr.setText("");
        jTFintrucComp.setText("");
        JTARegistros.setText("");
        ciclo = 0;
        aux = 1;
    }//GEN-LAST:event_btnRestartActionPerformed

    private void btnStepByStepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStepByStepActionPerformed

        switch (aux) {
            case 1:
                // TODO add your handling code here:

                String dir = jTFintrucComp.getText();

                while (dir.equals("") | dir.length() == 0) {
                    JFrame fram = new JFrame("Entrada nula");
                    fram.setAlwaysOnTop(true);
                    dir = dir.valueOf(JOptionPane.showInputDialog(fram,
                            "La entrada no puede estar vacia", "INVALID ENTRY", JOptionPane.INFORMATION_MESSAGE));
                    jTFintrucComp.setText(dir);
                    if (dir.equals("") | dir.length() == 0) {
                        break;
                    }
                }

                if (dir.length() > 16) {
                    JFrame frame = new JFrame("Es mayor a 16");
                    frame.setAlwaysOnTop(true);
                    dir = dir.valueOf(JOptionPane.showInputDialog(frame,
                            "La entrada no puede ser mayor a 16", "INVALID ENTRY", JOptionPane.INFORMATION_MESSAGE));
                    jTFintrucComp.setText(dir);
                    // b16=true;
                }
                
                if (dir.length() < 16 & !dir.equals("")) {
                    JFrame frames = new JFrame("Es menor a 16 bits");
                    frames.setAlwaysOnTop(true);
                    dir = dir.valueOf(JOptionPane.showInputDialog(frames,
                            "La entrada no puede ser menor a 16 bits", "INVALID ENTRY", JOptionPane.INFORMATION_MESSAGE));
                    jTFintrucComp.setText(dir);
                    //bm16=true;
                }

                ciclo += 1;

                //String[] fullinst;
                //fullinst = jTFintrucComp.getText().split("/n");
                codop = "";
                for (int i = 0; i < 4; i++) {
                    String a = String.valueOf(dir.charAt(i));
                    codop += a;
                    //codop.concat(a);
                }
                inst1 = "";
                for (int i = 4; i > 3 & i < 10; i++) {
                    String b = String.valueOf(dir.charAt(i));
                    inst1 += b;
                    //inst1.concat(b);
                }
                inst2 = "";
                for (int i = 10; i > 9 & i < 16; i++) {
                    String c = String.valueOf(dir.charAt(i));
                    inst2 += c;
                    //inst2.concat(c);
                }

                try {
                    captacion1(inst1, inst2, ciclo);
                } catch (InterruptedException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
                aux = aux + 1;
                System.out.println("Arq aux: " + aux);
                break;

            case 2:
                 try {
                captacion2(inst1, inst2, ciclo);
            } catch (InterruptedException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            aux = aux + 1;
            System.out.println("Arq aux: " + aux);
            break;
            case 3:
                try {
                captacion3(inst1, inst2, ciclo);
            } catch (InterruptedException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            aux = aux + 1;
            System.out.println("Arq aux: " + aux);
            break;
            case 4:
                try {
                captacion4(inst1, inst2, ciclo);
            } catch (InterruptedException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            aux = aux + 1;
            System.out.println("Arq aux: " + aux);
            break;
            case 5:
                try {
                captacion5(inst1, inst2, ciclo);
            } catch (InterruptedException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            aux = aux + 1;
            System.out.println("Arq aux: " + aux);
            break;
            case 6:
                try {
                captacion6(inst1, inst2, ciclo);
            } catch (InterruptedException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            aux = aux + 1;
            System.out.println("Arq aux: " + aux);
            break;
            case 7:
                try {
                captacion7(inst1, inst2, ciclo);
            } catch (InterruptedException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            aux = aux + 1;
            System.out.println("Arq aux: " + aux);
            break;
            case 8:
                try {
                captacion8(inst1, inst2, ciclo);
            } catch (InterruptedException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            aux = aux + 1;
            System.out.println("Arq aux: " + aux);
            break;
            case 9:
                captacion9(inst1, inst2, ciclo);

                JFrame fr = new JFrame(" Fin captación");
                //fr.setAlwaysOnTop(true);

                if (ciclo == 2) {
                    jTFintrucComp.setText("");
                    ciclo = 0;
                }

                aux = 1;
                System.out.println("Arq aux: " + aux);
                break;
            default:
                throw new AssertionError();
        }

    }//GEN-LAST:event_btnStepByStepActionPerformed

    private void btnStepByStepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStepByStepMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStepByStepMouseClicked

    private void jTFucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFucActionPerformed

    private void jTFbIntrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFbIntrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbIntrActionPerformed

    private void jTFbDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFbDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFbDatosActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JTARegistros;
    private javax.swing.JButton btnExe;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnShowCodops;
    private javax.swing.JButton btnStepByStep;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanelCPU;
    public static javax.swing.JPanel jPanelFondo;
    public static javax.swing.JPanel jPanelGeneral;
    public static javax.swing.JPanel jPanelMemoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTAalu;
    private javax.swing.JTextField jTFac;
    private javax.swing.JTextField jTFbControl;
    private javax.swing.JTextField jTFbDatos;
    private javax.swing.JTextField jTFbIntr;
    private javax.swing.JTextField jTFintrucComp;
    private javax.swing.JTextField jTFir;
    private javax.swing.JTextField jTFmar;
    private javax.swing.JTextField jTFmbr;
    private javax.swing.JTextArea jTFmemoria;
    private javax.swing.JTextField jTFpc;
    private javax.swing.JTextField jTFuc;
    private java.awt.List listRegistros;
    private java.awt.List listRegistros1;
    private java.awt.List listRegistros2;
    private javax.swing.JTextArea txtResult;
    // End of variables declaration//GEN-END:variables

}
