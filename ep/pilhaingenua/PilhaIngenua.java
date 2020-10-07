/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep.pilhaingenua;

/**
 *
 * @author Vini
 */
public class PilhaIngenua {
    protected final int MAX = 1000000;
    protected Integer[] pilha;
    
    PilhaIngenua ( ) { 
        pilha = new Integer [MAX] ; 
    }
    
    void add ( int newElement ) {
        int i ;
        for ( i = 0 ; pilha[i] != null ; i ++);
        pilha [i] = newElement ;
    }
    
    int remove ( ) {
        int i ;
        for ( i = 0 ; pilha[i] != null ; i ++);
        int tmp = pilha [i-1];
        pilha [i-1] = null;
        return tmp ;
    }
    
    
}
