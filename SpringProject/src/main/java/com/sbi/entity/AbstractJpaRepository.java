package com.sbi.entity;

import javax.persistence.*;

public abstract class AbstractJpaRepository {
	@PersistenceContext(unitName="SpringJPA")
	private EntityManager em;
	
	public EntityManager getEntityManager() {
		return em;
		}
}
