package example;

import common.Credential;
import ksyun.client.sts.assumerole.v20151101.AssumeRoleClient;
import ksyun.client.sts.assumerole.v20151101.AssumeRoleRequest;
import ksyun.client.sts.assumerole.v20151101.AssumeRoleResponse;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname AssumeRoleExample
 * @Description Example
 */
@Slf4j
public class AssumeRoleExample {
    public static void main(String[] args) {
//        //证书
        Credential credential = new Credential("", "", "region");
        AssumeRoleClient client = new AssumeRoleClient(credential);
        AssumeRoleRequest request = new AssumeRoleRequest();
        request.setRoleKrn("test");
        request.setRoleSessionName("test");


        try {
            AssumeRoleResponse assumeRoleResponse = client.doPostRaw("iam.api.ksyun.com", request);
            String assumeRoleResponseStr = assumeRoleResponse.getResult();

            AssumeRoleResultResp assumeRoleResult = com.alibaba.fastjson.JSON.parseObject(assumeRoleResponseStr, AssumeRoleResultResp.class);
            log.info("assumeRoleResult:{}",assumeRoleResult);

        } catch (Exception e) {
            log.error("assumeRole occur error", e);
        }
    }


    @Data
    public static class AssumeRoleResultResp extends AssumeRoleResponse{
        private AssumeRoleResult AssumeRoleResult;
    }


    @Data
    @ToString
    public static class AssumeRoleResult {
        private Credentials Credentials;
        private AssumedRoleUser AssumedRoleUser;
        private String RequestId;
    }

    @Data
    @ToString
    public static class Credentials {
        private String SecretAccessKey;
        private String Expiration;
        private String AccessKeyId;
        private String SecurityToken;
    }

    @Data
    @ToString
    public static class AssumedRoleUser {
        private String Krn;
        private String AssumedRoleId;
    }
}
