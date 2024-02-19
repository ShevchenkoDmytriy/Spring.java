<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Delete Product</title>
</head>
<body>
    <h1>Delete Product</h1>
    <p>Are you sure you want to delete this product?</p>
    <form action="/products/{id}/delete" method="post">
        <input type="hidden" id="id" name="id" value="${product.id}">
        <button type="submit">Delete Product</button>
    </form>
</body>
</html>
