package ksyun.client.kec.dedicatedhostmigrate.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DedicatedHostMigrateRequest
* @Description 请求参数
*/
@Data
public class DedicatedHostMigrateRequest{
    /**集群Id*/
    @KsYunField(name="DedicatedClusterId")
    private String DedicatedClusterId;

    /**专属宿主机Id*/
    @KsYunField(name="DedicatedHostId")
    private List<String> DedicatedHostIdList;

}