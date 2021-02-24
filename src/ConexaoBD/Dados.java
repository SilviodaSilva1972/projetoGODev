 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


/**
 *
 * @author Silvio da Silva
 * // Classe para salvar os dados
 */
public class Dados {
    
               
    
    
   public String LerTudo (String Caminho){
       String conteudo="";
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
                }
               arq.close();
               
           } catch (IOException ex) {
               conteudo = "Erro: Nao foi possivel ler Arquivo ! ";
           }
       } catch(IOException ex) {
           conteudo = "Erro: Arquivo inexistente ! ";
       }
        if (conteudo.contains("Erro")) {
       } else {
            return conteudo;
        }
       return null;
   }

   
   public boolean Gravar(String Caminho, String Dados){
       try {
           FileWriter arq = new FileWriter(Caminho,true);
           BufferedWriter bw = new BufferedWriter(arq);
           PrintWriter gravaArq = new PrintWriter(bw);
           gravaArq.println(Dados);
           gravaArq.close();
           JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
           return true;
           
       }catch (IOException e) {
           JOptionPane.showMessageDialog(null, e);
           return false;
           
       }
   }
  
       }
   
   

