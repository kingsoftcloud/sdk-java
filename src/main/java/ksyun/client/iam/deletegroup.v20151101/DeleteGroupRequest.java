package ksyun.client.iam.deletegroup.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteGroupRequest
 * @Description 请求参数
 */
@Data
public class DeleteGroupRequest {
    /**
     * 用户组名称
     */
    @KsYunField(name = "GroupName")
    private String GroupName;

}