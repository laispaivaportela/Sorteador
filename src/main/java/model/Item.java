/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author laispaivaportela
 */
public class Item {
    private String nomeItem; //como o que vai ser sorteado é um item (nome do item), a única variável de instância será o nome do item (o próprio item)

    //construtores
    public Item() {
    }
    
    //getters e setters
    public Item(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }
    

    
}
