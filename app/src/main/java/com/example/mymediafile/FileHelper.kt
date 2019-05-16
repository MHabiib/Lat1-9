package com.example.mymediafile

import android.content.Context
import java.io.File

class FileHelper{
    fun writeFile(data:String,context: Context){
        val fileName:String = "myPrivateFile"
        context.openFileOutput(fileName, Context.MODE_PRIVATE).use{
            it.write(data.toByteArray())
        }
    }
    fun readFile(context: Context):String{
        val file = File(context.filesDir,"myPrivateFile")
        val contents = file.readText()
        return contents
    }
}