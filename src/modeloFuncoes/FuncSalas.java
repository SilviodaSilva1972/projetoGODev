/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloFuncoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import telas.NewJInternalFrameCadPessoas;




/**
 *
 * @a@author Silvio da Silva
 * Classe para Funcoes
 */
public class FuncSalas {
   NewJInternalFrameCadPessoas CadPes = new NewJInternalFrameCadPessoas();
        
        
        
 public void BuscaCombo (String teste) {   

   // Preenche a combobox sala da tela de cadastro de pessoas.
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
                   //CadPes.jComboBoxSala.addItem(coluna[0]);
                   }
               arq.close();
           } catch (IOException ex) {
               conteudo = "Erro: Nao foi possivel ler Arquivo ! ";
           }
       } catch(IOException ex) {
           conteudo = "Erro: Arquivo inexistente ! ";
       }
        if (conteudo.contains("Erro"))
            JOptionPane.showMessageDialog(null, "erro  1");
        else {
            }
    
        // Preenche a ComboBOX sala de cafe
        //CadPes.jComboBoxCafe.removeAllItems();
        
        String conteudo2="";
         String Caminho2="SalaCafe.dad";
           try{
           FileReader arq2 = new FileReader(Caminho2);
           BufferedReader lerArq2 = new BufferedReader(arq2);
           String linha2="";
           
           try{
               String linha = lerArq2.readLine();
               while(linha2!=null){
                   String[] coluna2 = linha2.split(";");
                   conteudo2 += linha2;
                   linha = lerArq2.readLine();
                   //CadPes.jComboBoxCafe.addItem(coluna2[0]);
                }
               arq2.close();
           } catch (IOException ex) {
               conteudo2 = "Erro: Nao foi possivel ler Arquivo ! ";
           }
       } catch(IOException ex) {
           conteudo2 = "Erro: Arquivo inexistente ! ";
       }
        if (conteudo2.contains("Erro"))
            JOptionPane.showMessageDialog(null, "erro  1");
        else {
            }
 }
}


        