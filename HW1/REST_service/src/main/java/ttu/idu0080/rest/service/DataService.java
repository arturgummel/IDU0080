package ttu.idu0080.rest.service;

import ttu.idu0080.rest.data.*;

import java.util.*;
import java.text.*;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.transaction.annotation.Propagation;

import javax.persistence.EntityTransaction;

@Repository
public class DataService {

	@PersistenceContext
	private EntityManager em;

	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	public List<Friend> getAllFriends() {

		List<Friend> friend_list = null;
		try {

			Query q = em.createQuery("select c from Friend c ");
			friend_list = (List<Friend>) q.getResultList();

		}

		catch (Exception ex) {
			System.out.println("DataService.getAllFriends():" + ex.getMessage());
		}

		return friend_list;
	}

}
