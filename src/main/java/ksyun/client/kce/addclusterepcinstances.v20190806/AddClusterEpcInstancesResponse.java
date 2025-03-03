package ksyun.client.kce.addclusterepcinstances.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname AddClusterEpcInstancesResponse
 * @Description AddClusterEpcInstances 返回体
 */
@Data
@ToString
public class AddClusterEpcInstancesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
