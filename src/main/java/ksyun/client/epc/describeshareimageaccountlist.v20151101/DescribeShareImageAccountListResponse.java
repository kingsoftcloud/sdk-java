package ksyun.client.epc.describeshareimageaccountlist.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeShareImageAccountListResponse
* @Description DescribeShareImageAccountList 返回体
*/
@Data
@ToString
public class DescribeShareImageAccountListResponse extends BaseResponseModel {
    /***/
    @JsonProperty("SharePermissionSet")
    private List<SharePermissionSetDto> SharePermissionSet;

    @Data
    @ToString
    public static class SharePermissionSetDto {
        /***/
        @JsonProperty("AccountId")
        private Integer AccountId;

        /***/
        @JsonProperty("ShareTime")
        private String ShareTime;

        /***/
        @JsonProperty("Status")
        private String Status;

        /**镜像ID*/
        @JsonProperty("ImageId")
        private String ImageId;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回状态*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
