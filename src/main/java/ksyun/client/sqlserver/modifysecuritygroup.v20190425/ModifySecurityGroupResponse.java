package ksyun.client.sqlserver.modifysecuritygroup.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

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
