<?php

use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('welcome');
})->name('welcome');

Route::get('/home', function () {
    return view('utils.home');
})->name('homepage');

Route::get('/users', function () {
    return view('users.all_users');
})->name('users.all');

Route::get('/add_user', function () {
    return view('users.add_user');
})->name('users.add');

Route::get('/hello-world/{name}', function ($name) {
    return '<h1>Hello '.$name. '</h1>';
});

//rota de fallback, onde se não encontrar a rota, ele redireciona para a home.
Route::fallback(function () {
    return view('utils.fallback');
});
