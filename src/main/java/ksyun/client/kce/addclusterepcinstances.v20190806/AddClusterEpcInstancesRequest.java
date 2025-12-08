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
    @KsYunField(name="InstanceId",type=2)
    private List<String> InstanceIdList;

    /**裸金属服务器产品重新安装操作系统的透传参数，json化字符串格式，详见[重装租赁裸金属服务器](https://apiexplorer.ksyun.com/#/api/44/ReinstallEpc/2015-11-01/1003)。*/
    @KsYunField(name="EpcPara",type=2)
    private List<String> EpcParaList;

    /**节点高级设置*/
    @KsYunField(name="AdvancedSetting")
    private AdvancedSettingDto1 AdvancedSetting;

    @Data
    @ToString
    public static class AdvancedSettingDto1 {
        /**容器运行时，根据集群版本和需求选择
Kubernetes版本＜1.24时，有效值：
- docker
- containerd

Kubernetes版本≥1.24时，有效值：
- contained
默认值：docker*/
        @KsYunField(name="ContainerRuntime")
        private String ContainerRuntime;

        /**容器的存储路径，不填写的话默认为/data/container*/
        @KsYunField(name="ContainerPath")
        private String ContainerPath;

        /**base64 编码的用户脚本, 此脚本会在 节点上k8s 组件运行后执行, 需要用户保证脚本的可重入及重试逻辑,脚本和生成的日志的文件可在录/usr/local/ksyun/kce/userscript路径查看*/
        @KsYunField(name="UserScript")
        private String UserScript;

        /**base64 编码的用户脚本, 此脚本会在节点上 k8s 组件运行前执行, 需要用户保证脚本的可重入及重试逻辑,脚本和生成的日志的文件可在录/usr/local/ksyun/kce/pre_userscript路径查看*/
        @KsYunField(name="PreUserScript")
        private String PreUserScript;

        /**节点加入集群后是否可以正常调度，默认值：true
*/
        @KsYunField(name="Schedulable")
        private Boolean Schedulable;

        /**节点加入集群时预置的标签*/
        @KsYunField(name="Label",type=2)
        private List<LabelDto2> LabelList;

        @Data
        @ToString
        public static class LabelDto2 {
            /**标签键，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、"."、"/")，且必须以字母、数字开头和结尾*/
            @KsYunField(name="Key")
            private String Key;

            /**标签值，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、".")，且必须以字母、数字开头和结尾*/
            @KsYunField(name="Value")
            private String Value;

        }

        /**自定义节点上k8s组件的参数*/
        @KsYunField(name="ExtraArg")
        private ExtraArgDto3 ExtraArg;

        @Data
        @ToString
        public static class ExtraArgDto3 {
            /**用户自定义kubelet的参数*/
            @KsYunField(name="Kubelet",type=2)
            private List<KubeletDto4> KubeletList;

            @Data
            @ToString
            public static class KubeletDto4 {
                /**用户自定义kubelet的参数，格式k1=v1，如： --feature-gates=EphemeralContainers=true*/
                @KsYunField(name="CustomArg")
                private String CustomArg;

            }

        }

        /**自定义容器日志采集文件大小，超出此大小日志将滚动写入下一文件，默认值为100m*/
        @KsYunField(name="ContainerLogMaxSize")
        private Integer ContainerLogMaxSize;

        /**自定义容器日志采集文件最大数量，默认值为10个*/
        @KsYunField(name="ContainerLogMaxFiles")
        private Integer ContainerLogMaxFiles;

        /**节点加入集群时预置污点，匹配污点容忍进行调度*/
        @KsYunField(name="Taints",type=2)
        private List<TaintsDto5> TaintsList;

        @Data
        @ToString
        public static class TaintsDto5 {
            /**污点名称，校验规则：不超过253个字符，只能包含字母、数字及分隔符("-"、"_"、"."、"/")，且必须以字母、数字开头和结尾*/
            @KsYunField(name="Key")
            private String Key;

            /**污点值，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、"."、"/")，且必须以字母、数字开头和结尾*/
            @KsYunField(name="Value")
            private String Value;

            /**污点效果，有效值为NoSchedule、PreferNoSchedule、NoExecute*/
            @KsYunField(name="Effect")
            private String Effect;

        }

    }

}
