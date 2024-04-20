// klasa Droga, odpowiedzialna za wszystkie zmienne
// oraz potrzebne do tych zmiennych elementy takie
// jak gettery i settery, w przyszłości w miare
// dodawania kolejnych reguł, tutaj trzeba będzie
// je implementować

package com.example.model;

public class Droga {

    private int wartoscVW = 0;
    private int predkosc;
    private int natezenieRuchuWP;
    private int natezenieRuchu;
    private int skladRuchu;
    private String wydzielenieJezdni;
    private int gestoscPolaczen;
    private int wezly_mosty;
    private String zaparkowanePojazdy;
    private int jasnoscOtoczenia;
    private int zadanieNawigacyjne;

    private int k_predkosc;
    private int k_natezenieRuchu;
    private int k_skladRuchu;
    private String k_wydzielenieJezdni;
    private String k_zaparkowanePojazdy;
    private int k_jasnoscOtoczenia;
    private int k_zadanieNawigacyjne;

    private int p_predkosc;
    private int p_inten;
    private int p_skladRuchu;
    private String p_zaparkowanePojazdy;
    private int p_jasnoscOtoczenia;
    private String p_rozpoz;

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }

    public int getNatezenieRuchuWP() {
        return natezenieRuchuWP;
    }

    public void setNatezenieRuchuWP(int natezenieRuchuWP) {
        this.natezenieRuchuWP = natezenieRuchuWP;
    }

    public int getNatezenieRuchu() {
        return natezenieRuchu;
    }

    public void setNatezenieRuchu(int natezenieRuchu) {
        this.natezenieRuchu = natezenieRuchu;
    }

    public int getWartoscVW() {
        return wartoscVW;
    }

    public void setWartoscVW(int wartoscVW) {
        this.wartoscVW = wartoscVW;
    }

    public int getSkladRuchu() {
        return skladRuchu;
    }

    public void setSkladRuchu(int skladRuchu) {
        this.skladRuchu = skladRuchu;
    }

    public String getWydzielenieJezdni() {
        return wydzielenieJezdni;
    }

    public void setWydzielenieJezdni(String wydzielenieJezdni) {
        this.wydzielenieJezdni = wydzielenieJezdni;
    }

    public int getGestoscPolaczen() {
        return gestoscPolaczen;
    }

    public void setGestoscPolaczen(int gestoscPolaczen) {
        this.gestoscPolaczen = gestoscPolaczen;
    }

    public int getWezly_mosty() {
        return wezly_mosty;
    }

    public void setWezly_mosty(int wezly_mosty) {
        this.wezly_mosty = wezly_mosty;
    }

    public String getZaparkowanePojazdy() {
        return zaparkowanePojazdy;
    }

    public void setZaparkowanePojazdy(String zaparkowanePojazdy) {
        this.zaparkowanePojazdy = zaparkowanePojazdy;
    }

    public int getJasnoscOtoczenia() {
        return jasnoscOtoczenia;
    }

    public void setJasnoscOtoczenia(int jasnoscOtoczenia) {
        this.jasnoscOtoczenia = jasnoscOtoczenia;
    }

    public int getZadanieNawigacyjne() {
        return zadanieNawigacyjne;
    }

    public void setZadanieNawigacyjne(int zadanieNawigacyjne) {
        this.zadanieNawigacyjne = zadanieNawigacyjne;
    }

    public int getK_predkosc() {
        return k_predkosc;
    }

    public void setK_predkosc(int k_predkosc) {
        this.k_predkosc = k_predkosc;
    }

    public int getK_natezenieRuchu() {
        return k_natezenieRuchu;
    }

    public void setK_natezenieRuchu(int k_natezenieRuchu) {
        this.k_natezenieRuchu = k_natezenieRuchu;
    }

    public int getK_skladRuchu() {
        return k_skladRuchu;
    }

    public void setK_skladRuchu(int k_skladRuchu) {
        this.k_skladRuchu = k_skladRuchu;
    }

    public String getK_wydzielenieJezdni() {
        return k_wydzielenieJezdni;
    }

    public void setK_wydzielenieJezdni(String k_wydzielenieJezdni) {
        this.k_wydzielenieJezdni = k_wydzielenieJezdni;
    }

    public String getK_zaparkowanePojazdy() {
        return k_zaparkowanePojazdy;
    }

    public void setK_zaparkowanePojazdy(String k_zaparkowanePojazdy) {
        this.k_zaparkowanePojazdy = k_zaparkowanePojazdy;
    }

    public int getK_jasnoscOtoczenia() {
        return k_jasnoscOtoczenia;
    }

    public void setK_jasnoscOtoczenia(int k_jasnoscOtoczenia) {
        this.k_jasnoscOtoczenia = k_jasnoscOtoczenia;
    }

    public int getK_zadanieNawigacyjne() {
        return k_zadanieNawigacyjne;
    }

    public void setK_zadanieNawigacyjne(int k_zadanieNawigacyjne) {
        this.k_zadanieNawigacyjne = k_zadanieNawigacyjne;
    }

    public int getP_predkosc() {
        return p_predkosc;
    }

    public void setP_predkosc(int p_predkosc) {
        this.p_predkosc = p_predkosc;
    }

    public int getP_inten() {
        return p_inten;
    }

    public void setP_inten(int p_inten) {
        this.p_inten = p_inten;
    }

    public int getP_skladRuchu() {
        return p_skladRuchu;
    }

    public void setP_skladRuchu(int p_skladRuchu) {
        this.p_skladRuchu = p_skladRuchu;
    }

    public String getP_zaparkowanePojazdy() {
        return p_zaparkowanePojazdy;
    }

    public void setP_zaparkowanePojazdy(String p_zaparkowanePojazdy) {
        this.p_zaparkowanePojazdy = p_zaparkowanePojazdy;
    }

    public int getP_jasnoscOtoczenia() {
        return p_jasnoscOtoczenia;
    }

    public void setP_jasnoscOtoczenia(int p_jasnoscOtoczenia) {
        this.p_jasnoscOtoczenia = p_jasnoscOtoczenia;
    }

    public String getP_rozpoz() {
        return p_rozpoz;
    }

    public void setP_rozpoz(String p_rozpoz) {
        this.p_rozpoz = p_rozpoz;
    }
}