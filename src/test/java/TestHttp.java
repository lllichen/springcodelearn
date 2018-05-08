import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by lichen@daojia.com on 2017-11-24.
 */
public class TestHttp {

    public static void main(String[] args) {

        for (int i = 0 ; i < 500; i++){
        Thread t = new Thread( new Runnable() {
            @Override
            public void run() {
                HttpClient client = HttpClientBuilder.create().build();
                HttpGet httpGet = new HttpGet("http://127.0.0.1/api/performance/data/add/v1?userId=2627588671758570559_19118223&deviceId=&pageId=3&os=iOS&channel=web&version=&network=&lng=116.416544325087&lat=40.040051269532&ram=&cpuFrequency=&cpuCore=&screenHeight=&screenWidth=&url=https%3A%2F%2Fdiscovery-dop80.djtest.cn%2Fcommon%2FplatformIndex%3Fcate_id%3D14002%26cityid%3D1%26cityId%3D1%26uid%3D894504642308874240%26phone%3D18100000021%26mobile%3D18100000021%26lng%3D116.42307%26cityname%3D%26from%3Dandroid%26itemIndex%3D0%26frontCategoryList%3D%255B%255D%26orderByPlatform%3D4017%2C4001%2C4002%26customType%3D%255B%255D%26priceMin%3D%26priceMax%3D%26productSpecItemVoList%3D%255B%255D%26serviceTypeList%3D%255B%255D&pageWebkitPrepareTime=0&pageRequestHtmlTime=0&pageRequestResourceTime=754&pageApiTime=581&pageRenderTime=706&pageWholeTime=2041&allInterfaceTime=%7B%22index%22%3A%7B%22duration%22%3A271%2C%22size%22%3A917%7D%2C%22search%22%3A%7B%22duration%22%3A310%2C%22size%22%3A31971%7D%2C%22location%22%3A%7B%22duration%22%3A328%7D%7D&allHookTime=%7B%22startHtml%22%3A1511440030351%2C%22startJs%22%3A1511440031105%2C%22requireLocation%22%3A1511440031193%2C%22navMounted%22%3A1511440031516%2C%22recieveLocation%22%3A1511440031521%2C%22requireHeaderData%22%3A1511440031521%2C%22DOMContentLoaded%22%3A1511440031695%2C%22recieveHeaderData%22%3A1511440031792%2C%22requireListData%22%3A1511440031870%2C%22recieveListData%22%3A1511440032180%2C%22listRendered%22%3A1511440032392%2C%22windowOnload%22%3A1511440033385%7D&callback=_jsonpb4qzu1wozlb");
                try {
                    HttpResponse response = client.execute( httpGet );
                    System.out.println(convertStreamToString(response.getEntity().getContent()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } );

            t.start();
        }

    }


    public static String convertStreamToString(InputStream is) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();

        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + "/n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return sb.toString();
    }

}
