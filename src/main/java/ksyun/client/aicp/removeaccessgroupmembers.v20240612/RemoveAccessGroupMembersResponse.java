package ksyun.client.aicp.removeaccessgroupmembers.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RemoveAccessGroupMembersResponse
* @Description RemoveAccessGroupMembers 返回体
*/
@Data
@ToString
public class RemoveAccessGroupMembersResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**权限组ID*/
    @JsonProperty("AccessGroupId")
    private String AccessGroupId;

}
