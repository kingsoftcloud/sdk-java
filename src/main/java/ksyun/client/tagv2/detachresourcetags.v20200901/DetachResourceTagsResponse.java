package ksyun.client.tagv2.detachresourcetags.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DetachResourceTagsResponse
* @Description DetachResourceTags 返回体
*/
@Data
@ToString
public class DetachResourceTagsResponse extends BaseResponseModel {
    /**请求结果，TRUE代表请求成功*/
    @JsonProperty("Result")
    private Boolean Result;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
