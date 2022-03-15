package br.senai;

import br.senai.model.Cliente;
import br.senai.model.Evento;

public class Main {
    public static void main(String[] args) {
        
        Evento beiramar = new Evento();
        beiramar.setNome("Beiramar");
        beiramar.setData("18/05");
        beiramar.setClientes("Artur","21649735864","48 972546968","Artur@gmail.com");
        beiramar.setClientes("André","70723982343","48 964516497","André@gmail.com");
        beiramar.setClientes("Breno","82056515498","48 926594597","Breno@gmail.com");
        beiramar.setClientes("Chris","19435813547","48 978219734","Chris@gmail.com");
        beiramar.setClientes("Kalani","13242703901","48 978165781","Kalani@gmail.com");
        beiramar.setClientes("Thiago","14763939954","48 999299988","Thiago@gmail.com");
        System.out.println(beiramar);

        Evento jurere = new Evento();
        jurere.setNome("Jurerê");
        jurere.setData("23/08");
        jurere.setClientes("Artur","21649735864","48 972546968","Artur@gmail.com");
        jurere.setClientes("André","70723982343","48 964516497","André@gmail.com");
        jurere.setClientes("Breno","82056515498","48 926594597","Breno@gmail.com");
        jurere.setClientes("Chris","19435813547","48 978219734","Chris@gmail.com");
        jurere.setClientes("Kalani","13242703901","48 978165781","Kalani@gmail.com");
        jurere.setClientes("Thiago","14763939954","48 999299988","Thiago@gmail.com");
        System.out.println(jurere);

        Evento lagoa = new Evento();
        lagoa.setNome("Lagoa da Conceição");
        lagoa.setData("13/02");
        lagoa.setClientes("Artur","21649735864","48 972546968","Artur@gmail.com");
        lagoa.setClientes("André","70723982343","48 964516497","André@gmail.com");
        lagoa.setClientes("Breno","82056515498","48 926594597","Breno@gmail.com");
        lagoa.setClientes("Chris","19435813547","48 978219734","Chris@gmail.com");
        lagoa.setClientes("Kalani","13242703901","48 978165781","Kalani@gmail.com");
        lagoa.setClientes("Thiago","14763939954","48 999299988","Thiago@gmail.com");
        System.out.println(lagoa);

    }
}
