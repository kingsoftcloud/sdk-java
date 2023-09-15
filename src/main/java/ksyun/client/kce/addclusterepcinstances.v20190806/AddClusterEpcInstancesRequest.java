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

    /**移入集群的裸金属服务器实例id <br>注：参数InstanceId.N和EpcPara.N必须填写一个*/
    @KsYunField(name="InstanceId")
    private List<String> InstanceIdList;

    /**裸金属服务器产品重新安装操作系统的透传参数，json化字符串格式，详见[重装租赁裸金属服务器](https://docs.ksyun.com/documents/631)。<br>注：已兼容InstanceId.N参数，若填写此参数，则InstanceId.N参数无效*/
    @KsYunField(name="EpcPara")
    private List<String> EpcParaList;
}