package ksyun.client.aicp.removeaccessgroupmembers.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RemoveAccessGroupMembersRequest
* @Description 请求参数
*/
@Data
public class RemoveAccessGroupMembersRequest{
    /**权限组ID，36位*/
    @KsYunField(name="AccessGroupId")
    private String AccessGroupId;

    /**待移除的子账号ID列表，至少1项*/
    @KsYunField(name="UserIds",type=2)
    private List<String> UserIdsList;

}
