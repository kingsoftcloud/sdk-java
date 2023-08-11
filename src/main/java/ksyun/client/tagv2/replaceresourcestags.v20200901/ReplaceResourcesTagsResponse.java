package ksyun.client.tagv2.replaceresourcestags.v20200901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname ReplaceResourcesTagsResponse
* @Description ReplaceResourcesTags 返回体
*/
@Data
@ToString
public class ReplaceResourcesTagsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
