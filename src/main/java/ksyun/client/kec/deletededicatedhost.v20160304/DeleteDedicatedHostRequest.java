package ksyun.client.kec.deletededicatedhost.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteDedicatedHostRequest
* @Description 请求参数
*/
@Data
public class DeleteDedicatedHostRequest{
    /**专属宿主机id*/
    @KsYunField(name = "DedicatedHostId", type = 1)
    private List<String> DedicatedHostIdList;

    /**是否退订(默认true）*/
    @KsYunField(name="IsRefund")
    private Boolean IsRefund;

}
