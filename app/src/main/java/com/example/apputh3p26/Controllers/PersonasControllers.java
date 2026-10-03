package com.example.apputh3p26.Controllers;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.uth.app3p26.Database.DatabaseHelper;
import com.uth.app3p26.Models.Personas;


public class PersonasControllers
{
    private final DatabaseHelper databaseHelper;

    public PersonasController(Context context)
    {
        databaseHelper = new DatabaseHelper(context);
    }
}
