package ksyun.client.iam.updateaccesskey.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateAccessKeyResponse
* @Description UpdateAccessKey 返回体
*/
@Data
@ToString
public class UpdateAccessKeyResponse extends BaseResponseModel {
    /***/
    @JsonProperty("result")
    private Boolean Result;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
