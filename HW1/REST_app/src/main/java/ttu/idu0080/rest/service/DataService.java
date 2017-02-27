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

	public Friend getFriendById(long id) {

		Friend node = null;
		try {

			Query q = em.createQuery("select c from Friend c where c.id = :id")
					.setParameter("id", id);
			node = (Friend) q.getSingleResult();

		}

		catch (Exception ex) {
			System.out.println("DataService.getFriendById():" + ex.getMessage());

		}

		return node;
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

	public Friend update(Friend friend) {

		System.out.println("friend update , friend name: " + friend.getFirstName());
		try {

			em.merge(friend);
			em.flush();

		}

		catch (Exception ex) {
			System.out.println("DataService.update():" + ex.getMessage());
		}

		return friend;
	}

	public Friend save(Friend friend) {

		System.out.println("new friend insert , friend name: " + friend.getFirstName());

		try {

			em.persist(friend);

		}

		catch (Exception ex) {
			System.out.println("DataService.save():" + ex.getMessage());
		}

		return friend;
	}

	public void delete(long id) {

		System.out.println("DELETE ");

		try {

			Friend friend = em.find(Friend.class, id);
			em.remove(friend);

		}

		catch (Exception ex) {
			System.out.println("DataService.delete():" + ex.getMessage());
		}

	}

	public List<Friend> searchByName(String s_name) {

		List<Friend> friends = null;

		try {

			String sql = "from Friend c where upper(c.firstName) like upper(:firstname) order by c.firstName";

			Query q = em.createQuery(sql);
			q.setParameter("firstname", s_name + "%");
			friends = (List<Friend>) q.getResultList();
			System.out.println("Otsingu tulemusi:" + friends.size());

		}

		catch (Exception ex) {
			System.out
					.println("DataService.searchByName():" + ex.getMessage());

		}

		return friends;
	}

	public Friend add(Friend friend) {

		System.out.println("adding a new friend , friend name: " + friend.getFirstName());

		try {

			em.persist(friend);

		}

		catch (Exception ex) {
			System.out.println("DataService.add():" + ex.getMessage());
		}

		return friend;
	}

}
