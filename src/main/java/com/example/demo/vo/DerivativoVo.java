package com.example.demo.vo;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DerivativoVo {

    private HeadAssetVO headAssetVO;



    private String asset;
    private String data;
    private String hora;
    private String ultimo;
    private String abertura;
    private String maximo;
    private String minimo;
    private String fechamentoAnterior;
    private String strike;
    private String media;
    private String negocios;
    private String quantidade;
    private String ofCompra;
    private String ofVenda;
    private String vOC;
    private String vOV;
    private String ajuste;
    private String ajAnterior;
    private String precoTeorico;
    private String vencimento;
    private String voltImplicita;
    private String delta;
    private String gama;
    private String theta;
    private String rho;
    private String valorIntrinseco;
    private String valorExtrinseco;


    public HeadAssetVO getHeadAssetVO() {
        if(headAssetVO == null)
            headAssetVO = new HeadAssetVO();
        return headAssetVO;
    }

    public void setHeadAssetVO(HeadAssetVO headAssetVO) {
        this.headAssetVO = headAssetVO;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUltimo() {
        return ultimo;
    }

    public void setUltimo(String ultimo) {
        this.ultimo = ultimo;
    }

    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public String getMaximo() {
        return maximo;
    }

    public void setMaximo(String maximo) {
        this.maximo = maximo;
    }

    public String getMinimo() {
        return minimo;
    }

    public void setMinimo(String minimo) {
        this.minimo = minimo;
    }

    public String getFechamentoAnterior() {
        return fechamentoAnterior;
    }

    public void setFechamentoAnterior(String fechamentoAnterior) {
        this.fechamentoAnterior = fechamentoAnterior;
    }

    public String getStrike() {
        return strike;
    }

    public void setStrike(String strike) {
        this.strike = strike;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getNegocios() {
        return negocios;
    }

    public void setNegocios(String negocios) {
        this.negocios = negocios;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getOfCompra() {
        return ofCompra;
    }

    public void setOfCompra(String ofCompra) {
        this.ofCompra = ofCompra;
    }

    public String getOfVenda() {
        return ofVenda;
    }

    public void setOfVenda(String ofVenda) {
        this.ofVenda = ofVenda;
    }

    public String getvOC() {
        return vOC;
    }

    public void setvOC(String vOC) {
        this.vOC = vOC;
    }

    public String getvOV() {
        return vOV;
    }

    public void setvOV(String vOV) {
        this.vOV = vOV;
    }

    public String getAjuste() {
        return ajuste;
    }

    public void setAjuste(String ajuste) {
        this.ajuste = ajuste;
    }

    public String getAjAnterior() {
        return ajAnterior;
    }

    public void setAjAnterior(String ajAnterior) {
        this.ajAnterior = ajAnterior;
    }

    public String getPrecoTeorico() {
        return precoTeorico;
    }

    public void setPrecoTeorico(String precoTeorico) {
        this.precoTeorico = precoTeorico;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getVoltImplicita() {
        return voltImplicita;
    }

    public void setVoltImplicita(String voltImplicita) {
        this.voltImplicita = voltImplicita;
    }

    public String getDelta() {
        return delta;
    }

    public void setDelta(String delta) {
        this.delta = delta;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public String getTheta() {
        return theta;
    }

    public void setTheta(String theta) {
        this.theta = theta;
    }

    public String getRho() {
        return rho;
    }

    public void setRho(String rho) {
        this.rho = rho;
    }

    public String getValorIntrinseco() {
        return valorIntrinseco;
    }

    public void setValorIntrinseco(String valorIntrinseco) {
        this.valorIntrinseco = valorIntrinseco;
    }

    public String getValorExtrinseco() {
        return valorExtrinseco;
    }

    public void setValorExtrinseco(String valorExtrinseco) {
        this.valorExtrinseco = valorExtrinseco;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DerivativoVo)) return false;
        DerivativoVo that = (DerivativoVo) o;
        return getAsset().equals(that.getAsset()) &&
                getData().equals(that.getData()) &&
                getHora().equals(that.getHora()) &&
                getUltimo().equals(that.getUltimo()) &&
                getAbertura().equals(that.getAbertura()) &&
                getMaximo().equals(that.getMaximo()) &&
                getMinimo().equals(that.getMinimo()) &&
                getFechamentoAnterior().equals(that.getFechamentoAnterior()) &&
                getStrike().equals(that.getStrike()) &&
                getMedia().equals(that.getMedia()) &&
                getNegocios().equals(that.getNegocios()) &&
                getQuantidade().equals(that.getQuantidade()) &&
                getOfCompra().equals(that.getOfCompra()) &&
                getOfVenda().equals(that.getOfVenda()) &&
                getvOC().equals(that.getvOC()) &&
                getvOV().equals(that.getvOV()) &&
                getAjuste().equals(that.getAjuste()) &&
                getAjAnterior().equals(that.getAjAnterior()) &&
                getPrecoTeorico().equals(that.getPrecoTeorico()) &&
                getVencimento().equals(that.getVencimento()) &&
                getVoltImplicita().equals(that.getVoltImplicita()) &&
                getDelta().equals(that.getDelta()) &&
                getGama().equals(that.getGama()) &&
                getTheta().equals(that.getTheta()) &&
                getRho().equals(that.getRho()) &&
                getValorIntrinseco().equals(that.getValorIntrinseco()) &&
                getValorExtrinseco().equals(that.getValorExtrinseco());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAsset(), getData(), getHora(), getUltimo(), getAbertura(), getMaximo(), getMinimo(), getFechamentoAnterior(), getStrike(), getMedia(), getNegocios(), getQuantidade(), getOfCompra(), getOfVenda(), getvOC(), getvOV(), getAjuste(), getAjAnterior(), getPrecoTeorico(), getVencimento(), getVoltImplicita(), getDelta(), getGama(), getTheta(), getRho(), getValorIntrinseco(), getValorExtrinseco());
    }

    @Override
    public String toString() {
        return "DerivativoVo{" +
                "asset='" + asset + '\'' +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", ultimo='" + ultimo + '\'' +
                ", abertura='" + abertura + '\'' +
                ", maximo='" + maximo + '\'' +
                ", minimo='" + minimo + '\'' +
                ", fechamentoAnterior='" + fechamentoAnterior + '\'' +
                ", strike='" + strike + '\'' +
                ", media='" + media + '\'' +
                ", negocios='" + negocios + '\'' +
                ", quantidade='" + quantidade + '\'' +
                ", ofCompra='" + ofCompra + '\'' +
                ", ofVenda='" + ofVenda + '\'' +
                ", vOC='" + vOC + '\'' +
                ", vOV='" + vOV + '\'' +
                ", ajuste='" + ajuste + '\'' +
                ", ajAnterior='" + ajAnterior + '\'' +
                ", precoTeorico='" + precoTeorico + '\'' +
                ", vencimento='" + vencimento + '\'' +
                ", voltImplicita='" + voltImplicita + '\'' +
                ", delta='" + delta + '\'' +
                ", gama='" + gama + '\'' +
                ", theta='" + theta + '\'' +
                ", rho='" + rho + '\'' +
                ", valorIntrinseco='" + valorIntrinseco + '\'' +
                ", valorExtrinseco='" + valorExtrinseco + '\'' +
                '}';

    }

}
