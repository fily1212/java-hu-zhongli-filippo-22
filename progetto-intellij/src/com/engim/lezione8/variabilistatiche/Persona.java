package com.engim.lezione8.variabilistatiche;

public class Persona {
    private String nome;
    private String cognome;
    private int id;
    private static int nextId = 0;
    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
        this.id = nextId++;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Pippo","P");
        Persona p2 = new Persona("Pluto","P");
        System.out.println(p1);
        System.out.println(p2);
    }
}
