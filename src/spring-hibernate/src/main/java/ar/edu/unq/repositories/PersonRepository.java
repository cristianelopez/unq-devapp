package ar.edu.unq.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateCallback;

import ar.edu.unq.model.Person;

public class PersonRepository extends HibernateGenericDAO<Person> implements GenericRepository<Person> {
	public static Logger log = Logger.getLogger(PersonRepository.class);
    private static final long serialVersionUID = -4036535812105672110L;

    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<Person> filterPeople(final String pattern) {
    	
        return (List<Person>) this.getHibernateTemplate().execute(new HibernateCallback() {
            @Override
            public List<Person> doInHibernate(final Session session) throws HibernateException {
                Criteria criteria = session.createCriteria(Person.class);
                criteria.add(Restrictions.like("name", "%" + pattern + "%"));
                List<Person> p = criteria.list();
                log.info("Retornando FilterPeople con el patron: "+ pattern);
                return criteria.list();
            }

        });
    }

    @Override
    protected Class<Person> getDomainClass() {
        return Person.class;
    }
}
