package ksyun.client.tagv2.listtagkeys.v20200901;

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
    /**标签键列表*/
    @JsonProperty("TagKeys")
    private List<String> TagKeys;

    /**页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**条数*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /***/
    @JsonProperty("Total")
    private Integer Total;

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
