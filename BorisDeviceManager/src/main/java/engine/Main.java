package engine;


import java.util.Scanner;

public class Main
{
    //1. polimorfizm do aut
    //2. wydzielenie klasy jako repozytorium
    //3. wydzielenie klasy do naprawy samochodow

    //Koszt napraw
    public static void main(String[] args) {
        System.out.println("What car are you searching for?");
        Scanner a = new Scanner(System.in);

        String car = a.nextLine();


        Audi a3 = new Audi();
        a3.setModel("A3");
        a3.shouldChangeOil = true;
        a3.shouldChangeBreakPads = true;

        Audi a4 = new Audi();
        a4.setModel("A4");
        a4.shouldChangeOil = true;

        Renault clio = new Renault();
        clio.setModel("Clio");
        clio.shouldChangeOil = true;
        Renault megane = new Renault();
        megane.setModel("Megane");

        Audi[] audiCollection = new Audi[]{a3, a4};
        Renault[] renaultCollection = new Renault[]{clio, megane};

        int spacebar = car.indexOf(" ");
        String search1 = car.substring(0,spacebar);
        String search2 = car.substring(spacebar + 1);

        int money = 0;

        if( search1 == "Audi") {
            for(int i = 0; i < audiCollection.length; i++) {
                if(audiCollection[i].getModel() == search2) {
                    if(audiCollection[i].shouldChangeBreakPads == true ) {
                        money = money + 200;
                        if(audiCollection[i].shouldChangeOil == true) {
                            money = money + 100;
                        }
                        break;
                    }
                    if(audiCollection[i].shouldChangeOil == true) {
                        money = money + 150;
                        break;
                    }
                }
            }
        } else if ( search1 == "Renault") {
            for(int i = 0; i < renaultCollection.length; i++) {
                if(renaultCollection[i].getModel() == search2) {
                    if(renaultCollection[i].shouldChangeOil == true ) {
                        money = money + 650;
                    }
                    if(renaultCollection[i].shouldChangeBreakPads == true) {
                        money = money + 200;
                        break;
                    }
                }
            }
        }
        System.out.println("It will cost: " + money + " PLN");
    }
}
