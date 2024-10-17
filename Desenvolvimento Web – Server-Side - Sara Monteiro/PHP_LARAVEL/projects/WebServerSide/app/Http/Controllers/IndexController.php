<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class IndexController extends Controller
{
    public function welcome(){
        $myFirstVar = 'Hello World';
        $weekDays = $this->getAllWeekDays();

        return view('welcome', compact('weekDays'));
    }

    public function home(){
        $myFirstVar = 'Hello World';
        $weekDays = $this->getAllWeekDays();
        $info = $this->getCourseInfo();
        $cesaeInfo = $this->getCesaeInfo();

        //dd($cesaeInfo);
        // dd($info['name']);
        // var_dump($weekDays);
        // dd($weekDays);

        return view('utils.home', compact('myFirstVar', 'weekDays', 'info', 'cesaeInfo'));
    }

    private function getAllWeekDays(){
        return ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];

        // $weekDays = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
        // return $weekDays;
    }

    private function getCourseInfo(){
        $courseInfo = [
            'name' => 'Web&Mobile',
            'hours' => 950
        ];
        return $courseInfo;
    }

    private function getCesaeInfo(){
        $cesaeInfo = [
            'name' => 'Cesae',
            'address' => 'Rua Ciríaco Cardoso 186, 4150-212 Porto',
            'email' => 'cesae@cesae.pt'
            ];
            return $cesaeInfo;
    }
}



