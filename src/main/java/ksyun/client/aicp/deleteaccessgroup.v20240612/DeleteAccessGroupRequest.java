package ksyun.client.aicp.deleteaccessgroup.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteAccessGroupRequest
* @Description 请求参数
*/
@Data
public class DeleteAccessGroupRequest{
    /**权限组ID，36位*/
    @KsYunField(name="AccessGroupId")
    private String AccessGroupId;

}
