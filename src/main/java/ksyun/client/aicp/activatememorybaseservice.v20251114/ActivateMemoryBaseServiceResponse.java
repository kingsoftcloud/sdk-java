package ksyun.client.aicp.activatememorybaseservice.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ActivateMemoryBaseServiceResponse
* @Description ActivateMemoryBaseService 返回体
*/
@Data
@ToString
public class ActivateMemoryBaseServiceResponse extends BaseResponseModel {

    /**仅CREATE_SUCCESS 表示开通成功，其他情况为失败。*/
    @JsonProperty("Status")
    private String Status;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
