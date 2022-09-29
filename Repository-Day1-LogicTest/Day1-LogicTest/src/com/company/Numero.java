package com.company;

import java.util.stream.IntStream;

public class Numero {

    private double numero;

    public Numero(double numero) {
        this.numero = numero;
    }

    public void generarNumeroDigital() {
        double parteDecimal1 = numero % 1;
        double parteDecimal = Math.round((numero % 1) * 100000.0);
        double parteEntera = numero - parteDecimal1;

        //System.out.println(parteDecimal % 10);


        //System.out.println(parteDecimal);
        //System.out.println(parteEntera);

        String[][] matriz = new String[5][3];


        if (parteEntera > 5) {
            System.out.println("El número correspondiente a la parte entera debe ser mayor a cero y menor o igual a cinco");
        } else if (parteDecimal > 100000) {
            System.out.println("Es mayor que cien mil");
        } else {
            for (int i = 1; i <= parteEntera; i++) {
                for (int j = 0; j <= 4; j++) {
                    String number = String.valueOf(parteDecimal);
                    String number1 = number.substring(0, 5);
                    char arrayCaracteres[];
                    arrayCaracteres = new char[5];

                    int number2 = Integer.parseInt(String.valueOf(number1.charAt(j)));


                    switch (number2) {

                        case 0:
                            matriz[0][0] = "";
                            matriz[0][1] = "——";
                            matriz[0][2] = "";
                            matriz[1][0] = "|";
                            matriz[1][1] = " ";
                            matriz[1][2] = "|";
                            matriz[2][0] = "|";
                            matriz[2][1] = " ";
                            matriz[2][2] = "|";
                            matriz[3][0] = "";
                            matriz[3][1] = "——";
                            matriz[3][2] = "";

                            break;

                        case 1:
                            matriz[0][0] = "";
                            matriz[0][1] = "";
                            matriz[0][2] = "";
                            matriz[1][0] = "";
                            matriz[1][1] = "|";
                            matriz[1][2] = "";
                            matriz[2][0] = "";
                            matriz[2][1] = "";
                            matriz[2][2] = "";
                            matriz[3][0] = "";
                            matriz[3][1] = "|";
                            matriz[3][2] = "";
                            matriz[4][0] = "";
                            matriz[4][1] = "";
                            matriz[4][2] = "";
                            break;

                        case 2:
                            matriz[0][0] = "";
                            matriz[0][1] = "—";
                            matriz[0][2] = "";
                            matriz[1][0] = "";
                            matriz[1][1] = "";
                            matriz[1][2] = "|";
                            matriz[2][0] = "";
                            matriz[2][1] = "—";
                            matriz[2][2] = "";
                            matriz[3][0] = "|";
                            matriz[3][1] = "";
                            matriz[3][2] = "";
                            matriz[4][0] = "";
                            matriz[4][1] = "—";
                            matriz[4][2] = "";
                            break;

                        case 3:
                            matriz[0][0] = "";
                            matriz[0][1] = "—";
                            matriz[0][2] = "";
                            matriz[1][0] = "";
                            matriz[1][1] = "";
                            matriz[1][2] = "|";
                            matriz[2][0] = "";
                            matriz[2][1] = "—";
                            matriz[2][2] = "";
                            matriz[3][0] = "";
                            matriz[3][1] = "";
                            matriz[3][2] = "|";
                            matriz[4][0] = "";
                            matriz[4][1] = "—";
                            matriz[4][2] = "";
                            break;

                        case 4:
                            matriz[0][0] = "|";
                            matriz[0][1] = " ";
                            matriz[0][2] = "|";
                            matriz[1][0] = "";
                            matriz[1][1] = "—-";
                            matriz[1][2] = "";
                            matriz[2][0] = "";
                            matriz[2][1] = "";
                            matriz[2][2] = "|";
                            matriz[3][0] = "";
                            matriz[3][1] = "";
                            matriz[3][2] = "";
                            matriz[4][0] = "";
                            matriz[4][1] = "";
                            matriz[4][2] = " ";
                            break;
                        case 5:
                            matriz[0][0] = "";
                            matriz[0][1] = "-—";
                            matriz[0][2] = "";
                            matriz[1][0] = "|";
                            matriz[1][1] = " ";
                            matriz[1][2] = " ";
                            matriz[2][0] = "";
                            matriz[2][1] = "-—";
                            matriz[2][2] = "";
                            matriz[3][0] = " ";
                            matriz[3][1] = " ";
                            matriz[3][2] = "|";
                            matriz[4][0] = "";
                            matriz[4][1] = "-—";
                            matriz[4][2] = "";
                            break;
                        case 6:
                            matriz[0][0] = "";
                            matriz[0][1] = "-—";
                            matriz[0][2] = "";
                            matriz[1][0] = "|";
                            matriz[1][1] = "";
                            matriz[1][2] = "";
                            matriz[2][0] = "";
                            matriz[2][1] = "-—";
                            matriz[2][2] = "";
                            matriz[3][0] = "|";
                            matriz[3][1] = " ";
                            matriz[3][2] = "|";
                            matriz[4][0] = "";
                            matriz[4][1] = "-—";
                            matriz[4][2] = "";
                            break;
                        case 7:
                            matriz[0][0] = "";
                            matriz[0][1] = "-—-";
                            matriz[0][2] = "";
                            matriz[1][0] = "";
                            matriz[1][1] = "";
                            matriz[1][2] = "|";
                            matriz[2][0] = " ";
                            matriz[2][1] = " ";
                            matriz[2][2] = "";
                            matriz[3][0] = " ";
                            matriz[3][1] = " ";
                            matriz[3][2] = "|";
                            matriz[4][0] = " ";
                            matriz[4][1] = " ";
                            matriz[4][2] = "";
                            break;
                        case 8:
                            matriz[0][0] = "";
                            matriz[0][1] = "——";
                            matriz[0][2] = "";
                            matriz[1][0] = "|";
                            matriz[1][1] = " ";
                            matriz[1][2] = "|";
                            matriz[2][0] = "";
                            matriz[2][1] = "——";
                            matriz[2][2] = "";
                            matriz[3][0] = "|";
                            matriz[3][1] = "";
                            matriz[3][2] = "|";
                            matriz[4][0] = "";
                            matriz[4][1] = "——";
                            matriz[4][2] = "";
                            break;
                        case 9:
                            matriz[0][0] = "";
                            matriz[0][1] = "-—";
                            matriz[0][2] = "";
                            matriz[1][0] = "|";
                            matriz[1][1] = " ";
                            matriz[1][2] = "|";
                            matriz[2][0] = "";
                            matriz[2][1] = "-—";
                            matriz[2][2] = "|";
                            matriz[3][0] = "";
                            matriz[3][1] = " ";
                            matriz[3][2] = "|";
                            matriz[4][0] = "";
                            matriz[4][1] = "";
                            matriz[4][2] = " ";
                            break;
                        default:
                            System.out.println("El número aún no está implementado");


                    }
                    for (int x = 0; x < matriz.length; x++) {
                        System.out.print("");
                        for (int y = 0; y < matriz[x].length; y++) {
                            System.out.print(matriz[x][y]);
                            if (y != matriz[x].length - 1) System.out.print("\t");
                        }
                        System.out.println("");
                    }
                }


            }


        }


    }

}
