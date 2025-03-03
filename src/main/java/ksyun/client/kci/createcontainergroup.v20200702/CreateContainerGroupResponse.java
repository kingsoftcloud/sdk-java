package ksyun.client.kci.createcontainergroup.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CreateContainerGroupResponse
 * @Description CreateContainerGroup 返回体
 */
@Data
@ToString
public class CreateContainerGroupResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
