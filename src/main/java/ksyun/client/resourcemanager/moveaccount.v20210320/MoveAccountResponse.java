package ksyun.client.resourcemanager.moveaccount.v20210320;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname MoveAccountResponse
* @Description MoveAccount 返回体
*/
@Data
@ToString
public class MoveAccountResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
