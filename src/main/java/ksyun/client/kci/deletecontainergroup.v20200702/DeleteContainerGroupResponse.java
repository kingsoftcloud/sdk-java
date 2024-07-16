package ksyun.client.kci.deletecontainergroup.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DeleteContainerGroupResponse
* @Description DeleteContainerGroup 返回体
*/
@Data
@ToString
public class DeleteContainerGroupResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
