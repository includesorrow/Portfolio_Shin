function goUrl(url) {
	console.log("Param :" + url);
	location = url;
}

function goConfirmUrl(url,num) {

	if(confirm("Delete  ?")){
	console.log("Param :" + url);
	location = url+"&num="+num;
	}
}