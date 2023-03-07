<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>La Clean'Sneak !</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body style="background-color: green">
<nav class="navbar navbar-expand-lg bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="home">
    <img alt="logo" src="resources/img/logoHome.png">
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="home">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="contact">Contact</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="addUser">Inscription</a>
        </li>
      </ul>
      <form class="d-flex mx-3 rounded" role="Titre" style="text-aligne:center">
        <h1>La Clean'Sneak</h1>
      </form>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Recherche" aria-label="Search">
        <button class="btn btn-success" type="submit">Recherche</button>
      </form>
      <form class="d-flex" role="inscription/connection">
        <button class="btn btn-info btn-lg mx-3 rounded" type="button" onclick="window.location.href=`View/addUser.jsp`">Inscription</button>
        <button class="btn btn-info btn-lg" type="button">Connection</button>
      </form>
    </div>
  </div>
</nav>