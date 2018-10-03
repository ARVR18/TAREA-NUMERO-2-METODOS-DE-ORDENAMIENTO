
package metburbuja;

/**
 *
 * @author Alex
 */
public class Algoritmoclaseordenado {
  int i,j, temporal,repeticionesp;
public Algoritmoclaseordenado(){
this.i=0;
this.j=0;
this.temporal=0;
     }

public void burbuja(int[] arreglo){
  repeticionesp=0;
  
  for(i=1;i<arreglo.length;i++){
     for(j=0;j<arreglo.length-1;j++){
  if(arreglo[j]>arreglo[j+1]){
   temporal=arreglo[j];
   arreglo[j]=arreglo[j+1];
   arreglo[j+1]=temporal;
   
     }
  repeticionesp++;
   }
    
  }
    System.out.println("Termino en " + repeticionesp + " pasadas" );
 }

   public void mostrarArreglo(int[] arreglo){
   
       int g;
   
       
      for(g=0; g<arreglo.length;g++){
          //impresion del arreglo
   System.out.print("[" + arreglo[g] + "]");
 
   }
     System.out.println();
   }
      
}
