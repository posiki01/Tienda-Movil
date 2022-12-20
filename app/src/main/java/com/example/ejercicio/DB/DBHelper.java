package com.example.ejercicio.DB;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

import com.example.ejercicio.Entidades.Product;

public class DBHelper extends SQLiteOpenHelper {
    private  SQLiteDatabase sqLiteDatabase;

    public  DBHelper(Context context){
        super(context, "StoreMobile.db",null, 1);
        sqLiteDatabase = this.getWritableDatabase();
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE PRODUCTS("+
                "id TEXT PRIMARY KEY,"+
                "name TEXT,"+
                "description TEXT,"+
                "price TEXT,"+
                "image TEXT"+
                ")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS PRODUCTS");

    }
    //METODOS CRUD
    public void insertProduct(Product product){
        String sql = "INSERT INTO PRODUCTS VALUES(?, ?, ?, ?, ?)";
        SQLiteStatement statement = sqLiteDatabase.compileStatement(sql);
        statement.clearBindings();

        statement.bindString(1, product.getId());
        statement.bindString(2, product.getName());
        statement.bindString(3, product.getDescription());
        statement.bindString(4, String.valueOf(product.getPrice()));
        statement.bindString(5, product.getImage());

        statement.executeInsert();
    }

    public Cursor getProducts(){
       Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM PRODUCTS", null);
       return cursor;
    }


}
