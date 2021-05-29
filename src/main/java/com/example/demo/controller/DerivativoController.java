package com.example.demo.controller;


import com.example.demo.service.DerivativoService;
import com.example.demo.vo.DerivativoVo;
import com.mashape.unirest.http.exceptions.UnirestException;
import jxl.read.biff.BiffException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class DerivativoController {


    @Autowired
    private DerivativoService derivativoService;

    private static List<DerivativoVo> listDerivativos = new ArrayList<DerivativoVo>();



    @RequestMapping(value="dados/consultarDerivativo", method= RequestMethod.GET)
    public String consultarDerivativo(Model model) throws IOException, BiffException, GeneralSecurityException {
        System.out.println("Passando em DerivativoController dado/consultarDerivativo....");

        /*CONSULTA DERIVATIVOS */
        model.addAttribute("derivativoModel", this.derivativoService.doList());

        /*RETORNA A VIEW*/
        //return new ModelAndView("consultarListaDerivativos");

        return "derivativo";
    }


    @RequestMapping(value="dados/consultarDerivativoTemp", method= RequestMethod.GET)
    public List<DerivativoVo> consultarDerivativotemp(Model model) throws IOException, BiffException, GeneralSecurityException {
        System.out.println("Passando em DerivativoController dado/consultarDerivativoTemp....");

        /*CONSULTA DERIVATIVOS */
       // model.addAttribute("derivativoModel", this.derivativoService.doList());



       return this.derivativoService.doList();


    }

    @RequestMapping(value="dados/consultarDerivativoEverHedge", method= RequestMethod.GET)
    public String consultarDerivativoEverHedge(Model model) throws IOException, GeneralSecurityException, UnirestException {

        /*CONSULTA DERIVATIVOS */
        model.addAttribute("derivativoModel", this.derivativoService.doGetAssert());

        /*RETORNA A VIEW*/
        //return new ModelAndView("consultarListaDerivativos");

        return "derivativo";
    }






}
