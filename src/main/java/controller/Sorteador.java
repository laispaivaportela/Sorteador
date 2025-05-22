/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author laispaivaportela
 */
import java.util.Random; //classe
import DAO.ItensDAO;
import view.FrmSorteador;

public class Sorteador {
    private final ItensDAO itensDAO = new ItensDAO();
    private final FrmSorteador tela = new FrmSorteador();
    
    
    //método sorteia numero aleatorio (de 0 a tamanhodalista - 1)
    public String sorteiaNumero(){
        Random aleatorio = new Random(); //cria um novo objeto aleatorio
        int quantidadeItens = quantidadeItens(); //define a quantidade de itens na lista para o retorno do método quantidadeItens
        int numeroAleatorio = aleatorio.nextInt(quantidadeItens - 1 + 1); //escolhe um número aleatório
        String item = itensDAO.imprimeItem(numeroAleatorio); //"imprime" o item que está na posição do número escolhido aleatoriamente
        return item;
    }
    
    public void adicionaNome(String nomeItem){ //pede pra adicionar o nome do Item na lista na DAO
       itensDAO.adicionaItem(nomeItem);
    }

    public void incia(){ //método para iniciar (deixar visível a tela principal)
    tela.setVisible(true);
    }
    
    public int quantidadeItens(){ //chama o método tamanhoLista na classe DAO e armazena o tamanho da lista
        int quantidadeItens;
        quantidadeItens = itensDAO.tamanhoLista();
        return quantidadeItens;
    }
    
    public double calculaProbabilidade(){ //calcula à probabilidade de um item aleatório ser escolhido
        int quantidade = quantidadeItens();
        double probabilidade = 1.0/quantidade;
        return probabilidade;
    }
    
    public void novoArquivo(){ //limpa todas as definições para receber novas entradas
        itensDAO.limpaLista(); //limpa a lista
    }
}
