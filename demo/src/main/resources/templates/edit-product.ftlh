<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Product</title>
</head>
<body>
    <h1>Edit Product</h1>
    <form action="/products/{id}/edit" method="post">
        <input type="hidden" id="id" name="id" value="${product.id}">
        <label for="title">Title:</label>
        <input type="text" id="title" name="title" value="${product.title}" required><br><br>
        <label for="description">Description:</label>
        <input type="text" id="description" name="description" value="${product.description}" required><br><br>
        <label for="price">Price:</label>
        <input type="text" id="price" name="price" value="${product.price}" required><br><br>
        <label for="city">City:</label>
        <input type="text" id="city" name="city" value="${product.city}" required><br><br>
        <label for="author">Author:</label>
        <input type="text" id="author" name="author" value="${product.author}" required><br><br>
        <button type="submit">Update Product</button>
    </form>
</body>
</html>
