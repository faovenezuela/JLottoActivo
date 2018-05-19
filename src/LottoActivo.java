
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import presentacion.Acercade;
import presentacion.VentaTickets;


public class LottoActivo extends javax.swing.JFrame {

    
    public LottoActivo() {
        //LottoActivo f = new LottoActivo();
//        .setLayout(new BorderLayout());
//        JDesktopPane jDesktopPane = new JDesktopPane();
//        f.add(jDesktopPane, BorderLayout.CENTER);
//
//        f.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        
//        JFrame f = new JFrame();
//        f.setLayout(new BorderLayout());
//        JDesktopPane jDesktopPane = new JDesktopPane();
//        f.add(jDesktopPane, BorderLayout.CENTER);
//
//        f.setExtendedState(MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        mnuprincipal = new javax.swing.JMenuBar();
        mnprincipal = new javax.swing.JMenu();
        mnuventas = new javax.swing.JMenuItem();
        mnunumpremios = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnusalir = new javax.swing.JMenuItem();
        mnuprocesos = new javax.swing.JMenu();
        mnuanulacion = new javax.swing.JMenuItem();
        mnupagotickets = new javax.swing.JMenuItem();
        mnureportes1 = new javax.swing.JMenu();
        mnuconfiguracion = new javax.swing.JMenu();
        mnuagregarusuarios = new javax.swing.JMenuItem();
        mnuayuda = new javax.swing.JMenu();
        mnuacercade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lotto Activo");

        Escritorio.setBackground(new java.awt.Color(242, 242, 240));

        mnprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ventas2.png"))); // NOI18N
        mnprincipal.setText("Ventas");

        mnuventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-terminal-punto-de-venta.png"))); // NOI18N
        mnuventas.setText("Ventas de Tickets");
        mnuventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuventasActionPerformed(evt);
            }
        });
        mnprincipal.add(mnuventas);

        mnunumpremios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-trébol.png"))); // NOI18N
        mnunumpremios.setText("Numeros Premiados");
        mnunumpremios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnunumpremiosActionPerformed(evt);
            }
        });
        mnprincipal.add(mnunumpremios);
        mnprincipal.add(jSeparator2);

        mnusalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-cerrar-ventana.png"))); // NOI18N
        mnusalir.setText("Salir");
        mnusalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnusalirActionPerformed(evt);
            }
        });
        mnprincipal.add(mnusalir);

        mnuprincipal.add(mnprincipal);

        mnuprocesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/procesos.png"))); // NOI18N
        mnuprocesos.setText("Procesos");

        mnuanulacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-eliminar-boleto.png"))); // NOI18N
        mnuanulacion.setText("Anulación de tickets");
        mnuprocesos.add(mnuanulacion);

        mnupagotickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-boleto.png"))); // NOI18N
        mnupagotickets.setText("Pagos de tickets");
        mnuprocesos.add(mnupagotickets);

        mnuprincipal.add(mnuprocesos);

        mnureportes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-ruleta.png"))); // NOI18N
        mnureportes1.setText("Reportes");
        mnuprincipal.add(mnureportes1);

        mnuconfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/configurar.png"))); // NOI18N
        mnuconfiguracion.setText("Configuracion");

        mnuagregarusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-grupo-de-usuarios-hombre-y-mujer.png"))); // NOI18N
        mnuagregarusuarios.setText("Agregar Usuarios");
        mnuagregarusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuagregarusuariosActionPerformed(evt);
            }
        });
        mnuconfiguracion.add(mnuagregarusuarios);

        mnuprincipal.add(mnuconfiguracion);

        mnuayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-ayuda-2.png"))); // NOI18N
        mnuayuda.setText("Ayuda");

        mnuacercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-alta-importancia-3.png"))); // NOI18N
        mnuacercade.setText("Acerca de ...");
        mnuacercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuacercadeActionPerformed(evt);
            }
        });
        mnuayuda.add(mnuacercade);

        mnuprincipal.add(mnuayuda);

        setJMenuBar(mnuprincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 1263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuventasActionPerformed
       VentaTickets venta = new VentaTickets();
       //Escritorio.add(venta, BorderLayout.CENTER);
       Escritorio.add(venta);
       //Escritorio.setMaximumSize(maximumSize);
       
       
       Escritorio.show();
       //Escritorio.
       //Escritorio.setMaximumSize(new Dimension(1300, 600));
       
    }//GEN-LAST:event_mnuventasActionPerformed

    private void mnunumpremiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnunumpremiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnunumpremiosActionPerformed

    private void mnusalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnusalirActionPerformed
        System.exit(0);
               
    }//GEN-LAST:event_mnusalirActionPerformed

    private void mnuacercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuacercadeActionPerformed
            Acercade acerca = new Acercade(this, rootPaneCheckingEnabled);
            acerca.setVisible(true);
            
            
            
    }//GEN-LAST:event_mnuacercadeActionPerformed

    private void mnuagregarusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuagregarusuariosActionPerformed
        //AgregarUsuario au = new AgregarUsuario();
        //AgregarUs
        
    }//GEN-LAST:event_mnuagregarusuariosActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new LottoActivo().setVisible(true);
                LottoActivo lotto = new LottoActivo();
                lotto.setLayout(new BorderLayout());
                JDesktopPane Escritorio = new JDesktopPane();
                lotto.add(Escritorio,BorderLayout.CENTER);
                lotto.setExtendedState(MAXIMIZED_BOTH);
                lotto.setVisible(true);
//                new LottoActivo().setLayout(new BorderLayout());
                //JDesktopPane Escritorio = new JDesktopPane();
                //new LottoActivo().add(Escritorio,BorderLayout.CENTER);
//                new LottoActivo().setExtendedState(MAXIMIZED_BOTH);
//        JDesktopPane jDesktopPane = new JDesktopPane();
//        f.add(jDesktopPane, BorderLayout.CENTER);
//
//        f.setExtendedState(MAXIMIZED_BOTH);
       
                
                //JFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnprincipal;
    private javax.swing.JMenuItem mnuacercade;
    private javax.swing.JMenuItem mnuagregarusuarios;
    private javax.swing.JMenuItem mnuanulacion;
    private javax.swing.JMenu mnuayuda;
    private javax.swing.JMenu mnuconfiguracion;
    private javax.swing.JMenuItem mnunumpremios;
    private javax.swing.JMenuItem mnupagotickets;
    private javax.swing.JMenuBar mnuprincipal;
    private javax.swing.JMenu mnuprocesos;
    private javax.swing.JMenu mnureportes1;
    private javax.swing.JMenuItem mnusalir;
    private javax.swing.JMenuItem mnuventas;
    // End of variables declaration//GEN-END:variables
}
