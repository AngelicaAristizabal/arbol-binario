/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgClass;

/**
 *
 * @author angelica
 */
public class clsArbol { 
        
    private clsNodo  root;

    public clsArbol() {
        this.root = null;
    }

    public void insertar(clsNodo dato, clsNodo rootTmp) {
        if (this.getRoot() == null) { // Si e árbol está vacio
            this.setRoot(dato);
        } else { // El "arbol" no está vacio
            if (dato.getNum() > rootTmp.getNum()) {
                // Lo insertaré por derecha
                if (rootTmp.getDer() == null) {
                    rootTmp.setDer(dato);
                } else {
                    // Llamado recursivo
                    insertar(dato, rootTmp.getDer());
                }
            } else {
                // Lo insertaré por izquierda
                if (dato.getNum() <= rootTmp.getNum()) {
                    // Lo insertaré por derecha
                    if (rootTmp.getIzq() == null) {
                        rootTmp.setIzq(dato);
                    } else {
                        // Llamado recursivo
                        insertar(dato, rootTmp.getIzq());
                    }
                }
            }
        }
    }
    
    public void Preorden (clsNodo rootTmp){
      
        if (rootTmp != null){ 
            System.out.println("Num: " + rootTmp.getNum());
            if (rootTmp.getIzq() != null){
                Preorden(rootTmp.getIzq());
                 
            }
               if (rootTmp.getDer() != null){ // Tiene hijo por derecha? 
                Preorden(rootTmp.getDer());
            }
        }
    }
          
        public void Inorden (clsNodo rootTmp){
        if (rootTmp != null){
            
            if (rootTmp.getIzq() != null){
                Inorden(rootTmp.getIzq());
            }System.out.println("Num: " + rootTmp.getNum());
             if (rootTmp.getDer() != null){ // Tiene hijo por derecha?
                Inorden(rootTmp.getDer());
            }
        }
    }
        
            public void Posorden (clsNodo rootTmp){
        if (rootTmp != null){
            
              if (rootTmp.getIzq() != null){
               Posorden(rootTmp.getIzq());
            }
          
               if (rootTmp.getDer() != null){ // Tiene hijo por derecha?
               Posorden(rootTmp.getDer());
            }System.out.println("Num: " + rootTmp.getNum());
        }
    }
            public boolean existe(int busqueda) {
    return existe(this.root, busqueda);
}

private boolean existe(clsNodo n, int busqueda) {
    if (n == null) {
        return false;
    }
    if (n.getNum()== busqueda) {
        return true;
    } else if (busqueda < n.getNum()) {
        return existe(n.getIzq(), busqueda);
    } else {
        return existe(n.getDer(), busqueda);
    }
         
}

   
   
            
            
            
            
    /**
     * @return the root
     */
    public clsNodo getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(clsNodo root) {
        this.root = root;
    }
}
