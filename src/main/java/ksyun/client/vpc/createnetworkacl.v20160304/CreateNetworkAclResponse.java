package ksyun.client.vpc.createnetworkacl.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateNetworkAclResponse
* @Description CreateNetworkAcl 返回体
*/
@Data
@ToString
public class CreateNetworkAclResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**创建时间*/
    @JsonProperty("CreateTime")
    private String CreateTime;

    /**Vpc的ID*/
    @JsonProperty("VpcId")
    private String VpcId;

    /**ACL的名称*/
    @JsonProperty("NetworkAclName")
    private String NetworkAclName;

    /**ACL的ID*/
    @JsonProperty("NetworkAclId")
    private String NetworkAclId;

    /**ACL的描述*/
    @JsonProperty("Description")
    private String Description;

}
