package ksyun.client.iam.updategroup.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateGroupRequest
* @Description 请求参数
*/
@Data
public class UpdateGroupRequest{
    /**要更新的用户组名称*/
    @KsYunField(name="GroupName")
    private String GroupName;

    /**新用户组描述*/
    @KsYunField(name="Description")
    private String Description;

    /**新别名*/
    @KsYunField(name="GroupRealName")
    private String GroupRealName;

}
