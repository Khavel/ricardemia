/*
 * Copyright (c) 2018. Fichero creado por Alejandro Oceja para la Academia Ricardo
 */

package threads;

//El PROGRAMA que maneja el buffer y las tareas
class programaConHilos {
    public static void main (String [] args) {
        Cola el_buffer; //buffer monitor
        Productor p; //1 Tarea Productor
        Consumidor [] c; //Varias Tareas Consumidor
        el_buffer = new Cola (50);
        p = new Productor ( el_buffer );
        c = new Consumidor [3];
        for (int i = 0; i < c.length; i++)
            c[i] = new Consumidor ( el_buffer );
        p.start();
        for (int i = 0; i < c.length; i++)
            c[i].start();
    }
}
