package ksyun.client.krds.deletesecuritygroup.v20200825;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DeleteSecurityGroupResponse
* @Description DeleteSecurityGroup 返回体
*/
@Data
@ToString
public class DeleteSecurityGroupResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
