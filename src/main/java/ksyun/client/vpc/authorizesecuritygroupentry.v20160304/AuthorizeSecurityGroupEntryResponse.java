package ksyun.client.vpc.authorizesecuritygroupentry.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AuthorizeSecurityGroupEntryResponse
* @Description AuthorizeSecurityGroupEntry 返回体
*/
@Data
@ToString
public class AuthorizeSecurityGroupEntryResponse extends BaseResponseModel {

    /**安全组规则ID列表*/
    @JsonProperty("SecurityGroupEntryIdSet")
    private List<String> SecurityGroupEntryIdSet;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**操作是否成功*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
