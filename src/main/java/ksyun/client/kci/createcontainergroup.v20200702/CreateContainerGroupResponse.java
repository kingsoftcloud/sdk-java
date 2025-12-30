package ksyun.client.kci.createcontainergroup.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateContainerGroupResponse
* @Description CreateContainerGroup 返回体
*/
@Data
@ToString
public class CreateContainerGroupResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**容器实例ID*/
    @JsonProperty("ContainerGroupId")
    private String ContainerGroupId;

}
