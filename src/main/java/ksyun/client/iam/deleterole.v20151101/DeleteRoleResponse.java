package ksyun.client.iam.deleterole.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteRoleResponse
* @Description DeleteRole 返回体
*/
@Data
@ToString
public class DeleteRoleResponse extends BaseResponseModel {
    /***/
    @JsonProperty("result")
    private Boolean Result;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
