
    @extends('layouts.femaster')

    @section('content')

    @php
        $myVar = 'Hello World';
        $myName = 'Fernando';
    @endphp


        <div class="container-fluid">
          {{-- <a class="navbar-brand" href="#">Navbar</a> --}}
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Dropdown
                </a>
                <ul class="dropdown-menu">
                  <li><a class="dropdown-item" href="#">Action</a></li>
                  <li><a class="dropdown-item" href="#">Another action</a></li>
                  <li><hr class="dropdown-divider"></li>
                  <li><a class="dropdown-item" href="#">Something else here</a></li>
                </ul>
              </li>
              <li class="nav-item">
                <a class="nav-link disabled" aria-disabled="true">Disabled</a>
              </li>
            </ul>
            <form class="d-flex" role="search">
              <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
              <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
          </div>
        </div>
      </nav>

    <img src="{{asset('images/pwa.webp')}}" alt="pwa">
    <h1>Olá! Sou a nossa casa!</h1>
    <p>{{$myFirstVar}}</p>

    <ul>
      @foreach ( $weekDays as $day)
          <li>{{$day}}</li>

      @endforeach
    </ul>
    {{-- <p>{{$weekDays[0]}}</p> --}}

    @if ($myName)
        <p>{{$myName}}</p>
    @else
        <p>Nome não encontrado</p>
    @endif

    <h6>Dados do Curso</h6>
    <p>Nome: {{$info['name']}}</p>
    <p>Horas:{{$info['hours']}}</p>

    <h6>Dados Cesae</h6>
    <p>Nome: {{$cesaeInfo['name']}}</p>
    <p>Endereço:{{$cesaeInfo['address']}}</p>
    <p>email:{{$cesaeInfo['email']}}</p>

    <ul>
        <li><a href="{{route('welcome')}}">Welcome</a></li>
        <li><a href="{{route('users.all')}}">All Users</a></li>
        <li><a href="{{route('users.add')}}">Add User</a></li>
        <li></li>
    </ul>
    @endsection
