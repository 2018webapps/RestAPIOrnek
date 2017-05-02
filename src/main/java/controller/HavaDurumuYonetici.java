/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import model.HavaDurumu;
import model.Sehir;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author asimsinanyuksel
 */
public class HavaDurumuYonetici {

    private static final String MGM_SERVIS_URL = "https://servis.mgm.gov.tr/api/sondurumlar?merkezid=";
    private static final String MGM_SEHIR_BILGI_URL = "https://servis.mgm.gov.tr/api/merkezler?il=";
    private static final String MGM_SEHIRLER_URL = "https://servis.mgm.gov.tr/api/merkezler/iller ";
    private final ObjectMapper mapper = new ObjectMapper();
    private final OkHttpClient httpclient = new OkHttpClient();
    private Request request;

    public HavaDurumu havaDurumuGetir(String kod) throws Exception {
        HavaDurumu[] havaDurumu = null;
        request = new Request.Builder().url(MGM_SERVIS_URL + kod).get().build();
        try (Response response = httpclient.newCall(request).execute()) {
            havaDurumu = mapper.readValue(response.body().bytes(), HavaDurumu[].class);
        }
        return havaDurumu[0];
    }

    public Sehir sehirGetir(String il) throws Exception {
        Sehir[] sehirler = null;
        request = new Request.Builder().url(MGM_SEHIR_BILGI_URL + il).get().build();
        try (Response response = httpclient.newCall(request).execute()) {
            sehirler = mapper.readValue(response.body().bytes(), Sehir[].class);
        }
        return sehirler[0];
    }
//    "A": "Açık";
//        "AB": "Az Bulutlu";
//        "PB": "Parçalı Bulutlu";
//        "CB": "Çok Bulutlu";
//        "HY": "Hafif Yağmurlu";
//        "Y": "Yağmurlu";
//        "KY": "Kuvvetli Yağmurlu";
//        "KKY": "Karla Karışık Yağmurlu";
//        "HKY": "Hafif Kar Yağışlı";
//        "K": "Kar Yağışlı";
//        "KYK": "Yoğun Kar Yağışlı";
//        "HSY": "Hafif Sağanak Yağışlı";
//        "SY": "Sağanak Yağışlı";
//        "KSY": "Kuvvetli Sağanak Yağışlı";
//        "MSY": "Mevzi Sağanak Yağışlı";
//        "DY": "Dolu";
//        "GSY": "Gökgürültülü Sağanak Yağışlı";
//        "KGSY": "Kuvvetli Gökgürültülü Sağanak Yağışlı";
//        "SIS": "Sisli";
//        "PUS": "Puslu";
//        "DNM": "Dumanlı";
//        "KF": "Toz veya Kum Fırtınası";
//        "R": "Rüzgarlı";
//        "GKR": "Güneyli Kuvvetli Rüzgar";
//        "KKR": "Kuzeyli Kuvvetli Rüzgar";
//        "SCK": "Sıcak";
//        "SGK": "Soğuk";

    public String hadiseKodunuMetineDonustur(String kod) {
        if (kod.equalsIgnoreCase("a")) {
            return "Açık";
        } else if (kod.equalsIgnoreCase("ab")) {
            return "Az Bulutlu";
        } else if (kod.equalsIgnoreCase("cb")) {
            return "Çok Bulutlu";
        } else if (kod.equalsIgnoreCase("gsy")) {
            return "Gök Gürültülü Sağnak Yağışlı";
        } else if (kod.equalsIgnoreCase("hy")) {
            return "Hafif Yağmurlu";
        } else if (kod.equalsIgnoreCase("kky")) {
            return "Karla Karışık Yağmurlu";
        } else if (kod.equalsIgnoreCase("ksy")) {
            return "Kuvvetli Sağnak Yağışlı";
        } else if (kod.equalsIgnoreCase("pb")) {
            return "Parçalı Bulutlu";
        } else if (kod.equalsIgnoreCase("y")) {
            return "Yağışlı";
        } else {
            return "Diğer";
        }

    }

    public ArrayList<Sehir> tumSehirleriGetir() throws Exception {
        Sehir[] sehirler = null;       
        request = new Request.Builder().url(MGM_SEHIRLER_URL).get().build();
        try (Response response = httpclient.newCall(request).execute()) {
            sehirler = mapper.readValue(response.body().bytes(), Sehir[].class);
        }
        return new ArrayList<>(Arrays.asList(sehirler));
    }
    public static ImageIcon resimOlustur(String yol) {
        java.net.URL imgURL = HavaDurumuYonetici.class.getResource("/resimler/" + yol + ".png");
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            return null;
        }
    }

}
