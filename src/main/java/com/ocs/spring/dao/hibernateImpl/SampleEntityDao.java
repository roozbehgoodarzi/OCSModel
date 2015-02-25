package com.ocs.spring.dao.hibernateImpl;

import com.ocs.entity.SampleEntity;
import com.ocs.spring.dao.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

/**
 * Created by Goodarzi on 02/01/2015.
 */
@Repository("SampleEntityDao")
public class SampleEntityDao extends GenericDaoHibernate<SampleEntity> {
}
