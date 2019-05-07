package com.apirest.rest.utils;

public class CpfUtils {
          
        public static String aplicaMascara(String CPF) {
            return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
            CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
        }
        
        public static String retiraMascara(String CPF) {
            return CPF.replaceAll("[.-]", "");
        }
    }