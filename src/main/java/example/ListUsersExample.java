package example;

import com.alibaba.fastjson.JSON;
import common.Credential;
import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
* @Classname ListUsersExample
 * @Description Example
 */
@Slf4j
public class ListUsersExample {
    public static void main(String[] args) {
//        //证书
//        Credential credential = new Credential("secretKey", "signStr", "region");
//        ListUsersClient client = new ListUsersClient(credential);
//        ListUsersRequest request = new ListUsersRequest();
//        request.setMarker("1");
//        request.setMaxItems("2");
//        String host = "";
//        try {
//            ListUsersResponse ListUsersResponsePostRaw = client.doPostRaw(host, request);
//            log.info("ListUsers result:{}", JSON.toJSON(ListUsersResponsePostRaw));
//
//            //ListUsersResponse ListUsersResponsePost = client.doPost(host, request);
//            //log.info("ListUsers result:{}", JSON.toJSON(ListUsersResponsePost));
//
//            //ListUsersResponse ListUsersResponseGet = client.doGet(host, request);
//            //log.info("ListUsers result:{}", JSON.toJSON(ListUsersResponseGet));
//        } catch (Exception e) {
//            log.error("ListUsers occur error", e);
//        }
    }
}
