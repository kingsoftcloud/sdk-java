package example;

import com.alibaba.fastjson.JSON;
import common.Credential;
import ksyun.client.sts.assumerole.v20151101.AssumeRoleClient;
import ksyun.client.sts.assumerole.v20151101.AssumeRoleRequest;
import ksyun.client.sts.assumerole.v20151101.AssumeRoleResponse;

/**
 * @Classname AssumeRoleExample
 * @Description AssumeRole 示例
 */
public class AssumeRoleExample {

    public static void main(String[] args) {
        // 创建凭证
        Credential credential = new Credential("YOUR_SECRET_KEY", "YOUR_SIGN_STR", "YOUR_REGION");

        // 创建客户端
        AssumeRoleClient client = new AssumeRoleClient(credential);

        // 创建请求对象
        AssumeRoleRequest request = new AssumeRoleRequest();
        request.setRoleSessionName("Test");
        try {
            AssumeRoleResponse response = client.doPostSend("sts.api.ksyun.com", request);
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