package ksyun.client.epc.modifyepc.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyEpcRequest
* @Description 请求参数
*/
@Data
public class ModifyEpcRequest{
    /**裸金属服务器资源ID*/
    @KsYunField(name="HostId")
    private String HostId;

    /**云物理主机名称*/
    @KsYunField(name="HostName")
    private String HostName;

    /**描述信息*/
    @KsYunField(name="Description")
    private String Description;

    /**由客户端生成的本次请求的不超过64个ASCII字符唯一标识，同一个ClientToken支持幂等*/
    @KsYunField(name="ClientToken")
    private String ClientToken;

}
