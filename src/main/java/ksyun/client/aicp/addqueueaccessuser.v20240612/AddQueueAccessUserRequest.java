package ksyun.client.aicp.addqueueaccessuser.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddQueueAccessUserRequest
* @Description 请求参数
*/
@Data
public class AddQueueAccessUserRequest{
    /**队列ID*/
    @KsYunField(name="QueueId")
    private String QueueId;

    /**子账号ID*/
    @KsYunField(name="SubAccountId")
    private String SubAccountId;

    /**权限类型，有效值：
- writer，管理员
- reader，队列成员*/
    @KsYunField(name="Permission")
    private String Permission;

}
