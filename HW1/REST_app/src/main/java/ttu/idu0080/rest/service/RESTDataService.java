package ttu.idu0080.rest.service;

import ttu.idu0080.rest.data.*;

import java.util.*;
import java.text.*;
import java.util.List;

import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;;
@Service
public class RESTDataService  {



	
	
	public List<Friend> getAllFriends()  {
		
		Friend[] friend_array = null;
		try
		{
			RestTemplate restTemplate = new RestTemplate();
		friend_array = restTemplate.getForObject("http://localhost:8080/REST_service/service/friends", Friend[].class) ;
		System.out.println("Sõpru REST-teenusest:" + friend_array.length);
		}
		catch(Exception ex)
		{
			System.out.println("RESTDataService.getAllFriends():"+ ex.getMessage());
		}

		List<Friend> friend_list= Arrays.asList(friend_array);
		return friend_list;
	}

	
	
	
}
