package com.example.demo.vo;


import java.io.IOException;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;


public class RendaFixa {

    private Workbook planilha; // objeto que receberá um instancia da planilha estudada

    private Sheet aba; // objeto que será a aba

    private File arquivo; // arquivo .xls que será lido


    public RendaFixa() throws IOException, BiffException {
        //listaDerivativos();

    }


    //@Controller
    //@RequestMapping(method = RequestMethod.GET, value="/rendaFixa/listaDerivativos")
    public List<DerivativoVo> listaDerivativos(Model model) throws IOException, BiffException {

        //model.addAttribute("UsaurioModel", this.derivativoService.doList());

        return  doList();


    }

    private void doInstacePlane() throws IOException, BiffException {

        arquivo = new File(getPath());

        // instancia a planilha

        planilha = Workbook.getWorkbook(arquivo);

        //Obendo as Abas da planilha

        Sheet[] abas = planilha.getSheets();

        aba = planilha.getSheet(0); // pega a primeira aba, ou seja, aba de indice 0.
    }

    private String getPath() {
         String path = "/Users/edson/Downloads/demo/src/main/resources/static/rtd/rtd_profit.xls";
         return path;
    }

    private List<DerivativoVo> doList() throws IOException, BiffException {

        doInstacePlane();

        List<DerivativoVo> listDerivativos = new ArrayList<DerivativoVo>();

        String[][] matriz = new String[aba.getRows()][aba.getColumns()];

        //matriz.length -> representa as linhas da matriz

        //matriz[0].length -> pega o tamanho da linha [0], ou seja, pega o número de colunas

        Cell[] cel; // instancia um array de cÃ©lulas que irá auxiliar no povoamento da matriz

        for (int i = 0; i < matriz.length; i++) {

            cel = aba.getRow(i);

            for (int j = 0; j < matriz[0].length; j++) {

                // pega os dados da celula cel[j] e adiciona na matriz

                matriz[i][j] = cel[j].getContents();

            }

        }

        // imprime os dados da matriz

        for (int i = 1; i < matriz.length; i++) {

            DerivativoVo derivativo = new DerivativoVo();
           // System.out.print(" Derivativo :  " + i + " - ");

            for (int j = 0; j < matriz[0].length; j++) {

                derivativo.setAsset(matriz[i][j++] );
                derivativo.setData(matriz[i][j++] );
                derivativo.setHora(matriz[i][j++] );
                derivativo.setUltimo(matriz[i][j++] );
                derivativo.setAbertura(matriz[i][j++] );
                derivativo.setMaximo(matriz[i][j++] );
                derivativo.setMinimo(matriz[i][j++] );
                derivativo.setFechamentoAnterior(matriz[i][j++] );
                derivativo.setStrike(matriz[i][j++] );
                derivativo.setMedia(matriz[i][j++] );
                derivativo.setNegocios(matriz[i][j++] );
                derivativo.setQuantidade(matriz[i][j++] );
                derivativo.setOfCompra(matriz[i][j++] );
                derivativo.setOfVenda(matriz[i][j++] );
                derivativo.setvOC(matriz[i][j++] );
                derivativo.setvOV(matriz[i][j++] );
                derivativo.setAjuste(matriz[i][j++] );
                derivativo.setAjAnterior(matriz[i][j++] );
                derivativo.setPrecoTeorico(matriz[i][j++] );
                derivativo.setVencimento(matriz[i][j++] );
                derivativo.setVoltImplicita(matriz[i][j++] );
                derivativo.setDelta(matriz[i][j++] );
                derivativo.setGama(matriz[i][j++] );
                derivativo.setTheta(matriz[i][j++] );
                derivativo.setRho(matriz[i][j++] );
                derivativo.setValorIntrinseco(matriz[i][j++] );
                derivativo.setValorExtrinseco(matriz[i][j++] );

                listDerivativos.add(derivativo);

                System.out.print(derivativo);

            }

            System.out.println("\\");


        }
        return listDerivativos;

    }

    public static void main(String[] args)
            throws IOException, BiffException {

        new RendaFixa();

    }

}
