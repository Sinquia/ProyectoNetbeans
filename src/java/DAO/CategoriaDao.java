
package DAO;

import Prueba.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import service.ICategoria;

/** @author SINQUIA */
public class CategoriaDao extends ICategoria{

    @Override
    public void Guardar() {
       // Session=HibernateUtil.getSessionFactory().openSession();
        
    
    }

    @Override
    public void Actualizar() {
        
    }

    @Override
    public void Eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
