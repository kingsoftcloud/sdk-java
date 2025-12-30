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

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
