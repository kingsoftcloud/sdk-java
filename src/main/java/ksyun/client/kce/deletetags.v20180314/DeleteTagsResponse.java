package ksyun.client.kce.deletetags.v20180314;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteTagsResponse
* @Description DeleteTags 返回体
*/
@Data
@ToString
public class DeleteTagsResponse extends BaseResponseModel {
    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
