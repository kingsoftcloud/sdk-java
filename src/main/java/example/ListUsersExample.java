package example;

import common.Credential;
import ksyun.client.iam.listusers.v20151101.ListUsersClient;
import ksyun.client.iam.listusers.v20151101.ListUsersRequest;
import ksyun.client.iam.listusers.v20151101.ListUsersResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname ListUsersExample
 * @Description ListUsers API 使用示例
 */
@Slf4j
public class ListUsersExample {
    public static void main(String[] args) {
        // 创建凭证
        Credential credential = new Credential("YOUR_SECRET_KEY", "YOUR_SIGN_STR", "YOUR_REGION");

        // 创建客户端
        ListUsersClient client = new ListUsersClient(credential);

        // 创建请求对象
        ListUsersRequest request = new ListUsersRequest();

        // 设置请求参数
        request.setMaxItems(500);

        try {
            // 发起请求，获取结构化的 Response 对象
            ListUsersResponse response = client.doPostRaw("iam.api.ksyun.com", request);

            // 检查响应是否为空
            if (response == null) {
                log.error("请求失败，返回响应为空");
                return;
            }

            // 请求成功，可以直接访问返回字段
            log.info("请求成功！");

            // 将完整响应序列化为 JSON 字符串输出
            log.info("完整返回结果: {}", response);

        } catch (Exception e) {
            // 捕获并记录异常
            log.error("ListUsers 请求发生错误: {}", e.getMessage(), e);
        }
    }
}