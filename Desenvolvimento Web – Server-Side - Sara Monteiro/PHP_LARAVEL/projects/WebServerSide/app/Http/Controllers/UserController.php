<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserController extends Controller
{
    public function allUsers(){
        return view('users.all_users');
    }

    public function addUser(){
        return view('users.add_user');
    }
}
