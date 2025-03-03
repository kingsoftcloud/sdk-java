package ksyun.client.ked.clouddeskmanage.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CloudDeskmanageResponse
 * @Description CloudDeskmanage 返回体
 */
@Data
@ToString
public class CloudDeskmanageResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
