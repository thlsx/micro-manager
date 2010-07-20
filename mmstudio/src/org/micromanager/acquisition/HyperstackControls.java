/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HyperstackControls.java
 *
 * Created on Jul 15, 2010, 2:54:37 PM
 */

package org.micromanager.acquisition;

import ij.IJ;

/**
 *
 * @author arthur
 */
public class HyperstackControls extends java.awt.Panel {
   private final MMVirtualAcquisition2 acq_;

    /** Creates new form HyperstackControls */
    public HyperstackControls(MMVirtualAcquisition2 acq) {
        initComponents();
        acq_ = acq;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      metadataButton = new javax.swing.JButton();
      showFolderButton = new javax.swing.JButton();
      contrastButton = new javax.swing.JButton();
      saveButton = new javax.swing.JButton();

      metadataButton.setBackground(new java.awt.Color(255, 255, 255));
      metadataButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/micromanager/icons/application_view_list.png"))); // NOI18N
      metadataButton.setToolTipText("View acquisition metadata");
      metadataButton.setFocusable(false);
      metadataButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      metadataButton.setMaximumSize(new java.awt.Dimension(30, 28));
      metadataButton.setMinimumSize(new java.awt.Dimension(30, 28));
      metadataButton.setPreferredSize(new java.awt.Dimension(30, 28));
      metadataButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
      metadataButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            metadataButtonActionPerformed(evt);
         }
      });

      showFolderButton.setBackground(new java.awt.Color(255, 255, 255));
      showFolderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/micromanager/icons/folder.png"))); // NOI18N
      showFolderButton.setToolTipText("Show containing folder");
      showFolderButton.setFocusable(false);
      showFolderButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      showFolderButton.setMaximumSize(new java.awt.Dimension(30, 28));
      showFolderButton.setMinimumSize(new java.awt.Dimension(30, 28));
      showFolderButton.setPreferredSize(new java.awt.Dimension(30, 28));
      showFolderButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
      showFolderButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            showFolderButtonActionPerformed(evt);
         }
      });

      contrastButton.setBackground(new java.awt.Color(255, 255, 255));
      contrastButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/micromanager/icons/contrast.png"))); // NOI18N
      contrastButton.setToolTipText("Adjust brightness and contrast");
      contrastButton.setFocusable(false);
      contrastButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      contrastButton.setMaximumSize(new java.awt.Dimension(30, 28));
      contrastButton.setMinimumSize(new java.awt.Dimension(30, 28));
      contrastButton.setPreferredSize(new java.awt.Dimension(30, 28));
      contrastButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
      contrastButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            contrastButtonActionPerformed(evt);
         }
      });

      saveButton.setBackground(new java.awt.Color(255, 255, 255));
      saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/micromanager/icons/disk.png"))); // NOI18N
      saveButton.setToolTipText("Save as...");
      saveButton.setFocusable(false);
      saveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      saveButton.setMaximumSize(new java.awt.Dimension(30, 28));
      saveButton.setMinimumSize(new java.awt.Dimension(30, 28));
      saveButton.setPreferredSize(new java.awt.Dimension(30, 28));
      saveButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

      org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(showFolderButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
         .add(layout.createSequentialGroup()
            .add(100, 100, 100)
            .add(contrastButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
         .add(layout.createSequentialGroup()
            .add(30, 30, 30)
            .add(saveButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
         .add(layout.createSequentialGroup()
            .add(70, 70, 70)
            .add(metadataButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(showFolderButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
         .add(contrastButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
         .add(saveButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
         .add(metadataButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
      );
   }// </editor-fold>//GEN-END:initComponents

   private void showFolderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showFolderButtonActionPerformed
      acq_.showFolder();
   }//GEN-LAST:event_showFolderButtonActionPerformed

   private void contrastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrastButtonActionPerformed
      IJ.runPlugIn("ij.plugin.frame.ContrastAdjuster", "");
   }//GEN-LAST:event_contrastButtonActionPerformed

   private void metadataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metadataButtonActionPerformed
      MetadataViewer mv = new MetadataViewer(acq_);
      mv.setVisible(true);
   }//GEN-LAST:event_metadataButtonActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton contrastButton;
   private javax.swing.JButton metadataButton;
   private javax.swing.JButton saveButton;
   private javax.swing.JButton showFolderButton;
   // End of variables declaration//GEN-END:variables

}
