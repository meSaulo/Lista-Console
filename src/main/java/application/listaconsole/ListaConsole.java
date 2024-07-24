/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package application.listaconsole;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wasabi
 */
public class ListaConsole {

    public static void main(String[] args) {
       
         Scanner sc = new Scanner(System.in);
         Scanner scStr = new Scanner(System.in);
        ArrayList <String> lista = new ArrayList();
        
        
        int op;
        
        
        System.out.println("Bem Vindo Sua Lista Pessoal De Compras - Console \n 1 - Adicionar Produto Na Lista \n 2 - Verificar Lista \n 3 - Remover Item Da Lista (por posição) \n 4 - Limpar Lista \n 0 - Sair");
        
        do{
           
           
            
            
            op = sc.nextInt();
            
            switch(op){
            
                case 1 : 
                    
                    System.out.print("Digite o que deseja adicionar na lista : ");
                    lista.add(scStr.nextLine());
                    System.out.println("Adicionado com sucesso");
                    break;
                    
                    
                case 2 : 
                    
                    if(lista.isEmpty()){
                     
                        System.out.println("Lista está vazia");
                    
                    }
                    else{
                        for(String listagem : lista){
                        System.out.print(listagem + ", ");
                       
                       
                       }
                        
                    }
                    
                    break;
                    
                   
                case 3 : 
                    
                    System.out.print("Qual Item Deseja Remover Da Lista, indique sua posição : ");
                    lista.remove(sc.nextInt());
                    System.out.println("Item Removido com sucesso ");
                    break;
                    
                    
                case 4 : 
                    
                    lista.clear();
                    System.out.println("Todos os Itens Removidos com sucesso");
                    break;
            }   
                
            
            
           
        }while(op != 0);
        
            System.out.println("Programa Finalizado");
            
            
            
            
            
            
            
            
    }
}
