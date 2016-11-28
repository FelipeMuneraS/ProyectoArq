/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Curso;
import dto.Estudiante;
import dto.Grupo;
import dto.Profesor;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author estudiantelis
 */
public class Logica {
    
    public List<Curso> getListaCursos(Profesor prof) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("From Curso as curso where curso.profesor=" + prof.getId());
        List<Curso> lista = query.list();
        return lista;
    }
    
    public List<Estudiante> getListaEstudiantes(Grupo grupo) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("Select mat.estudiante From Matricula as mat where mat.grupo=" + grupo.getId());
        List<Estudiante> lista = query.list();
        return lista;
    }
    
    
    
}
