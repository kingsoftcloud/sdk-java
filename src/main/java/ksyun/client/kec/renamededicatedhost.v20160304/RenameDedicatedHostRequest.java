package ksyun.client.kec.renamededicatedhost.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RenameDedicatedHostRequest
* @Description 请求参数
*/
@Data
public class RenameDedicatedHostRequest{
    /**专属宿主机id*/
    @KsYunField(name="DedicatedHostId")
    private String DedicatedHostId;

    /**专属宿主机新的名称*/
    @KsYunField(name="NewDedicatedHostName")
    private String NewDedicatedHostName;


}