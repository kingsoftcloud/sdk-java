package ksyun.client.epc.rebootepc.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RebootEpcRequest
* @Description 请求参数
*/
@Data
public class RebootEpcRequest{
    /**裸金属服务器资源ID，也可填入EpcHostId*/
    @KsYunField(name="HostId")
    private String HostId;

    /**由客户端生成的本次请求的不超过64个ASCII字符唯一标识，同一个ClientToken支持幂等*/
    @KsYunField(name="ClientToken")
    private String ClientToken;

}
