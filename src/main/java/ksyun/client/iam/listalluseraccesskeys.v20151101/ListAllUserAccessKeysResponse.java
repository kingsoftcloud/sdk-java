package ksyun.client.iam.listalluseraccesskeys.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListAllUserAccessKeysResponse
* @Description ListAllUserAccessKeys 返回体
*/
@Data
@ToString
public class ListAllUserAccessKeysResponse extends BaseResponseModel {
    /***/
    @JsonProperty("AccessKeyList")
    private List<AccessKeyListDto> AccessKeyList;

    @Data
    @ToString
    public static class AccessKeyListDto {
        /***/
        @JsonProperty("UserName")
        private String UserName;

        /***/
        @JsonProperty("AccessKey")
        private String AccessKey;

        /**'-'表示最近三个月未使用*/
        @JsonProperty("LastLoginTime")
        private String LastLoginTime;

        /***/
        @JsonProperty("AkLastUsedTime")
        private String AkLastUsedTime;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
