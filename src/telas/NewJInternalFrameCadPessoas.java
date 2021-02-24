/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import ConexaoBD.Dados;
import ModeloDeclare.DecCadPessoas;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import modeloFuncoes.FuncPessoas;



/**
 *
 * @author Silvio da Silva
 * Classe para a janela de dados 
 */
public class NewJInternalFrameCadPessoas extends javax.swing.JInternalFrame {
    FuncPessoas fPes = new FuncPessoas();
    DecCadPessoas cadPes = new DecCadPessoas();
    Dados banco = new Dados();
   
    
    
    /**
     * Creates new form NewJInternalFrameCadPessoas
     */
    public NewJInternalFrameCadPessoas() {
        initComponents();
     
       
      
// Preenche a combobox sala da tela de cadastro de pessoas.
            
        jComboBoxSala.removeAllItems();
         String conteudo="";
         String Caminho="Sala.dad";
           try{
           FileReader arq = new FileReader(Caminho);
           BufferedReader lerArq = new BufferedReader(arq);
           String linha="";
           
           try{
               linha = lerArq.readLine();
               while(linha!=null){
                   String[] coluna = linha.split(";");
                   conteudo += linha;
                   linha = lerArq.readLine();
                   jComboBoxSala.addItem(coluna[0]);
                }
               arq.close();
           } catch (IOException ex) {
               conteudo = "Erro: Nao foi possivel ler Arquivo ! ";
           }
       } catch(IOException ex) {
           conteudo = "Erro: Arquivo inexistente ! ";
       }
        if (conteudo.contains("Erro"));
        else {
            }
    
        // Preenche a ComboBOX sala de cafe
        
        jComboBoxCafe.removeAllItems();
         String conteudo2="";
         String Caminho2="SalaCafe.dad";
           try{
           FileReader arq = new FileReader(Caminho2);
           BufferedReader lerArq = new BufferedReader(arq);
           String linha="";
           
           try{
               linha = lerArq.readLine();
               while(linha!=null){
                   String[] coluna = linha.split(";");
                   conteudo2 += linha;
                   linha = lerArq.readLine();
                   jComboBoxCafe.addItem(coluna[0]);
                }
               arq.close();
           } catch (IOException ex) {
               conteudo2 = "Erro: Nao foi possivel ler Arquivo ! ";
           }
       } catch(IOException ex) {
           conteudo2 = "Erro: Arquivo inexistente ! ";
       }
        if (conteudo2.contains("Erro"));
        else {
            }
            
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNomePessoa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomePessoa = new javax.swing.JTextField();
        jComboBoxSala = new javax.swing.JComboBox<>();
        jComboBoxCafe = new javax.swing.JComboBox<>();
        jButtonSalvarPes = new javax.swing.JButton();
        jComboBoxEtapa = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Cadastro de Pessoas");

        jLabelNomePessoa.setText("Nome completo:");

        jLabel2.setText("Sala :");

        jLabel3.setText("Espaço Café:");

        jComboBoxSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSalaActionPerformed(evt);
            }
        });

        jComboBoxCafe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonSalvarPes.setText("Salvar");
        jButtonSalvarPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarPesActionPerformed(evt);
            }
        });

        jComboBoxEtapa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Etapa 1", "Etapa 2" }));

        jLabel1.setText("Etapa do Evento do Participante:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvarPes)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNomePessoa)
                        .addGap(8, 8, 8)
                        .addComponent(jTextFieldNomePessoa))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxSala, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxCafe, 0, 116, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxEtapa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomePessoa)
                    .addComponent(jTextFieldNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButtonSalvarPes)
                .addContainerGap())
        );

        setBounds(400, 75, 400, 184);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSalaActionPerformed
       
       
               
    }//GEN-LAST:event_jComboBoxSalaActionPerformed

    private void jButtonSalvarPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarPesActionPerformed
        cadPes.setNomePessoa(jTextFieldNomePessoa.getText());
        cadPes.setNomeSala((String) jComboBoxSala.getSelectedItem());
        cadPes.setNomeEspacoCafe((String) jComboBoxCafe.getSelectedItem());
        
        String Caminho="Pessoas.dad";
        String Dados=jTextFieldNomePessoa.getText();
        String Dados2=(String) jComboBoxSala.getSelectedItem();
        String Dados3=(String) jComboBoxCafe.getSelectedItem();
        String Dados4=(String) jComboBoxEtapa.getSelectedItem();
        String conteudo = Dados+";"+Dados2+";"+Dados3+";"+Dados4;
        
        //banco.LerTudo(Caminho);
        //JOptionPane.showMessageDialog(this, conteudo);
        
        
        banco.Gravar(Caminho,conteudo);
        jTextFieldNomePessoa.setText("");
        jComboBoxSala.setToolTipText("");
        jComboBoxCafe.setToolTipText("");
        jTextFieldNomePessoa.requestFocus(true);
        
        
    }//GEN-LAST:event_jButtonSalvarPesActionPerformed
            


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvarPes;
    private javax.swing.JComboBox<String> jComboBoxCafe;
    private javax.swing.JComboBox<String> jComboBoxEtapa;
    private javax.swing.JComboBox<String> jComboBoxSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelNomePessoa;
    private javax.swing.JTextField jTextFieldNomePessoa;
    // End of variables declaration//GEN-END:variables

}





