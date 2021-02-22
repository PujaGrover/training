var req = "";

function validate(textObj) {

	var url = "";
	var emailvalue = textObj.value;
	url = "/AjaxDemo/validate?emailaddress=" + emailvalue;
	req = initRequest();
	req.open("GET", url, false);
	req.send(null);
	req.onreadystatechange = processRequest();
}

function initRequest() {
	if (window.XMLHttpRequest) {
		return new XMLHttpRequest();
	} else if (window.ActiveXObject) {

		return new ActiveXObject("Microsoft.XMLHTTP");
	}
}

function processRequest() {
	if (req.readyState == 4) {
		if (req.status == 200) {
			parseMessages();
		}

	}
}

function parseMessages() {
	
	var emailresult = document.getElementById("result");

	var emailresponse = req.responseText;
	emailresult.innerHTML = emailresponse;

}
