package ksyun.client.sks.describekeys.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeKeysResponse
* @Description DescribeKeys 返回体
*/
@Data
@ToString
public class DescribeKeysResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**裸金属服务器总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**Key的信息*/
    @JsonProperty("KeySet")
    private List<KeySetDto> KeySet;

    @Data
    @ToString
    public static class KeySetDto {
        /**密钥ID*/
        @JsonProperty("KeyId")
        private String KeyId;

        /**公钥*/
        @JsonProperty("PublicKey")
        private String PublicKey;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**公钥名称*/
        @JsonProperty("KeyName")
        private String KeyName;

    }

}
