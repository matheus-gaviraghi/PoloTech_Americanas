<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html" charset=UTF-8>
<html>
<head>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<form action="cadastro" method="POST">

    <div class="container-md">

        <p class="text-center fs-1">Formulário</p>

        <div class="input-group mb-3">
          <span class="input-group-text" id="inputGroup-sizing-default">Nome</span>
          <input type="text" name="name" class="form-control">
        </div>

        <div class="input-group mb-3">
          <span class="input-group-text" id="inputGroup-sizing-default2">Idade</span>
          <input type="text" name="age" class="form-control">
        </div>

        <div class="input-group mb-3">
          <span class="input-group-text" id="inputGroup-sizing-default3">Endereço</span>
          <input type="text" name="address" class="form-control">
        </div>

        <input type="submit" class="btn btn-primary"  />

     </div>

</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
