/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author winky
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Date date = new Date();

        //LocalDate localDate = LocalDate.now();
        LocalDateTime localDate = date.toInstant()
        .atZone(ZoneId.systemDefault())
        .toLocalDateTime();

        int ano = localDate.getYear();
        System.out.println("ano = " + ano);
    }
}
