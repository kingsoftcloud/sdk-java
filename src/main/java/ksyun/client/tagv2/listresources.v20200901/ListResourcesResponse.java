package ksyun.client.tagv2.listresources.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListResourcesResponse
* @Description ListResources 返回体
*/
@Data
@ToString
public class ListResourcesResponse extends BaseResponseModel {

    /**Resources*/
    @JsonProperty("Resources")
    private String Resources;

    /**页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**条数*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**总数*/
    @JsonProperty("Total")
    private Integer Total;

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
