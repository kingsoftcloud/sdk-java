package ksyun.client.kce.protectedfromscaledown.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ProtectedFromScaleDownResponse
* @Description ProtectedFromScaleDown 返回体
*/
@Data
@ToString
public class ProtectedFromScaleDownResponse extends BaseResponseModel {
    /**设置缩容保护成功的节点id*/
    @JsonProperty("SucceedInstanceIds")
    private List<String> SucceedInstanceIds;

    /**设置缩容保护失败的节点id*/
    @JsonProperty("FailedInstanceIds")
    private List<String> FailedInstanceIds;

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
