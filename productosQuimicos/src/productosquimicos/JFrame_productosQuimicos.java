package productosquimicos;
/**
 *
* @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class JFrame_productosQuimicos extends javax.swing.JFrame {
     //Declarar variables...
        double litros, detergente, densidad, agua, sales;
        String TXTAgua, TXTSales;
    public JFrame_productosQuimicos() {
        initComponents();
           
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        pnlLitros = new javax.swing.JPanel();
        sldLitros = new javax.swing.JSlider();
        lblLitros = new javax.swing.JLabel();
        pnlDensidad = new javax.swing.JPanel();
        sldDensidad = new javax.swing.JSlider();
        lblDensidad = new javax.swing.JLabel();
        pnlDetergente = new javax.swing.JPanel();
        sldDetergente = new javax.swing.JSlider();
        lblDetergente = new javax.swing.JLabel();
        lblAgua = new javax.swing.JLabel();
        lblSales = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(39, 33, 39));
        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "--Productos Quimicos--", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial Narrow", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        pnlLitros.setBackground(new java.awt.Color(45, 45, 64));
        pnlLitros.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Litros a fabricar...", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 0, 10), new java.awt.Color(204, 204, 255))); // NOI18N

        sldLitros.setBackground(new java.awt.Color(19, 81, 144));
        sldLitros.setMinimum(1);
        sldLitros.setPaintLabels(true);
        sldLitros.setPaintTicks(true);
        sldLitros.setSnapToTicks(true);
        sldLitros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sldLitros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldLitrosStateChanged(evt);
            }
        });

        lblLitros.setBackground(new java.awt.Color(19, 15, 32));
        lblLitros.setFont(new java.awt.Font("Bauhaus 93", 0, 14)); // NOI18N
        lblLitros.setForeground(new java.awt.Color(255, 255, 255));
        lblLitros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLitros.setText("50");
        lblLitros.setOpaque(true);

        javax.swing.GroupLayout pnlLitrosLayout = new javax.swing.GroupLayout(pnlLitros);
        pnlLitros.setLayout(pnlLitrosLayout);
        pnlLitrosLayout.setHorizontalGroup(
            pnlLitrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLitrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sldLitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLitros, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlLitrosLayout.setVerticalGroup(
            pnlLitrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLitrosLayout.createSequentialGroup()
                .addGroup(pnlLitrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLitros, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(sldLitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlDensidad.setBackground(new java.awt.Color(45, 45, 64));
        pnlDensidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Densidad deseada...", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 0, 10), new java.awt.Color(200, 200, 253))); // NOI18N

        sldDensidad.setBackground(new java.awt.Color(19, 81, 144));
        sldDensidad.setMaximum(200);
        sldDensidad.setMinimum(50);
        sldDensidad.setPaintLabels(true);
        sldDensidad.setPaintTicks(true);
        sldDensidad.setSnapToTicks(true);
        sldDensidad.setToolTipText("");
        sldDensidad.setValue(100);
        sldDensidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sldDensidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldDensidadStateChanged(evt);
            }
        });

        lblDensidad.setBackground(new java.awt.Color(19, 15, 32));
        lblDensidad.setFont(new java.awt.Font("Bauhaus 93", 0, 14)); // NOI18N
        lblDensidad.setForeground(new java.awt.Color(255, 255, 255));
        lblDensidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDensidad.setText("100");
        lblDensidad.setOpaque(true);

        javax.swing.GroupLayout pnlDensidadLayout = new javax.swing.GroupLayout(pnlDensidad);
        pnlDensidad.setLayout(pnlDensidadLayout);
        pnlDensidadLayout.setHorizontalGroup(
            pnlDensidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDensidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sldDensidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDensidad, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlDensidadLayout.setVerticalGroup(
            pnlDensidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDensidadLayout.createSequentialGroup()
                .addGroup(pnlDensidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDensidad, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(sldDensidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlDetergente.setBackground(new java.awt.Color(45, 45, 64));
        pnlDetergente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad de detergente...", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 0, 10), new java.awt.Color(204, 204, 255))); // NOI18N

        sldDetergente.setBackground(new java.awt.Color(19, 81, 144));
        sldDetergente.setMaximum(10);
        sldDetergente.setPaintLabels(true);
        sldDetergente.setPaintTicks(true);
        sldDetergente.setSnapToTicks(true);
        sldDetergente.setValue(5);
        sldDetergente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sldDetergente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldDetergenteStateChanged(evt);
            }
        });

        lblDetergente.setBackground(new java.awt.Color(19, 15, 32));
        lblDetergente.setFont(new java.awt.Font("Bauhaus 93", 0, 14)); // NOI18N
        lblDetergente.setForeground(new java.awt.Color(255, 255, 255));
        lblDetergente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDetergente.setText("5");
        lblDetergente.setOpaque(true);

        javax.swing.GroupLayout pnlDetergenteLayout = new javax.swing.GroupLayout(pnlDetergente);
        pnlDetergente.setLayout(pnlDetergenteLayout);
        pnlDetergenteLayout.setHorizontalGroup(
            pnlDetergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetergenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sldDetergente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDetergente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnlDetergenteLayout.setVerticalGroup(
            pnlDetergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetergenteLayout.createSequentialGroup()
                .addGroup(pnlDetergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDetergente, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(sldDetergente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblAgua.setBackground(new java.awt.Color(20, 35, 44));
        lblAgua.setFont(new java.awt.Font("Bauhaus 93", 0, 10)); // NOI18N
        lblAgua.setForeground(new java.awt.Color(255, 255, 255));
        lblAgua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgua.setText("...");
        lblAgua.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "--Agua en la solución--", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 0, 10), new java.awt.Color(204, 204, 255))); // NOI18N
        lblAgua.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAgua.setOpaque(true);

        lblSales.setBackground(new java.awt.Color(42, 20, 44));
        lblSales.setFont(new java.awt.Font("Bauhaus 93", 0, 10)); // NOI18N
        lblSales.setForeground(new java.awt.Color(255, 255, 255));
        lblSales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSales.setText("...");
        lblSales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "--Sales en la solución--", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 0, 10), new java.awt.Color(204, 204, 255))); // NOI18N
        lblSales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblSales.setOpaque(true);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblSales, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlLitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDensidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDetergente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDetergente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDensidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgua, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(lblSales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldLitrosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldLitrosStateChanged
            //Declarar variable que almacena el valor del Slider...
        String TXTLitros;
            //Asignar a la cadena de texto (TXT) el valor del Slider que ha sido convertido a String.
        TXTLitros = String.valueOf(sldLitros.getValue());
            //Colocar valor en su respectivo Label.
        lblLitros.setText(TXTLitros);
        
        //Lo que haria si tuviese un botón...
            //Asignar a las variables tipo doble su respectivo valor, asignado por sus Slider's.
        litros = sldLitros.getValue();
        detergente = sldDetergente.getValue();
        densidad = sldDensidad.getValue();
            //Asignar a la variable 'agua'  y a 'sales' su respectivo valor.
        agua = (2*(litros))+(detergente/densidad);
        sales = ((detergente*litros))/((100*densidad));
            //Convertir los valores enteros (INT) de 'agua' y 'sales' a cadena de texto (String).
        TXTAgua = String.valueOf(agua);
        TXTSales = String.valueOf(sales);
            //Colocar las variables String (TXT) en sus respectivos Label's.
        lblAgua.setText(TXTAgua);
        lblSales.setText(TXTSales);
    }//GEN-LAST:event_sldLitrosStateChanged

    private void sldDetergenteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldDetergenteStateChanged
            //Declarar variable que almacena el valor del Slider...
        String TXTDetergente;
            //Asignar a la cadena de texto (TXT) el valor del Slider que ha sido convertido a String.
        TXTDetergente = String.valueOf(sldDetergente.getValue());
            //Colocar valor en su respectivo Label.
        lblDetergente.setText(TXTDetergente);
        
        //Lo que haria si tuviese un botón...   
            //Asignar a las variables tipo doble su respectivo valor, asignado por sus Slider's.
        litros = sldLitros.getValue();
        detergente = sldDetergente.getValue();
        densidad = sldDensidad.getValue();
            //Asignar a la variable 'agua'  y a 'sales' su respectivo valor.
        agua = (2*(litros))+(detergente/densidad);
        sales = ((detergente*litros))/((100*densidad));
            //Convertir los valores enteros (INT) de 'agua' y 'sales' a cadena de texto (String).
        TXTAgua = String.valueOf(agua);
        TXTSales = String.valueOf(sales);
            //Colocar las variables String (TXT) en sus respectivos Label's.
        lblAgua.setText(TXTAgua);
        lblSales.setText(TXTSales);
    }//GEN-LAST:event_sldDetergenteStateChanged

    private void sldDensidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldDensidadStateChanged
            //Declarar variable que almacena el valor del Slider...
        String TXTDensidad;
            //Asignar a la cadena de texto (TXT) el valor del Slider que ha sido convertido a String.
        TXTDensidad = String.valueOf(sldDensidad.getValue());
            //Colocar valor en su respectivo Label.
        lblDensidad.setText(TXTDensidad);
        
         //Lo que haria si tuviese un botón...
            //Asignar a las variables tipo doble su respectivo valor, asignado por sus Slider's.
        litros = sldLitros.getValue();
        detergente = sldDetergente.getValue();
        densidad = sldDensidad.getValue();
            //Asignar a la variable 'agua'  y a 'sales' su respectivo valor.
        agua = (2*(litros))+(detergente/densidad);
        sales = ((detergente*litros))/((100*densidad));
            //Convertir los valores enteros (INT) de 'agua' y 'sales' a cadena de texto (String).
        TXTAgua = String.valueOf(agua);
        TXTSales = String.valueOf(sales);
            //Colocar las variables String (TXT) en sus respectivos Label's.
        lblAgua.setText(TXTAgua);
        lblSales.setText(TXTSales);
    }//GEN-LAST:event_sldDensidadStateChanged
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
            java.util.logging.Logger.getLogger(JFrame_productosQuimicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_productosQuimicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_productosQuimicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_productosQuimicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_productosQuimicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAgua;
    private javax.swing.JLabel lblDensidad;
    private javax.swing.JLabel lblDetergente;
    private javax.swing.JLabel lblLitros;
    private javax.swing.JLabel lblSales;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pnlDensidad;
    private javax.swing.JPanel pnlDetergente;
    private javax.swing.JPanel pnlLitros;
    private javax.swing.JSlider sldDensidad;
    private javax.swing.JSlider sldDetergente;
    private javax.swing.JSlider sldLitros;
    // End of variables declaration//GEN-END:variables
}
