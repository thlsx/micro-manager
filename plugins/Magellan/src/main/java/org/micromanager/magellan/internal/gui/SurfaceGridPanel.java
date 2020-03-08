/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.micromanager.magellan.internal.gui;

import java.awt.CardLayout;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.micromanager.magellan.internal.gui.DisplayWindowSurfaceGridTableModel;
import org.micromanager.magellan.internal.surfacesandregions.SurfaceGridListener;
import org.micromanager.magellan.internal.surfacesandregions.SurfaceInterpolator;
import org.micromanager.magellan.internal.surfacesandregions.XYFootprint;
import org.micromanager.multiresviewer.NDViewer;

/**
 *
 * @author henrypinkard
 */
public class SurfaceGridPanel extends javax.swing.JPanel implements SurfaceGridListener {

   
   private NDViewer display_;
   private ListSelectionListener surfaceTableListSelectionListener_;
   private volatile int selectedSurfaceGridIndex_ = -1;
//   MagellanChannelSpec channels_;

   /**
    * Creates new form SurfaceGridPanel
    */
   public SurfaceGridPanel() {
      initComponents();

      //exactly one surface or grid selected at all times
      surfaceGridTable_.setSelectionModel(new ExactlyOneRowSelectionModel());
      surfaceTableListSelectionListener_ = new ListSelectionListener() {
         @Override
         public void valueChanged(ListSelectionEvent e) {
            if (e.getValueIsAdjusting()) {
               return;
               //action occurs second time this method is called, after the table gains focus
            }
            updateSurfaceGridSelection();
         }
      };
      surfaceGridTable_.getSelectionModel().addListSelectionListener(surfaceTableListSelectionListener_);
      //Table column widths
      surfaceGridTable_.getColumnModel().getColumn(0).setMaxWidth(40); //show column
      surfaceGridTable_.getColumnModel().getColumn(1).setMaxWidth(120); //type column
      //So it is initialized correctly when surfaces are already present
      updateSurfaceGridSelection();
      //TODO: fix mode stuff
//      updateMode();
   }

   //TODO: how to do this on shutdown
//   surfaceGridTable_.getSelectionModel().removeListSelectionListener(surfaceTableListSelectionListener_);
   @Override
   public void SurfaceOrGridChanged(XYFootprint f) {

   }

   @Override
   public void SurfaceOrGridDeleted(XYFootprint f) {
      updateSurfaceGridSelection();
   }

   @Override
   public void SurfaceOrGridCreated(XYFootprint f) {
      updateSurfaceGridSelection();
   }

   @Override
   public void SurfaceOrGridRenamed(XYFootprint f) {

   }

   @Override
   public void SurfaceInterpolationUpdated(SurfaceInterpolator s) {

   }

   private void updateSurfaceGridSelection() {
//      selectedSurfaceGridIndex_ = surfaceGridTable_.getSelectedRow();
//      //if last in list is removed, update the selected index
//      if (selectedSurfaceGridIndex_ == surfaceGridTable_.getModel().getRowCount()) {
//         surfaceGridTable_.getSelectionModel().setSelectionInterval(selectedSurfaceGridIndex_ - 1, selectedSurfaceGridIndex_ - 1);
//      }
//      XYFootprint current = getCurrentSurfaceOrGrid();
//      if (current != null) {
//
//         CardLayout card1 = (CardLayout) surfaceGridSpecificControlsPanel_.getLayout();
//         if (current instanceof SurfaceInterpolator) {
//            card1.show(surfaceGridSpecificControlsPanel_, "surface");
//         } else {
//            card1.show(surfaceGridSpecificControlsPanel_, "grid");
//            int numRows = ((MultiPosGrid) current).numRows();
//            int numCols = ((MultiPosGrid) current).numCols();
//            gridRowsSpinner_.setValue(numRows);
//            gridColsSpinner_.setValue(numCols);
//         }
//      }
//      display_.redrawOverlay();
   }

   public ArrayList<XYFootprint> getSurfacesAndGridsForDisplay() {
//      ArrayList<XYFootprint> list = new ArrayList<XYFootprint>();
//      for (int i = 0; i < SurfaceGridManager.getInstance().getNumberOfGrids() + SurfaceGridManager.getInstance().getNumberOfSurfaces(); i++) {
//         try {
//            if (((DisplayWindowSurfaceGridTableModel) surfaceGridTable_.getModel()).isSurfaceOrGridVisible(i)) {
//               list.add(SurfaceGridManager.getInstance().getSurfaceOrGrid(i));
//            }
//         } catch (NullPointerException e) {
//            //this comes up when making a bunch of surfaces then making a grid, unclear why vut it seems to be debnign
//         }
//      }
//      return list;
return null;
   }

   public boolean isCurrentlyEditableSurfaceGridVisible() {
      if (selectedSurfaceGridIndex_ == -1) {
         return false;
      }
      return (Boolean) surfaceGridTable_.getValueAt(selectedSurfaceGridIndex_, 0);
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      newGridButton_ = new javax.swing.JButton();
      newSurfaceButton_ = new javax.swing.JButton();
      currentGridLabel_ = new javax.swing.JLabel();
      gridRowsLabel_ = new javax.swing.JLabel();
      gridRowsSpinner_ = new javax.swing.JSpinner();
      gridColsLabel_ = new javax.swing.JLabel();
      gridColsSpinner_ = new javax.swing.JSpinner();
      jScrollPane1 = new javax.swing.JScrollPane();
      surfaceGridTable_ = new javax.swing.JTable();

      newGridButton_.setText("New Grid");
      newGridButton_.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            newGridButton_ActionPerformed(evt);
         }
      });

      newSurfaceButton_.setText("New Surface");
      newSurfaceButton_.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            newSurfaceButton_ActionPerformed(evt);
         }
      });

      currentGridLabel_.setText("Current Grid:");

      gridRowsLabel_.setText("Rows:");

      gridRowsSpinner_.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
      gridRowsSpinner_.addChangeListener(new javax.swing.event.ChangeListener() {
         public void stateChanged(javax.swing.event.ChangeEvent evt) {
            gridRowsSpinner_StateChanged(evt);
         }
      });

      gridColsLabel_.setText("Columns:");

      gridColsSpinner_.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
      gridColsSpinner_.addChangeListener(new javax.swing.event.ChangeListener() {
         public void stateChanged(javax.swing.event.ChangeEvent evt) {
            gridColsSpinner_StateChanged(evt);
         }
      });

      surfaceGridTable_.setModel(new DisplayWindowSurfaceGridTableModel(display_));
      jScrollPane1.setViewportView(surfaceGridTable_);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(newGridButton_)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(newSurfaceButton_)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(currentGridLabel_)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(gridRowsLabel_)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(gridRowsSpinner_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(gridColsLabel_)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(gridColsSpinner_, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(69, Short.MAX_VALUE))
         .addComponent(jScrollPane1)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(newGridButton_)
               .addComponent(newSurfaceButton_)
               .addComponent(currentGridLabel_)
               .addComponent(gridRowsLabel_)
               .addComponent(gridRowsSpinner_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(gridColsLabel_)
               .addComponent(gridColsSpinner_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
      );
   }// </editor-fold>//GEN-END:initComponents

   private void newGridButton_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGridButton_ActionPerformed
//      try {
//         Point2D.Double coord = display_.getStageCoordinateOfViewCenter();
//         MultiPosGrid r = ((DisplayWindowSurfaceGridTableModel) surfaceGridTable_.getModel()).newGrid(
//                 (Integer) gridRowsSpinner_.getValue(), (Integer) gridColsSpinner_.getValue(), coord);
//         selectedSurfaceGridIndex_ = SurfaceGridManager.getInstance().getIndex(r);
//         surfaceGridTable_.getSelectionModel().setSelectionInterval(selectedSurfaceGridIndex_, selectedSurfaceGridIndex_);
//      } catch (NoPositionsDefinedYetException e) {
//         JOptionPane.showMessageDialog(this, "Explore a tile first before adding a position");
//         return;
//      }
   }//GEN-LAST:event_newGridButton_ActionPerformed

   private void newSurfaceButton_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSurfaceButton_ActionPerformed
//      SurfaceInterpolator s = ((DisplayWindowSurfaceGridTableModel) surfaceGridTable_.getModel()).addNewSurface();
//      selectedSurfaceGridIndex_ = SurfaceGridManager.getInstance().getIndex(s);
//      surfaceGridTable_.getSelectionModel().setSelectionInterval(selectedSurfaceGridIndex_, selectedSurfaceGridIndex_);
   }//GEN-LAST:event_newSurfaceButton_ActionPerformed

   private void gridRowsSpinner_StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_gridRowsSpinner_StateChanged
//      if (getCurrentSurfaceOrGrid() != null && getCurrentSurfaceOrGrid() instanceof MultiPosGrid) {
//         ((MultiPosGrid) getCurrentSurfaceOrGrid()).updateParams((Integer) gridRowsSpinner_.getValue(), (Integer) gridColsSpinner_.getValue());
//      }
//      display_.redrawOverlay();
   }//GEN-LAST:event_gridRowsSpinner_StateChanged

   private void gridColsSpinner_StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_gridColsSpinner_StateChanged
//      if (getCurrentSurfaceOrGrid() != null && getCurrentSurfaceOrGrid() instanceof MultiPosGrid) {
//         ((MultiPosGrid) getCurrentSurfaceOrGrid()).updateParams((Integer) gridRowsSpinner_.getValue(), (Integer) gridColsSpinner_.getValue());
//      }
//      display_.redrawOverlay();
   }//GEN-LAST:event_gridColsSpinner_StateChanged


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel currentGridLabel_;
   private javax.swing.JLabel gridColsLabel_;
   private javax.swing.JSpinner gridColsSpinner_;
   private javax.swing.JLabel gridRowsLabel_;
   private javax.swing.JSpinner gridRowsSpinner_;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JButton newGridButton_;
   private javax.swing.JButton newSurfaceButton_;
   private javax.swing.JTable surfaceGridTable_;
   // End of variables declaration//GEN-END:variables
}
