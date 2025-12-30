package ksyun.client.tagv2.listtagvalues.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListTagValuesResponse
* @Description ListTagValues 返回体
*/
@Data
@ToString
public class ListTagValuesResponse extends BaseResponseModel {

    /**TagValues*/
    @JsonProperty("TagValues")
    private List<TagValuesDto> TagValues;

    @Data
    @ToString
    public static class TagValuesDto {
        /**标签值ID*/
        @JsonProperty("ID")
        private String ID;

        /**标签键*/
        @JsonProperty("Key")
        private String Key;

        /**标签值*/
        @JsonProperty("Value")
        private String Value;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**绑定的资源数量*/
        @JsonProperty("BindNum")
        private Integer BindNum;

    }

    /**页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**条数*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**总数*/
    @JsonProperty("Total")
    private Integer Total;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
