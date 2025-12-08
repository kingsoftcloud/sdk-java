package ksyun.client.clickhouse.createinstanceaccount.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateInstanceAccountResponse
* @Description CreateInstanceAccount 返回体
*/
@Data
@ToString
public class CreateInstanceAccountResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /**```json
实例创建分为两步：
1.创建
2.赋权

注意：接口返回两步操作的状态
```*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**赋权状态*/
        @JsonProperty("modify_privileges")
        private Boolean Modify_privileges;

        /**创建状态*/
        @JsonProperty("create_account")
        private Boolean Create_account;

    }

}
