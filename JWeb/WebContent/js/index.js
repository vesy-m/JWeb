/**
 * 
 */

function sendFormRegister() {
	var $this = $(this);

	var firstname = $('#firstname').val();
	var lastname = $('#lastname').val();
	var email = $('#email').val();
	var password = $('#password').val();
	var validPassword = $('#validPassword').val();

	if (firstname == null || firstname == "" && lastname == null
			|| lastname == "", email == null || email == "", password == null
			|| password == "", validPassword == null || validPassword == "")
		return false;
	if (validPassword != password) {
		document.forms["Form"]["password"].style.border = '1px solid red';
		document.forms["Form"]["validPassword"].style.border = '1px solid red';
		setTimeout(function() {
			document.forms["Form"]["password"].style.border = 'none';
			document.forms["Form"]["validPassword"].style.border = 'none';
		}, 3000);
		return false;
	}
//	} else {
//		$.ajax({
//			url : $this.attr('action'),
//			type : $this.attr('method'),
//			data : $this.serialize(),
//			success : function() {
//				document.forms["Form"]["firstname"].value = "";
//				document.forms["Form"]["lastname"].value = "";
//				document.forms["Form"]["email"].value = "";
//				document.forms["Form"]["password"].value = "";
//				document.forms["Form"]["validPassword"].value = "";
//				alert("Inscription Reussi. Vous pouvez vous connecter.");
//			},
//			error : function(xhr, ajaxOptions, thrownError) {
//				alert(xhr.status);
//				alert(thrownError);
//			}
//		});
//		return false;
	}
}