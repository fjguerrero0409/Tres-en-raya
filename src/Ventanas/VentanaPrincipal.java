/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class VentanaPrincipal extends javax.swing.JFrame {
 
    private boolean casilla [][] = new boolean [3][3];
    private String  turno ="usuario1";
    private int matriz [][] = new int [3] [3];
    int casillasEmpate =0;
    private String usuario1,usuario2;
    private int vecesGano1=0 ,vecesGano2=0,vecesEmpate=0;
    public VentanaPrincipal( String usuario1 , String usuario2) {
         this.usuario1=usuario1;
       this.usuario2=usuario2;
        
        initComponents();
        setSize(700,700);
        setLocationRelativeTo(null);
        llenarCasillas();
        llenarMatriz();
        
      
       
    }
    
    private void llenarCasillas(){
        for (int i=0; i<3 ; i++){
           for(int j=0;j<3 ; j++){
               casilla[i][j] = true;
           } 
        }
    }
    
    private void llenarMatriz(){
        for (int i=0; i<3 ; i++){
           for(int j=0;j<3 ; j++){
               matriz [i][j] = 0;
           } 
        }
    }
    
    private void dibujarX(JButton boton){
    boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/x.jpg")));
       
    }
        private void dibujarO(JButton boton){
    boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/circulo.png")));
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonArribaIzquierda = new javax.swing.JButton();
        botonArriba = new javax.swing.JButton();
        botonArribaDerecha = new javax.swing.JButton();
        botonMedioIzquierda = new javax.swing.JButton();
        botonMedio = new javax.swing.JButton();
        botonMedioDerecha = new javax.swing.JButton();
        botonAbajoIzquierda = new javax.swing.JButton();
        botonAbajo = new javax.swing.JButton();
        botonAbajoDerecha = new javax.swing.JButton();
        barraDeMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        comenzarDeNuevo = new javax.swing.JMenuItem();
        mostrarResultados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));

        panel.setLayout(new java.awt.GridLayout(3, 3));

        botonArribaIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonArribaIzquierda);

        botonArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaActionPerformed(evt);
            }
        });
        panel.add(botonArriba);

        botonArribaDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArribaDerechaActionPerformed(evt);
            }
        });
        panel.add(botonArribaDerecha);

        botonMedioIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMedioIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonMedioIzquierda);

        botonMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMedioActionPerformed(evt);
            }
        });
        panel.add(botonMedio);

        botonMedioDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMedioDerechaActionPerformed(evt);
            }
        });
        panel.add(botonMedioDerecha);

        botonAbajoIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoIzquierdaActionPerformed(evt);
            }
        });
        panel.add(botonAbajoIzquierda);

        botonAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoActionPerformed(evt);
            }
        });
        panel.add(botonAbajo);

        botonAbajoDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbajoDerechaActionPerformed(evt);
            }
        });
        panel.add(botonAbajoDerecha);

        menuJuego.setText("Menu");
        menuJuego.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N

        comenzarDeNuevo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        comenzarDeNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1 (1).png"))); // NOI18N
        comenzarDeNuevo.setText("Comenzar de Nuevo");
        comenzarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarDeNuevoActionPerformed(evt);
            }
        });
        menuJuego.add(comenzarDeNuevo);

        mostrarResultados.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        mostrarResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3 (1).jpg"))); // NOI18N
        mostrarResultados.setText("Mostrar tabla de resultados");
        mostrarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarResultadosActionPerformed(evt);
            }
        });
        menuJuego.add(mostrarResultados);
        menuJuego.add(jSeparator1);

        salir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2 (1).png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menuJuego.add(salir);

        barraDeMenu.add(menuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        menuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAyudaMouseClicked(evt);
            }
        });
        barraDeMenu.add(menuAyuda);

        setJMenuBar(barraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void botonAbajoIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoIzquierdaActionPerformed
        if(casilla[2][0]== true){// verificamos is aun no se a dado clic sobre el boton
       if(turno.equals("usuario1")){ // verificamos el turno
           dibujarX(botonAbajoIzquierda);
           matriz[2][0]=1;
           turno="usuario2";
       }
       else{//turno de usuario 2
           dibujarO(botonAbajoIzquierda);
           matriz[2][0]=2;
           turno ="usuario1";
       }
        casilla[2][0]=false;
       } 
    }//GEN-LAST:event_botonAbajoIzquierdaActionPerformed

    private void botonAbajoDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoDerechaActionPerformed
        if(casilla[2][2]== true){// verificamos is aun no se a dado clic sobre el boton
       if(turno.equals("usuario1")){ // verificamos el turno
           dibujarX(botonAbajoDerecha);
           matriz[2][2]=1;
           turno="usuario2";
       }
       else{//turno de usuario 2
           dibujarO(botonAbajoDerecha);
           matriz[2][2]=2;
           turno ="usuario1";
       }
        casilla[2][2]=false;
       } 
        comprobarGanador();
    }//GEN-LAST:event_botonAbajoDerechaActionPerformed

    private void botonArribaIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaIzquierdaActionPerformed
       if(casilla[0][0]== true){// verificamos is aun no se a dado clic sobre el boton
       if(turno.equals("usuario1")){ // verificamos el turno
           dibujarX(botonArribaIzquierda);
           matriz[0][0]=1;
           turno="usuario2";
       }
       else{//turno de usuario 2
           dibujarO(botonArribaIzquierda);
           matriz[0][0]=2;
           turno ="usuario1";
       }
        casilla[0][0]=false;
       } 
       comprobarGanador();
    }//GEN-LAST:event_botonArribaIzquierdaActionPerformed

    private void botonArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaActionPerformed
         if(casilla[0][1]== true){// verificamos is aun no se a dado clic sobre el boton
       if(turno.equals("usuario1")){ // verificamos el turno
           dibujarX(botonArriba);
           matriz[0][1]=1;
           turno="usuario2";
       }
       else{//turno de usuario 2
           dibujarO(botonArriba);
           matriz[0][1]=2;
           turno ="usuario1";
       }
        casilla[0][1]=false;
       } 
         comprobarGanador();
    }//GEN-LAST:event_botonArribaActionPerformed

    private void botonArribaDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArribaDerechaActionPerformed
         if(casilla[0][2]== true){// verificamos is aun no se a dado clic sobre el boton
       if(turno.equals("usuario1")){ // verificamos el turno
           dibujarX(botonArribaDerecha);
           matriz[0][2]=1;
           turno="usuario2";
       }
       else{//turno de usuario 2
           dibujarO(botonArribaDerecha);
           matriz[0][2]=2;
           turno ="usuario1";
       }
        casilla[0][2]=false;
       } 
         comprobarGanador();
    }//GEN-LAST:event_botonArribaDerechaActionPerformed

    private void botonMedioIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMedioIzquierdaActionPerformed
        if(casilla[1][0]== true){// verificamos is aun no se a dado clic sobre el boton
       if(turno.equals("usuario1")){ // verificamos el turno
           dibujarX(botonMedioIzquierda);
           matriz[1][0]=1;
           turno="usuario2";
       }
       else{//turno de usuario 2
           dibujarO(botonMedioIzquierda);
           matriz[1][0]=2;
           turno ="usuario1";
       }
        casilla[1][0]=false;
       } 
        comprobarGanador();
    }//GEN-LAST:event_botonMedioIzquierdaActionPerformed

    private void botonMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMedioActionPerformed
        if(casilla[1][1]== true){// verificamos is aun no se a dado clic sobre el boton
       if(turno.equals("usuario1")){ // verificamos el turno
           dibujarX(botonMedio);
           matriz[1][1]=1;
           turno="usuario2";
       }
       else{//turno de usuario 2
           dibujarO(botonMedio);
           matriz[1][1]=2;
           turno ="usuario1";
       }
        casilla[1][1]=false;
       } 
        comprobarGanador();
    }//GEN-LAST:event_botonMedioActionPerformed

    private void botonMedioDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMedioDerechaActionPerformed
         if(casilla[1][2]== true){// verificamos is aun no se a dado clic sobre el boton
       if(turno.equals("usuario1")){ // verificamos el turno
           dibujarX(botonMedioDerecha);
           matriz[1][2]=1;
           turno="usuario2";
       }
       else{//turno de usuario 2
           dibujarO(botonMedioDerecha);
           matriz[1][2]=2;
           turno ="usuario1";
       }
        casilla[1][2]=false;
       }
   comprobarGanador();
    }//GEN-LAST:event_botonMedioDerechaActionPerformed

    private void botonAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbajoActionPerformed
        if(casilla[2][1]== true){// verificamos is aun no se a dado clic sobre el boton
       if(turno.equals("usuario1")){ // verificamos el turno
           dibujarX(botonAbajo);
           matriz[2][1]=1;
           turno="usuario2";
       }
       else{//turno de usuario 2
           dibujarO(botonAbajo);
           matriz[2][1]=2;
           turno ="usuario1";
       }
        casilla[2][1]=false;
       } 
        comprobarGanador();
    }//GEN-LAST:event_botonAbajoActionPerformed

    private void mostrarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarResultadosActionPerformed
         ventana_Resultados ventanaMR= new ventana_Resultados(this, true, usuario1, usuario2, vecesGano1, vecesGano2, vecesEmpate);
         ventanaMR.setVisible(true);
    }//GEN-LAST:event_mostrarResultadosActionPerformed

    private void comenzarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarDeNuevoActionPerformed
       vecesGano1=0 ;vecesGano2=0;vecesEmpate=0; 
       reiniciarJuego();
    }//GEN-LAST:event_comenzarDeNuevoActionPerformed

    private void menuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAyudaMouseClicked
        try {
            try {
                Desktop.getDesktop().browse(new URI("https://www.mundodeportivo.com/uncomo/ocio/articulo/como-jugar-al-tres-en-raya-2442.html"));
            } catch (IOException ex) {
               // Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuAyudaMouseClicked

    private void comprobarGanador(){
        boolean ganador1 = false;
        boolean ganador2 = false;
        // comprobamos si el gaandor es el usuario 1
        ganador1 = comprobar(1);
        // comprobamos si el ganador es el usuario 2
        ganador2 = comprobar(2);
        
        if(ganador1== true){
            vecesGano1++;
            ventanaGanador ventanaG = new ventanaGanador(this, true, usuario1);
            ventanaG.setVisible(true);
            reiniciarJuego();
        }
        else if(ganador2 == true){
            vecesGano2++;
           ventanaGanador ventanaG = new ventanaGanador(this, true, usuario2);
            ventanaG.setVisible(true);
            reiniciarJuego();
        }
        else{// talves el tablero este lleno , entonces hay un empate
            for (int i=0; i<3;i++){
                for (int j=0 ; j<3 ;j++){
                    if(matriz[i][j]!=0){//puede haber un numero 1 o numero 2
                        casillasEmpate++;
                        
                        
                    }
                }
            }
            if(casillasEmpate == 9){
                vecesEmpate++;
               ventanaEmpate ventanaE = new ventanaEmpate(this,true);
               ventanaE.setVisible(true);
                reiniciarJuego();
            }
            else{
                casillasEmpate =0;
            }
        }
           }
    
    private boolean comprobar(int num){ //
    boolean ganador = false;
    
    if(matriz[0][0]==num && matriz [0][1] == num && matriz [0][2]==num){
        ganador = true;
    }
    else if(matriz[1][0]==num && matriz[1][1]==num && matriz [1][2]==num){
        ganador = true;
        
    }
    else if(matriz [2][0]==num && matriz[2][1]==num && matriz[2][2]==num){
        ganador = true;
    }
    else if(matriz [0][0]==num && matriz[1][1]==num && matriz[2][2]==num){
        ganador = true;
  
    }
   else if(matriz [0][2]==num && matriz[1][1]==num && matriz[2][0]==num){
        ganador = true;
  
    }
    else if(matriz [0][0]==num && matriz[1][0]==num && matriz[2][0]==num){
        ganador = true;
  
    }
    else if(matriz [0][1]==num && matriz[1][1]==num && matriz[2][1]==num){
        ganador = true;
  
    }
    else if(matriz [0][2]==num && matriz[1][2]==num && matriz[2][2]==num){
        ganador = true;
  
    }
   
      return ganador;
    }
    
    private void reiniciarJuego(){
        llenarCasillas();
        llenarMatriz();
        
        botonArribaIzquierda.setIcon(null);
        botonArriba.setIcon(null);
        botonArribaDerecha.setIcon(null);
        botonMedioIzquierda.setIcon(null);
        botonMedio.setIcon(null);
        botonMedioDerecha.setIcon(null);
        botonAbajoIzquierda.setIcon(null);
        botonAbajo.setIcon(null);
        botonAbajoDerecha.setIcon(null);
        // vamos a preguntar al usuario quien juega primero
        quienJuegaPrimero();
    }
    
    private void quienJuegaPrimero(){
        ventanaEscogerTurno ventanaET = new ventanaEscogerTurno(this, true, usuario1, usuario2);
        ventanaET.setVisible(true);
        turno= ventanaET.getTurno();
    }
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JButton botonAbajo;
    private javax.swing.JButton botonAbajoDerecha;
    private javax.swing.JButton botonAbajoIzquierda;
    private javax.swing.JButton botonArriba;
    private javax.swing.JButton botonArribaDerecha;
    private javax.swing.JButton botonArribaIzquierda;
    private javax.swing.JButton botonMedio;
    private javax.swing.JButton botonMedioDerecha;
    private javax.swing.JButton botonMedioIzquierda;
    private javax.swing.JMenuItem comenzarDeNuevo;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenuItem mostrarResultados;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
