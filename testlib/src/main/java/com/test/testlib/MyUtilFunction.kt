package com.test.testlib

import android.content.Context
import android.widget.Toast

object MyUtilFunction {

    fun sayHello(context: Context){
        Toast.makeText(context,"Hello",Toast.LENGTH_SHORT).show()
    }
}