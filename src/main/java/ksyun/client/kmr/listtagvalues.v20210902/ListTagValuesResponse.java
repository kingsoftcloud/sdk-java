package ksyun.client.kmr.listtagvalues.v20210902;

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
    /**标签信息*/
    @JsonProperty("TagValues")
    private List<TagValuesDto> TagValues;

    @Data
    @ToString
    public static class TagValuesDto {
        /**标签值ID*/
        @JsonProperty("Id")
        private Integer Id;

        /**标签键*/
        @JsonProperty("Key")
        private String Key;

        /**标签值*/
        @JsonProperty("Value")
        private String Value;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**绑定的资源数量

*/
        @JsonProperty("BindNum")
        private Integer BindNum;

    }

    /**页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**分页数*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**总数*/
    @JsonProperty("Total")
    private Integer Total;

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**状态码*/
    @JsonProperty("StatusCode")
    private Integer StatusCode;

}
