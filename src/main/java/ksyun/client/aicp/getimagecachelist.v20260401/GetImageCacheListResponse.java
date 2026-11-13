package ksyun.client.aicp.getimagecachelist.v20260401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetImageCacheListResponse
* @Description GetImageCacheList 返回体
*/
@Data
@ToString
public class GetImageCacheListResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**页码*/
    @JsonProperty("PageNum")
    private Integer PageNum;

    /**每页数量*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**总条数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
