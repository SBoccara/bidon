package sio.perso1;

public class Contacts {
    private String nom;
    private String prenom;
    private int age;

    public Contacts (String nom, String prenon, int age){}
    public void setNom(String nom) { this.nom = nom;}

    public void setPrenon (String prenom) { this.prenom = prenom;}

    public void setAge (int age) { this.age = age;}

    public String getNom() { return nom;}

    public String getPrenon() { return prenom;}

    public int getAge() { return age;}
}
