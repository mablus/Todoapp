/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ProjectController;
import controller.TaskController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Project;
import model.Task;
import util.ButtonColumnCellRenderer;
import util.DeadlineColumnCellRenderer;
import util.TaskTableModel;

/**
 *
 * @author Usuario
 */
public final class MainPanelScreen extends javax.swing.JFrame {

    ProjectController projectController;
    TaskController taskController;
    
    DefaultListModel projectsModel;
    TaskTableModel taskModel;
    
    public MainPanelScreen() {
        initComponents();
        initDataController();
        initComponentsModel();
        decorateTableTask();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTasks = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();
        jPanelToolBar = new javax.swing.JPanel();
        jLabelToolBarTitlle = new javax.swing.JLabel();
        jLabelToolBarSubtitle = new javax.swing.JLabel();
        jPanelPanelProjects = new javax.swing.JPanel();
        jLabelProjectsTitle = new javax.swing.JLabel();
        jLabelProjectsIcon = new javax.swing.JLabel();
        jPanelTasks = new javax.swing.JPanel();
        jLabelTaskTitle = new javax.swing.JLabel();
        jLabelTaskIcon = new javax.swing.JLabel();
        jPanelProjectList = new javax.swing.JPanel();
        jScrollPaneprojects = new javax.swing.JScrollPane();
        jListProjects = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jPanelEmptyList = new javax.swing.JPanel();
        jLabelEMptyListIcon = new javax.swing.JLabel();
        jLabelEmptyListTitle = new javax.swing.JLabel();
        jLabelEmptyListSubtitle = new javax.swing.JLabel();

        jTableTasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descri??o", "Prazo", "Tarefa Conclu?da"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
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
        jTableTasks.setGridColor(new java.awt.Color(204, 204, 204));
        jTableTasks.setRowHeight(40);
        jTableTasks.setSelectionBackground(new java.awt.Color(153, 255, 204));
        jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTasks.setShowHorizontalLines(true);
        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTasksMouseClicked(evt);
            }
        });
        jScrollPaneTasks.setViewportView(jTableTasks);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 600));

        jPanelToolBar.setBackground(new java.awt.Color(0, 255, 204));

        jLabelToolBarTitlle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelToolBarTitlle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelToolBarTitlle.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Downloads\\NEW MARK.png")); // NOI18N
        jLabelToolBarTitlle.setText(" TODO APP");

        jLabelToolBarSubtitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelToolBarSubtitle.setText("Anote tudo n?o se esque?a de nada");

        javax.swing.GroupLayout jPanelToolBarLayout = new javax.swing.GroupLayout(jPanelToolBar);
        jPanelToolBar.setLayout(jPanelToolBarLayout);
        jPanelToolBarLayout.setHorizontalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelToolBarTitlle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelToolBarSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelToolBarLayout.setVerticalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelToolBarTitlle)
                .addGap(18, 18, 18)
                .addComponent(jLabelToolBarSubtitle)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanelPanelProjects.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPanelProjects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelProjectsTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelProjectsTitle.setForeground(new java.awt.Color(0, 153, 0));
        jLabelProjectsTitle.setText("Projetos");

        jLabelProjectsIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Pictures\\plus (1).png")); // NOI18N
        jLabelProjectsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProjectsIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelPanelProjectsLayout = new javax.swing.GroupLayout(jPanelPanelProjects);
        jPanelPanelProjects.setLayout(jPanelPanelProjectsLayout);
        jPanelPanelProjectsLayout.setHorizontalGroup(
            jPanelPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPanelProjectsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelProjectsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelProjectsIcon)
                .addContainerGap())
        );
        jPanelPanelProjectsLayout.setVerticalGroup(
            jPanelPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPanelProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelProjectsIcon)
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPanelProjectsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelProjectsTitle)
                .addGap(21, 21, 21))
        );

        jPanelTasks.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTaskTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTaskTitle.setForeground(new java.awt.Color(0, 153, 0));
        jLabelTaskTitle.setText("Tarefas");

        jLabelTaskIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Pictures\\plus (1).png")); // NOI18N
        jLabelTaskIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTaskIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTasksLayout = new javax.swing.GroupLayout(jPanelTasks);
        jPanelTasks.setLayout(jPanelTasksLayout);
        jPanelTasksLayout.setHorizontalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelTaskTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTaskIcon)
                .addContainerGap())
        );
        jPanelTasksLayout.setVerticalGroup(
            jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTaskIcon)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTasksLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTaskTitle)
                .addGap(21, 21, 21))
        );

        jPanelProjectList.setBackground(new java.awt.Color(255, 255, 255));
        jPanelProjectList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jListProjects.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListProjects.setToolTipText("");
        jListProjects.setFixedCellHeight(50);
        jListProjects.setSelectionBackground(new java.awt.Color(0, 153, 0));
        jListProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListProjectsMouseClicked(evt);
            }
        });
        jScrollPaneprojects.setViewportView(jListProjects);

        javax.swing.GroupLayout jPanelProjectListLayout = new javax.swing.GroupLayout(jPanelProjectList);
        jPanelProjectList.setLayout(jPanelProjectListLayout);
        jPanelProjectListLayout.setHorizontalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProjectListLayout.createSequentialGroup()
                .addComponent(jScrollPaneprojects)
                .addContainerGap())
        );
        jPanelProjectListLayout.setVerticalGroup(
            jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProjectListLayout.createSequentialGroup()
                .addComponent(jScrollPaneprojects, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanelEmptyList.setBackground(new java.awt.Color(255, 255, 255));

        jLabelEMptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEMptyListIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Pictures\\folder.png")); // NOI18N

        jLabelEmptyListTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmptyListTitle.setForeground(new java.awt.Color(0, 204, 0));
        jLabelEmptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListTitle.setText("NENHUMA TAREFA AQUI ;D");

        jLabelEmptyListSubtitle.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEmptyListSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListSubtitle.setText("Clique no bot?o \"+\" para adcionar tarefa");

        javax.swing.GroupLayout jPanelEmptyListLayout = new javax.swing.GroupLayout(jPanelEmptyList);
        jPanelEmptyList.setLayout(jPanelEmptyListLayout);
        jPanelEmptyListLayout.setHorizontalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEMptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEmptyListTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEmptyListSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEmptyListLayout.setVerticalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmptyListLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelEMptyListIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEmptyListTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabelEmptyListSubtitle)
                .addGap(38, 38, 38))
        );

        jPanel5.add(jPanelEmptyList, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPanelProjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelTasks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelProjectsIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProjectsIconMouseClicked
        ProjectDialogSreen projectDialogSreen = new ProjectDialogSreen(this, rootPaneCheckingEnabled);
        projectDialogSreen.setVisible(true);
        
        projectDialogSreen.addWindowListener(new WindowAdapter(){
            
        public void WindowClosed(WindowEvent e){
            loadProjects();
        }

            private void loadProjects() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
    }); 

    }//GEN-LAST:event_jLabelProjectsIconMouseClicked
    
    private void jLabelTaskIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTaskIconMouseClicked
        // TODO add your handling code here:
        TaskDialogScreen  taskDialogScreen = new  TaskDialogScreen(this, rootPaneCheckingEnabled);
        int projectIndex = jListProjects.getSelectedIndex();
        Project project =(Project) projectsModel.get(projectIndex);
        taskDialogScreen.setProject(project);
        
        taskDialogScreen.setVisible(true);
        
        taskDialogScreen.addWindowListener(new WindowAdapter(){
            public void windowClosed(WindowEvent e){
            
                    int projectIndex = jListProjects.getAnchorSelectionIndex();
                    Project project = (Project)projectsModel.get(projectIndex);
                    loadTasks(project.getId());
            }
            
        });
    }//GEN-LAST:event_jLabelTaskIconMouseClicked

    private void jTableTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTasksMouseClicked
        // TODO add your handling code here:
        int rowIndex = jTableTasks.rowAtPoint(evt.getPoint().getLocation());
        int columnIndex = jTableTasks.columnAtPoint(evt.getPoint().getLocation());
        Task task = taskModel.getTasks().get(rowIndex);
        switch(columnIndex){
                       
            case 3:
               
                taskController.update(task);
                break;
            case 4:
                break;
                
            case 5:
                
                taskController.removeById(task.getId());
                taskModel.getTasks().remove(task);
                
                int projectIndex = jListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
                
        }
    }//GEN-LAST:event_jTableTasksMouseClicked

    private void jListProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListProjectsMouseClicked
        // TODO add your handling code here:
        int projectIndex = jListProjects.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        loadTasks(project.getId());
        
    }//GEN-LAST:event_jListProjectsMouseClicked

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPanelScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPanelScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPanelScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPanelScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPanelScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelEMptyListIcon;
    private javax.swing.JLabel jLabelEmptyListSubtitle;
    private javax.swing.JLabel jLabelEmptyListTitle;
    private javax.swing.JLabel jLabelProjectsIcon;
    private javax.swing.JLabel jLabelProjectsTitle;
    private javax.swing.JLabel jLabelTaskIcon;
    private javax.swing.JLabel jLabelTaskTitle;
    private javax.swing.JLabel jLabelToolBarSubtitle;
    private javax.swing.JLabel jLabelToolBarTitlle;
    private javax.swing.JList<String> jListProjects;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelEmptyList;
    private javax.swing.JPanel jPanelPanelProjects;
    private javax.swing.JPanel jPanelProjectList;
    private javax.swing.JPanel jPanelTasks;
    private javax.swing.JPanel jPanelToolBar;
    private javax.swing.JScrollPane jScrollPaneTasks;
    private javax.swing.JScrollPane jScrollPaneprojects;
    private javax.swing.JTable jTableTasks;
    // End of variables declaration//GEN-END:variables
public void decorateTableTask(){
    jTableTasks.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,14));
    jTableTasks.getTableHeader().setBackground(new Color(0,153,102));
    jTableTasks.getTableHeader().setForeground(new Color(255,255,255));
    jTableTasks.getColumnModel().getColumn(2).setCellRenderer
        (new DeadlineColumnCellRenderer());
    
    jTableTasks.getColumnModel().getColumn(4)
            .setCellRenderer(new ButtonColumnCellRenderer("Edit"));
    
    jTableTasks.getColumnModel().getColumn(5)
            .setCellRenderer(new ButtonColumnCellRenderer("delete"));
    
    //jTableTasks.setAutoCreateRowSorter(true);


    }

    public void initDataController(){
    projectController = new ProjectController();
    taskController = new TaskController();
    }
    
    public void initComponentsModel(){
        
        projectsModel = new DefaultListModel();
        loadProjects();
    
        taskModel = new TaskTableModel();
        jTableTasks.setModel(taskModel);
        
    if(!projectsModel.isEmpty()){
        jListProjects.setSelectedIndex(0);
        Project project = (Project) projectsModel.get(0);
        loadTasks(project.getId());
      }
    }
    public void loadTasks(int idProject){
        List<Task> tasks = taskController.getAll(idProject);
        taskModel.setTasks(tasks);
        
        showjTableTasks(!tasks.isEmpty());
    }
    
    private void showjTableTasks(boolean hasTasks){
        if(hasTasks){
            if(jPanelEmptyList.isVisible()){
               jPanelEmptyList.setVisible(false);
               jPanel5.remove(jPanelEmptyList);
                          
            }
            jPanel5.add(jPanelEmptyList);
            jScrollPaneTasks.setVisible(false);
            jScrollPaneTasks.setSize(jPanel5.getWidth(),jPanel5.getHeight());
            }else{
                if(jScrollPaneTasks.isVisible()){
                   jScrollPaneTasks.setVisible(false);
                   jPanel5.remove(jScrollPaneTasks);
                }
                
            jPanel5.add(jPanelEmptyList);
            jScrollPaneTasks.setVisible(false);
            jScrollPaneTasks.setSize(jPanel5.getWidth(),jPanel5.getHeight());
        
            }
    }

  


    public void loadProjects(){
        
       List<Project> projects = projectController.getAll();
       
       
       
       projectsModel.clear();
       
       for(int i = 0; i < projects.size() - 1;i++){
           
           Project project = projects.get(i);
                   
           projectsModel.addElement(project);
       
       
       }
    
        jListProjects.setModel(projectsModel);
    }

}
