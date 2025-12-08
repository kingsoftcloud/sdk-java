package ksyun.client.kes.checkclusterhealth.v20201215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CheckClusterHealthResponse
* @Description CheckClusterHealth 返回体
*/
@Data
@ToString
public class CheckClusterHealthResponse extends BaseResponseModel {
    /**返回集群ID*/
    @JsonProperty("Return")
    private String ReturnField;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**状态码*/
    @JsonProperty("StatusCode")
    private Integer StatusCode;

}
