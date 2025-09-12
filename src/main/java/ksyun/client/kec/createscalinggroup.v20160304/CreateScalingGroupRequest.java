package ksyun.client.kec.createscalinggroup.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateScalingGroupRequest
* @Description 请求参数
*/
@Data
public class CreateScalingGroupRequest{
    /**伸缩组名称 
 */
    @KsYunField(name="ScalingGroupName")
    private String ScalingGroupName;

    /**待创建伸缩组所要使用的启动配置ID 
 标准UUID格式*/
    @KsYunField(name="ScalingConfigurationId")
    private String ScalingConfigurationId;

    /**最小伸缩数最小伸缩数，即伸缩组内最小云服务器数 
 */
    @KsYunField(name="MinSize")
    private String MinSize;

    /**期望实例数期望实例数，即伸缩组刚创建时的云服务器数量 
 0-10,必须在最小伸缩数与最大伸缩数之间*/
    @KsYunField(name="DesiredCapacity")
    private Integer DesiredCapacity;

    /**移除策略 
 有效值：RemoveOldestInstance，表示移除最旧云服务器；RemoveNewestInstance，表示移除最新云服务器*/
    @KsYunField(name="RemovePolicy")
    private String RemovePolicy;

    /**子网ID 
 */
    @KsYunField(name="SubnetId")
    private List<String> SubnetIdList;

    /**多子网扩展策略当绑定多个子网时，此项必填，有效值：balanced-distribution(均衡分布），choice-first（选择优先）默认值：balanced-distribution 
 */
    @KsYunField(name="SubnetStrategy")
    private String SubnetStrategy;

    /**安全组ID 
 */
    @KsYunField(name="SecurityGroupId")
    private String SecurityGroupId;

    /**与伸缩组绑定的各负载均衡的ID 
 */
    @KsYunField(name="Slb")
    private List<SlbDto> SlbList;

    @Data
    @ToString
    public static class SlbDto {
        /**与伸缩组绑定的各负载均衡的ID 
 */
        @KsYunField(name="Id")
                private String Id;
        /**Slb下的监听器ID 
 */
        @KsYunField(name="ListenerId")
                private String ListenerId;
        /**后端服务地址 
 */
        @KsYunField(name="ServerPort")
                private List<Integer> ServerPortList;
        private List<Int> ServerPortList;
        /**端口权重 
 */
        @KsYunField(name="Weight")
                private Integer Weight;
    }

}