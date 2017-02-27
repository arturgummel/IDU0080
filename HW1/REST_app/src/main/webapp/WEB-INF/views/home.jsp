
<c:set var="uri" value="" />

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
         <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
        <script src="resources/app.js"></script>
    </head>
    <body>
        <h1>REST World!</h1>
        <a href=>Sõbrad</a>
      <input type="text" name="firstname" id="searchCriteria">
      <input type=button value="Otsi sõpru" onClick="javascript:search_friends()">
      <div id="showFriends"></div>
      <form>
      <input type=button value="Koik sõbrad" onClick="javascript:get_friends()">
      <input type=button value="External" onClick="javascript:get_friends_external()">
      <br><br>
      <table bgcolor=000000>
      <tr><td bgcolor=cccccc>Teated</td></tr>
      <tr><td bgcolor=ffffff><div id="msg_text"> </div></td></tr>
      </table> 
      <br>
      <div id="one_friend"></div> 
      <br><br>
      <div id="friends_table"></div>
      <br> 
      <table bgcolor=eeeeee><tr><td>Uue sõbra lisamine</td></tr>
      <tr><td>Nimi:</td><td><input type=text name=new_friend_firstName value=''></td></tr>
      <tr><td>Perenimi:</td><td><input type=text name=new_friend_lastName value=''></td></tr>
      <tr><td>Telefoninumber:</td><td><input type=text name=new_friend_phoneNumber value=''></td></tr>
      <tr><td>Võlg:</td><td><input type=text name=new_friend_debt value=''></td></tr>
      <td><button type='button' class='btn'  onClick='javascript:add_friend()'>Saada uus serverile</button></td></tr>
      </table>
      <br><br>
      
	  
	  
	  </form>
	  
    </body>
</html>
