package ksyun.client.postgresql.modifysecuritygroup.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifySecurityGroupResponse
 * @Description ModifySecurityGroup 返回体
 */
@Data
@ToString
public class ModifySecurityGroupResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
