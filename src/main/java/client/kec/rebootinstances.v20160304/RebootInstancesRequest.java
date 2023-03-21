package ksyun.client.kec.rebootinstances.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RebootInstancesRequest
* @Description 请求参数
*/
@Data
public class RebootInstancesRequest{
    /**待重启实例ID列表，N的范围为1-100*/
    @KsYunField(name="InstanceId")
    private List<String> InstanceIdList;

    /**强制重启*/
    @KsYunField(name="ForceReboot")
    private Boolean ForceReboot;


}