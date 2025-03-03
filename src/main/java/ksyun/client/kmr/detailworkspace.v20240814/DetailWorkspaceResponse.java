package ksyun.client.kmr.detailworkspace.v20240814;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DetailWorkspaceResponse
 * @Description DetailWorkspace 返回体
 */
@Data
@ToString
public class DetailWorkspaceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
