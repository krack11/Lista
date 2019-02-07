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
public interface ILista {
    
    public void poner(Object o);
    public Object coger();
    public Object sacar();
    public int length();
    public Object[] toArray();
    @Override
    public String toString();
    
}
