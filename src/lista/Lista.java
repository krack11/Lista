/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author alumno
 */
public class Lista implements ILista {
    
    private Nodo primero;
    private Nodo ultimo;
    
    
    public Lista(){
        this.primero=null;
        this.ultimo=null;
    }
    
    public void put(Object o){
        Nodo nuevo = new Nodo(o);
        nuevo.siguiente=this.ultimo;
        this.ultimo=nuevo;
    }
    
    public Object get(){
        if(ultimo==null){
            return null;
        }else{
            return this.ultimo.contenido;
        }

    }
    @Override
    public void poner(Object o) {
        
        Nodo aux = new Nodo(o);
        
        if(this.primero==null){
            this.primero=aux;
        } else{
            this.ultimo.siguiente=aux;
        }
        this.ultimo=aux;
    }

    @Override
    public Object coger() {
        if(primero==null){
            return null;
        } else {
            return this.primero.contenido;
            
        }
    }

    @Override
    public Object sacar() {
        Nodo aux= this.primero;
        if(aux==null){
            return null;
        }else{
            if(aux.siguiente==null){
                this.primero=null;
                this.ultimo=null;
            }else{
                this.primero=this.primero.siguiente;
            }
            return aux.contenido;
        }
    }

    @Override
    public int length() {
        Nodo aux = this.primero;
        int longi=0;
        while(aux!=null){
            aux=aux.siguiente;
            longi++;
        }
        return longi;
    }

    @Override
    public Object[] toArray() {
        Object[] r= new Object[this.length()];
        Nodo aux=this.primero;
        for(int i=0;i<r.length;i++){
            r[i]=aux.contenido;
            aux=aux.siguiente;
        }
        return r;
    }
    
    public static Lista toLista(Object[]a){
        Lista l=new Lista();
        
        for(Object elem : a){
            l.poner(elem);
        }
        return l;
    }
    
    @Override
    public String toString(){
        Nodo aux=this.primero;
        String r="\n------------Lista---------------\n";
        while(aux !=null){
            r+=aux.contenido;
            r+="\n";
            aux=aux.siguiente;
        }
        return r;
    }

    
        public void insertobj(int pos, Object o) {
        
        Nodo nuevo = new Nodo(o);
        
        if(pos==1){
            if(this.primero==null){
                this.primero=nuevo;
                this.ultimo=nuevo;
                nuevo.siguiente=null;
            }else{
                nuevo.siguiente=primero;
                this.primero=nuevo; 
               }      
        } else if(pos<=this.length()){
            Nodo actual = this.primero;
            int i=1;
            while(i<pos && actual !=null){
                actual=actual.siguiente;
                i++;
            }
            nuevo.siguiente=actual.siguiente;
            actual.siguiente=nuevo;
            
        }else if(pos==this.length()+1){
            this.ultimo.siguiente=nuevo;
            this.ultimo=nuevo;
            nuevo.siguiente=null;
        }
         
    }
      
       public void setObj(int pos, Object cont){
           
           
           
       }
       
       public void getObj(int pos){
           
       }
        

}
