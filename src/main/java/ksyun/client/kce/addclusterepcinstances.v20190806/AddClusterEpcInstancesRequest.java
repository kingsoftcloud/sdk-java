package ksyun.client.kce.addclusterepcinstances.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddClusterEpcInstancesRequest
* @Description 请求参数
*/
@Data
public class AddClusterEpcInstancesRequest{
    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**移入集群的裸金属服务器实例id，即HostId

注：参数InstanceId.N和EpcPara.N必须填写一个，不能同时填写，也不能同时为空*/
    @KsYunField(name="InstanceId")
    private List<String> InstanceIdList;

    /**裸金属服务器产品重新安装操作系统的透传参数，json化字符串格式，详见[重装租赁裸金属服务器](https://apiexplorer.ksyun.com/#/api/44/ReinstallEpc/2015-11-01/1003)。*/
    @KsYunField(name="EpcPara")
    private List<String> EpcParaList;
}