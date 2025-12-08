package ksyun.client.kmr.modifyhosts.v20231231;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyHostsRequest
* @Description 请求参数
*/
@Data
public class ModifyHostsRequest{
    /**实例ID*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**TunaHosts*/
    @KsYunField(name="TunaHosts",type=2)
    private List<String> TunaHostsList;

}
