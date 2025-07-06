class Cardápio {
    //Atributos
    private String arroz;
    private String feijão;
    private String proteína;
    private String salada;
    private String fruta;
    private String bebida;

    //Construtores sem e com parâmetro
    Cardápio(){
        this("","","","","","");
    }
    Cardápio(String arroz, String feijão, String proteína, String salada, String fruta, String bebida){
        this.arroz = arroz;
        this.feijão = feijão;
        this.proteína = proteína;
        this.salada = salada;
        this.fruta = fruta;
        this.bebida = bebida;
    }

    //Metódos getter e setter
    public String getArroz() {
        return arroz;
    }
    public void setArroz(String arroz) {
        this.arroz = arroz;
    }

    public String getFeijão() {
        return feijão;
    }
    public void setFeijão(String feijão) {
        this.feijão = feijão;
    }

    public String getProteína() {
        return proteína;
    }
    public void setProteína(String proteína) {
        this.proteína = proteína;
    }

    public String getSalada() {
        return salada;
    }
    public void setSalada(String salada) {
        this.salada = salada;
    }

    public String getFruta() {
        return fruta;
    }
    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public String getBebida() {
        return bebida;
    }
    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

}
