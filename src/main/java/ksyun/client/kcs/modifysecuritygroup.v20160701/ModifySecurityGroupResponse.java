package ksyun.client.kcs.modifysecuritygroup.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifySecurityGroupResponse
* @Description ModifySecurityGroup 返回体
*/
@Data
@ToString
public class ModifySecurityGroupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
