package ksyun.client.kec.modifyscalinggroup.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyScalingGroupRequest
* @Description 请求参数
*/
@Data
public class ModifyScalingGroupRequest{
    /**待修改的伸缩组ID 
 */
    @KsYunField(name="ScalingGroupId")
    private String ScalingGroupId;

    /**修改后的最小实例数 
 */
    @KsYunField(name="MinSize")
    private Integer MinSize;

    /**修改后的最大实例数 
 */
    @KsYunField(name="MaxSize")
    private Integer MaxSize;

    /**修改后的期望实例数 
 */
    @KsYunField(name="DesiredCapacity")
    private Integer DesiredCapacity;

    /**伸缩组移除策略 
 RemoveOldestInstance：表示移除最早加入伸缩组的云服务器；RemoveNewestInstance：表示移除最新加入伸缩组的云服务器*/
    @KsYunField(name="RemovePolicy")
    private String RemovePolicy;

    /**伸缩组名称 
 */
    @KsYunField(name="ScalingGroupName")
    private String ScalingGroupName;

    /**与伸缩组绑定的启动配置ID 
 */
    @KsYunField(name="ScalingConfigurationId")
    private String ScalingConfigurationId;

    /**子网ID 
 */
    @KsYunField(name = "SubnetId", type = 1)
    private List<String> SubnetIdList;

    /**多子网扩展策略当绑定多个子网时，此项必填，有效值：balanced-distribution(均衡分布），choice-first（选择优先）默认值：balanced-distribution 
 balanced-distribution(均衡分布），choice-first（选择优先）默认值：balanced-distribution*/
    @KsYunField(name="SubnetStrategy")
    private String SubnetStrategy;

    /**与伸缩组绑定的各负载均衡的ID即将废弃 
 */
    @KsYunField(name = "Slb", type = 1)
    private List<SlbDto> SlbList;

    @Data
    @ToString
    public static class SlbDto {
        /**与伸缩组绑定的各负载均衡的ID即将废弃 
 */
        @KsYunField(name="Id")
        private String Id;

        /**Slb下的监听器ID即将废弃 
 */
        @KsYunField(name="ListenerId")
        private String ListenerId;

        /**后端服务地址用“，”隔开各个值，即将废弃 
 */
        @KsYunField(name = "ServerPort", type = 1)
        private List<String> ServerPortList;

        /**端口权重即将废弃 
 */
        @KsYunField(name="Weight")
        private Integer Weight;

    }

    /**支持容器业务线指定子网扩容 
 */
    @KsYunField(name = "ContainerSubnetId", type = 1)
    private List<String> ContainerSubnetIdList;

}
