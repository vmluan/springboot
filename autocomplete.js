//initialize some global variables
//firmId, userId
var firmList = null;
var userList = null;
//initData('selFirm', 'firmId');initData('selUser', 'userId')
function initData(selType, typeId) {
	//selType: selFirm/selUser 
	//typeId:  firmId/userId
	
	var field = document.getElementById(typeId);
	var selobj = document.getElementById(selType);
	
	if (selType == 'selFirm' && typeId == 'firmId') {			
		if(!firmList)
		{
				var len = selobj.options.length;
				field.value = "";
				firmList = new Array();
				for(var i = 0;i < len;i++)
				{
					firmList[i] = new Object();
					firmList[i]["text"] = selobj.options[i].text;
					firmList[i]["value"] = selobj.options[i].value;
				}
		}
		else
		{
			var op = document.createElement("option");
			var tmp = null;
			selobj.options.length = 0;
			for(var i = 0;i < firmList.length;i++)
		   {
				tmp = op.cloneNode(true);
				tmp.appendChild(document.createTextNode(firmList[i]["text"]));
				tmp.setAttribute("value",firmList[i]["value"]);
				selobj.appendChild(tmp)/*;*/
		   }
		}
	}
	// USERS
	if (selType == 'selUser' && typeId == 'userId') {
		if(!userList)
		{
				var len = selobj.options.length;
				field.value = "";
				userList = new Array();
				for(var i = 0;i < len;i++)
				{
					userList[i] = new Object();
					userList[i]["text"] = selobj.options[i].text;
					userList[i]["value"] = selobj.options[i].value;
				}
		}
		else
		{
			var op = document.createElement("option");
			var tmp = null;
			selobj.options.length = 0;
			for(var i = 0;i < userList.length;i++)
		   {
				tmp = op.cloneNode(true);
				tmp.appendChild(document.createTextNode(userList[i]["text"]));
				tmp.setAttribute("value",userList[i]["value"]);
				selobj.appendChild(tmp);
		   }
		}
	}
	
	
}


 function findIt(selType, field, type)
{
	//selType: selFirm/selUser 
		var list = null;
		if (type == 'forFirm') {
			list = firmList;
		}
		if (type == 'forUser') {
			list = userList;
		}
		
        var selobj = document.getElementById(selType);
				
        var len = list.length;
        if(field.value.length > 0)
        {
                if(!list)
                {
					if (selType == 'selFirm') {
						initData(selType,'firmId');
					}
					if (selType == 'selUser') {
						initData(selType,'userId');
					}
					
                }
				
                var op = document.createElement("option");
                selobj.options.length = 0;
                var reg = new RegExp(field.value,"i");
                var tmp = null;
                var count = 0;
                var msg = "";
                for(var i = 0;i < len;i++)
                {
                        if(reg.test(list[i].text))
                        {                               
							tmp = op.cloneNode(true);
							tmp.setAttribute("value",list[i].value);
							tmp.appendChild(document.createTextNode(list[i].text));
							selobj.appendChild(tmp);
                        }
                } 
        }
        else if(list && len > selobj.options.length)
        {
                selobj.selectedIndex = 0;
				if (selType == 'selFirm') {
					initData(selType,'firmId');
				}
				if (selType == 'selUser') {
					initData(selType,'userId');
				}
				
        }
		
}
