package ksyun.client.kce.createnodepool.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateNodePoolRequest
* @Description 请求参数
*/
@Data
public class CreateNodePoolRequest{
    /**节点池名称<br>校验规则：2-64个字符，支持中文，英文，数字，以及特殊字符-,.!$^*()%#&+/:;<=>[]_`{*/
    @KsYunField(name="NodePoolName")
    private String NodePoolName;

    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**是否开启弹性伸缩，有效值：<br>True：开启弹性伸缩<br>False：关闭弹性伸缩<br>默认值：False<br>注：默认未开启自动缩容，若您想开启弹性缩容，后续可在参数ScaleDownEnabled中进行配置开启*/
    @KsYunField(name="EnableAutoScale")
    private Boolean EnableAutoScale;

    /**节点模板信息*/
    @KsYunField(name="NodeTemplate")

    /**节点标签*/
    @KsYunField(name="Label")
    private List<LabelDto> LabelList;

    @Data
    @ToString
    public static class LabelDto {
        /**标签键，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、"."、"/")，且必须以字母、数字开头和结尾*/
        @KsYunField(name="Key")
        private String Key;
        /**标签值，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、".")，且必须以字母、数字开头和结尾*/
        @KsYunField(name="Value")
        private String Value;
    }

    /**节点污点*/
    @KsYunField(name="Taint")
    private List<TaintDto> TaintList;

    @Data
    @ToString
    public static class TaintDto {
        /**污点键，校验规则：污点名不超过253个字符，只能包含字母、数字及分隔符("-"、"_"、"."、"/")，且必须以字母、数字开头和结尾*/
        @KsYunField(name="Key")
        private String Key;
        /**污点值，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、".")，且必须以字母、数字开头和结尾*/
        @KsYunField(name="Value")
        private String Value;
        /**有效值：NoSchedule、PreferNoSchedule、NoExecute*/
        @KsYunField(name="Effect")
        private String Effect;
    }

    /**最小节点数量，即为最小能缩容的实例数量，范围[0-50]，不大于maxSize*/
    @KsYunField(name="MinSize")
    private Integer MinSize;

    /**最大节点数量，即为最大能扩容的实例数量，范围[0-50]，不小于minSize*/
    @KsYunField(name="MaxSize")
    private Integer MaxSize;

    /**期望节点数量，即节点池刚创建时的实例数量，必须在最小节点数量与最大节点数量之间*/
    @KsYunField(name="DesiredCapacity")
    private Integer DesiredCapacity;


}