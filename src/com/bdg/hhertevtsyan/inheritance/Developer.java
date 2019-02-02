package com.bdg.hhertevtsyan.inheritance;

class worker {
    float salary = 50000;

    public float getClearSalary () {
        return salary-(salary*28/100);
    }
}
// public class Developer extends worker {
//    float bonus;
//
// public float getTotalSalary () {
//        return worker.+bonus;
//    }
//}
