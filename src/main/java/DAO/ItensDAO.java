/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author laispaivaportela
 */
import java.util.ArrayList;
import java.util.List;
import model.Item;

public class ItensDAO {
    private List<String> itens = new ArrayList<>();
    
    //método cadastra item
    public void adicionaItem(String nomeItem){
        itens.add(nomeItem);
    }
    
    //método verifica/devolve quantidade de itens
    public int tamanhoLista(){
        return itens.size();
    }
    
    //método imprime lista de itens
    public String imprimeItens(){
        String itensFormatado = "";
        for(int i = 0; i < itens.size(); i++){
         itensFormatado +=  itens.get(i);
        }
        return itensFormatado;
    }
    
    //método que exibe o resultado do sorteio (pega o elemento na posição do número sorteado)
    public String imprimeItem(int numeroAleatorio){
        String itemAleatorio = "";
        int posicao = numeroAleatorio;
        for(int i = 0; i < itens.size(); i++){
         if(i == posicao){
             itemAleatorio = itens.get(i);
             break;
         }
        }
        return itemAleatorio;
    }
    
    public void limpaLista(){ //limpa a lista quando for criar novo arquivo
        itens.clear();
    }
    
    
 }
