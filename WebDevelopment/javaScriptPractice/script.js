var butt = document.querySelector("button");
var isBlue = false;

butt.addEventListener("click", function(){
	if(isBlue) {
		document.body.style.color = "white";
		isBlue = false;
	} else {
		document.body.style.color = "blue";
		isBlue = true;
	}
});