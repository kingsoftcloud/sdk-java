package ksyun.client.aicp.listdatasettopic.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname ListDatasetTopicResponse
 * @Description ListDatasetTopic 返回体
 */
@Data
@ToString
public class ListDatasetTopicResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
