package com.engim.lezione9;

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
        com.engim.lezione8.variabilistatiche.Persona p1 = new com.engim.lezione8.variabilistatiche.Persona("Pippo","P");
        com.engim.lezione8.variabilistatiche.Persona p2 = new com.engim.lezione8.variabilistatiche.Persona("Pluto","P");
        System.out.println(p1);
        System.out.println(p2);
    }
}
