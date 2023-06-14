# 简介

欢迎使用金山云开发者工具套件（SDK）。为方便 JAVA 开发者调试和接入金山云产品 API，这里向您介绍适用于 JAVA 的金山云开发工具包，并提供首次使用开发工具包的简单示例。让您快速获取金山云 JAVA SDK 并开始调用。

# 依赖环境

1. JDK 7 版本及以上
2. 从金山云控制台 开通相应产品
3. 获取 secretId、secretKey。

# 获取安装

安装 JAVA SDK 前，先获取安全凭证。在第一次使用云 API 之前，用户首先需要在金山云控制台上申请安全凭证，安全凭证包括 secretId 和 secretKey， secretId 是用于标识 API 调用者的身份，secretKey 是用于加密签名字符串和服务器端验证签名字符串的密钥。secretKey 必须严格保管，避免泄露。

## 通过 MAVEN 安装

1. 在maven 项目 pom.xml 中添加sdk 依赖
   ```
     <groupId>com.ksyun</groupId>
     <artifactId>ksyun-java-sdk</artifactId>
     <version>1.0.4</version>
   ```
2. 在您的代码中引用对应模块代码，可参考示例。

## 通过源码包安装

1. 前往 [Github 仓库](https://github.com/kingsoftcloud/sdk-java)下载源码压缩包。
2. 解压源码包到您项目合适的位置。
3. 在您的代码中引用对应模块代码，可参考示例。

# 示例

```js
public static void main(String[] args) {
   //证书
   Credential credential = new Credential("secretKey", "signStr", "region");
   ListUsersClient client = new ListUsersClient(credential);
   ListUsersRequest request = new ListUsersRequest();
   request.setMarker("1");
   request.setMaxItems("2");
   try {
      ListUsersResponse ListUsersResponse = client.doGet("iam.api.ksyun.com", request);
      log.info("ListUsers result:{}", JSON.toJSON(ListUsersResponse));
   } catch (Exception e) {
      log.error("ListUsers occur error", e);
   }
}
```

# 更多示例
参见金山云控制台-API Explorer-对应服务-SDK示例。