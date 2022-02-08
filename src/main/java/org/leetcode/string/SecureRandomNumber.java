package org.leetcode.string;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author bruno-fabrice touopi
 */
public class SecureRandomNumber {


    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static SecureRandom rnd = new SecureRandom();

    public static void main(String[] args) {
        String codeGenerated=randomString(8);
        ConcurrentMap<String,String> codeGeneratedMap=new ConcurrentHashMap<>();
        int numberCodetoGenerate=100;
        while(numberCodetoGenerate>0){
            String code=randomString(8);
            codeGeneratedMap.putIfAbsent(code,code);
        }
        System.out.println(randomString(8));

    }

   public  static String   randomString(int len){
        StringBuilder sb = new StringBuilder(len);
        for(int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }
}
