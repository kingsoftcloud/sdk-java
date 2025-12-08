package ksyun.client.kcs.describebigkeys.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeBigKeysResponse
* @Description DescribeBigKeys 返回体
*/
@Data
@ToString
public class DescribeBigKeysResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("id")
        private String Id;

        /***/
        @JsonProperty("resourceId")
        private String ResourceId;

        /***/
        @JsonProperty("updateTime")
        private String UpdateTime;

        /***/
        @JsonProperty("taskType")
        private String TaskType;

        /***/
        @JsonProperty("createTime")
        private String CreateTime;

        /***/
        @JsonProperty("taskStatus")
        private String TaskStatus;

    }

}
