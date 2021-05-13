package com.mycompany.a2iga.module.sample;

import android.app.Activity;
import android.os.Bundle;

// Имя класса настроек модуля ModuleSettings обязательно!
public class ModuleSettings extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        
        /* Тут можно устроить экран настроек как
         * вам удобно. Просто вывести PreferenceScreen
         * или в обычном Activity с чекбоксами.
         */
        
    }
    
}
