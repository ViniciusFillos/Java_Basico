/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import static java.time.temporal.TemporalQueries.localDate;

/**
 *
 * @author winky
 */
public class Mavenproject1 {

    public static void main(String[] args) {
int ano = localDate.getYear();
System.out.println("ano = " + ano);
    }
}
