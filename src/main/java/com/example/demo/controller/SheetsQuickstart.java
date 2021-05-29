package com.example.demo.controller;

import com.example.demo.vo.DerivativoVo;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SheetsQuickstart {

    private static final String APPLICATION_NAME = "Google Sheets API Java Quickstart";
    private static final String TOKENS_DIRECTORY_PATH = "tokens";
    private static final String spreadsheetId = "17wJrb_23BUTrS6oXwPS8nS4HPIXhjGRa0ndK_GQO7HY";
    private static final String CREDENTIALS_FILE_PATH = "/credentials.json";
    private static List<DerivativoVo> listDerivativos = new ArrayList<DerivativoVo>();


    private static Credential authorize() throws IOException, GeneralSecurityException {

        InputStream in = SheetsQuickstart.class.getResourceAsStream("/credentials.json");
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(
                JacksonFactory.getDefaultInstance(), new InputStreamReader(in));

        List<String> scopes = Arrays.asList(SheetsScopes.SPREADSHEETS);

        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                GoogleNetHttpTransport.newTrustedTransport(), JacksonFactory.getDefaultInstance(),
                clientSecrets, scopes)
                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();

        Credential credential = new AuthorizationCodeInstalledApp(
                flow, new LocalServerReceiver())
                .authorize("edsonw11@gmail.com");

        return credential;

    }

    public static Sheets getSheetsService() throws IOException, GeneralSecurityException {
        Credential credential = authorize();

        return new Sheets.Builder(GoogleNetHttpTransport.newTrustedTransport(),
                JacksonFactory.getDefaultInstance(), credential)
                .setApplicationName(APPLICATION_NAME)
                .build();
    }

    public static List<DerivativoVo> doList() throws IOException, GeneralSecurityException{

        listDerivativos.clear();

        Sheets service = getSheetsService();

        String range = "A1:AA101";

        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();

        List<List<Object>> values = response.getValues();
        if (values == null || values.isEmpty()) {
            System.out.println("No data found.");

        } else {

            //Lendo as Linhas
            int linha = 0;

            linha = 1;
            for (List row : values) {

                ArrayList<String> ListaColumn = new ArrayList<String>();
                ListaColumn.addAll(row);

                for ( int i=0; i< ListaColumn.size(); i++) {

                    DerivativoVo derivativo = new DerivativoVo();

                    if (linha == 1) {
                        derivativo.getHeadAssetVO().setHeadAsset(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadData(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadHora(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadUltimo(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadAbertura(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadMaximo(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadMinimo(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadFechamentoAnterior(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadStrike(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadMedia(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadNegocios(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadQuantidade(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadOfCompra(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadOfVenda(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadVOC(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadVOV(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadAjuste(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadAjAnterior(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadPrecoTeorico(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadVencimento(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadVoltImplicita(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadDelta(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadGama(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadTheta(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadRho(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadValorIntrinseco(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadValorExtrinseco(ListaColumn.get(i++).toString());
                        linha = ++linha;

                    } else {
                        //cabecalho dos derivativo
                        derivativo.setHeadAssetVO(listDerivativos.get(0).getHeadAssetVO());

                        derivativo.setAsset(ListaColumn.get(i++).toString());
                        derivativo.setData(ListaColumn.get(i++).toString());
                        derivativo.setHora(ListaColumn.get(i++).toString());
                        derivativo.setUltimo(ListaColumn.get(i++).toString());
                        derivativo.setAbertura(ListaColumn.get(i++).toString());
                        derivativo.setMaximo(ListaColumn.get(i++).toString());
                        derivativo.setMinimo(ListaColumn.get(i++).toString());
                        derivativo.setFechamentoAnterior(ListaColumn.get(i++).toString());
                        derivativo.setStrike(ListaColumn.get(i++).toString());
                        derivativo.setMedia(ListaColumn.get(i++).toString());
                        derivativo.setNegocios(ListaColumn.get(i++).toString());
                        derivativo.setQuantidade(ListaColumn.get(i++).toString());
                        derivativo.setOfCompra(ListaColumn.get(i++).toString());
                        derivativo.setOfVenda(ListaColumn.get(i++).toString());
                        derivativo.setvOC(ListaColumn.get(i++).toString());
                        derivativo.setvOV(ListaColumn.get(i++).toString());
                        derivativo.setAjuste(ListaColumn.get(i++).toString());
                        derivativo.setAjAnterior(ListaColumn.get(i++).toString());
                        derivativo.setPrecoTeorico(ListaColumn.get(i++).toString());
                        derivativo.setVencimento(ListaColumn.get(i++).toString());
                        derivativo.setVoltImplicita(ListaColumn.get(i++).toString());
                        derivativo.setDelta(ListaColumn.get(i++).toString());
                        derivativo.setGama(ListaColumn.get(i++).toString());
                        derivativo.setTheta(ListaColumn.get(i++).toString());
                        derivativo.setRho(ListaColumn.get(i++).toString());
                        derivativo.setValorIntrinseco(ListaColumn.get(i++).toString());
                        derivativo.setValorExtrinseco(ListaColumn.get(i++).toString());

                    }
                    listDerivativos.add(derivativo);
                }
            }

            System.out.println(listDerivativos);
        }

        return listDerivativos;

    }


    public static void main(String[] args) throws IOException, GeneralSecurityException {

        Sheets service = getSheetsService();

        String range = "A1:AA101";

        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();

        List<List<Object>> values = response.getValues();
        if (values == null || values.isEmpty()) {
            System.out.println("No data found.");

        } else {

            //Lendo as Linhas
            int linha = 0;

            linha = 1;
            for (List row : values) {

                ArrayList<String> ListaColumn = new ArrayList<String>();
                ListaColumn.addAll(row);

                for ( int i=0; i< ListaColumn.size(); i++) {

                    DerivativoVo derivativo = new DerivativoVo();

                    if (linha == 1) {
                        derivativo.getHeadAssetVO().setHeadAsset(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadData(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadHora(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadUltimo(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadAbertura(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadMaximo(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadMinimo(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadFechamentoAnterior(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadStrike(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadMedia(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadNegocios(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadQuantidade(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadOfCompra(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadOfVenda(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadVOC(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadVOV(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadAjuste(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadAjAnterior(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadPrecoTeorico(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadVencimento(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadVoltImplicita(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadDelta(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadGama(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadTheta(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadRho(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadValorIntrinseco(ListaColumn.get(i++).toString());
                        derivativo.getHeadAssetVO().setHeadValorExtrinseco(ListaColumn.get(i++).toString());
                        linha = ++linha;

                    } else {
                        //cabecalho dos derivativo
                        derivativo.setHeadAssetVO(listDerivativos.get(0).getHeadAssetVO());

                        derivativo.setAsset(ListaColumn.get(i++).toString());
                        derivativo.setData(ListaColumn.get(i++).toString());
                        derivativo.setHora(ListaColumn.get(i++).toString());
                        derivativo.setUltimo(ListaColumn.get(i++).toString());
                        derivativo.setAbertura(ListaColumn.get(i++).toString());
                        derivativo.setMaximo(ListaColumn.get(i++).toString());
                        derivativo.setMinimo(ListaColumn.get(i++).toString());
                        derivativo.setFechamentoAnterior(ListaColumn.get(i++).toString());
                        derivativo.setStrike(ListaColumn.get(i++).toString());
                        derivativo.setMedia(ListaColumn.get(i++).toString());
                        derivativo.setNegocios(ListaColumn.get(i++).toString());
                        derivativo.setQuantidade(ListaColumn.get(i++).toString());
                        derivativo.setOfCompra(ListaColumn.get(i++).toString());
                        derivativo.setOfVenda(ListaColumn.get(i++).toString());
                        derivativo.setvOC(ListaColumn.get(i++).toString());
                        derivativo.setvOV(ListaColumn.get(i++).toString());
                        derivativo.setAjuste(ListaColumn.get(i++).toString());
                        derivativo.setAjAnterior(ListaColumn.get(i++).toString());
                        derivativo.setPrecoTeorico(ListaColumn.get(i++).toString());
                        derivativo.setVencimento(ListaColumn.get(i++).toString());
                        derivativo.setVoltImplicita(ListaColumn.get(i++).toString());
                        derivativo.setDelta(ListaColumn.get(i++).toString());
                        derivativo.setGama(ListaColumn.get(i++).toString());
                        derivativo.setTheta(ListaColumn.get(i++).toString());
                        derivativo.setRho(ListaColumn.get(i++).toString());
                        derivativo.setValorIntrinseco(ListaColumn.get(i++).toString());
                        derivativo.setValorExtrinseco(ListaColumn.get(i++).toString());

                    }
                    listDerivativos.add(derivativo);
                }
            }

            System.out.println(listDerivativos);
        }
    }
}
