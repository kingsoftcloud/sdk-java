package ksyun.client.kes.modifyclustername.v20201215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyClusterNameResponse
* @Description ModifyClusterName 返回体
*/
@Data
@ToString
public class ModifyClusterNameResponse extends BaseResponseModel {

    /**集群ID*/
    @JsonProperty("ClusterId")
    private String ClusterId;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**状态码*/
    @JsonProperty("StatusCode")
    private Integer StatusCode;

}
