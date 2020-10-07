
package ep.slinkedlist;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class processa {

    
    
    public void carrega(File folder){

    File[] fileNames = folder.listFiles();


        if(folder.isDirectory()){
           for(File file : fileNames){
                try {
                makeLog(file);
                } catch (IOException e){
                  e.printStackTrace();
                }
            } 
        } else {
            System.out.println("nao é pasta tem q retornar");
        }
    }


    public void makeLog(File file) throws IOException{

        SLinkedList linkedList = new SLinkedList();
       
        List<String> list = new ArrayList<>();
        
        List<Integer> saida = new ArrayList<>();

        long start,end; 
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            //br returns as stream and convert it into a List
            list = br.lines().collect(Collectors.toList());
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
       
        start = System.currentTimeMillis();
        ProcessaLista(list, saida, linkedList);
        end = System.currentTimeMillis();

       
       
        FileWriter writer = new FileWriter(file.getName().replace(".txt","-Log_lista.txt")); 
        for(Integer str: saida) {
          writer.write(str + System.lineSeparator());
        }
      
        
        
        
        
        saida.clear();
        list.clear();



        }
    
     public void ProcessaLista(List<String> list, List<Integer> saida, SLinkedList linkedList){
        list.forEach(s -> {   
            if(s.length() != 0){
                linkedList.addFirst(new Node(Integer.parseInt(s), null));
            } else {
                saida.add(linkedList
                        .removeFirst()
                        .getElement());
            } 
        });
    }
    
   
        
}
