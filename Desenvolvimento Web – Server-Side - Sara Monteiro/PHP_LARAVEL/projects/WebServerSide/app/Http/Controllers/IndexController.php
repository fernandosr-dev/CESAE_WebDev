<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class IndexController extends Controller
{
    public function welcome(){
        return view('welcome');
    }

    public function home(){
        $myFirstVar = 'Hello World';

        return view('utils.home', compact('myFirstVar'));
    }
}


