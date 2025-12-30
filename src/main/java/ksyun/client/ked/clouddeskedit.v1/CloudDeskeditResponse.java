package ksyun.client.ked.clouddeskedit.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CloudDeskeditResponse
* @Description CloudDeskedit 返回体
*/
@Data
@ToString
public class CloudDeskeditResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("detail")
    private String Detail;

    /***/
    @JsonProperty("data")
    private Boolean Data;

}
