package com.ocs.spring.dao;

import com.ocs.entity.DomainObject;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Goodarzi on 10/22/14.
 */
@Repository
public class GenericDaoHibernate <T extends DomainObject> implements GenericDAO<T> {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    public <T> T save(final T o){
        return (T) sessionFactory.getCurrentSession().save(o);
    }


    public void delete(final Object object){
        sessionFactory.getCurrentSession().delete(object);
    }

    /***/
    public <T> T get(final Class<T> type, final Long id){
        return (T) sessionFactory.getCurrentSession().get(type, id);
    }

    /***/
    public <T> T merge(final T o)   {
        return (T) sessionFactory.getCurrentSession().merge(o);
    }

    /***/
    public <T> void saveOrUpdate(final T o){
        sessionFactory.getCurrentSession().saveOrUpdate(o);
    }

    public <T> List<T> getAll(final Class<T> type) {
        final Session session = sessionFactory.getCurrentSession();
        final Criteria crit = session.createCriteria(type);
        return crit.list();
    }

}
