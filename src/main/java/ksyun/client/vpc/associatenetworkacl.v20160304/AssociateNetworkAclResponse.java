package ksyun.client.vpc.associatenetworkacl.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AssociateNetworkAclResponse
* @Description AssociateNetworkAcl 返回体
*/
@Data
@ToString
public class AssociateNetworkAclResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**操作是否成功*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
