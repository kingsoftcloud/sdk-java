package ksyun.client.kec.createdataguardgroup.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDataGuardGroupRequest
* @Description 请求参数
*/
@Data
public class CreateDataGuardGroupRequest{
    /**容灾分组名称*/
    @KsYunField(name="DataGuardName")
    private String DataGuardName;


}