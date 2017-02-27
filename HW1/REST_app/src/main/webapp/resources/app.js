var friend_from_server;

function Friend()
{
this.firstName;
this.lastName;
this.phoneNumber;
this.debt;
}

/*function search_friends() {
	$.get('/service/search/', $(this).serializable(), function(response) {
		$('#showFriends').html("test");
	}, "json");
}
*/
function search_friends()
{
var name = document.getElementById('searchCriteria').value;	

 
$.ajaxSetup({ cache: false });
$.ajax({

    url: 'service/search/?firstname=' + name ,
    type: "GET",
    dataType: 'json',
    success: function(data) {
    	display_friends(data);
       // console.log(JSON.stringify(data));

    }
  });


}

function get_friends_external()
{

 
$.ajaxSetup({ cache: false });
$.ajax({

    url: 'service/external/friends' ,
    type: "GET",
    dataType: 'json',
    success: function(data) {
    	display_friends(data);
        //console.log(JSON.stringify(data));

    }
  });


}

function get_friends()
{

 
$.ajaxSetup({ cache: false });
$.ajax({

    url: 'service/friends' ,
    type: "GET",
    dataType: 'json',
    success: function(data) {
    	display_friends(data);
        //console.log(JSON.stringify(data));

    }
  });


}

function get_friend(id)
{

 
$.ajaxSetup({ cache: false });
$.ajax({

    url: 'service/friend/' + id ,
    type: "GET",
    dataType: 'json',
    success: function(data) {
    	friend_from_server = data;
    	display_friend(data);
        //console.log(JSON.stringify(data));

    }
  });


}


function save_friend()
{
	
	friend_from_server.firstName=document.forms[0].firstName.value;
	friend_from_server.lastName=document.forms[0].lastName.value;
	friend_from_server.phoneNumber=document.forms[0].phoneNumber.value;
	friend_from_server.debt=document.forms[0].debt.value;
		
var jsonData = JSON.stringify(friend_from_server); 
$.ajaxSetup({ cache: false });
$.ajax({

    url: 'service/friend/' + friend_from_server.id ,
    type: "POST",
    data: jsonData,
    dataType: 'json',
    contentType : 'application/json',
    success: function(data) {
    	show_message("Salvestatud");
        //console.log(JSON.stringify(data));

    }
  });


}

function delete_friend(id)
{
	

$.ajaxSetup({ cache: false });
$.ajax({

    url: 'service/friend/' + id ,
    type: "DELETE",
    contentType : 'application/json',
    success: function(data) {
    	show_message("Kustutatud");
    	get_friends();
        //console.log(JSON.stringify(data));

    }
  });


}


function add_friend()
{
	var friend_to_server = new Friend();
	friend_to_server.firstName=document.forms[0].new_friend_firstName.value;
	friend_to_server.lastName=document.forms[0].new_friend_lastName.value;
	friend_to_server.phoneNumber=document.forms[0].new_friend_phoneNumber.value;
	friend_to_server.debt=document.forms[0].new_friend_debt.value;
		
var jsonData = JSON.stringify(friend_to_server); 
$.ajaxSetup({ cache: false });
$.ajax({

    url: 'service/friend/' ,
    type: "PUT",
    data: jsonData,
    dataType: 'json',
    contentType : 'application/json',
    success: function(data) {
    	show_message("Sisestatud");
        console.log(JSON.stringify(data));
    	get_friends();

    }
  });


}

function display_friend(friend)
{
	 var out_data="";
	 out_data = out_data + "<table bgcolor=eeeeee><tr><td>Muutmine. Sõbra id: <b>" + friend.id + "</b></td></tr>";

		out_data = out_data + "<tr><td>Nimi:</td><td><input type=text name=firstName value='" + friend.firstName + "'></td></tr>";
		out_data = out_data + "<tr><td>Perenimi:</td><td><input type=text name=lastName value='" + friend.lastName + "'></td></tr>";
		out_data = out_data + "<tr><td>Telefoninumber:</td><td><input type=text name=phoneNumber value='" + friend.phoneNumber + "'></td></tr>";
		out_data = out_data + "<tr><td>Võlg:</td><td><input type=text name=debt value='" + friend.debt + "'></td></tr>";
		out_data = out_data + "<td><button type='button' class='btn'  onClick='javascript:save_friend()'>Salvesta</button></td></tr>";
		out_data = out_data + "</table>";

	

	
	 $("#one_friend").html(out_data);
}




function display_friends(data)
{
	var out_data="";
	 out_data = out_data + "<table bgcolor=eeeeee><tr><td colspan=4>Sõpru kokku: <b>" + data.length + "</b></td></tr>";
	 for(var  i in data) {
   	  var friend = data[i];
		out_data = out_data + "<tr><td>nimi:</td><td bgcolor=ffffff>" + friend.firstName + "</td><td>perenimi:</td><td bgcolor=ffffff>" + friend.lastName + "</td>";
		out_data = out_data + "<td><button type='button' class='btn'  onClick='javascript:get_friend(" + friend.id + ")'>Vali</button></td>";
		out_data = out_data + "<td><button type='button' class='btn'  onClick='javascript:delete_friend(" + friend.id + ")'>Kustuta</button></td></tr>";
		
	 }
	 out_data = out_data + "</table>";

	
	 $("#friends_table").html(out_data);
}


function show_message(message)
{
	
	 $("#msg_text").html(message);
}
