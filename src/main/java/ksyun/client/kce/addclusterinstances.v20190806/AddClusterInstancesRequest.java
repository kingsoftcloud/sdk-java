package ksyun.client.kce.addclusterinstances.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddClusterInstancesRequest
* @Description 请求参数
*/
@Data
public class AddClusterInstancesRequest{
    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**建议仅填写一条InstanceSet数据，不要填写多条。*/
    @KsYunField(name="InstanceSet")
    private List<InstanceSetDto> InstanceSetList;

    @Data
    @ToString
    public static class InstanceSetDto {
        /**节点角色,有效值：Worker*/
        @KsYunField(name="NodeRole")
        private String NodeRole;
        /**定义节点的配置，支持普通云主机和专属云主机。
节点配置信息使用云主机/专属云主机创建透传参数，json化字符串格式，详见云主机创建实例接口和专属云主机创建实例接口*/
        @KsYunField(name="NodePara")
        private List<String> NodeParaList;
        /**节点高级设置*/
        @KsYunField(name="AdvancedSetting")
    }


}