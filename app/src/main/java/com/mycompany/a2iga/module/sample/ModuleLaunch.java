package com.mycompany.a2iga.module.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

// Имя класса запуска модуля ModuleLaunch обязательно!
public class ModuleLaunch extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Выполняем действие
        Toast.makeText(this, "Hello world!", Toast.LENGTH_SHORT).show();
        
        // Уничтожаем activity после действия
        this.finish();
        
    }
    
}
