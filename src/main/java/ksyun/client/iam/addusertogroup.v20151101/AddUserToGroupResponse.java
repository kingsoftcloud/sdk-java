package ksyun.client.iam.addusertogroup.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddUserToGroupResponse
* @Description AddUserToGroup 返回体
*/
@Data
@ToString
public class AddUserToGroupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("result")
    private Boolean Result;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
