package ksyun.client.kce.deleteclusterinstancesfromnodepool.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteClusterInstancesFromNodePoolResponse
 * @Description DeleteClusterInstancesFromNodePool 返回体
 */
@Data
@ToString
public class DeleteClusterInstancesFromNodePoolResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
