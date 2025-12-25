package ksyun.client.kec.describescalinggroup.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeScalingGroupRequest
* @Description 请求参数
*/
@Data
public class DescribeScalingGroupRequest{
    /**待查询的各伸缩组组成的数组数组下标从0开始 
 */
    @KsYunField(name = "ScalingGroupId", type = 1)
    private List<String> ScalingGroupIdList;

    /**待查询的伸缩组名称 模糊查询
 */
    @KsYunField(name="ScalingGroupName")
    private String ScalingGroupName;

    /**待查询的伸缩组所使用的启动配置ID 
 */
    @KsYunField(name="ScalingConfigurationId")
    private String ScalingConfigurationId;

    /**私有网络ID不传则查询全部网络伸缩组，传0表示基础网络, 如需指定vpc网络 
 */
    @KsYunField(name="VpcId")
    private String VpcId;

    /**分页标识单次调用未返回全部伸缩组时，标记下次调用的返回值的起点，默认值是0 
 */
    @KsYunField(name="Marker")
    private Integer Marker;

    /**一次显示的最多条目数 
 默认为10，最小为5*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**弹性伸缩活动id列表*/
    @KsYunField(name = "ScalingActivityId", type = 1)
    private List<String> ScalingActivityIdList;

}
