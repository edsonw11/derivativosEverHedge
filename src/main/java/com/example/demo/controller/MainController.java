package com.example.demo.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    /***
     * ESSE MÉTODO CARREGA A PÁGINA(index.html) DE LOGIN DA NOSSA APLICAÇÃO
     * @return
     */
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String index(){

        return "base/layout";
    }

    /***
     * CARREGA À PÁGINA INICIAL DA APLICAÇÃO APÓS EFETUARMOS O LOGIN
     * @return
     */
    @RequestMapping(value="/home", method= RequestMethod.GET)
    public String home(){

        return "home";
    }

    /***
     * MOSTRA UM PÁGINA COM A MENSAGEM DE ACESSO NEGADO QUANDO O
     * USUÁRIO NÃO TIVER PERMISSÃO DE ACESSAR UMA DETERMINADA FUNÇÃO DO SISTEMA
     * @return
     */
    @RequestMapping(value="/acessoNegado", method= RequestMethod.GET)
    public String acessoNegado(){

        return "acessoNegado";
    }


    /***
     * MOSTRA UM PÁGINA COM A MENSAGEM DE ACESSO NEGADO QUANDO O
     * USUÁRIO NÃO TIVER PERMISSÃO DE ACESSAR UMA DETERMINADA FUNÇÃO DO SISTEMA
     * @return
     */
    @RequestMapping(value="dados/consultar", method= RequestMethod.GET)
    public String consulta(){
        System.out.println("Passanod em MainController dado/consultar....");
        return "consulta";
    }



    /***



     * MOSTRA UM PÁGINA COM A MENSAGEM DE ACESSO NEGADO QUANDO O
     * USUÁRIO NÃO TIVER PERMISSÃO DE ACESSAR UMA DETERMINADA FUNÇÃO DO SISTEMA
     * @return
     */
    @RequestMapping(value="dados/carga", method= RequestMethod.GET)
    public String upload(){

        return "upload";
    }



}
