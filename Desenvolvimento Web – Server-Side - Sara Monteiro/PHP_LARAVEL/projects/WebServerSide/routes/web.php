<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\UserController;
use App\Http\Controllers\IndexController;

Route::get('/', [IndexController::class, 'welcome'])->name('welcome');

Route::get('/home', [IndexController::class, 'home'])->name('homepage');

Route::get('/users', [UserController::class, 'allUsers'])->name('users.all');

Route::get('/add_user', [UserController::class, 'addUser'])->name('users.add');

Route::get('/hello-world/{name}', function ($name) {
    return '<h1>Hello '.$name. '</h1>';
});

//rota de fallback, onde se não encontrar a rota, ele redireciona para a home.
Route::fallback(function () {
    return view('utils.fallback');
});
