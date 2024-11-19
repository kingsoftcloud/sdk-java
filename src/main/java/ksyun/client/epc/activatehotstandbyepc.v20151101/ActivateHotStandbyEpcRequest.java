package ksyun.client.epc.activatehotstandbyepc.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ActivateHotStandbyEpcRequest
* @Description 请求参数
*/
@Data
public class ActivateHotStandbyEpcRequest{
    /**待激活热备机实例ID*/
    @KsYunField(name="HostId")
    private String HostId;


}