package net.learn2develop.task15;

public class Jelo {
    private int ID;
    private String ime;
    private String opis;

    public Jelo(int ID, String ime, String opis) {
        this.ID = ID;
        this.ime = ime;
        this.opis = opis;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
      return ime;
    }
}

