package ksyun.client.epc.describesoinstancetypes.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSoInstanceTypesRequest
* @Description 请求参数
*/
@Data
public class DescribeSoInstanceTypesRequest{
    /**镜像ID，查询该镜像可创建的实例规格*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**指定查询的实例规格
• 参数 - N：表示实例规格的序号，取值范围：1～100。N大于100时，仅前100个生效。
• 多个InstanceTypeId 之间用&分隔。
说明：不传则默认查询所有实例规格的信息。*/
    @KsYunField(name="InstanceTypeId")
    private List<String> InstanceTypeIdList;

}