package ksyun.client.resourcemanager.updateaccount.v20210320;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateAccountResponse
* @Description UpdateAccount 返回体
*/
@Data
@ToString
public class UpdateAccountResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
