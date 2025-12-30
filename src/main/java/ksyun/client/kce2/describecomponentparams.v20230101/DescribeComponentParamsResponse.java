package ksyun.client.kce2.describecomponentparams.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeComponentParamsResponse
* @Description DescribeComponentParams 返回体
*/
@Data
@ToString
public class DescribeComponentParamsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequeestId")
    private String RequeestId;

    /**返回数据*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**集群ID*/
        @JsonProperty("ClusterId")
        private String ClusterId;

    }

    /**组件列表*/
    @JsonProperty("Components")
    private List<ComponentsDto> Components;

    @Data
    @ToString
    public static class ComponentsDto {
        /**组件类型*/
        @JsonProperty("Type")
        private String Type;

        /**组件版本*/
        @JsonProperty("Version")
        private String Version;

        /**组件参数*/
        @JsonProperty("Args")
        private String Args;

    }

}
