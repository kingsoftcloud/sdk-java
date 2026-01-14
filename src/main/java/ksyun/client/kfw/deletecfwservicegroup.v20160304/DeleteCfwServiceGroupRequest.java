package ksyun.client.kfw.deletecfwservicegroup.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteCfwServiceGroupRequest
* @Description 请求参数
*/
@Data
public class DeleteCfwServiceGroupRequest{
    /**服务组id*/
    @KsYunField(name="ServiceGroupId")
    private String ServiceGroupId;

}
