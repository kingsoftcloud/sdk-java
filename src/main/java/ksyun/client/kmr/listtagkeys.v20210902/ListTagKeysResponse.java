package ksyun.client.kmr.listtagkeys.v20210902;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListTagKeysResponse
* @Description ListTagKeys 返回体
*/
@Data
@ToString
public class ListTagKeysResponse extends BaseResponseModel {

    /**标签键*/
    @JsonProperty("TagKeys")
    private List<String> TagKeys;

    /**页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**分页数*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**总数*/
    @JsonProperty("Total")
    private Integer Total;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**状态码*/
    @JsonProperty("StatusCode")
    private Integer StatusCode;

}
