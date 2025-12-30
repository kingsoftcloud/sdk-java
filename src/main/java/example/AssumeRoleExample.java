package example;

import com.alibaba.fastjson.JSON;
import common.Credential;
import ksyun.client.iam.listusers.v20151101.ListUsersClient;
import ksyun.client.iam.listusers.v20151101.ListUsersRequest;
import ksyun.client.iam.listusers.v20151101.ListUsersResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * @Classname ListUsersExample
 * @Description Example
 */
@Slf4j
public class AssumeRoleExample {
    public static void main(String[] args) {
        // 创建凭证
        Credential credential = new Credential("AKLT32VWMXXLS5WKEHeNdJzw", "OFoUOOs8OKI9aSyq5qzy4NgYs18JpvZlJp8a8s7k", "cn-beijing-6");

        // 创建客户端
        ListUsersClient client = new ListUsersClient(credential);

        // 创建请求对象
        ListUsersRequest request = new ListUsersRequest();
        request.setMaxItems(100);
        try {
            ListUsersResponse response = client.doGetSend("iam.api.ksyun.com", request);
            if (response != null) {
                System.out.println("请求成功: " + JSON.toJSON(response));
            } else {
                System.out.println("响应为空");
            }
        } catch (RuntimeException e) {
            // SDK 已经格式化好错误信息，直接输出即可
            System.err.println(e.getMessage());
        }
    }
}
