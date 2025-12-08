package ksyun.client.ked.clouddeskmanage.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CloudDeskmanageResponse
* @Description CloudDeskmanage 返回体
*/
@Data
@ToString
public class CloudDeskmanageResponse extends BaseResponseModel {
    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("code")
    private Integer Code;

    /***/
    @JsonProperty("message")
    private String Message;

    /***/
    @JsonProperty("detail")
    private String Detail;

    /***/
    @JsonProperty("data")
    private Boolean Data;

}
