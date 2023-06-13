package ksyun.client.kec.detachinstancesiamrole.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DetachInstancesIamRoleRequest
* @Description 请求参数
*/
@Data
public class DetachInstancesIamRoleRequest{
    /**待解绑IAM角色实例ID列表，N的范围为1-100*/
    @KsYunField(name="InstanceId")
    private List<String> InstanceIdList;


}