package es.aiiscyl.cursoandroidleccion4.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TodoDatabaseHelper extends SQLiteOpenHelper {

	private static final String DATABASE_NAME = "todotable.db";
	private static final int DATABASE_VERSION = 1;

	public TodoDatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	// Este étodo es ejecutado durante la creación de la base de datos.
	@Override
	public void onCreate(SQLiteDatabase database) {
		TodoTable.onCreate(database);
	}

	// Este método es llamado durante la actualización de la base de datos
	// p.eje, si incrementas el número de versión de la bbdd.
	@Override
	public void onUpgrade(SQLiteDatabase database, int oldVersion,
			int newVersion) {
		TodoTable.onUpgrade(database, oldVersion, newVersion);
	}
}

