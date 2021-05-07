package Logic;

public class Kunde {
    String navn = "";
    String cpr = "";
    String tlf = "";
    String adresse = "";
    String model = "";
    String leveringsadresse = "";

    public boolean isValid() {
        return  !navn.isEmpty() &&
                cpr.matches("^\\d{10}$")&&  //tjekker fra første karakter om der er 10 tal frem til den sidste
                !tlf.isEmpty() &&
                !adresse.isEmpty() &&
                !model.isEmpty();
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLeveringsadresse() {
        if (leveringsadresse.isEmpty())
            return adresse;
        else
            return leveringsadresse;
    }

    public void setLeveringsadresse(String leveringsadresse) {
        this.leveringsadresse = leveringsadresse;
    }
}
