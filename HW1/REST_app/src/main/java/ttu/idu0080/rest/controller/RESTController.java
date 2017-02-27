package ttu.idu0080.rest.controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import ttu.idu0080.rest.service.*;
import ttu.idu0080.rest.data.*;

@Controller
public class RESTController {

	@Autowired
	private DataService dataService;
	@Autowired
	private RESTDataService restDataService;

	@RequestMapping(value = "/service/friends", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Friend> getFriends(HttpServletResponse response)
			throws IOException {

		List<Friend> friends = dataService.getAllFriends();
		return friends;
	}

	
	@RequestMapping(value = "/service/friend/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Friend getFriend(@PathVariable int id) throws IOException {

		Friend friend = dataService.getFriendById(id);
		return friend;
	}
	
	@RequestMapping(value="/service/search/",method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Friend> searchByName(@RequestParam(value = "firstname",required = true) String  s_name) throws IOException{
		List<Friend> friends = dataService.searchByName(s_name);
		return friends;
	}

	@Transactional
	@RequestMapping(value = "/service/friend/{id}", method = RequestMethod.POST)
	public @ResponseBody void updateFriend(@RequestBody Friend friend) {
		dataService.update(friend);

	}

	@Transactional
	@RequestMapping(value = "/service/friend/", method = RequestMethod.PUT)
	public @ResponseBody void addFriend(@RequestBody Friend friend) {
		dataService.add(friend);

	}
	
	@Transactional
	@RequestMapping(value = "/service/friend/{id}", method = RequestMethod.DELETE)
	public @ResponseBody void deleteFriend(@PathVariable long id)
			throws IOException {
		dataService.delete(id);

	}

	@RequestMapping(value = "/service/external/friends", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Friend> getExternalFriends(HttpServletResponse response)
			throws IOException {
		List<Friend> friends = restDataService.getAllFriends();
		return friends;
	}

}
