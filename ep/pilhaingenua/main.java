/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep.pilhaingenua;

import java.io.File;

/**
 *
 * @author Vini
 */
public class main {
    public static void main(String[] args) {
        System.out.println("Inicio programa - Pilha Ingenua");
        
        
        File folder = new File(args[0]);
        processa listFiles = new processa();
        listFiles.carrega(folder);
        System.out.println("Log criado com sucesso!");
    }
}
