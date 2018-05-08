package es.info;

import es.client.ESApi;
import org.elasticsearch.Build;
import org.elasticsearch.Version;
import org.elasticsearch.action.main.MainResponse;
import org.elasticsearch.cluster.ClusterName;

import java.io.IOException;

/**
 * Created by lichen@daojia.com on 2017-11-30.
 */
public class InfoDemo implements ESApi {

    public static void main(String[] args) throws IOException {
        try {
            MainResponse response = client.info();
            ClusterName clusterName = response.getClusterName();
            String clusterUuid = response.getClusterUuid();
            String nodeName = response.getNodeName();
            Version version = response.getVersion();
            Build build = response.getBuild();
            System.out.println( clusterName );
//            response.writeTo(  );
            System.out.println( response.toString() );
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            client.close();
        }
    }
}
