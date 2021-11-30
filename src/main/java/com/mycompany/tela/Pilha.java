package com.mycompany.tela;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author guizi
 */
public class Pilha <T> {

    No pilha[];
    int TAM;
    
    int topo = -1;

    public Pilha(int tam){
        pilha = new No[tam];
        this.TAM = tam;
    }

    

   
    public void empilha(No n){
        if(topo == -1 || topo<(this.TAM-1)){
            topo = topo +1;
            pilha[topo] = n;
            System.out.println("Foi inserido na pilha "+n.tostring());
        }
        else{
            System.out.println("Pilha Cheia!!");
        }
    }

    
    public No desempilha() throws ExcecaoPilhaVazia{
        if(topo !=-1){
            No temp = pilha[topo];
            pilha[topo] = null;
            topo = topo-1;
            System.out.println("desempilha: "+temp.tostring());
            return temp;
        }
        else{
            throw new ExcecaoPilhaVazia();
           
        }
    }
            public int retornaTopo() {
                return topo;
         }
    public void imprime(){
        for(int i = this.topo; i >= 0; i--) {
            System.out.println(i+" - " +pilha[i].tostring());
        }
    
    }
}

