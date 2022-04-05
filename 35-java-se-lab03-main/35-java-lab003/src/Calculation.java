/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author Win7
 */
public class Calculation {
    public static void KineticEnergy(String MassTela, String SkorostTela)
{
        
        int m = Integer.parseInt(MassTela);//присвоим целому значению, значение строки
        int v = Integer.parseInt(SkorostTela);
        int KEnergy = (m * (v*v))/2;
        System.out.println("Кинетическая энергия тела равна:" +KEnergy);
                System.out.println("Число " + KEnergy + " в двоичной форме: " + 
                                    Integer.toBinaryString(KEnergy));
        String s = String.valueOf(KEnergy);
        ArrayList<String> Out1 = new ArrayList<>(Arrays.asList("Скорость тела " +SkorostTela ,"\n Масса тела " + MassTela ,"\n Кинетическая энергия " +s));
        System.out.println(Out1);
        
}}