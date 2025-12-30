package ksyun.client.iam.updaterole.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateRoleResponse
* @Description UpdateRole 返回体
*/
@Data
@ToString
public class UpdateRoleResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
