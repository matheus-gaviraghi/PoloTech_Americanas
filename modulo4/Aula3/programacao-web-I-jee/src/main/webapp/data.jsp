<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html" charset=UTF-8>
<html>
    <head>
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    </head>
    <body>
      <div class="container-md">

          <p class="text-center fs-1">Resumo</p>

          <div class="mb-3 row">
            <label for="staticName" class="col-md-2 col-form-label">Nome</label>
            <div class="col-md-10">
              <input type="text" readonly class="form-control-plaintext" id="staticName" value="<%= request.getAttribute("name") %>">
            </div>
          </div>

            <div class="mb-3 row">
              <label for="staticIdade" class="col-md-2 col-form-label">Idade</label>
              <div class="col-md-10">
                <input type="text" readonly class="form-control-plaintext" id="staticIdade" value="<%= request.getAttribute("age") %>">
              </div>
            </div>

          <div class="mb-3 row">
            <label for="staticAddress" class="col-md-2 col-form-label">EndereÃ§o</label>
            <div class="col-md-10">
              <input type="text" readonly class="form-control-plaintext" id="staticAddress" value="<%= request.getAttribute("address") %>">
            </div>
          </div>

      </div>
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    </body>
</html>