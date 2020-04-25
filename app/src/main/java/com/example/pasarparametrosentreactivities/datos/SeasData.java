package com.example.pasarparametrosentreactivities.datos;

import com.example.pasarparametrosentreactivities.beans.Usuario;

import java.util.ArrayList;

public class SeasData {
    private static Usuario usuario;
    private static ArrayList<Usuario> listaUsuarios;

    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        SeasData.listaUsuarios = listaUsuarios;
    }

    public static Usuario getUsuario() {

        return usuario;
    }

    public static void setUsuario(Usuario usuario) {

        SeasData.usuario = usuario;
    }

}

