package ksyun.client.kec.describeimagesharepermission.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeImageSharePermissionResponse
* @Description DescribeImageSharePermission 返回体
*/
@Data
@ToString
public class DescribeImageSharePermissionResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("SharePermissionSet")
    private List<SharePermissionSetDto> SharePermissionSet;

    @Data
    @ToString
    public static class SharePermissionSetDto {
        /***/
        @JsonProperty("AccountId")
        private String AccountId;

    }

}
