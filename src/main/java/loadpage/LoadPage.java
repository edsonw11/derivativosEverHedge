package loadpage;


import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import loadpage.modelAssert.Screen;

import java.io.*;
import java.net.URL;


public class LoadPage {




    public static void main(String[] args) throws IOException, UnirestException {

        Screen screen = doGetAssert();
        System.out.println(" ************** doGetAssert() " + screen.getTarget() + " ************** ");


    }





    public static Screen doGetAssert() throws UnirestException {


        HttpResponse<String> response = Unirest.get("https://api.oplab.com.br/v2/studies/current")
                .header("access-control-allow-headers", "DNT,X-CustomHeader,Keep-Alive,User-Agent,X-Requested-With,If-Modified-Since,Cache-Control,Content-Type,Content-Range,Range,Access-Token,Authorization")
                .header("authorization", "Basic ZWRzc29udzExQGdtYWlsLmNvbTp0ZWNoMjA4MQ==")
                .header("access-token", "O62AjLdEI/aYU450Y2z7pPJmNBpap7wqe9KCKoNz3dLTHFz8o7q917MqlYfAJl3LtPHuSutvC4wTwgnDBBl/SQ==--HN/OWBlOW9kK1IKXM+Dw8g==--6Pbbam5VueoWsrgRKkyTmQ==")
                .header("email", "edsonw11@gmail.com")
                .header("password", "tech2081")
                .header("cache-control", "no-cache")
                .header("postman-token", "9f127d97-6815-3fe9-e4d2-eff406e5e17c")
                .asString();


        return doBuildScreen(response);


    }


    private static Screen doBuildScreen(HttpResponse<String> response) {

        Screen screen = new Gson().fromJson(response.getBody(), Screen.class);

        return screen;

    }


    public void getPage(URL url, File file) throws IOException {
        BufferedReader in =
                new BufferedReader(new InputStreamReader(url.openStream()));

        BufferedWriter out = new BufferedWriter(new FileWriter(file));

        String inputLine;

        while ((inputLine = in.readLine()) != null) {

            // Imprime página no console
            System.out.println(inputLine);

            // Grava pagina no arquivo
            out.write(inputLine);
            out.newLine();
        }

        out.flush();
        in.close();
        out.close();
    }


}



