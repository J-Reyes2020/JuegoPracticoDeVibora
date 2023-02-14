package com.example.proyecto072gesturedetectorjuegipracticodevibora;

import android.content.Context;
import android.graphics.Path;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.LinkedList;
import java.util.logging.Handler;

public class SnakeView extends View {
    private GestureDetector gestos;
    private Direccion direccion;
    private LinkedList<Punto> lista;
    private Handler manejador = new Handler(Looper.getMainLooper());
    private Runnable tiempo;
    private int columna;
    private int fila;
    private int colfruta;
    private int filfruta;
    private boolean activo = true;

    private int crecimiento = 0;
    private int ladoCuadritos;

    private int cuadroAncho=30;
    private int cuadroAlto;

    private enum Direccion{
        Izquierda,Derecha,Arriba,Abajo
    };

    class Punto{
        int x;
        int y;
        public Punto(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public SnakeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
