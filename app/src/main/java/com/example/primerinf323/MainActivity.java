package com.example.primerinf323;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GLSurfaceView superficie = new GLSurfaceView(this);
        Renderiza renderiza = new Renderiza();
        superficie.setRenderer((GLSurfaceView.Renderer) renderiza);
        setContentView(superficie);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
