/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.webpom;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author bestinet
 */
public class DateUtil {
    
     public static String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date uDate = new Date();
        return sdf.format(uDate);
    }
    
}
