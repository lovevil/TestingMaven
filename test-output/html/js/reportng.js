function toggleElement(elementId, displayStyle) {
    var current = getStyle(elementId, 'display');
    elementId.style.display = (current == 'none' ? displayStyle : 'none');
}

function getStyle(elementId, property) {
    var element = elementId;
    return element.currentStyle ? element.currentStyle[property] : document.defaultView.getComputedStyle(element, null).getPropertyValue(property);
}

function hidePass(element) {
	 var suite = $('table.table-bordered');
	 var suitefooter = $('tr.suite');
	 var well = $('div.well');
	 for(var i = 0; i < suitefooter.length; i++){
		var foundAllPass = 0;
		var elements = suitefooter[i].parentElement.getElementsByTagName("td");
		for(var j=5; j<elements.length-1; j++){
   		if (elements[j].textContent != '0'){
   			foundAllPass = 1;
				break;
   		}
	}
   	if(foundAllPass==0){
			toggleElement(suitefooter[i], '');
			toggleElement(suitefooter[i].parentElement.parentElement, '');
			
			toggleElement(well[i], '');
		}
	 }
	 var test = $('tr.test');
	 for (var i = 0; i < test.length; i++) {
		 var pass = 0;
		 var elements = test[i].getElementsByTagName("td");
		 for(var j=5; j<elements.length-1; j++){
			 if (elements[j].textContent != '0'){
				 pass = 1;
				 break;
			 }
		 }
		 if(pass==0){
			toggleElement(test[i], '');
		 }
	 }
	 if ($("#hideResults").hasClass('btn-danger')){
		$("#hideResults").removeClass('btn-danger').toggleClass('btn-success');
		$("#hideResults").text('Hide Pass');
	 }else{
		$("#hideResults").removeClass('btn-success').toggleClass('btn-danger');
		$("#hideResults").text('Show All');
	}
}

function hidePassSuites(element) {
	 var suitefooter = $('tr.test');
	 for(var i = 0; i < suitefooter.length; i++){
		var elements = suitefooter[i].getElementsByTagName("td");
		if (elements[10].innerText == 'PASS'){
			toggleElement(suitefooter[i], '');
		}
	}
	 if ($("#hideResults").hasClass('btn-danger')){
			$("#hideResults").removeClass('btn-danger').toggleClass('btn-success');
			$("#hideResults").text('Hide Pass');
		 }else{
			$("#hideResults").removeClass('btn-success').toggleClass('btn-danger');
			$("#hideResults").text('Show All');
		}
}