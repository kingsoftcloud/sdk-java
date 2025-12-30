package ksyun.client.tagv2.replaceresourcestags.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ReplaceResourcesTagsResponse
* @Description ReplaceResourcesTags 返回体
*/
@Data
@ToString
public class ReplaceResourcesTagsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
