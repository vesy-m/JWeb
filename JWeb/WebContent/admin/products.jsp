<div class="Box right">
	<center><h1>Ajouter un produit</h1></center>
	<form method="POST" action="product.do" enctype="multipart/form-data">
		<input type="text" name="title" placeholder="Nom du produit"  maxlength="15"/><br>
		<textarea name="description"></textarea><br>
		Select a file: <input type="file" name="file" accept="image/*"><br>
		<input type="number" name="price" placeholder="Prix" /><br>
		<input type="Submit" value="Envoyer">
	</form>
	<div class="success">
		<% 
			String successProduct = (String)request.getAttribute("successProduct");
			if (successProduct != null)
				out.print(successProduct);
		%>
	</div>
	<div class="error">
		<% 
			String errorProduct = (String)request.getAttribute("errorProduct");
			if (errorProduct != null)
				out.print(errorProduct);
		%>
	</div>
</div>
